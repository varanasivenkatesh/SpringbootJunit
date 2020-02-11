package com.vv.sb.test.sample.sbootjunitsample1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


public class BankDtlTest {

//    @Autowired
//    WebApplicationContext webApplicationContext;
//
//    MockMvc mockMvc;
//
//    @Before
//    public void setup()
//    {
//        System.out.println("In setup");
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    public void testBankDtl() throws Exception {
//        mockMvc.perform(get("/bankDetails")).andExpect(status().isOk())
//                .andExpect(content().contentType("application/json"));
//               // .andExpect(jsonPath("$.bankName").value("ICIC"));
//    }


}
