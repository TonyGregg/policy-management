package cts.alp.insurance.triplecover.policymanagement.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by genil on 10/28/18 at 17 47
 **/
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class TripleCoverConfig {
    private String adminUserName;
    private String adminPassword;
    private String userNotRegisteredMsg;
    private String adminErrorMsg;
    private String userPasswordOrIdIncorrectMsg;

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getUserNotRegisteredMsg() {
        return userNotRegisteredMsg;
    }

    public void setUserNotRegisteredMsg(String userNotRegisteredMsg) {
        this.userNotRegisteredMsg = userNotRegisteredMsg;
    }

    public String getAdminErrorMsg() {
        return adminErrorMsg;
    }

    public void setAdminErrorMsg(String adminErrorMsg) {
        this.adminErrorMsg = adminErrorMsg;
    }

    public String getUserPasswordOrIdIncorrectMsg() {
        return userPasswordOrIdIncorrectMsg;
    }

    public void setUserPasswordOrIdIncorrectMsg(String userPasswordOrIdIncorrectMsg) {
        this.userPasswordOrIdIncorrectMsg = userPasswordOrIdIncorrectMsg;
    }
}
