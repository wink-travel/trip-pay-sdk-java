package io.trippay.sdk.payment.acquiring;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import io.trippay.sdk.payment.acquiring.api.AffiliateApi;
import io.trippay.sdk.payment.acquiring.api.ContractApi;
import io.trippay.sdk.payment.acquiring.api.NmiApi;
import io.trippay.sdk.payment.acquiring.api.StripeApi;
import io.trippay.sdk.payment.acquiring.invoker.ApiClient;

@RequiredArgsConstructor
@Configuration
public class PaymentAcquiringSDKConfiguration {
	private final WebClient webClient;

	@Bean
	public ApiClient apiClient() {
		return new ApiClient(this.webClient);
	}

	@Bean
	public AffiliateApi affiliateApi() {
		return new AffiliateApi(apiClient());
	}
	@Bean
	public ContractApi contractApi() {
		return new ContractApi(apiClient());
	}
	@Bean
	public NmiApi nmiApi() {
		return new NmiApi(apiClient());
	}
	@Bean
	public StripeApi stripeApi() {
		return new StripeApi(apiClient());
	}
}
