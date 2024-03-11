# Order Tracking Application

This is a RESTful API for managing products and orders in an order tracking application.

## Features

- **Products**: CRUD operations for managing products.
- **Orders**: CRUD operations for managing orders.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL Database
- Swagger (for API documentation)

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/order-tracking.git
    ```

2. Navigate to the project directory:

    ```bash
    cd order-tracking
    ```

3. Build the project using Maven:

    ```bash
    mvn clean package
    ```

4. Run the application:

    ```bash
    java -jar target/order-tracking-0.0.1-SNAPSHOT.jar
    ```

5. Access the Swagger UI:

    Open your web browser and go to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to view and interact with the API documentation.

## API Endpoints

The following endpoints are available:

- **GET /products/all**: Get all products.
- **POST /products/add**: Add a new product.
- **GET /products/{id}**: Get a product by ID.
- **POST /products/save**: Save a product.
- **DELETE /products/delete/{id}**: Delete a product by ID.
- **GET /products/category/{category}**: Get products by category.
- **GET /products/filter**: Filter products by price range.

For a complete list of endpoints and their details, refer to the Swagger documentation.


## Application Configuration

The application is configured with the following settings:

- **Database URL**: jdbc:postgresql://localhost:5432/trackingsystem
- **Database Username**: postgres
- **Database Password**: 1234
- **Hibernate Dialect**: org.hibernate.dialect.PostgreSQLDialect
- **Hibernate DDL Mode**: update
- **Show SQL**: true
- **Validation Mode**: none
- **Active Profile**: development

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and create a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.



