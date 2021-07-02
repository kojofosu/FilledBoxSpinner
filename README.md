# FilledBoxSpinner
:sparkles: Beautiful spinner library for your android projects.

## Setup

Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        //...omitted for brevity
        maven { url 'https://jitpack.io' }
    }
}
```



Add the dependency

```groovy
dependencies {
   implementation "com.github.kojofosu:FilledBoxSpinner:$latest_release"
}
```

## Usage
Sample implementation [here](app/)

- Add `FilledBoxSpinner` in your layout xml file
```xml
    <com.mcdev.filledboxspinner.FilledBoxSpinner
        android:id="@+id/filled_box_spinner"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="40dp"
        app:hint="Waveform"
        app:icon="@drawable/ic_baseline_graphic_eq_24"
        app:iconPosition="start"/>
```

- Add list items to spinner
```kotlin
       val filledBoxSpinner: FilledBoxSpinner = findViewById(R.id.filled_box_spinner)
       filledBoxSpinner.setItems(listItems)
```
