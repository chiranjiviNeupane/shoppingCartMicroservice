package com.client.catalogservice.model;

import lombok.Data;

@Data
public class ProductInventoryResponse {
    private String productCode;
    private Integer availableQuantity = 0;
}