# FilledBoxSpinner
:sparkles: Beautiful spinner library for your android projects.

![Jit](https://img.shields.io/jitpack/v/github/kojofosu/FilledBoxSpinner?style=for-the-badge)

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

### Licensed under the [MIT License](LICENSE)

```
MIT License

Copyright (c) 2021 Kojo Fosu Bempa Edue

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
