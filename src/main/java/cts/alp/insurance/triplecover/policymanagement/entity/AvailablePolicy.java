package cts.alp.insurance.triplecover.policymanagement.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/21/2018 8:48 PM
 **/

@Entity
@Table(name = "available_policies")
public class AvailablePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "policy_details")
    private String policyDetails;


    // For mapping ending with Many, LAZY is the default fetch type
    @OneToMany(mappedBy = "availablePolicy", fetch = FetchType.LAZY)
    private List<UserPolicyDetail>userPolicyDetails = new ArrayList<>();


    public List<UserPolicyDetail> getUserPolicyDetails() {
        return userPolicyDetails;
    }

    public void addUserPolicyDetail(UserPolicyDetail userPolicyDetail) {
        this.userPolicyDetails.add(userPolicyDetail);
    }

    public Long getId() {
        return id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyDetails() {
        return policyDetails;
    }

    public void setPolicyDetails(String policyDetails) {
        this.policyDetails = policyDetails;
    }

    @Override
    public String toString() {
        return "AvailablePolicy{" +
                "id=" + id +
                ", policyName='" + policyName + '\'' +
                ", policyDetails='" + policyDetails + '\'' +
                '}';
    }
}
