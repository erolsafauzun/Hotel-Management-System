package com.erolsafauzun.customerservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

    @Id
    private String custId;
    private String frstName;
    private String mName;
    private String lastName;
    private Date brthDate;
    private String brthPlc;
    private String natId;
    private Number isActv;


}
