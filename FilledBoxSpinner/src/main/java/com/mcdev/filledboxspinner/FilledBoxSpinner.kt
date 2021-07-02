package com.mcdev.filledboxspinner

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.mcdev.filledboxspinner.databinding.FilledBoxSpinnerViewBinding
import java.text.FieldPosition

class FilledBoxSpinner @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
    ): ConstraintLayout (context, attributeSet, defStyleAttr) {

    private val TAG = "FilledBoxSpinner"
    private val binding = FilledBoxSpinnerViewBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        val attributes = context.theme.obtainStyledAttributes(attributeSet, R.styleable.FilledBoxSpinner, defStyleAttr, defStyleAttr)
        val hint = attributes.getString(R.styleable.FilledBoxSpinner_hint)
        val spinnerIcon = attributes.getResourceId(R.styleable.FilledBoxSpinner_icon, 0)
        val iconPosition = attributes.getInt(R.styleable.FilledBoxSpinner_iconPosition, 0)

        setSpinnerIcon(spinnerIcon, iconPosition)
        setHint(hint)
    }

    fun setHint(hint: String?) {
        binding.textInputLayout.hint = hint
    }

    fun setItems(list: List<String>) {
        val arrayAdapter = ArrayAdapter(context, R.layout.spinner_item, list)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    fun setSpinnerIcon(icon: Int, position: Int = Position.START.ordinal) {
        when (position) {
            0 ->  binding.textInputLayout.setStartIconDrawable(icon)
            1 -> binding.textInputLayout.setEndIconDrawable(icon)
        }
    }

}