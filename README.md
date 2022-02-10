## Spring Boot Microservice 2 - Transaction Service

### Endpoint

#### 1- Save Transaction

````
POST /api/transaction HTTP/1.1
Host: localhost:4444
Authorization: Basic base64(username:password)
Content-Type: application/json
Cookie: JSESSIONID=F2870CF9AD6F9A67FD8E9EB89C9A4A99
Content-Length: 42

{
    "userId": 1,
    "productId": 1
}
````

#### 2- Find All Transactions Of User
````
GET /api/transaction/1 HTTP/1.1
Host: localhost:4444
Cookie: JSESSIONID=F2870CF9AD6F9A67FD8E9EB89C9A4A99
````

#### 3- Delete Transaction
````
DELETE /api/transaction/2 HTTP/1.1
Host: localhost:4444
Cookie: JSESSIONID=F2870CF9AD6F9A67FD8E9EB89C9A4A99
````