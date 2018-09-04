
---
CircleIndicator (with support for InfinityPager)
===============
A lightweight viewpager indicator like in nexus 5 launcher 
Code modified to work with InfiniteViewPager (based on  https://github.com/surfstudio/InfinitePageIndicator to use with InfinityPager).

New sample fragment added.

[ ![Download](https://jitpack.io/v/net.intari/CircleIndicatorEnhanced.svg) ](https://jitpack.io/#net.intari/CircleIndicatorEnhanced/)

This is fork of  https://github.com/ongakuer/CircleIndicator 

Gradle
------------
Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency

```groovy
dependencies {
    compile 'net.intari:CircleIndicatorEnhanced:1.2.30@aar'
}
```

Usage
--------
```xml
	<net.intari.circleindicatorenhanced.CircleIndicator
		android:id="@+id/indicator"
        android:layout_width="match_parent"
        android:layout_height="48dp"/>
```
```java
    ViewPager viewpager = (ViewPager) view.findViewById(R.id.viewpager);
    CircleIndicator indicator = (CircleIndicator) view.findViewById(R.id.indicator);
    viewpager.setAdapter(mPageAdapter);
    indicator.setViewPager(viewpager);
```

##### Properties:

* `app:ci_width`
* `app:ci_height`
* `app:ci_margin`
* `app:ci_drawable`
* `app:ci_drawable_unselected`
* `app:ci_animator`
* `app:ci_animator_reverse`
* `app:ci_orientation` (default:horizontal)
* `app:ci_gravity` (default:center)



[Changelog](/CHANGELOG.md)
------------
##### v1.2.0 Please change like this if you used dynamic adapter

```java
viewpager.setAdapter(mAdapter);
indicator.setViewPager(viewpager);
mAdapter.registerDataSetObserver(indicator.getDataSetObserver());
```


License
--------
```
Copyright (C) 2014 relex, (C) 2018 intari

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
