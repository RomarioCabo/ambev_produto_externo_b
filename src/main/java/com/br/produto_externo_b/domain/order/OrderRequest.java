package com.br.produto_externo_b.domain.order;

import com.br.produto_externo_b.domain.enums.Status;
import com.br.produto_externo_b.domain.product.ProductRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequest {
    @JsonProperty("order_id")
    private UUID id;
    private BigDecimal total;
    private Status status;
    private List<ProductRequest> products;
}
