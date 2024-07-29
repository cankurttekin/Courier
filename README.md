# Courier Tracking
Backend service to manage/track couriers' movement and location.
Provides REST API Endpoints to create courier, update, locate and more.
Developed using design patterns such as Repository, Builder, DTO, and Singleton to ensure that it is maintainable and easy to understand. 

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Spring Web
- Lombok

## Endpoints
Base Path: /api/v1

| METHOD         | PATH           | DESCRIPTION                     |
|----------------|----------------|---------------------------------|
| `GET`            | /couriers/{id} | Get Courier By Id               |
| `POST`           | /couriers      | Create Courier                  |
| `PUT`            | /couriers/{id}/status  | Update Courier Status   |
| `GET`            | /courier-locator/{id}  | Get Courier Location By Id   |
| `POST`           | /courier-locator| Create Courier Locator         |


##
