1  Demo-Web-Shop-Task
This assignment of implement an automation testing framework for the Demo Web Shop e-commerce application using Selenium WebDriver, TestNG, Cucumber (BDD), and the Page Object Model design pattern.

2. Tools and Technologies Used

• Java
• Selenium WebDriver
• TestNG
• Cucumber (BDD)
• Page Object Model (POM)
• Maven
• Git & GitHub

3. Framework Architecture

The framework follows Page Object Model (POM) to maintain separation between test logic and page elements.

Project Structure
DemoWebShopAutomation
│
├── src/test/java
│   ├── pages
│   │   ├── HomePage.java
│   │   ├── LoginPage.java
│   │   ├── RegisterPage.java
│   │
│   ├── stepdefinitions
│   │   ├── LoginSteps.java
│   │   ├── RegisterSteps.java
│   │   ├── SearchSteps.java
│   │
│   ├── runners
│   │   └── TestRunner.java
│   │
│   ├── utilities
│   │   ├── DriverFactory.java
│   │   ├── ConfigReader.java
│   │   ├── ScreenshotHelper.java
│
├── src/test/resources
│   ├── features
│   │   ├── login.feature
│   │   ├── register.feature
│   │   ├── search.feature
│
├── pom.xml
4. Automated Test Scenarios
1. Verify Home Page

Launch browser

Navigate to Demo Web Shop website

Verify homepage title

Verify main categories:

Books

Electronics

Apparel

2. User Registration

Click Register

Enter user details

Enter email and password

Submit the registration form

Verify successful registration message

3. Login Functionality

Click Login

Enter valid email and password

Click login button

Verify successful login

4. Invalid Login

Enter incorrect email or password

Click login

Verify error message

5. Search Product

Enter product name in search box

Click search

Verify relevant product results appear

5. Utility Classes
DriverFactory

Manages WebDriver initialization and browser setup.

ConfigReader

Reads configuration values such as browser type and application URL from properties file.

ScreenshotHelper

Captures screenshots automatically when a test fails.

6. How to Run the Project
Step 1: Clone the Repository
git clone https://github.com/your-username/demo-webshop-automation.git
Step 2: Open the Project

Import the project in Eclipse / IntelliJ IDEA as a Maven project.

Step 3: Install Dependencies

Maven will automatically download dependencies from pom.xml.

You can also run:

mvn clean install
Step 4: Execute Tests

Run the TestRunner class to execute all Cucumber scenarios.

Or run from Maven:

mvn test
7. Test Reporting

After execution, test reports are generated using Cucumber Reports which provide:

Passed test cases

Failed test cases

Execution time

Step level details

Reports can be found in:

/target/cucumber-reports
8. GitHub Repository

Add your project repository link here:

https://github.com/your-username/demo-webshop-automation
9. Author

Automation Framework developed as part of Automation Testing Assignment using Selenium, TestNG, and Cucumber.
