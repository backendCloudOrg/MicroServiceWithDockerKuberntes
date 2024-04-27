package com.eazybytes.accounts.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity@Getter
@Setter@ToString@NoArgsConstructor@AllArgsConstructor
public class Customer extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private Long customerId;
    private String name;
    private String email;
    private String mobileNumber;


}
