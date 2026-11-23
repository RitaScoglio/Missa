# Missa 2.0

Missa is a Kotlin Android app for reading Roman Catholic Mass texts and following the Slovak liturgical calendar. It provides the Mass for a selected date, special Masses, blessings, and responses in multiple languages. The app bundles its liturgical content as JSON.

## Build and run

Open the project root in Android Studio. Install Android SDK Platform 36 and use JDK 17 for Gradle. Run the `app` configuration on an emulator or device running Android 5.0 (API 21) or later. See the [Android Gradle Plugin compatibility table](https://developer.android.com/build/releases/agp-8-13-0-release-notes#compatibility) for build tool requirements.

From the project root, use the Gradle wrapper to build a debug APK, run JVM tests, and check Android lint.

```sh
./gradlew :app:assembleDebug :app:testDebugUnitTest :app:lintDebug
```

On Windows PowerShell, use `./gradlew.bat` in place of `./gradlew`. The debug APK is written to `app/build/outputs/apk/debug/app-debug.apk`. With a device or emulator connected, run `:app:connectedDebugAndroidTest` using the wrapper to run the instrumented tests.

## Documentation

- The [UI and feature guide](docs/ui-guide.md) maps the Slovak screen labels to the controls, source files, and tests behind them.
- The [code structure guide](docs/code-structure.md) explains how the calendar selects a celebration, how the app resolves Mass texts, and where to change each part.
- The [liturgical datasets](app/src/main/assets/liturgy/) contain the bundled celebrations, readings, prayers, rites, and language packs.
