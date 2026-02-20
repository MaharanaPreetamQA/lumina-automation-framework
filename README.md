# Lumina Automation Framework

![Java](https://img.shields.io/badge/Java-11-blue)
![Selenium](https://img.shields.io/badge/Selenium-4.15-green)
![TestNG](https://img.shields.io/badge/TestNG-7.8-orange)

## 📋 Overview
This is a **hybrid automation testing framework** built for e-commerce applications using Selenium WebDriver, Java, and TestNG. It follows the **Page Object Model (POM)** design pattern for better maintainability and reusability.

This framework was developed during my work on **Project Lumina**, a DTC fashion e-commerce platform for a UK-based client.

## 🚀 Tech Stack
- **Language:** Java 11
- **Automation Tool:** Selenium WebDriver 4.15
- **Test Runner:** TestNG 7.8
- **Build Tool:** Maven
- **Design Pattern:** Page Object Model (POM)

## 📁 Project Structure
lumina-automation-framework/
├── src/
│ ├── main/java/
│ │ └── pages/
│ │ ├── LoginPage.java
│ │ ├── HomePage.java
│ │ └── CartPage.java
│ └── test/java/
│ └── tests/
│ └── LoginTest.java
├── pom.xml
├── testng.xml
├── Manual-Test-Cases.md
└── README.md

## ✨ Features
- ✅ Page Object Model for clean code separation
- ✅ Reusable components
- ✅ Explicit waits for dynamic elements
- ✅ Data-driven testing support
- ✅ Detailed test reports

## 🔧 Setup Instructions
1. Clone the repository
2. Import as Maven project in Eclipse/IntelliJ
3. Run tests using: `mvn clean test`

## 🧪 Test Scenarios Covered
- Valid and invalid login
- Empty field validation
- Product search
- Add to cart operations

## 📊 Sample Bugs Found Using This Framework
- **Double Payment Bug:** Users could be charged twice on payment button double-click
- **Discount Disappearance Bug:** Coupon applied on cart but vanished at checkout
- **Mobile Menu Bug:** Hamburger menu not working on iPhone Safari

## 👨‍💻 Author
**Preetam Maharana** - Software Test Engineer

---

*Note: This framework was developed for a UK-based fashion client under NDA. Client name and proprietary information have been removed.*
