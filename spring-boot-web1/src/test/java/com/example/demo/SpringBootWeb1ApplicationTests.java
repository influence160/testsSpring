package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
class SpringBootWeb1ApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;

	
	// Comme ca ca marche pas je sais pas pk .. il faut utiliser @AutoConfigureMockMvc pour que ca marche
//	@Autowired
//	WebApplicationContext wac;
//	
//    @Before
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
//    }
//    
	@Test
	void contextLoads() {
		Assertions.assertEquals(1, 1);
	}
	
	@Test 
	void testGet1() throws Exception {
		mockMvc.perform(get("/a/get1")).andExpect(status().isOk());
	}
	
	@Test 
	void testGetAaa() throws Exception {
		mockMvc.perform(get("/a/getAaa")).andExpect(status().isOk());
	}

}
