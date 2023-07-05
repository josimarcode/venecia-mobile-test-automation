##README SERENITY WEB TRAINING

##Run tests with gradle:
In windows:
./gradlew clean test
To run tests in Firefox:

./gradlew clean test -Dwebdriver.driver=firefox
In Mac
./gradle clean test
To run tests in Firefox:

./gradle clean test -Dwebdriver.driver=firefox
gradlew clean test
##Run tests with Maven:

mvn clean verify -Ddriver=firefox
or try this:

mvn clean verify -Dwebdriver.driver=firefox