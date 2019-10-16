package io.swagger.api;

import io.swagger.model.ErrorModel;
import org.threeten.bp.OffsetDateTime;
import io.swagger.model.OrderModel;

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
public class OmmApiControllerIntegrationTest {

    @Autowired
    private OmmApi api;

    @Test
    public void ommOrdersGetTest() throws Exception {
        Integer offset = 56;
        Integer limit = 56;
        OffsetDateTime odf = new OffsetDateTime();
        OffsetDateTime odt = new OffsetDateTime();
        Double oaf = 3.4D;
        Double oat = 3.4D;
        String csp = "csp_example";
        String tp1 = "tp1_example";
        ResponseEntity<List<OrderModel>> responseEntity = api.ommOrdersGet(offset, limit, odf, odt, oaf, oat, csp, tp1);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void ommOrdersOrderIdGetTest() throws Exception {
        String orderId = "orderId_example";
        ResponseEntity<OrderModel> responseEntity = api.ommOrdersOrderIdGet(orderId);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void ommOrdersOrderIdPutTest() throws Exception {
        String orderId = "orderId_example";
        OrderModel body = new OrderModel();
        ResponseEntity<OrderModel> responseEntity = api.ommOrdersOrderIdPut(orderId, body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void ommOrdersOrderIdStatusOrderStatusPatchTest() throws Exception {
        String orderId = "orderId_example";
        String orderStatus = "orderStatus_example";
        ResponseEntity<Void> responseEntity = api.ommOrdersOrderIdStatusOrderStatusPatch(orderId, orderStatus);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

    @Test
    public void ommOrdersPostTest() throws Exception {
        OrderModel body = new OrderModel();
        ResponseEntity<OrderModel> responseEntity = api.ommOrdersPost(body);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}
