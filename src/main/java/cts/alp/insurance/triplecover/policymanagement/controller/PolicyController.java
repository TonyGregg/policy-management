package cts.alp.insurance.triplecover.policymanagement.controller;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import cts.alp.insurance.triplecover.policymanagement.repository.PolicyRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    /**
     *
     * @return all policies for the admin
     */
    @GetMapping("/all")
    public List<Policy> list() {
        List<Policy>  policies= policyRepository.findAll();

        logger.info("Size of the policy {}", policies.size());

        for (Policy policy: policies) {
            logger.info("Policy {} ",policy);
        }
        return policies;
    };
    @GetMapping("/test")
    public List<Policy> testFew() {
        List<Policy>  policies=  new ArrayList<>();
        Policy policy = new Policy();
        policy.setPolicyName("test 1...");
        policies.add(policy);

        policy = new Policy();
        policy.setPolicyName("test 2...");
        policies.add(policy);

        policy = new Policy();
        policy.setPolicyName("test 3...");
        policies.add(policy);



        logger.info("Size of the policy {}", policies.size());

        return policies;
    };

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
