package cts.alp.insurance.triplecover.policymanagement.controller;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import cts.alp.insurance.triplecover.policymanagement.entity.UserPolicy;
import cts.alp.insurance.triplecover.policymanagement.repository.UserPolicyRepository;
import cts.alp.insurance.triplecover.policymanagement.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by genil on 10/24/18 at 17 49
 **/

@RestController
@RequestMapping("/api/v1/3cover/users")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserPolicyRepository userPolicyRepository;

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     * Postman test URL
     * http://localhost:8090/api/v1/3cover/users/user/1
     * @param id - of the user
     * @return One User object.
     */
    @RequestMapping("/user/{id}")
    public User get(@PathVariable(value = "id") Long id) {
        logger.info("Id passed "+id);
        User user = userRepository.getOne(id);
        logger.info("User {}",user);
        return user;
    }

    /**
     * Postman URL http://localhost:8090/api/v1/3cover/users/all
     * @return all users...
     */

    @GetMapping("/all")
    public List<User> list(){
        return userRepository.findAll();
    }

    /**
     * POST URI http://localhost:8090/api/v1/3cover/users/
     * Create new user
     * @param user
     *
     * To update pass
     *  {
     *         "id": 12,
     *         "userId": "test12",
     *         "firstName": "12 Tester first name",
     *         "lastName": "12 Tester Last name",
     *         "birthDate": "1988-01-12",
     *         "address": "tester street 12, tester city, tester state, 10001",
     *         "contactNumber": "+1 122-333-4444",
     *         "email": "tester12@testers.com",
     *         "password": "122-433p2d-"
     *     }
     *
     *     To create pass without ID
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody @Valid User user) {
        return userRepository.save(user);
    }

    /**
     * Get all the policy details for a given user
     *
     * To test user Rest API from postman use
     * http://localhost:8090/api/v1/3cover/users/userPolicies/1
     * @param userId
     * @return
     */

    @RequestMapping("userPolicies/{id}")
    public List<UserPolicy> getUserPolicies(@PathVariable(value = "id") Long userId) {
        return userPolicyRepository.findByUser(userId);
    }

}
