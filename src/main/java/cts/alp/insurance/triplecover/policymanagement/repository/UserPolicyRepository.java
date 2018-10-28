package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.UserPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/27/2018 9:23 PM
 * For project : policy-management
 **/
public interface UserPolicyRepository  extends JpaRepository<UserPolicy,Long> {
    @Query("select up from UserPolicy up where up.userId=?1")
    List<UserPolicy> findByUser(Long userId);

    UserPolicy save(UserPolicy userPolicy);

}
