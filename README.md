# Prueba Tecnica


## Run Locally

Clone the project

```bash
  git clone https://github.com/jalucenyo/ecomerce-technicaltest.git
```

Go to the project directory

```bash
  cd ecomerce-technicaltest
```

Start the server

```bash
  mvn spring-boot:run
```

## Running Tests

To run tests, run the following command

```bash
  mvn test
```

## API Reference

#### Get price

```http
  GET /api/v1/prices
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `applyDate` | `datetime` | **Required**.  Date query |
| `productId` | `number` | **Required**. Product id |
| `brandId` | `number` | **Required**. Brand Id |
