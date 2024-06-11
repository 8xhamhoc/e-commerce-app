package org.quangphan.customer.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.quangphan.customer.customer.Address;

public record CustomerRequest(
        String id,
        @NotNull
        String firstname,
        @NotNull
        String lastname,
        @NotNull
        @Email
        String email,
        Address address) {
}
