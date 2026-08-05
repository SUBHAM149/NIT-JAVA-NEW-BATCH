package com.sub.bank.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Money Transfer Request")
public class TransferRequest {

    @NotNull(message = "Sender Account ID is required")
    @Schema(description = "Sender Account ID", example = "1")
    private Long senderId;

    @NotNull(message = "Receiver Account ID is required")
    @Schema(description = "Receiver Account ID", example = "2")
    private Long receiverId;

    @NotNull(message = "Amount is required")
    @Min(value = 1, message = "Transfer amount must be greater than 0")
    @Schema(description = "Transfer Amount", example = "5000")
    private Double amount;

}
