package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import cts.alp.insurance.triplecover.policymanagement.entity.UserPolicyDetail;
import org.junit.Before;
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
 * Created by Antony Genil Gregory on 10/21/2018 9:54 PM
 * For project : policy-management
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserJPARepositoryTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserJPARepository userJPARepository;

//    @Before
//    public void setUp() throws Exception {
//
//    }

    @Test
    public void findByFirstName() {
        List<User> userList = userJPARepository.findByFirstName("antony");
        logger.info("Find by first name {} ",userList);
    }

    @Test
    public void findByUserId() {
        Optional<User> userOptional = userJPARepository.findById(2L);
        Boolean result = userOptional.isPresent();
        logger.info("{} ",result);

        assertTrue(result);



    }
}