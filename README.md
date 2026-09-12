# Product Management System

A simple Product Management System built using **Java, Spring Boot, Spring Data JPA, MySQL, HTML, CSS, and JavaScript**.

## Features

- Add Product
- View All Products
- Search Product
- Update Product
- Delete Product
- REST API integration
- MySQL database integration

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- HTML, CSS, JavaScript
- Maven
- Git & GitHub

## Project Structure

```text
src/main/java
└── com.product_mgmt
    ├── controller
    │   ├── PageController.java
    │   └── ProductController.java
    │
    ├── entity
    │   └── Product.java
    │
    ├── repository
    │   └── ProductRepository.java
    │
    └── service
        ├── ProductService.java
        └── ProductServiceImplementation.java

src/main/resources
├── static
│   ├── admin-home.html
│   ├── product-mgmt.html
│   ├── add-product.html
│   ├── update-product.html
│   ├── search-product.html
│   ├── product-details.html
│   ├── view-all-products.html
│   └── delete-product.html
│
└── application.properties
```

## REST APIs

| Method | Endpoint | Description |
|---|---|---|
| POST | `/addProduct` | Add product |
| GET | `/viewAllProducts` | View all products |
| GET | `/viewProduct/{prodId}` | View product |
| PATCH | `/updateProduct` | Update product |
| DELETE | `/deleteProduct/{prodId}` | Delete product |

## How to Run

1. Configure MySQL in `application.properties`.
2. Run the Spring Boot application.
3. Open `http://localhost:8080/`

## Author

**Sandesh Singh**
