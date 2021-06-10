package com.eetig.helloworld;

import com.eetig.demo.controller.HelloWorld;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @Date 2021/6/11 周五 00:23
 * @Author xu
 * @FileName SpringBootTest
 * @Description test
 */

@RunWith(SpringRunner.class)
@ContextConfiguration
public class SpringBootTest {

    private MockMvc mvc;

    @Before
    public void setUp()throws Exception{

        mvc = MockMvcBuilders.standaloneSetup(new HelloWorld()).build();
    }


    @Test
    public void getHello()throws Exception{

        mvc.perform(MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk()).andDo(MockMvcResultHandlers.print()).andReturn();

    }






}
