package com.kafka.producerconsumer.service;

import com.kafka.producerconsumer.model.CryptoHealthRate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CryptoServiceTest {

    private CryptoService cryptoService;

    @Test
    public void return_Bitcoin_Health_info_for_symbol_BTC(){
        CryptoHealthRate healthRate = cryptoService.getHealthInfo("BTC");
        Assertions.assertThat(healthRate.getSymbol()).isEqualTo("BTC");
        Assertions.assertThat(healthRate.getRating()).isEqualTo("Attractive");
        Assertions.assertThat(healthRate.getName()).isEqualTo("Bitcoin");
    }
}