<h1 align="center">𝙳𝚛𝚘𝚒𝚍𝚄𝚝𝚒𝚕𝚃𝚘𝚘𝚕𝙱𝚘𝚡</h1>

![bannerUtils](https://github.com/devrath/DroidUtilToolBox/assets/1456191/18b284e9-ec48-4443-b1f2-a02e92db3a15)

🧰 𝚃𝚑𝚒𝚜 𝚛𝚎𝚙𝚘𝚜𝚒𝚝𝚘𝚛𝚢 𝚌𝚘𝚗𝚝𝚊𝚒𝚗𝚜 𝚝𝚑𝚎 𝚜𝚍𝚔 𝚏𝚘𝚛 𝚊𝚕𝚕 𝚝𝚑𝚎 𝚞𝚝𝚒𝚕𝚒𝚝𝚒𝚎𝚜 𝚝𝚑𝚊𝚝 𝚒𝚜 𝚗𝚎𝚎𝚍𝚎𝚍 𝚏𝚘𝚛 𝚊 𝚊𝚗𝚍𝚛𝚘𝚒𝚍 𝚙𝚛𝚘𝚓𝚎𝚌𝚝



# `Download`

## `JitPack`
<p> <a href="https://jitpack.io/#devrath/DroidUtilToolBox"><img alt="License" src="https://jitpack.io/v/devrath/DroidUtilToolBox.svg"/></p>
  
**Dependency**: `implementation("com.github.devrath:DroidUtilToolBox:Tag")`

# `Using in code`

### `TYPE-1: Using App Startup library`

* The App Startup library is part of the AndroidX libraries, and you can include it in your project without additional dependencies. However, checking the latest documentation or release notes for any updates or changes is crucial.

`implementation("androidx.startup:startup-runtime:1.1.1")`

* Add the meta data in the manifest of your project
```manifest
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <application>
        <meta-data
            android:name="com.istudio.lib_utils.sdkConfig.SDKInitializer"
            android:value="initializer" />
    </application>
</manifest>
```
* Add below lines in OnCreate of the application class
```kotlin
AppInitializer.getInstance(this).initializeComponent(SDKInitializer::class.java)
```  

### `TYPE-2: Just manually add the below lines in your Application class OnCreate`
```kotlin
SDKConfig.initContext(context)
```

## **`𝚂𝚞𝚙𝚙𝚘𝚛𝚝`** ☕
𝙸𝚏 𝚢𝚘𝚞 𝚏𝚎𝚎𝚕 𝚕𝚒𝚔𝚎 𝚜𝚞𝚙𝚙𝚘𝚛𝚝 𝚖𝚎 𝚊 𝚌𝚘𝚏𝚏𝚎𝚎 𝚏𝚘𝚛 𝚖𝚢 𝚎𝚏𝚏𝚘𝚛𝚝𝚜, 𝙸 𝚠𝚘𝚞𝚕𝚍 𝚐𝚛𝚎𝚊𝚝𝚕𝚢 𝚊𝚙𝚙𝚛𝚎𝚌𝚒𝚊𝚝𝚎 𝚒𝚝.</br>
<a href="https://www.buymeacoffee.com/devrath" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png" alt="𝙱𝚞𝚢 𝙼𝚎 𝙰 𝙲𝚘𝚏𝚏𝚎𝚎" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## **`𝙲𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚎`** 🙋‍♂️
𝚁𝚎𝚊𝚍 [𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗 𝚐𝚞𝚒𝚍𝚎𝚕𝚒𝚗𝚎𝚜](CONTRIBUTING.md) 𝚏𝚘𝚛 𝚖𝚘𝚛𝚎 𝚒𝚗𝚏𝚘𝚛𝚖𝚊𝚝𝚒𝚘𝚗 𝚛𝚎𝚐𝚊𝚛𝚍𝚒𝚗𝚐 𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗.

## **`𝙵𝚎𝚎𝚍𝚋𝚊𝚌𝚔`** ✍️ 
𝙵𝚎𝚊𝚝𝚞𝚛𝚎 𝚛𝚎𝚚𝚞𝚎𝚜𝚝𝚜 𝚊𝚛𝚎 𝚊𝚕𝚠𝚊𝚢𝚜 𝚠𝚎𝚕𝚌𝚘𝚖𝚎, [𝙵𝚒𝚕𝚎 𝚊𝚗 𝚒𝚜𝚜𝚞𝚎 𝚑𝚎𝚛𝚎](https://github.com/devrath/DroidUtilToolBox/issues/new).

## **`𝙵𝚒𝚗𝚍 𝚝𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚞𝚜𝚎𝚏𝚞𝚕`** ? ❤️
𝚂𝚞𝚙𝚙𝚘𝚛𝚝 𝚒𝚝 𝚋𝚢 𝚌𝚕𝚒𝚌𝚔𝚒𝚗𝚐 𝚝𝚑𝚎 ⭐ 𝚋𝚞𝚝𝚝𝚘𝚗 𝚘𝚗 𝚝𝚑𝚎 𝚞𝚙𝚙𝚎𝚛 𝚛𝚒𝚐𝚑𝚝 𝚘𝚏 𝚝𝚑𝚒𝚜 𝚙𝚊𝚐𝚎. ✌️

## **`𝙻𝚒𝚌𝚎𝚗𝚜𝚎`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
𝚃𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚒𝚜 𝚕𝚒𝚌𝚎𝚗𝚜𝚎𝚍 𝚞𝚗𝚍𝚎𝚛 𝚝𝚑𝚎 𝙰𝚙𝚊𝚌𝚑𝚎 𝙻𝚒𝚌𝚎𝚗𝚜𝚎 𝟸.𝟶 - 𝚜𝚎𝚎 𝚝𝚑𝚎 [𝙻𝙸𝙲𝙴𝙽𝚂𝙴](https://github.com/devrath/DroidUtilToolBox/blob/main/LICENSE) 𝚏𝚒𝚕𝚎 𝚏𝚘𝚛 𝚍𝚎𝚝𝚊𝚒𝚕𝚜.


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>
