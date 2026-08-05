package com.sub.bank.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bank_accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Bank Account Entity")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique Account ID", example = "1")
    private Long accountId;

    @NotBlank(message = "Account Holder Name is required")
    @Schema(description = "Account Holder Name", example = "Subham Behera")
    private String accountHolderName;

    @NotBlank(message = "Account Type is required")
    @Schema(description = "Account Type", example = "SAVINGS")
    private String accountType;

    @Min(value = 0, message = "Balance cannot be negative")
    @Schema(description = "Available Balance", example = "50000")
    private Double balance;

    @Email(message = "Enter valid Email")
    @Schema(description = "Email Address", example = "subham@gmail.com")
    private String email;

    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid Mobile Number")
    @Schema(description = "Mobile Number", example = "9876543210")
    private String mobile;
}
