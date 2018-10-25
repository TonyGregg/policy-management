package cts.alp.insurance.triplecover.policymanagement.controller;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     *
     * @param id - of the user
     * @return User object. Which also holds list of policies associated with the user
     */
    @RequestMapping("/user/{id}")
    public User get(@PathVariable(value = "id") Long id) {
        logger.info("Id passed "+id);
        User user = userRepository.getOne(id);
        logger.info("User {}",user);
        return user;
    }

    @GetMapping("/all")
    public List<User> list(){
        return userRepository.findAll();
    }

    /**
     * Create new user
     * @param user
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid User user) {
        userRepository.save(user);
    }

}
