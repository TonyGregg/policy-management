package cts.alp.insurance.triplecover.policymanagement.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Antony Genil Gregory on 10/21/2018 9:17 PM
 **/

@Entity
@Table(name = "user_policy_details")
public class UserPolicyDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_id")
    private Long policyId;

    @Column(name = "amount_paid")
    private Double amountPaid;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "user_id", insertable = false, updatable = false)
    private Long userId;

    @ManyToOne
    private User user;

    @ManyToOne
    private AvailablePolicy availablePolicy;

    public Long getId() {
        return id;
    }
    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public AvailablePolicy getAvailablePolicy() {
        return availablePolicy;
    }

    public void setAvailablePolicy(AvailablePolicy availablePolicy) {
        this.availablePolicy = availablePolicy;
    }

    @Override
    public String toString() {
        return "UserPolicyDetail{" +
                "id=" + id +
                ", policyId=" + policyId +
                ", amountPaid=" + amountPaid +
                ", endDate=" + endDate +
                ", userId=" + userId +
                ", user=" + user +
                '}';
    }
}
