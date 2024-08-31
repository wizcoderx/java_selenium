# Java-Selenium Practicals

This repository contains all the Java-Selenium practicals, divided into two main folders:

## Repository Structure

- **SeleniumOne**: Contains Selenium practicals using Google Chrome.
- **SeleniumTest_firefox**: Contains Selenium practicals using Firefox.

---

## Steps to Execute the Code in `SeleniumTest_firefox`

Follow these steps to successfully run the Selenium tests using Firefox:

### 1. Download Selenium Drivers
- Download the Selenium drivers ZIP file for Java from [here](https://github.com/SeleniumHQ/selenium/releases/download/selenium-4.24.0/selenium-java-4.24.0.zip).
- Extract the contents of the ZIP file and save them in a known location.

### 2. Download Firefox Driver (GeckoDriver)
- Download the GeckoDriver from this [link](https://sourceforge.net/projects/geckodriver.mirror/files/v0.35.0/geckodriver-v0.35.0-win64.zip/download). This file (`geckodriver-v0.35.0-win64.zip`) is for 64-bit Windows and might not be available on the official GeckoDriver GitHub page.
- Extract the downloaded ZIP file and save the GeckoDriver in a known location.

### 3. Set Up the Java Project in Eclipse
- If you want to use the project directly from this GitHub repository, you can skip this step. Otherwise, follow these steps:
  - Open Eclipse IDE for Java Developers (Version: 2022-09 (4.25.0) or similar).
  - Create a new Java project in Eclipse.

### 4. Configure Build Path
- Right-click on your project in the Package Explorer and select **Build Path > Configure Build Path**.
- In the **Libraries** tab, click on **Classpath** and then focus on the right-hand side.
- Click **Add External JARs** and navigate to the folder where you extracted the Selenium files. Select all the JAR files.
- Click on **Apply and Close**.
- **Note:** Ensure that the JAR files are added under the **Classpath** section, not the Modulepath.

### 5. Remove Module File (if present)
- If a `module-info.java` file is present in your project, delete it immediately. This file is not required for non-modular projects and can cause issues.

### 6. Create Package and Class
- Right-click on the `src` folder and create a new package named `seleniumtest_firefox`.
- Once the package is created, right-click on it and create a new Java class (name it as per your preference).
- Write your Selenium Java code in this class.

### 7. Running the Code
- Ensure that your `geckodriver.exe` path is correctly specified in your code.
- Run your Java class as a Java application.

---

### Important:
- **Java Version**: Make sure you are using a compatible version of Java (JDK 8 or higher is recommended).
- **GeckoDriver Path**: Ensure that the path to `geckodriver.exe` is correctly set in your code with the `System.setProperty()` method.
