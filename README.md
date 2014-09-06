# AppFoundry Android Project Template

## Goal

Home for AppFoundry Android project template

* Project structure sample
    - project structure
    - (default) libraries
    - testing setup

## Android setup


This Android sample setup consists of a multi-module Gradle-based project

The project has three different modules  
* /appfoundry-app - The Android application with instrumentation tests using Espresso
* /appfoundry-core - A plain Java module which could allocate Java code such as network-related code, model classes, etc. and runs JUnit tests
* /appfoundry-robo-tests - Robolectric tests for the /appfoundry-app module

Espresso tests can be run using:
~~~~
./gradlew connectedCheck
./gradlew connectedAndroidTest
~~~~

JUnit and Robolectric tests can be run using one of the following:
~~~~
./gradlew test
./gradlew check
./gradlew build
~~~~

Test just runs the tests, check would run tests plus checkstyle, lint etc, and build compiles everything & checks & tests
 
 



## Development Android Signing Key

The Android system requires that all installed applications be digitally signed with a certificate whose private key is held by the application's developer. The Android system uses the certificate as a means of identifying the author of an application and establishing trust relationships between applications. The certificate is not used to control which applications the user can install. The certificate does not need to be signed by a certificate authority: it is perfectly allowable, and typical, for Android applications to use self-signed certificates.

### Signing process

The Android build process signs your application differently depending on which build mode you use to build your application. There are two build modes: debug mode and release mode. You use debug mode when you are developing and testing your application. You use release mode when you want to build a release version of your application that you can distribute directly to users or publish on an application marketplace such as Google Play.

When you build in debug mode the Android SDK build tools use the Keytool utility (included in the JDK) to create a debug key. Because the SDK build tools created the debug key, they know the debug key's alias and password. Each time you compile your application in debug mode, the build tools use the debug key along with the Jarsigner utility (also included in the JDK) to sign your application's .apk file. Because the alias and password are known to the SDK build tools, the tools don't need to prompt you for the debug key's alias and password each time you compile.

When you build in release mode you use your own private key to sign your application. If you don't have a private key, you can use the Keytool utility to create one for you. When you compile your application in release mode, the build tools use your private key along with the Jarsigner utility to sign your application's .apk file. Because the certificate and private key you use are your own, you must provide the password for the keystore and key alias.

### Release signing

### Development signing configuration

To setup the release signing infrastructure for the Android app, we will use a development-specific release key for the time being.

A development keystore is checked in under the `keystore` directory of the android project.

The generated development key is a 2,048 bit RSA key pair and self-signed certificate (SHA256withRSA) with a validity of 10,000 days
        for: `CN=AppFoundryAndroidDev, OU=AppFoundryAndroidDev, O=AppFoundry, L=Kontich, ST=Antwerp, C=BE`

with keystore password `appfoundry` and appfoundry_dev_key alias password `appfoundry`

The command used to generate this key:
~~~~
keytool -genkey -v -keystore appfoundry-dev.keystore -alias appfoundry_dev_key -keyalg RSA -keysize 2048 -validity 10000
~~~~


