package com.vv.sb.test.sample.sbootjunitsample1;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;


import static org.mockito.Mockito.when;



public class BankServiceTestCase  extends SbootJunitSample1ApplicationTests {

    @Autowired
    BankDtlService bankDtlService;

    @MockBean
    BankRepo bankRepo;

    @Test
    public void getBankDetails_test()
    {
        List<BankDtl> li = new ArrayList<BankDtl>();
        li.add(new BankDtl("SBI","Hyd","SBIERE"));
        li.add(new BankDtl("MHI","Hyd","MHIUCUICU"));

        when(bankRepo.findAll()).thenReturn(li);
        Assert.assertEquals(2,bankDtlService.getAllBankDetails().size());


    }


}
