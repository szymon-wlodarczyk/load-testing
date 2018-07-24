## Simple load testing tool implemented in Gatling https://gatling.io/

### Prerequisites
1. Java 1.8.0_144
2. Gradle 4.3.1

### How to build test app
1. Navigate to /app dir
2. Run *gradle clean build*

### How to run test app
3. Build an app (please see steps above)
4. Run *java -jar /app/build/libs/app-0.0.1-SNAPSHOT.jar*

### How to start load test
1. Run test app and then open different terminal
2. Navigate to /gatling dir
3. Run *gradle loadTest*
4. Test results are available under /gatling/build/gatling-results dir
5. Each load test invoked by gradle task in point 3 generates folder named loadtest-<timestamp>
6. Navigate to folder, inside you can find index.html file with test load reports
