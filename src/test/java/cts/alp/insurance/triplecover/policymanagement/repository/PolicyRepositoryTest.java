package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by genil on 10/24/18 at 17 32
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PolicyRepositoryTest {
    @Autowired
    PolicyRepository policyRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Test
    public void getAllPolicies() {
        List<Policy> policies = policyRepository.findAll();

        assertNotNull(policies);
        for (Policy policy:policies) {
            logger.info("Policy {} ",policy);
        }
    }

    @Test
    public void findByPolicyName() {
        Policy policy = policyRepository.findByPolicyName("RogerHandPolicy");
        assertNotNull(policy);
    }
}