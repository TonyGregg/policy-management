package cts.alp.insurance.triplecover.policymanagement.repository;

import cts.alp.insurance.triplecover.policymanagement.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/21/2018 9:48 PM
 * For project : policy-management
 **/
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFirstName(String firstName);
    User findByUserId(String userId);
    User findByEmail(String email);
    User save(User user);
}
