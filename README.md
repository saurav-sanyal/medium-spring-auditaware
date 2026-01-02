# Spring Boot AuditorAware + MongoDB Example

This project demonstrates how to use Spring Data MongoDB's auditing features with a custom `AuditorAware` implementation in a Spring Boot application.

## Features
- MongoDB integration
- Auditing fields: `createdBy`, `createdDate`, `lastModifiedBy`, `lastModifiedDate`
- Simple REST API for a `Note` entity

## Prerequisites
- Java 17+
- Maven
- MongoDB running locally on default port (27017)

## How to Run
1. Start MongoDB locally (default port 27017).
2. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```
3. Test the API:
   - Create a note:
     ```sh
     curl -X POST -H "Content-Type: application/json" -d '{"content":"Hello, world!"}' http://localhost:8080/api/notes
     ```
   - List notes:
     ```sh
     curl http://localhost:8080/api/notes
     ```

## AuditorAware
The current user is hardcoded as `tutorial-user` in `AuditorAwareConfig`. In a real application, integrate with your authentication system.

## Project Structure
- `model/Note.java`: Entity with auditing fields
- `repository/NoteRepository.java`: MongoDB repository
- `controller/NoteController.java`: REST API
- `config/AuditorAwareConfig.java`: Auditor provider

---

Replace any hardcoded values as needed for your use case.
