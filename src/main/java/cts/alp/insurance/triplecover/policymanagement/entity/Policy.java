package cts.alp.insurance.triplecover.policymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/23/2018 9:17 PM
 * For project : policy-management
 **/
@Entity
@Table(name = "policies")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Policy {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "detailed_name")
    private String detailedName;

    @OneToMany(mappedBy = "policy")
    private List<UserPolicy> userPolicies;

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }


    public String getDetailedName() {
        return detailedName;
    }

    public void setDetailedName(String detailedName) {
        this.detailedName = detailedName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "id=" + id +
                ", policyName='" + policyName + '\'' +
                ", detailedName='" + detailedName + '\'' +
                '}';
    }





}
