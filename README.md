# API Testing Framework with RestAssured

## Overview

This project is a boilerplate for an API testing framework built using **Java** and **RestAssured**. It provides a structured and maintainable way to create, manage, and execute API tests, ensuring easier validation of RESTful services for both functionality and performance.

## Features

- **API Payload Generation**: Utility classes for generating API request payloads.
- **Cucumber Integration**: Simplifies behavior-driven development (BDD) using human-readable test scenarios.
- **RestAssured**: Enables fluent and efficient testing of REST APIs, with support for assertions and validations.
- **Flexible Payload Creation**: Allows testing various scenarios like missing fields or invalid data.

## Project Structure

```plaintext
api-testing-framework/
├── .idea/                     # IDE configuration files (specific to IntelliJ IDEA)
├── src/
│   ├── main/
│   │   └── java/
│   │       └── api/
│   │           └── utils/
│   │               ├── ApiPayload.java      # Utility for generating API request payloads
│   │               └── Utility.java         # Additional helper methods for test utilities
│   └── test/
│       └── java/
│           └── api/
│               ├── runner/
│               │   └── APIRunner.java       # Entry point for running API tests
│               └── stepDefinition/
│                   └── StepDefinition.java  # Implements step definitions for Cucumber features
│       └── resources/
│           ├── Features/
│           │   └── Microsoft-CE.feature     # Cucumber feature file for defining test scenarios
│           ├── cucumber.properties          # Configuration file for Cucumber execution
│           └── microsoft_ce_url.properties  # Property file for environment-specific URLs
├── pom.xml                   # Maven configuration file for dependencies and build lifecycle
├── target/                   # Compiled class files and test results (generated after building the project)
└── README.md                 # Project documentation
```

## Folder Use Cases

### Main Code
- **`main/java/api/utils/`**: Contains reusable utility classes for the framework.
  - `ApiPayload.java`: A utility class for dynamically creating API payloads with flexible configurations.
  - `Utility.java`: Provides additional helper methods, such as common data transformations or validations.

### Test Code
- **`test/java/api/runner/APIRunner.java`**: Acts as the entry point for running test scenarios. Integrates with Cucumber and ensures proper initialization.
- **`test/java/api/stepDefinition/StepDefinition.java`**: Implements the step definitions for scenarios written in Cucumber feature files. Connects high-level test cases to specific actions and validations.

### Resources
- **`resources/Features/`**: Contains Cucumber `.feature` files, where scenarios are defined in a human-readable format.
  - Example: `Microsoft-CE.feature` contains BDD scenarios for testing specific API functionalities.
- **`resources/cucumber.properties`**: Configuration file for Cucumber, such as glue paths and plugin settings.
- **`resources/microsoft_ce_url.properties`**: Stores environment-specific URLs or other configuration properties for easier test management.

### Miscellaneous
- **`.idea/`**: IDE-specific settings for IntelliJ IDEA (not mandatory for other IDE users).
- **`pom.xml`**: Maven configuration for managing dependencies and build lifecycle.
- **`target/`**: Contains build artifacts, such as compiled class files and test results (automatically generated).

## Getting Started

### Prerequisites

Ensure the following tools are installed on your system:

- **Java** (version 8 or higher)
- **Maven**
- An IDE like **IntelliJ IDEA** or **Eclipse**

### Installation

1. Clone the repository:

   ```bash
   git clone <repository-url>
   cd api-testing-framework
   ```

2. Build the project using Maven:

   ```bash
   mvn clean install
   ```

3. Open the project in your preferred IDE.

## Usage

### Creating Payloads

Use the `ApiPayload` class to generate request payloads for your API tests. This utility provides methods for creating various payload structures with flexibility for optional fields.

### Writing Tests

Create test classes in the `src/test/java` directory. Use **RestAssured** to send HTTP requests and validate responses. Example:

```java
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class ApiTests {
    @Test
    public void testCreateAccount() {
        String payload = new ApiPayload().createAccountPayload();
        
        given()
            .contentType("application/json")
            .body(payload)
        .when()
            .post("/api/accounts")
        .then()
            .statusCode(201)
            .body("message", equalTo("Account created successfully"));
    }
}
```

### Running Tests

Run your tests using your IDE or via Maven:

```bash
mvn test
```

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch for your changes.
3. Submit a pull request with a clear description of your changes.

## License

This project is licensed under the **MIT License**. See the `LICENSE` file for more details.
