🧮 Mathematical Operation Analyzer

Mathematical Operation Analyzer is a Java-based desktop application that performs core arithmetic operations using an intuitive Graphical User Interface (GUI).
The project is built using Apache Maven and follows industry-standard DevOps practices with GitHub Actions CI pipeline for automated builds.

🚀 Features

User-friendly GUI built using Java Swing

Supports Addition, Subtraction, Multiplication, Division

Handles invalid inputs (e.g., division by zero)

Fully object-oriented design

Executable JAR — runs on any system with Java installed

Continuous Integration enabled via GitHub Actions

🛠️ Tech Stack
Component	Technology
Language	Java (JDK 17)
Build Tool	Apache Maven
CI/CD	GitHub Actions
GUI Library	Java Swing
Version Control	Git + GitHub
📂 Project Structure
calculator-app
 ├─ src
 │  ├─ main
 │  │  └─ java/com/abhay/calculator
 │  │      ├─ App.java
 │  │      └─ CalculatorGUI.java   ← main GUI
 │  └─ test/java/com/abhay/calculator
 │     └─ AppTest.java
 ├─ pom.xml
 └─ README.md

▶ How to Run
🔹 Option 1 — Using Maven (recommended)
mvn exec:java

🔹 Option 2 — Run the JAR (double-click supported)

First build:

mvn clean package


Then run:

java -jar target/calculator-app-1.0-SNAPSHOT.jar

🖥 GUI Snapshot

The application includes:

Input for Number 1

Input for Number 2

Operation selector (+ – × ÷)

Calculate button

Result display label

🤝 DevOps Integration

This project includes a GitHub Actions CI workflow that automatically:

Checks out source code

Installs JDK 17

Builds the project using Maven

Verifies successful compilation

Status badge at the top of this README reflects real-time build status.

🌱 Future Enhancements

Planned upgrades for next versions:

Scientific calculator mode (log, sin, cos, power)

Calculation history

Light/Dark UI theme

Web version using Spring Boot

Containerization using Docker

Deployment to AWS / Render

👨‍💻 Author

Abhay Chaudhary
📌 Java | Maven | GitHub Actions | DevOps Enthusiast
🔗 GitHub: @abhaychaudhary18

⭐ Contributions

Pull requests and suggestions are welcome!
If you like this project, don’t forget to star ⭐ the repository.
