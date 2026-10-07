package com.agrosense.backend.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class ProfileUpdateRequest {

    @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
    private String name; // optional — already set during registration

    @Pattern(
        regexp = "^(?:\\+94|94|0)[1-9]\\d{8}$",
        message = "Invalid phone number. Use format: 07XXXXXXXX or +94XXXXXXXXX"
    )
    private String phone; // optional

    private Long districtId;

    private Long cropId;
}
