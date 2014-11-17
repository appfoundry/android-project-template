#!/bin/sh

./gradlew :build :appfoundry-app:connectedAndroidTest \
          :appfoundry-core:test \
          :appfoundry-robo-tests:test \
          :appfoundry-robo-tests:jacocoTestReport \
#          :appfoundry-robo-tests:coveralls \
