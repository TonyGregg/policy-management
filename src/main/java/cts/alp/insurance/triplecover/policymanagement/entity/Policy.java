package cts.alp.insurance.triplecover.policymanagement.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Antony Genil Gregory on 10/23/2018 9:17 PM
 * For project : policy-management
 **/
@Entity
@Table(name = "policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "amount_paid")
    private Double amountPaid;

    @Column(name = "policy_end_date")
    private LocalDate policyEndDate;

    @Column(name = "detailed_name")
    private String detailedName;

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", policyName='" + policyName + '\'' +
                ", amountPaid=" + amountPaid +
                ", policyEndDate=" + policyEndDate +
                ", detailedName='" + detailedName + '\'' +
                '}';
    }

    @ManyToOne
    private User user;


}
