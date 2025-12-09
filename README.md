🧮 Mathematical Operation Analyzer

🔗 Project Repository:
👉 https://github.com/abhaychaudhary18/Mathematical-Operation-Analyzer

Mathematical Operation Analyzer is a Java-based desktop application that performs core arithmetic operations using an intuitive Graphical User Interface (GUI).
The project is built using Apache Maven and follows industry-standard DevOps automation with GitHub Actions for continuous integration.

🚀 Features

Clean and user-friendly GUI (Java Swing)

Four major operations: Add, Subtract, Multiply, Divide

Handles invalid input & division-by-zero error

Executable JAR supported (double-click to run)

Built & automated using Apache Maven + GitHub Actions

🛠️ Tech Stack
Component	Technology
Language	Java 17
Build Tool	Maven
CI/CD	GitHub Actions
UI Library	Java Swing
Version Control	Git & GitHub
📂 Project Structure
calculator-app
 ├─ src
 │  ├─ main/java/com/abhay/calculator
 │  │    ├─ App.java
 │  │    └─ CalculatorGUI.java
 │  └─ test/java/com/abhay/calculator
 │       └─ AppTest.java
 ├─ pom.xml
 └─ README.md

▶ How to Run the Project
🔹 Run using Maven
mvn exec:java

🔹 Run packaged JAR

Build JAR:

mvn clean package


Run:

java -jar target/calculator-app-1.0-SNAPSHOT.jar


You can also double-click the JAR file to launch the GUI.

🤝 DevOps Integration

This repository includes a working CI pipeline (GitHub Actions) that:

Checks out repository

Installs Java 17

Runs mvn clean package for build validation

View CI pipeline status here 👇
🔗 https://github.com/abhaychaudhary18/Mathematical-Operation-Analyzer/actions

🌱 Future Enhancements

Scientific calculator operations (log, sqrt, power, sin/cos/tan)

Calculation history

Dark & Light themes

Web version using Spring Boot

Docker container deployment

Cloud deployment via AWS

👨‍💻 Author

Abhay Chaudhary
🚀 Java | Maven | DevOps | GitHub Actions
🔗 GitHub Profile: https://github.com/abhaychaudhary18

⭐ Contributions

Contributions and suggestions are welcome.
If you like the project, don’t forget to star ⭐ the repository!
