package com.vv.sb.test.sample.sbootjunitsample1;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankRepo {

    public List<BankDtl> findAll()
    {
        List<BankDtl> daoList = new ArrayList<BankDtl>();
        daoList.add(new BankDtl("HDFC","Hyd","HYDFIC"));
        return daoList;
    }
}
