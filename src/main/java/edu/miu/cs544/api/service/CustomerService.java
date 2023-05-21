package edu.miu.cs544.api.service;

import edu.miu.cs544.api.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> findAll();
    CustomerDto findById(long id);
    boolean deleteById(long id);
    boolean addNewCustomer(CustomerDto customer);
    boolean updateCustomer(CustomerDto customerDto);
    List<OfferDto> findOffersByCustomerId(long customerId);
    boolean updateOfferStatus(OfferDto offerDto, long customerId);
    boolean addCustomerToBlacklist( long customerId, long blackListedById);
    boolean addCustomerToWhitelist( long customerId, long whiteListedById);
}
