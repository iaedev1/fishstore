package org.vaadin.example.backend;

import org.junit.Before;
import org.junit.Test;

import org.vaadin.example.bookstore.backend.DataService;
import org.vaadin.example.bookstore.backend.data.Product;
import org.vaadin.example.bookstore.backend.data.ProductType;
import org.vaadin.example.bookstore.backend.mock.MockDataService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Simple unit test for the back-end data service.
 */
public class DataServiceTest {

    private DataService service;

    @Before
    public void setUp() throws Exception {
        service = MockDataService.getInstance();
    }

    @Test
    public void testDataServiceCanFetchProducts() throws Exception {
        assertFalse(service.getAllProducts().isEmpty());
    }

    @Test
    public void testDataServiceCanFetchCategories() throws Exception {
        assertFalse(service.getAllCategories().isEmpty());
    }

    @Test
    public void testUpdateProduct_updatesTheProduct() throws Exception {
        Product p = service.getAllProducts().iterator().next();
        p.setProductName("Fresh Tuna Fillet");
        p.setProductType(ProductType.FILLET);
        service.updateProduct(p);
        Product p2 = service.getAllProducts().iterator().next();
        assertEquals("Fresh Tuna Fillet", p2.getProductName());
        assertEquals(ProductType.FILLET, p2.getProductType());
    }
}
