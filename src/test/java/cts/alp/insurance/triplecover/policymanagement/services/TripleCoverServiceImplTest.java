package cts.alp.insurance.triplecover.policymanagement.services;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import static org.junit.Assert.*;

/**
 * Created by genil on 10/28/18 at 18 29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class TripleCoverServiceImplTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TripleCoverService tripleCoverService;

    @Test
    public void isAdmin() {
        String testUser = "Admin";
        boolean isAdmin = tripleCoverService.isAdmin(testUser);
        logger.info("Is admin? {} ",isAdmin);
        assertTrue(isAdmin);

        testUser = "UnknownAdmin";
        isAdmin = tripleCoverService.isAdmin(testUser);

        logger.info(testUser+" Is admin? {} ",isAdmin);

        assertTrue(!isAdmin);

    }

    @Test
    public void isAdminPasswordValid() {
        String adminPassword = "Admin";
        boolean isAdminValidPwd = tripleCoverService.isAdminPasswordValid(adminPassword);
        assertTrue(isAdminValidPwd);
    }

    @Test
    public void isUserIdValid() {
        User user = tripleCoverService.isValidUser("Nadal0820");
        assertNotNull(user);

        user = tripleCoverService.isValidUser("dummyknownuser");
        assertNull(user);

    }

    @Test
    public void isUserPasswordValid() {
        String  userPassword = "password263";
        User user = tripleCoverService.isValidUser("Nadal0820");
        boolean isUserPasswordValid = tripleCoverService.isUserPasswordValid(user,userPassword);

        assertTrue(isUserPasswordValid);
    }
}