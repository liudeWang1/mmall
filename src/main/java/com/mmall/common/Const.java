package com.mmall.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Created by 汪刘德 on 2018/1/10.
 */
public class Const {
    public static final String CURRENT_USER="currentUser";

    public static final String EMAIL="email";
    public static final String USERNAME="username";

    public interface ProductListOrderBy{
        Set<String> PRICE_ASC_DESC= Sets.newHashSet("price_desc","price_asc");
    }

    public interface Role{
        int ROLE_CUSTOMER=0;    //用户
        int ROLE_ADMIN=1;   //管理员
    }

    public interface Cart{
        int CHECKED=1;       //购物车被选中
        int UN_CHECKED=0;    //购物车未选中

        String LIMIT_NUM_FAIL="LIMIT_NUM_FAIL";
        String LIMIT_NUM_SUCCESS="LIMIT_NUM_SUCCESS";
    }

    public enum ProductStatusEnumP{

        ON_SALE(1,"在线");
        private int code;
        private String value;

        ProductStatusEnumP(int code,String value){
            this.code=code;
            this.value=value;
        }

        public int getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }
    }
}
