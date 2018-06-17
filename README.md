# serenity-bdd-example
http://www.thucydides.info/docs/serenity/#_introducing_the_screenplay_pattern

## Prerequisites

* Oracle JDK 1.8
* IntelliJ IDEA
* Maven 3+

## Configuration

### How to run *all* tests
* `mvn clean verify`

## Web drivers
* Google Chrome - https://sites.google.com/a/chromium.org/chromedriver/downloads
* Firefox (gecko driver) - https://github.com/mozilla/geckodriver/releases
* Edge - https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/

**How to run .feature files within IntelliJ**
* Open `Run -> Edit Configurations -> Defaults`
* Select Cucumber java
* Main Class: net.serenitybdd.cucumber.cli.Main
* Glue: example.steps.definitions
* Apply changes

### How to check Serenity reports
Open `target/site/serenity/index.html` which is generated after `mvn verify`

To see full functionality of Serenity reports on Jenkins, Content Security Rules need to be relaxed (_more info https://wiki.jenkins.io/display/JENKINS/Configuring+Content+Security+Policy_)

To do that run following script in Jenkins Script Console:

`sandbox allow-same-origin allow-scripts; default-src 'self'; script-src 'self' 'unsafe-inline' 'unsafe-eval'; img-src 'self'; style-src 'self' 'unsafe-inline'; font-src *`

Changes will be effective immediatelly, but will require re-run after Jenkins restart
