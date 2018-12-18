#Expandable Search Bar for Android

This easy to use library will help to add a beautiful customizable Material Design Expandable SearchBar in your project.

<img src="art/preview_rounded.gif" width="300">

<img src="art/preview.gif" width="300">

<img src="art/preview_typing.gif" width="300">

----------


#How to use

**to include SearchBar to your project:**

 add this code to the the project level build.gradle file

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

add the dependency to the the app level build.gradle file

```gradle
dependencies {
	implementation 'com.github.adrianotelesc:ExpandableSearchBar:0.1.0'
}

```

then add SearchBar to your activity:

```xml
<com.adrianotelesc.expandablesearchbar.ExpandableSearchBar
            style="@style/ExpandableSearchBarLight"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:hint="Search"
            app:isRounded="true" />
```
