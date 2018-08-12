package com.sda.strategy;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentModel {
    private String author;
    private String source;
    private String to;
    private int amount;
    private String currency;
    private String preferredMode;
}
