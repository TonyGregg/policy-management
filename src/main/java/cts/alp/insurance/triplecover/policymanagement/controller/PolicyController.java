package cts.alp.insurance.triplecover.policymanagement.controller;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import cts.alp.insurance.triplecover.policymanagement.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by genil on 10/24/18 at 08 23
 *
 * Controller for fetching user policies and update as required by the admin
 **/
@RestController
@RequestMapping("/api/v1/3cover/policies")
public class PolicyController {
    @Autowired
    PolicyRepository policyRepository;

    /**
     *
     * @return all policies for the admin
     */
    @GetMapping
    public List<Policy> list() { return policyRepository.findAll(); };

    /**
     *
     * @param id - of one policy
     * @return the policy queries
     */
    @GetMapping("/{id}")
    public Policy get(@PathVariable("id") long id) {
        return policyRepository.getOne(id);
    }

}
