# Selenium Cucumber Framework

---

## Project Purpose
This project aims to test get help with paying for NHS costs online service by creating an automation test framework that uses Selenium and Cucumber with Java as the programming language.

---

## Tools and Libraries
This project uses 2 main tools, Selenium and Cucumber.
On the other hand, I am using some of the tools that support this framework.
The complete list of tools, you can see in the `pom.xml` file.

## Requirements
* Java Development Kit
* Maven

## Running Tests
* Clone the repository from your fork to this directory
* Open the project using any Java IDE
* Run the tests with the script below
```shell
$ mvn test
```
* If you want to run the specific test, use the cucumber tags like this
```shell
$ mvn test -Dcucumber.options="--tags @Acceptance"
```
* If you want to run the test in different browsers, just go to `configuration.properties` then change the value of browser to `chrome` or `firefox`
```properties
browser = firefox
browser = chrome
```

## Test Results
* Test report automatically generated on `target` folder and `ExtentReports` folder once the test execution is completed.
* See test report from `target/cucumber-reports/advanced-reports/cucumber.json`
* Can also see test report from ` ExtentReports/ SparkReport_ /Reports/Spark.html `
* You can see Cucumber Report at https://reports.cucumber.io/reports/, just go to `src/test/resources/cucumber.properties` then change the value to be `true`
```properties
cucumber.publish.enabled=true
```

---

### References
* https://cucumber.io/docs/installation/java/
* https://www.selenium.dev/documentation/en/
* https://www.w3schools.com/java/
* https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html
