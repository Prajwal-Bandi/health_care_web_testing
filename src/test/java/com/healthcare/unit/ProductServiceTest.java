package com.healthcare.unit;

import com.healthcare.service.ProductService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductServiceTest {

    @Test
    public void addProductTest() {
        ProductService service = new ProductService();
        Assert.assertTrue(service.addProduct("Paracetamol", 50));
    }
}
