# SVVT Project - Imtec.ba E-Commerce Testing

## Project Overview
This project contains automated functional tests for the **imtec.ba** e-commerce platform. The tests are designed to verify the core functionality of the website from an end-user perspective.

## Testing Environment and Tools

| Component | Details |
|-----------|---------|
| **Programming Language** | Java 22 |
| **Test Framework** | JUnit 5 |
| **Browser Automation** | Selenium WebDriver 4.6.0 |
| **Browser** | Google Chrome |
| **IDE** | IntelliJ IDEA |
| **Operating System** | Windows 10 |

## Project Structure

```
svvt-project/
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── BaseTest.java
│           └── tests/
│               ├── UserAuthenticationTest.java
│               ├── SearchTest.java
│               ├── NavigationTest.java
│               ├── FiltersTest.java
│               ├── SecurityTest.java
│               ├── ProfileSettingsTest.java
│               ├── ShoppingCartManagementTest.java
│               ├── StandardCheckoutProcessTest.java
│               ├── ProductDetailsTest.java
│               ├── OrderHistoryTest.java
│               ├── FooterTest.java
│               ├── SocialMediaLinksTest.java
│               ├── WishlistFunctionalityTest.java
│               ├── PersonalDataManagementTest.java
│               └── AddressManagementTest.java
├── pom.xml
└── README.md
```

## Test Scenarios

### Critical Test Scenarios

| # | Scenario | Test Cases |
|---|----------|------------|
| 1 | User Authentication | 5          |
| 2 | Search | 7          | 
| 3 | Navigation | 3          |
| 4 | Filters | 5          |
| 5 | Security | 6          |
| 6 | Profile Settings | 3          |
| 7 | Shopping Cart Management | 6          |
| 8 | Standard Checkout Process | 6          |
| 9 | Product Details | 5          |
| 10 | Order History | 4          |

### Non-Critical Test Scenarios

| # | Scenario | Test Cases |
|---|----------|------------|
| 1 | Footer | 4          | 
| 2 | Social Media Links | 4          |
| 3 | Wishlist Functionality | 3          |
| 4 | GDPR - Personal Data Management | 3          |
| 5 | Address Management | 4          |



## Test Summary

| Metric | Value |
|--------|-----|
| **Total Test Scenarios** | 15  |
| **Total Test Cases** | 70  |
| **Passed Tests** | 63  |
| **Failed Tests** | 7   |
| **Pass Rate** | 90% |



## How to Run Tests

### Prerequisites
1. Java JDK 22 or higher installed
2. Maven installed
3. Google Chrome browser installed
4. IntelliJ IDEA (recommended)

### Running Tests

**Run all tests:**
```bash
mvn test
```

**Run specific test class:**
```bash
mvn test -Dtest=ShoppingCartManagementTest
```

**Run specific test method:**
```bash
mvn test -Dtest=ShoppingCartManagementTest#addSingleProductToCartTest
```

### Running from IntelliJ IDEA
1. Open the project in IntelliJ IDEA
2. Navigate to the test class you want to run
3. Right-click on the class or method
4. Select "Run"

## Dependencies

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.6.0</version>
    </dependency>
</dependencies>
```

## Authors

| | Student 1 | Student 2 |
|---|-----------|-----------|
| **Name** | Haris Sušić | Tarik Hodžić |
| **University** | International Burch University | International Burch University |
| **Course** | Software Verification, Validation and Testing (SVVT) | Software Verification, Validation and Testing (SVVT) |
| **Date** | January 2026 | January 2026 |

## License
This project is for educational purposes only.
