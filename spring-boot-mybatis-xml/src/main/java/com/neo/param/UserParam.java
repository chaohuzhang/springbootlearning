package com.neo.param;

/**
 * @package: com.neo.param
 * @data: 2018/7/4
 * @author: 70918
 */
public class UserParam extends PageParam{

    private String userName;
    private String userSex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
}
