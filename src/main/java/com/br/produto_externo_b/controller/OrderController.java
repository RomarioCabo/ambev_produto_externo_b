package com.br.produto_externo_b.controller;

import com.br.produto_externo_b.domain.order.OrderRequest;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Tags(@Tag(name = "Pedido", description = "Pedido REST Controller"))
public interface OrderController {

    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "Pedido processado.",
                    content = @Content(
                            mediaType = APPLICATION_JSON_VALUE,
                            schema = @Schema()
                    )
            ),
    })
    @PostMapping(
            value = "pedido",
            consumes = APPLICATION_JSON_VALUE
    )
    ResponseEntity<Void> receiveOrder(@RequestBody OrderRequest request);
}
