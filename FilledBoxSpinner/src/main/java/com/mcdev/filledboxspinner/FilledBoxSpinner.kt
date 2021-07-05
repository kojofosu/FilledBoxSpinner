package com.mcdev.filledboxspinner

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.mcdev.filledboxspinner.databinding.FilledBoxSpinnerViewBinding

class FilledBoxSpinner @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
    ): ConstraintLayout (context, attributeSet, defStyleAttr) {

    private val TAG = "FilledBoxSpinner"
    private val binding = FilledBoxSpinnerViewBinding.inflate(LayoutInflater.from(context), this, true)

    private var arrayAdapter: ArrayAdapter<Any>? = null
    private var itemSelectedListener: OnItemSelectedListener? = null
    private var list : List<Any>? = null

    private var mItemSelected: String? = null
    private var mItemSelectedPosition: Int? = null
    private var mItemSelectedId: Long? = null

    init {
        val attributes = context.theme.obtainStyledAttributes(attributeSet, R.styleable.FilledBoxSpinner, defStyleAttr, defStyleAttr)
        val hint = attributes.getString(R.styleable.FilledBoxSpinner_hint)
        val spinnerIcon = attributes.getResourceId(R.styleable.FilledBoxSpinner_icon, 0)
        val iconPosition = attributes.getInt(R.styleable.FilledBoxSpinner_iconPosition, 0)
        val searchable = attributes.getBoolean(R.styleable.FilledBoxSpinner_isSearchable, false)

        setSpinnerIcon(spinnerIcon, iconPosition)
        setHint(hint)
        isSearchable(searchable)

        binding.autoCompleteTextView.setOnItemClickListener(object: AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Log.d(TAG, "onItemClick: executed1")
                mItemSelected = parent!!.getItemAtPosition(position).toString()
                mItemSelectedPosition = position
                mItemSelectedId = id
                itemSelectedListener?.onItemSelected(mItemSelected!!)
            }

        })
    }

    fun setHint(hint: String?) {
        binding.textInputLayout.hint = hint
    }

    fun setItems(list: List<Any>) {
        this.list = list
        this.arrayAdapter = ArrayAdapter(context, R.layout.spinner_item, list)
        binding.autoCompleteTextView.setAdapter(this.arrayAdapter)
    }

    fun setSpinnerIcon(icon: Int, position: Int = Position.START.ordinal) {
        when (position) {
            0 ->  binding.textInputLayout.setStartIconDrawable(icon)
            1 -> binding.textInputLayout.setEndIconDrawable(icon)
        }
    }


    fun setOnItemSelectedListener(itemSelectedListener: OnItemSelectedListener) {
        this.itemSelectedListener = itemSelectedListener
    }

    fun getOnItemSelectedListener(): OnItemSelectedListener? {
        return this.itemSelectedListener
    }

    fun getSelectedItemPosition(): Int? {
        return mItemSelectedPosition
    }

    fun getSelectedItem(): String {
        return mItemSelected!!
    }

    fun setError(message: String) {
        binding.textInputLayout.error = message
    }

    fun isSearchable(searchable: Boolean) {
        when (searchable) {
            true -> binding.autoCompleteTextView.inputType = EditorInfo.TYPE_TEXT_FLAG_AUTO_COMPLETE
        }
    }
}