# AppFoundry Android Project Template

[![AppFoundry Android Template build status](https://travis-ci.org/appfoundry/android-project-template.svg?branch=feature%2Ftravis-build)](https://travis-ci.org/appfoundry/android-project-template)

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
 
 


