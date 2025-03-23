# Land Sale Web Application Backend
## Using Spring boot

### This is the backend for the Land Sale Web application, built using Spring Boot. It handles all server-side logic, such as user management, land listings, and admin operations.

## Features

- User authentication and authorization (JWT Authentication)
- CRUD operations for land listings, appointment , booking and selling lands requestings
- Integration with MySQL database
- REST API endpoints for frontend communication
- Admin panel for managing land listings

## Technologies Used

- Spring Boot (Java framework)
- MySQL (Database)
- Maven (Build tool)
- JPA/Hibernate (ORM for database interaction)
- Spring Security (For user authentication and authorization)

## Setup Instructions

### Clone the repository:
```bash
git clone https://github.com/JananiShashinika/LandSaleWeb-Backend.git
```

### Navigate to the project directory:
```bash
cd LandSaleWeb-Backend
```

### Install dependencies and build the project:
```bash
./mvnw clean install
```

### Configure database details:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/landsale
spring.datasource.username=root
spring.datasource.password=password
```

### Run the application:
```bash
./mvnw spring-boot:run
```

## Contribution
Feel free to fork this repository and make improvements or contribute to the code. Please make sure to submit pull requests with detailed explanations of any changes.

