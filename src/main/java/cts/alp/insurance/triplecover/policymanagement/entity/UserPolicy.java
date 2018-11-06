package cts.alp.insurance.triplecover.policymanagement.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by Antony Genil Gregory on 10/27/2018 8:47 PM
 * For project : policy-management
 **/
@Entity(name = "UserPolicy")
@Table(name = "user_policies")
public class UserPolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_id", insertable = false, updatable = false)
    private Long policyId;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;

    @Column(name = "amount_paid")
    private Double amountPaid;

    @Column(name = "policy_end_date")
    private LocalDate policyEndDate;

    @Transient
    private String valid;

    @ManyToOne
    private User user;

    @ManyToOne
    private Policy policy;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    @Override
    public String toString() {
        return "UserPolicy{" +
                "id=" + id +
                ", amountPaid=" + amountPaid +
                ", policyEndDate=" + policyEndDate +
                ", user=" + user +
                ", policy=" + policy +
                ", valid=" + this.getValid() +
                '}';
    }

    /**
     *
     * @return "Yes" if the policy end date is before or equals today, "No" otherwise.
     *
     */
    public String getValid() {
        return this.policyEndDate.isAfter(LocalDate.now())  ? "Yes"
                : "No";
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
