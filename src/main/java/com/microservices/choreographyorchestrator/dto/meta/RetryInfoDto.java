package com.microservices.choreographyorchestrator.dto.meta;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RetryInfoDto {
    private Integer timeout;

    private String timeUnit;

    private Integer attempts;

    private KafkaRetryDto kafkaRetry;
}
