package com.eazybytes.accounts.controller;
import com.eazybytes.accounts.Constants.AccountsConstants;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api",produces = MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

   /* @GetMapping("sayHello")
    public String sayHello(){
        return "hello Abhishek";
    }*/

    public ResponseEntity<ResponseDto>createAccount(@RequestBody CustomerDto customerDTo){

        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto(AccountsConstants.STATUS_201,AccountsConstants.STATUS_201));
    }

}
