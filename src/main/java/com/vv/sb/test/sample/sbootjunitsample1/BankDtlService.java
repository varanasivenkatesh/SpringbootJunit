package com.vv.sb.test.sample.sbootjunitsample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankDtlService {

    @Autowired
    BankRepo bankRepo;


    public List<BankDtl> getAllBankDetails()
    {
        return bankRepo.findAll();
    }
}
