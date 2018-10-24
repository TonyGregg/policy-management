package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/21/2018 9:48 PM
 * For project : policy-management
 **/
public interface UserJPARepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String firstName);
    List<User> findByUserId(String userId); // Get all the users matching given userId

    User findByEmail(String email);
}
