package com.cloudbees.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import com.cloudbees.model.Product;

/**
 * A delegate to be called by the {@link ProductAPIController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T00:08:19.694326500+05:30[Asia/Calcutta]")
public interface ProductAPIDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PATCH /api/applyDiscount/{id} : Apply Discount
     * Apply Discount to promote sales
     *
     * @param id Product Id (required)
     * @param discountPercentage  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#applyDiscount
     */
    default ResponseEntity<Product> applyDiscount(Long id,
        Double discountPercentage) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /api/applyTax/{id} : Apply Tax
     * Apply tax for regulatory compliance
     *
     * @param id Product Id (required)
     * @param taxRate  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#applyTax
     */
    default ResponseEntity<Product> applyTax(Long id,
        Double taxRate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /api/addProduct : Add a new Product
     * creates a new Product
     *
     * @param product  (optional)
     * @return Created (status code 201)
     *         or Missing Required Information (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#createProduct
     */
    default ResponseEntity<Product> createProduct(Product product) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /api/deleteProduct/{id} : Delete a Product
     * To delete an existing product.  
     *
     * @param id Product Id (required)
     * @return Product Deleted Successfully (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#deleteProduct
     */
    default ResponseEntity<String> deleteProduct(Long id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/getAllProducts : Get all products
     * Retrive all products
     *
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#getAllProducts
     */
    default ResponseEntity<List<Product>> getAllProducts() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }, { \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /api/getProduct/{id} : Get Product Info by Product ID
     * Retrieve the information of the Product with the matching Product ID.
     *
     * @param id Product Id (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Product Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#getProductById
     */
    default ResponseEntity<Optional<Product>> getProductById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /api/updateProduct/{id} : Update Product Information
     * Update the information of an existing product.
     *
     * @param id Product Id (required)
     * @param product  (optional)
     * @return Product information Updated (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     * @see ProductAPI#updateProduct
     */
    default ResponseEntity<Product> updateProduct(Long id,
        Product product) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantityAvailable\" : 0, \"productId\" : 0, \"price\" : 0.6027456183070403, \"name\" : \"name\", \"description\" : \"description\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
