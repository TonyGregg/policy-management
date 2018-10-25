package cts.alp.insurance.triplecover.policymanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Antony Genil Gregory on 10/23/2018 9:17 PM
 * For project : policy-management
 **/
@Entity
@Table(name = "policies")
@JsonIgnoreProperties("user")
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

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(LocalDate policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public String getDetailedName() {
        return detailedName;
    }

    public void setDetailedName(String detailedName) {
        this.detailedName = detailedName;
    }
//    @JsonIgnore
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

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
