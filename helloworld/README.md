Hello World
===

Hello World is a simplest glassware written for Google Glass.


Dir structure
---

    helloworld
    |
    |-- AndroidManifest.xml
    |-- README.md
    |-- build.gradle
    |-- res
    |   |-- drawable
    |   |   `-- app_logo.png
    |   |-- values
    |   |   |-- dimens.xml
    |   |   |-- strings.xml
    |   |   `-- styles.xml
    |   `-- xml
    |       `-- voice_trigger_start.xml
    `-- src
        `-- com
            `-- jackslab
                `-- helloworld
                    |-- MainActivity.java
                    `-- MainService.java


How to build
---

Download the gradle-1.11-bin.zip from http://www.gradle.org, unpack it into
/path/to/gradle-1.11

Install the Android SDK 4.4.2(API 19) and 'Glass Development Kit Preview' and
Android Build Tools 19.0.3 through Android SDK Manager. The SDK is located at
/path/to/android-sdk-linux

Add these into ~/.bashrc

    export PATH=/path/to/gradle-1.11/bin:$PATH
	export ANDROID_HOME=/path/to/android-sdk-linux


Use the keytool to generate a key file the password is 'android':

    $ keytool --genkeypair
	Enter keystore password:
	Re-enter new password:
	What is your first and last name?
	  [Unknown]: Jack Tan
	......
	......
	......

	$ cp ~/.keystore ~/.android/my-debug.keystore


export DEBUG_KEYSTORE in ~/.bashrc:

	export DEBUG_KEYSTORE=~/.android/my-debug.keystore


Then in helloworld directory type 'gradle build' to build the first glass app:

    $ cd /path/to/helloworld
	$ gradle build


The apk file is located in /path/to/helloworld/build/apk/ after building success
