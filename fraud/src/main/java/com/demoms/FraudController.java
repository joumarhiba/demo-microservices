package com.demoms;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/fraud-check")
@AllArgsConstructor
@Slf4j

public class FraudController {

    private final FraudCheckService fraudCheckService;



    @GetMapping(path = "{customerId}")
    public FraudCheckResponse inFraudster(@PathVariable("customerId") Long customerId ) {
        Boolean isFraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        log.info("fraud check request for customer {} ", customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
