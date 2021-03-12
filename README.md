# rest-client-employees project

This project is an API gives Employee information hosted at Heroku, and using MOCK data provided from Mockaroo.

API is using Quarkus framework.

## Technical Specs

Database: heroku.com / Postgres

Data: Mock data from https://www.mockaroo.com/

Entity: Panache

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## API Endpoints


@GET
#### `/employees?page={id}&limit={limit}&sortBy={id}`

Lists all employees from Employees table. `application/json`


**page:** activepage\
**limit:** rows per page\
**sortBy:** sort data depending on provided column, default: id\

```shell script
curl -X -GET http://localhost:8080/employees?page={id}&limit={limit}&sortBy={id}
```


@GET
#### `/employees/department/{limit}/{page}/{department}`

Lists all employees in a specific department from Employees table. `application/json`

**page:** activepage\
**limit:** rows per page\
**department:** department name

```shell script
curl -X -GET http://localhost:8080/employees/department/{limit}/{page}/{department}
```

@GET
#### `/employees/{id}`

Returns employee detail by id. `application/json`

```shell script
curl -X -GET http://localhost:8080/employees/{id}
```


@GET
#### `/employees/email/{email}`

Returns employee detail by e-mail. `application/json`

```shell script
curl -X -GET http://localhost:8080/employees/email/{email}
```


@GET
#### `/employees/jobtitle/{jobtitle}`

Returns employee detail by e-mail. `application/json`

```shell script
curl -X -GET http://localhost:8080/employees/jobtitle/{jobtitle}
```


@DELETE
#### `/employees/{id}`

Deletes employee by id.

```shell script
curl -X -DELETE http://localhost:8080/employees/{id}
```


@DELETE
#### `/employees&ids={ids as String divided by ","}`

Deletes multiple employees by ids at once.

```shell script
curl -X -DELETE http://localhost:8080/employees?ids=77,78,79
```


@POST
#### `/employees`

Creates new employee.

```shell script
curl -X POST -H "Content-Type: application/json" \
    -d '{"firstName": "John", "lastName": "Doe", "email": "john@example.com", status: 1, "dateOfBirth": "10/10/1988", "jobTitle": "Front End Developer", "department": "Finance"}' \
    http://localhost:8080/employees
```


## References
https://quarkus.io/
