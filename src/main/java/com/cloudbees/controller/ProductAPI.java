/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.cloudbees.controller;


import java.util.List;
import java.util.Optional;

import javax.annotation.Generated;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudbees.model.GenericResponse;
import com.cloudbees.model.Product;
import com.cloudbees.model.ProductModificationRequest;
import com.cloudbees.model.ProductResponse;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T10:40:44.336476700+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ProductAPI {

    default ProductAPIDelegate getDelegate() {
        return new ProductAPIDelegate() {};
    }

    /**
     * POST /api/product : Add a new Product
     * creates a new Product
     *
     * @param product  (optional)
     * @return Created (status code 201)
     *         or Missing Required Information (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "createProduct",
        summary = "Add a new Product",
        description = "creates a new Product",
        responses = {
            @ApiResponse(responseCode = "201", description = "Created", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
            }),
            @ApiResponse(responseCode = "400", description = "Missing Required Information", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/product",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Product> createProduct(
        @Parameter(name = "Product", description = "") @Valid @RequestBody(required = false) Product product
    ) {
        return getDelegate().createProduct(product);
    }


    /**
     * DELETE /api/products/{product-id} : Delete a Product
     * To delete an existing product.  
     *
     * @param productId Product ID (required)
     * @return Product Deleted Successfully (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "deleteProduct",
        summary = "Delete a Product",
        description = "To delete an existing product.  ",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "Product Deleted Successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/products/{product-id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> deleteProduct(
        @Parameter(name = "product-id", description = "Product ID", required = true, in = ParameterIn.PATH) @PathVariable("product-id") Long productId
    ) {
        return getDelegate().deleteProduct(productId);
    }


    /**
     * GET /api/products : Get all products
     * Retrive all products
     *
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getAllProducts",
        summary = "Get all products",
        description = "Retrive all products",
        tags = { "Products" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/products",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Product>> getAllProducts(
        
    ) {
        return getDelegate().getAllProducts();
    }


    /**
     * GET /api/products/{product-id} : Get Product Info by Product ID
     * Retrieve the information of the Product with the matching Product ID.
     *
     * @param productId Product ID (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Product Not Found (status code 404)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "getProductById",
        summary = "Get Product Info by Product ID",
        description = "Retrieve the information of the Product with the matching Product ID.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Product Not Found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/products/{product-id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Optional<Product>> getProductById(
        @Parameter(name = "product-id", description = "Product ID", required = true, in = ParameterIn.PATH) @PathVariable("product-id") Long productId
    ) {
        return getDelegate().getProductById(productId);
    }


    /**
     * POST /api/products/{product-id}/applyModification : Apply Discount or deduct tax
     * Appy Discount or deduct tax
     *
     * @param productId Product ID (required)
     * @param postApiProductProductIdApplyModificationRequest  (optional)
     * @return OK (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "postApiProductProductIdApplyModification",
        summary = "Apply Discount or deduct tax",
        description = "Appy Discount or deduct tax",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductResponse.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductResponse.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/products/{product-id}/applyModification",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<ProductResponse> postApiProductProductIdApplyModification(
        @Parameter(name = "product-id", description = "Product ID", required = true, in = ParameterIn.PATH) @PathVariable("product-id") Long productId,
        @Parameter(name = "PostApiProductProductIdApplyModificationRequest", description = "") @Valid @RequestBody(required = false) ProductModificationRequest postApiProductProductIdApplyModificationRequest
    ) {
        return getDelegate().applyModification(productId, postApiProductProductIdApplyModificationRequest);
    }


    /**
     * PATCH /api/products/{product-id} : Update Product Information
     * Update the information of an existing product.
     *
     * @param productId Product ID (required)
     * @param product  (optional)
     * @return Product information Updated (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Method Not Allowed (status code 405)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "updateProduct",
        summary = "Update Product Information",
        description = "Update the information of an existing product.",
        tags = {  },
        responses = {
            @ApiResponse(responseCode = "200", description = "Product information Updated", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
            }),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "405", description = "Method Not Allowed", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/api/products/{product-id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Product> updateProduct(
        @Parameter(name = "product-id", description = "Product ID", required = true, in = ParameterIn.PATH) @PathVariable("product-id") Long productId,
        @Parameter(name = "Product", description = "") @Valid @RequestBody(required = false) Product product
    ) {
        return getDelegate().updateProduct(productId, product);
    }

}
