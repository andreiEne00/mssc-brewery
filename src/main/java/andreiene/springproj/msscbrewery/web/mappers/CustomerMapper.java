package andreiene.springproj.msscbrewery.web.mappers;

import andreiene.springproj.msscbrewery.domain.Customer;
import andreiene.springproj.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto (Customer customer);
    Customer customerDtoCustomer (CustomerDto customerDto);
}
