package com.kafka.producerconsumer;

import com.kafka.producerconsumer.model.CryptoHealthRate;
import com.kafka.producerconsumer.service.CryptoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@SpringBootTest
class ProducerConsumerApplicationTests {

    @Mock
    private CryptoService cryptoService;

    @Test
    public void fetch_stock_data_from_market_feed() {

        given(cryptoService.getHealthInfo(anyString()))
                .willReturn(
                        new CryptoHealthRate("BTC", "Bitcoin", "Attractive"));

        CryptoHealthRate cryptoHealthRate = cryptoService.getHealthInfo("BTC");
        Assertions.assertThat(cryptoHealthRate.getSymbol()).isEqualTo("BTC");
        Assertions.assertThat(cryptoHealthRate.getRating()).isEqualTo("Attractive");
        Assertions.assertThat(cryptoHealthRate.getName()).isEqualTo("Bitcoin");

    }

}
