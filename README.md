# REST API Fundamentals - Spring Boot

A Spring Boot REST API project demonstrating fundamental HTTP operations and RESTful design principles.

## 🎯 Purpose
This project was built to learn and practice:
- RESTful API design principles
- HTTP methods (GET, POST, PUT, DELETE)
- Spring Boot framework basics
- Request/Response handling with JSON
- API testing with Postman

## 🚀 Tech Stack
- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **API Testing:** Postman
- **Data Storage:** In-memory (ArrayList/HashMap)

## 📋 Features
- ✅ Create new records (POST)
- ✅ Retrieve all records (GET)
- ✅ Retrieve single record by ID (GET)
- ✅ Update existing records (PUT)
- ✅ Delete records (DELETE)
- ✅ Proper HTTP status codes (200, 201, 404, etc.)
- ✅ JSON request/response format

## 🛠️ Setup & Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Running the Application
```bash

Ah, perfect! Now I understand. This is a learning project for REST API fundamentals without database persistence - just in-memory data structures. This is actually GREAT for demonstrating REST concepts!
Let me give you the perfect way to present this:

🎯 Your Rest_API Project - Perfect Explanation
📋 What Your Project Actually Is:
A Spring Boot REST API Learning Project that demonstrates:

✅ HTTP methods (GET, POST, PUT, DELETE)
✅ RESTful endpoint design
✅ Request/Response handling with JSON
✅ In-memory data management (ArrayList/HashMap)
✅ API testing with Postman
✅ Spring Boot fundamentals

This is PERFECT for learning and interviews! It shows you understand REST concepts without the complexity of database configuration.

📝 How to Present This on Your Resume
Option 1: Honest & Professional (RECOMMENDED)
latex\resumeProjectHeading
    {\textbf{REST API Fundamentals Project} $|$ \emph{Spring Boot, Java, Maven, Postman}}
{\href{https://github.com/Snehalmahasagar/Rest_API}{\underline{GitHub}}}
    \resumeItemListStart
      \resumeItem{Built RESTful web service using \textbf{Spring Boot} to demonstrate HTTP methods (GET, POST, PUT, DELETE) with in-memory data management.}
      \resumeItem{Implemented \textbf{REST controllers} with proper endpoint design, JSON request/response handling, and HTTP status codes.}
      \resumeItem{Tested API endpoints using \textbf{Postman} and validated CRUD operations following RESTful conventions.}
    \resumeItemListEnd
Option 2: Slightly Enhanced (Still Honest)
latex\resumeProjectHeading
    {\textbf{RESTful API Service} $|$ \emph{Spring Boot, Java, Maven, REST API}}
{\href{https://github.com/Snehalmahasagar/Rest_API}{\underline{GitHub}}}
    \resumeItemListStart
      \resumeItem{Developed RESTful web service using \textbf{Spring Boot} implementing CRUD operations with in-memory data structures.}
      \resumeItem{Designed \textbf{REST endpoints} following HTTP standards with proper methods, status codes, and JSON serialization.}
      \resumeItem{Applied \textbf{OOP principles} and layered architecture (Controller-Service pattern) for clean code organization.}
    \resumeItemListEnd

📄 README.md for Your Repository
Add this to your GitHub repo RIGHT NOW:
markdown# REST API Fundamentals - Spring Boot

A Spring Boot REST API project demonstrating fundamental HTTP operations and RESTful design principles.

## 🎯 Purpose
This project was built to learn and practice:
- RESTful API design principles
- HTTP methods (GET, POST, PUT, DELETE)
- Spring Boot framework basics
- Request/Response handling with JSON
- API testing with Postman

## 🚀 Tech Stack
- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven
- **API Testing:** Postman
- **Data Storage:** In-memory (ArrayList/HashMap)

## 📋 Features
- ✅ Create new records (POST)
- ✅ Retrieve all records (GET)
- ✅ Retrieve single record by ID (GET)
- ✅ Update existing records (PUT)
- ✅ Delete records (DELETE)
- ✅ Proper HTTP status codes (200, 201, 404, etc.)
- ✅ JSON request/response format

## 🛠️ Setup & Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Running the Application
```bash
# Clone the repository
git clone https://github.com/Snehalmahasagar/Rest_API.git

# Navigate to project directory
cd Rest_API

# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080`

## 📡 API Endpoints

| Method | Endpoint | Description | Request Body |
|--------|----------|-------------|--------------|
| GET | `/api/items` | Get all items | - |
| GET | `/api/items/{id}` | Get item by ID | - |
| POST | `/api/items` | Create new item | JSON object |
| PUT | `/api/items/{id}` | Update item | JSON object |
| DELETE | `/api/items/{id}` | Delete item | - |

### Example Request (POST)
```json
{
  "id": 1,
  "name": "Sample Item",
  "description": "This is a sample item"
}
```

### Example Response (GET)
```json
[
  {
    "id": 1,
    "name": "Sample Item",
    "description": "This is a sample item"
  }
]
```

## 🧪 Testing with Postman

1. Start the application
2. Open Postman
3. Test endpoints:
   - **GET** all: `http://localhost:8080/api/items`
   - **POST** create: `http://localhost:8080/api/items` with JSON body
   - **GET** by ID: `http://localhost:8080/api/items/1`
   - **PUT** update: `http://localhost:8080/api/items/1` with JSON body
   - **DELETE**: `http://localhost:8080/api/items/1`

## 📚 What I Learned
- Spring Boot application structure
- `@RestController` and `@RequestMapping` annotations
- HTTP method mapping (`@GetMapping`, `@PostMapping`, etc.)
- Request/Response handling with `@RequestBody` and `@PathVariable`
- HTTP status codes and `ResponseEntity`
- RESTful API design principles
- API testing workflows

## 🔄 Future Enhancements
- [ ] Add database integration (MySQL/MongoDB)
- [ ] Implement Spring Data JPA
- [ ] Add input validation
- [ ] Add exception handling with `@ControllerAdvice`
- [ ] Add Swagger/OpenAPI documentation
- [ ] Add unit tests with JUnit and Mockito

## 📝 License
MIT License

---

**Built as a learning project to understand REST API fundamentals with Spring Boot**
