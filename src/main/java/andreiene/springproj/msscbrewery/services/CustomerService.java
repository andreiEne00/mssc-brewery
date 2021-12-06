package andreiene.springproj.msscbrewery.services;

import andreiene.springproj.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
