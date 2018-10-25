package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import cts.alp.insurance.triplecover.policymanagement.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * Created by Antony Genil Gregory on 10/24/2018 9:12 PM
 * For project : policy-management
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserRepository userRepository;

    @Test
    public void findByFirstName() {
        List<User> userList = userRepository.findByFirstName("antony");
        logger.info("Find by first name {} ",userList);
    }

    @Test
    public void findByUserId() {

        Optional<User> userOptional = userRepository.findById(2L);
        Boolean result = userOptional.isPresent();
        logger.info("{} ",result);
        assertTrue(result);
    }

    @Test
    @Transactional
    public void findByEmail() {
        User user = userRepository.findByEmail("roger@roger.com");
        List<Policy> policies = user.getPolicies();

        for (Policy policy:policies) {
            logger.info(" policy detail {}", policy);
        }
    }
}