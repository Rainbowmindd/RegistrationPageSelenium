# Selenium Test Project

This project demonstrates a basic web automation setup using Selenium WebDriver in Java. It includes a test for a user registration form implemented with the Page Object Model (POM) pattern.

## **Features**
- Automates web interactions with Selenium WebDriver.
- Uses the Page Object Model for clean and maintainable code.
- Includes tests managed with TestNG.
- Automatically handles WebDriver setup with WebDriverManager.


## **Technologies Used**
- **Java**: Programming language for the tests.
- **Selenium WebDriver**: Web browser automation.
- **WebDriverManager**: Simplifies WebDriver setup and management.
- **Maven**: Dependency management and build tool.
- **TestNG**: Test framework for running and organizing tests.

## **Setup Instructions**

### **Prerequisites**
1. Install **Java Development Kit (JDK)** (version 11 or later).
2. Install **Maven**.
3. Install **IntelliJ IDEA** or another Java IDE.
4. Install **Google Chrome** (latest version).

### **Project Setup**
1. Clone the repository:
   ```bash
   git clone https://github.com/Rainbowmindd/RegistrationPageSelenium
   ```
2. Navigate to the project directory:
   ```bash

   cd selenium-test-project
   ```
3. Open the project in IntelliJ IDEA or your preferred IDE.
4. Build the project using Maven:
   ```bash

   mvn clean install
   ```


## **Running the Tests**

### **Run via IntelliJ IDEA**
1. Open `RegistrationTest` in `src/test/java/com/example/tests`.
2. Right-click the file and select **Run 'RegistrationTest'**.

### **Run via Command Line**
1. Navigate to the project directory.
2. Run the tests with Maven:
   ```bash

   mvn test
   ```

## **How It Works**

### **Test Scenario**
The `RegistrationTest` verifies the functionality of a sample registration form:
1. Opens the `registration.html` page.
2. Fills in the username, email, and password fields.
3. Submits the form.
4. Verifies the success message is displayed.

### **Page Object Model**
The project uses the **Page Object Model (POM)** for better code organization:
- Each web page is represented as a class.
- All interactions with the page (e.g., clicking buttons, entering text) are encapsulated in methods.


## **Testing the Application**
1. Ensure the `registration.html` file path is correct in the test:
   ```java

   registrationPage.openUrl("file:///C:/path/to/resources/registration.html");
   ```
2. Run the test to simulate user actions and validate the form.

Happy Testing! <3

