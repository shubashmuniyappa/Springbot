Farm Application

Overview
The Farm Application is a Spring Boot-based web application designed to manage various aspects of a farm, including products, orders, carts, and user accounts. It provides functionalities for user registration, authentication, product management, cart operations, and order processing.

Features
User registration and authentication
Product management (CRUD operations)
Cart management (add, remove, and view items)
Order processing
Commenting on products
Email confirmation for user registration
JWT-based authentication for secure API access
CORS support for frontend applications

Technologies Used
Java 17: The programming language used for the application.
Spring Boot 3.3.2: Framework for building the application.
Spring Data JPA: For database interactions.
Hibernate: ORM for managing database entities.
MySQL: Database for storing application data.
MapStruct: For mapping between DTOs and entities.
Lombok: To reduce boilerplate code.
Postman: For API testing.
Maven: For project management and dependency management.

Getting Started

Prerequisites
Java 17 or higher
Maven
MySQL Server
Installation
Clone the repository:
git clone <repository-url>
cd farm

Set up the database:

Create a new MySQL database (e.g., farm_db).
Update the application.properties file with your database credentials:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/farm_db
spring.datasource.username=your_username
spring.datasource.password=your_password

Build the application:
mvn clean install

Run the application:
mvn spring-boot:run

API Endpoints
User Registration: POST /api/auth/register
User Login: POST /api/auth/login
Get User Role: GET /api/auth/user/role
Get User by ID: GET /api/auth/user/{id}
Add Product: POST /api/products
Update Product: PUT /api/products/{id}
Delete Product: DELETE /api/products/{id}
Get All Products: GET /api/products
Add to Cart: POST /api/cart/add
Get Cart: GET /api/cart
Clear Cart: DELETE /api/cart
Remove Cart Item: DELETE /api/cart/{productId}
Add Comment: POST /api/comments/product/{productId}
Get Comments by Product: GET /api/comments/product/{productId}
Create Order: POST /api/orders
Get User Orders: GET /api/orders/user
Get All Orders: GET /api/orders

CORS Configuration
The application is configured to allow CORS requests from http://localhost:3000. You can modify the allowed origins in the CorsConfig class.

Testing
API tests can be run using Postman:
