package com.samsungsds.eshop.common;

import com.samsungsds.eshop.cart.CartService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.client.RestTemplate;

@ExtendWith(SpringExtension.class)
public class TestTest {

    @InjectMocks
    CartService cartService;

    @Mock
    RestTemplate restTemplate;

    @Test
    void name() {
//        when(cartService.getCartItems()).thenReturn(null);
//        cartService.getCartItems();
    }
}
