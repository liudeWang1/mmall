package com.mmall.common;

/**
 * Created by 汪刘德 on 2018/1/10.
 */
public class Const {
    public static final String CURRENT_USER="currentUser";

    public static final String EMAIL="email";
    public static final String USERNAME="username";

    public interface Role{
        int ROLE_CUSTOMER=0;    //用户
        int ROLE_ADMIN=1;   //管理员
    }
}