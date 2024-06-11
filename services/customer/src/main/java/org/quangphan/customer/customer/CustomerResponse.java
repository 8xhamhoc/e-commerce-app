package org.quangphan.customer.customer;

import org.quangphan.customer.customer.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {
}
