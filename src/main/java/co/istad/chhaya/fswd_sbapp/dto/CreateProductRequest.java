package co.istad.chhaya.fswd_sbapp.dto;

import java.math.BigDecimal;

public record CreateProductRequest(
        String name,
        double price
){
}
