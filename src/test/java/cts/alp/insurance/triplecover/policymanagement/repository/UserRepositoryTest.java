package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import cts.alp.insurance.triplecover.policymanagement.entity.User;
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
        assertTrue(userList.size()>0);
    }

    @Test
    public void findByUserId() {

        User user = userRepository.findByUserId("Wawrinka0208");
        logger.info("{} ",user);
        assertTrue(user.getId().intValue()==7);
    }

    @Test
    public void findByEmail() {
        User user = userRepository.findByEmail("roger@roger.com");
        logger.info("{}", user);
        assertTrue(user.getLastName().equalsIgnoreCase("Federer"));
    }

    @Test
    @Rollback(true)
    public void createUser() {
        User user = new User();
        user.setUserId("test0101");
        user.setFirstName("Tester first name");
        user.setLastName("Tester Last name");
        user.setBirthDate(LocalDate.of(1981,10,25));
        user.setAddress("tester street, tester city, tester state, 10001");
        user.setContactNumber("+1 222-333-4444");
        user.setEmail("tester123@testers.com");
        user.setPassword("123-433p2d-");
        user = userRepository.save(user);
        assertNotNull(user);

    }
}