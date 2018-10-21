package cts.alp.insurance.triplecover.policymanagement.entity;

/**
 * Created by genil on 10/21/18 at 15 49
 **/

import javax.persistence.*;

/**
 * Let us make the entity as real entity
 */

@Entity(name = "User") // referrred in queries and everywhere else
@Table(name = "Users") // Name of the table in DB
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "user_id")
    private String userId;



}
