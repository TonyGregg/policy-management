package cts.alp.insurance.triplecover.policymanagement.controller;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import cts.alp.insurance.triplecover.policymanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by genil on 10/24/18 at 17 49
 **/

@RestController
@RequestMapping("/api/v1/3cover/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    /**
     *
     * @param id - of the user
     * @return User object. Which also holds list of policies associated with the user
     */
    @GetMapping("/{id}")
    public User get(@PathVariable("id") long id) {
        return userRepository.getOne(id);
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
