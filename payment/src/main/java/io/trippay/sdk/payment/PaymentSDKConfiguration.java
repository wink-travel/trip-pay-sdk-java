package io.trippay.sdk.payment;

import io.trippay.sdk.payment.api.AccountApi;
import io.trippay.sdk.payment.api.AccountMappingsApi;
import io.trippay.sdk.payment.api.AffiliateApi;
import io.trippay.sdk.payment.api.AgentApi;
import io.trippay.sdk.payment.api.ContractApi;
import io.trippay.sdk.payment.api.MappingApi;
import io.trippay.sdk.payment.api.PingApi;
import io.trippay.sdk.payment.invoker.ApiClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@RequiredArgsConstructor
@Configuration
public class PaymentSDKConfiguration {
    private final WebClient webClient;

    @Bean
    public ApiClient apiClient() {
        return new ApiClient(this.webClient);
    }

    @Bean
    public AccountApi accountApi() {
        return new AccountApi(apiClient());
    }

    @Bean
    public AccountMappingsApi accountMappingsApi() {
        return new AccountMappingsApi(apiClient());
    }

    @Bean
    public MappingApi mappingApi() {
        return new MappingApi(apiClient());
    }

    @Bean
    public AgentApi agentApi() {
        return new AgentApi(apiClient());
    }

    @Bean
    public ContractApi contractApi() {
        return new ContractApi(apiClient());
    }

    @Bean
    public PingApi pingApi() {
        return new PingApi(apiClient());
    }

    @Bean
    public AffiliateApi affiliateApi() {
        return new AffiliateApi(apiClient());
    }

}
