package com.eazybytes.accounts.service.impl;


import com.eazybytes.accounts.Entity.Customer;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.mapper.CustomerMapper;
import com.eazybytes.accounts.repository.AccountsRepository;
import com.eazybytes.accounts.repository.CustomerRepository;
import com.eazybytes.accounts.service.AccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountsService {
    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     *
     * @param customerDto dto obj
     */
    //empty abstract method
    @Override
    public void createAccount(CustomerDto customerDto) {
        //class 17
        Customer customer= CustomerMapper.mapToCustomer(customerDto,new Customer());
        Customer saved = customerRepository.save(customer);

    }
}
