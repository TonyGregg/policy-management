package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by genil on 10/24/18 at 08 29
 **/
public interface PolicyRepository extends JpaRepository<Policy,Long> {

    public List<Policy> getAllPolicies();
    public Policy findByPolicyName(String policyName);
}
