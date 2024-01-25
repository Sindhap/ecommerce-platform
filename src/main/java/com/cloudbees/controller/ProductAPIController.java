package com.cloudbees.controller;

import java.util.Optional;

import javax.annotation.Generated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-25T10:40:44.336476700+05:30[Asia/Calcutta]")
@Controller
@RequestMapping("${openapi.product.base-path:}")
public class ProductAPIController implements ProductAPI {

    private final ProductAPIDelegate delegate;

    public ProductAPIController(@Autowired(required = false) ProductAPIDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ProductAPIDelegate() {});
    }

    @Override
    public ProductAPIDelegate getDelegate() {
        return delegate;
    }

}
