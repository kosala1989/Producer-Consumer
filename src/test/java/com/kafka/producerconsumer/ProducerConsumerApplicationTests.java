package com.kafka.producerconsumer;

import com.kafka.producerconsumer.model.CryptoHealthRate;
import com.kafka.producerconsumer.service.CryptoService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProducerConsumerApplicationTests {

	private CryptoService cryptoService;

	@Test
	public void fetch_stock_data_from_market_feed(){
		CryptoHealthRate cryptoHealthRate = cryptoService.getHealthInfo("BTC");
		Assertions.assertThat(cryptoHealthRate.getSymbol()).isEqualTo("BTC");
		Assertions.assertThat(cryptoHealthRate.getRating()).isEqualTo("Attractive");
		Assertions.assertThat(cryptoHealthRate.getName()).isEqualTo("Bitcoin");

	}

}
