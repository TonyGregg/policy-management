package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import cts.alp.insurance.triplecover.policymanagement.entity.User;
import cts.alp.insurance.triplecover.policymanagement.entity.UserPolicy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Antony Genil Gregory on 10/27/2018 9:27 PM
 * For project : policy-management
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserPolicyRepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserPolicyRepository userPolicyRepository;

    @Autowired
    PolicyRepository policyRepository;

    @Autowired
    UserRepository userRepository;



    @Test
    @Transactional
    public void findByUser() {
        Long userId = 1L;
        List<UserPolicy> userPolicyList = userPolicyRepository.findByUser(userId);

        for (UserPolicy userPolicy : userPolicyList) {
            logger.info("{}",userPolicy);
        }

        assertNotNull(userPolicyList);

    }


    /**
     * The saveUserPolicy method is just for my own learning..
     * I wanted to check how new row can be inserted with 2 foreign keys..
     *
     */
    @Test
    @Transactional
    /**
     * Make Rollback to true if the data to be persisted in DB
     * @Rollback(true)
     */
    @Rollback(true)
    public void saveUserPolicy() {
        User user = userRepository.getOne(6L); // Mr Djokovic
        Policy policy = policyRepository.getOne(3L); // 3 Eye Policy

        UserPolicy userPolicy = new UserPolicy();

        userPolicy.setUser(user);
        userPolicy.setPolicy(policy);

        userPolicy.setAmountPaid(5600.82);
        userPolicy.setPolicyEndDate(LocalDate.of(2016,12,20));
        userPolicy = userPolicyRepository.save(userPolicy);

        logger.info("Newly created user policy {} ",userPolicy);
        assertNotNull(userPolicy);


    }
}