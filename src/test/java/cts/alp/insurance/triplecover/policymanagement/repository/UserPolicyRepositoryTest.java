package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.UserPolicy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

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
}