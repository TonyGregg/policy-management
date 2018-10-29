package cts.alp.insurance.triplecover.policymanagement.services;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by genil on 10/28/18 at 17 53
 **/
@Component
public interface TripleCoverService {

    public boolean isAdmin(String userName);
    public boolean isAdminPasswordValid(String password);

    public User isValidUser(String userId);
    public boolean isUserPasswordValid(User user, String password);

}
