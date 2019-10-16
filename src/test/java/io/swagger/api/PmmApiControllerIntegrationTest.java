package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.ProductModel;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PmmApiControllerIntegrationTest {

    @Autowired
    private PmmApi api;

    @Test
    public void pmmProductsGetTest() throws Exception {
        Integer offset = 56;
        Integer limit = 56;
        ResponseEntity<List<ProductModel>> responseEntity = api.pmmProductsGet(offset, limit);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void pmmProductsPossibleShipmentStartProductIdGetTest() throws Exception {
        String productId = "productId_example";
        ResponseEntity<Boolean> responseEntity = api.pmmProductsPossibleShipmentStartProductIdGet(productId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void pmmProductsPostTest() throws Exception {
        ProductModel body = new ProductModel();
        ResponseEntity<ProductModel> responseEntity = api.pmmProductsPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void pmmProductsProductIdGetTest() throws Exception {
        String productId = "productId_example";
        ResponseEntity<ProductModel> responseEntity = api.pmmProductsProductIdGet(productId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void pmmProductsProductIdPutTest() throws Exception {
        String productId = "productId_example";
        ProductModel body = new ProductModel();
        ResponseEntity<ProductModel> responseEntity = api.pmmProductsProductIdPut(productId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
