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
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloudbees.model.GenericResponse;
import com.cloudbees.model.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-24T00:08:19.694326500+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ProductAPI {

    default ProductAPIDelegate getDelegate() {
        return new ProductAPIDelegate() {};
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
     */
    @Operation(
        operationId = "applyDiscount",
        summary = "Apply Discount",
        description = "Apply Discount to promote sales",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
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
        method = RequestMethod.PATCH,
        value = "/api/applyDiscount/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Product> applyDiscount(
        @Parameter(name = "id", description = "Product Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "DiscountPercentage", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "DiscountPercentage", required = false) Double discountPercentage
    ) {
        return getDelegate().applyDiscount(id, discountPercentage);
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
     */
    @Operation(
        operationId = "applyTax",
        summary = "Apply Tax",
        description = "Apply tax for regulatory compliance",
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))
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
        method = RequestMethod.PATCH,
        value = "/api/applyTax/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Product> applyTax(
        @Parameter(name = "id", description = "Product Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "TaxRate", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "TaxRate", required = false) Double taxRate
    ) {
        return getDelegate().applyTax(id, taxRate);
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
        value = "/api/addProduct",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Product> createProduct(
        @Parameter(name = "Product", description = "") @Valid @RequestBody(required = false) Product product
    ) {
        return getDelegate().createProduct(product);
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
     */
    @Operation(
        operationId = "deleteProduct",
        summary = "Delete a Product",
        description = "To delete an existing product.  ",
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
        method = RequestMethod.DELETE,
        value = "/api/deleteProduct/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> deleteProduct(
        @Parameter(name = "id", description = "Product Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        return getDelegate().deleteProduct(id);
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
        value = "/api/getAllProducts",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Product>> getAllProducts(
        
    ) {
        return getDelegate().getAllProducts();
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
        value = "/api/getProduct/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Optional<Product>> getProductById(
        @Parameter(name = "id", description = "Product Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id
    ) {
        return getDelegate().getProductById(id);
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
        value = "/api/updateProduct/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Product> updateProduct(
        @Parameter(name = "id", description = "Product Id", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "Product", description = "") @Valid @RequestBody(required = false) Product product
    ) {
        return getDelegate().updateProduct(id, product);
    }

}
