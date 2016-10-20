package com.java.courses.injection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    private AbstractService abstractService;

    @Before
    public void setUp() {
        when(abstractService.sendEmail(anyObject())).thenReturn(true);
    }

    @Test
    public void proceedWithOrderTest() {
        Product product = new Product("TV", new BigDecimal(35.58));
        Cart cart = new Cart(product, 5);

        OrderService service = new OrderService(abstractService);

        BigDecimal result = service.proceedWithOrder(cart);

        assertThat(result, is(new BigDecimal(40.5799999999999982946974341757595539093017578125)));
    }

    /*
    class MockEmailService implements AbstractService {
        @Override
        public boolean sendEmail(BigDecimal sum) {
            return true;
        }
    }
    */


}
