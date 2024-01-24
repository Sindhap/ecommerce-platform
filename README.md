ECommerce Platform API

A comprehensive Springboot CRUD API for managing products in an eCommerce platform.



## Documentation

### OpenAPI - Stoplight

The POJO (Plain Old Java Object) and Controller classes for the API have been automatically generated based on the OpenAPI specification using Stoplight. 

The OpenAPI specification file, which serves as the source for the code generation, is available at https://github.com/Sindhap/ecommerce-platform/blob/feature_ecommerce/src/main/resources/productAPI.yaml

## Prerequisites

Ensure you have the following prerequisites before getting started:

- Java 8 or higher
- Maven
- Eclipse IDE 


## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

- DB_USERNAME:user
- DB_PASSWORD:testH2

## Run Locally

To get started with the project, follow these steps:

1. Clone the repository: `git clone https://github.com/Sindhap/ecommerce-platform.git`

2. Navigate to the project directory: `cd <project_directory>`

3. Build the project: `mvn clean install`

4. To run the application, use the following Maven command:
 `mvn spring-boot:run`
 
## Running Tests

To run tests, run the following command

mvn test

Coverage Report is available at https://github.com/Sindhap/ecommerce-platform/tree/feature_ecommerce/src/main/resources/coverage-report

## Code Quality and Scanning

### Code Scanning Status

The codebase has been scanned using CodeQL, and no code scanning alerts were found.

Also, Used [SonarLint](https://www.sonarlint.org/) in Eclipse IDE for code smell detection.

## API Reference

#### Get all products

Retrieve a list of all products.

```http
  GET /api/getAllProducts
```

#### Get Product by ProductID

Retrieve the information of the product with the matching product ID.

```http
  GET /api/getProduct/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of product to fetch |

#### Add a New Product

Create a new product.

```http
  POST /api/addProduct
```

| Fields | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `name`      | `string` | Product name |
| `description`      | `string` | Description of the product |
| `price`      | `Double` | Product price |
| `quantityAvailable`      | `Integer` | Available quantity of the product |


#### Update Product by ProductID

Update the information of an existing product.

```http
  PATCH /api/updateProduct/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of product to fetch |

#### Delete Product

Delete an existing product.

```http
  DELETE /api/deleteProduct/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of product to delete |

#### Apply Discount

Apply discount to a product to promote sales

```http
  PATCH /api/applyDiscount/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of product to update |
| `DiscountPercentage`      | `Double` | **Required**. The discount percentage to apply |


#### Apply Tax

Apply tax for regulatory compliance.

```http
  PATCH /api/applyTax/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of product to update |
| `TaxRate `      | `Double` | **Required**. The taxRate to apply |
