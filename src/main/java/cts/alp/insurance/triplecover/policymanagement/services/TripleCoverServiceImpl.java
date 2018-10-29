package cts.alp.insurance.triplecover.policymanagement.services;

import cts.alp.insurance.triplecover.policymanagement.config.TripleCoverConfig;
import cts.alp.insurance.triplecover.policymanagement.entity.User;
import cts.alp.insurance.triplecover.policymanagement.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by genil on 10/28/18 at 18 23
 **/
@Component
public class TripleCoverServiceImpl implements TripleCoverService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    TripleCoverConfig tripleCoverConfig;

    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isAdmin(String userName) {
        String adminUserName = tripleCoverConfig.getAdminUserName();
        logger.info("passed admin user name "+userName + " admin name from config file "+adminUserName);
        if(!StringUtils.isEmpty(userName)) {
            if(userName.equals(adminUserName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isAdminPasswordValid(String password) {
        if(!StringUtils.isEmpty(password)) {
            if(password.equals(tripleCoverConfig.getAdminPassword())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User isValidUser(String userId) {
        /**
         * Check from back-end DB if the user name is there or not
         */
        User user = userRepository.findByUserId(userId);
        if(user != null) {
            logger.info("User found {} ",user);
            return user;
        }

        return null;
    }

    @Override
    public boolean isUserPasswordValid(User user, String password) {

        return password.equals(user.getPassword())?true:false;
    }
}
