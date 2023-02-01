package com.demoms;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fraud-check")
@AllArgsConstructor

public class FraudController {

    private final FraudCheckService fraudCheckService;



    @GetMapping(path = "{customerId}")
    public FraudCheckResponse inFraudster(@PathVariable("customerId") Long customerId ) {
        Boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
