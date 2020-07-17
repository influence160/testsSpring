import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.othmen.testspring.webmvctest2.t1.EnableWebMVCTest;

@RunWith(SpringRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = EnableWebMVCTest.class)
//If no context configuration file is provided to the @ContextConfiguration annotation, 
//Spring usesa file convention naming. It triesto load a file named with the test class 
//name and suffices by "-context.xml" (i.e. MyDaoTest-context.xml
public class RestController1Test {

	private MockMvc mockMvc;
	
	@Autowired
	WebApplicationContext wac;
	
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void getNothing() throws Exception {
        this.mockMvc.perform(get("/nothing"))
            .andExpect(status().isNotFound());
//            .andExpect(content().contentType("application/json"))
//            .andExpect(jsonPath("$.name").value("Lee"));
    }
    
    @Test
    public void getAccount() throws Exception {
        this.mockMvc.perform(get("/rs1/test")
                .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(MockMvcResultMatchers.content().string("test"));
        
    }
}
