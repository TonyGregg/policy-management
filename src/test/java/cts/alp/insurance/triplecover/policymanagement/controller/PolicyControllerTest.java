package cts.alp.insurance.triplecover.policymanagement.controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by Antony Genil Gregory on 10/27/2018 12:24 PM
 * For project : policy-management
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PolicyControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private PolicyController policyController;



    /**
     * Get all policies method test
     * @GetMapping("/all")
     * @throws Exception
     */

    @Test
    public void testList() throws Exception {

        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/3cover/policies/all"))
                .andExpect(status().isOk());
    }



    @Test
    public void testFew() {
    }

    @Test
    public void findById() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/3cover/policies/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.policyName").value("AntonyHealthPolicy"));
    }

    @Test
    public void save() {
    }
}