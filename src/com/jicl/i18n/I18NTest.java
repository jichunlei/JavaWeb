/**  
 * @Title: I18NTest.java
 * @Prject: JavaWeb
 * @Package: com.jicl.i18n
 * @Description: TODO
 * @author: xianzilei  
 * @date: 2019年5月28日 上午8:27:44
 * @version: V1.0  
 * Copyright © 2019xianzilei. All rights reserved.
 */
 package com.jicl.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName: I18NTest
 * @Description: 国际化测试
 * @author: xianzilei
 * @date: 2019年5月28日 上午8:27:44
 */
public class I18NTest {
    public static void main(String[] args) {
        String basename="com.jicl.i18n.properities.myproperties";
        Locale cn=Locale.CHINA;
        Locale en=Locale.US;
        ResourceBundle resourceBundleCN=ResourceBundle.getBundle(basename, cn); 
        ResourceBundle resourceBundleEN=ResourceBundle.getBundle(basename, en);
        String usernameCN = resourceBundleCN.getString("username");
        String passwordCN = resourceBundleCN.getString("password");
        String usernameEN = resourceBundleEN.getString("username");
        String passwordEN = resourceBundleEN.getString("password");
        System.out.println("中文-->"+usernameCN+":"+passwordCN);
        System.out.println("英文-->"+usernameEN+":"+passwordEN);
    }
}
