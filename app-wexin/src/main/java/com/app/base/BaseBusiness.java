package com.app.base;

import com.app.po.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

public class BaseBusiness {
    protected Log log = LogFactory.getLog(this.getClass());

    protected User getUser() {
        Subject subject = SecurityUtils.getSubject();
        if (null != subject) {
            return (User) subject.getSession().getAttribute("user");
        }
        return null;
    }

    protected String getUserName() {
        Subject subject = SecurityUtils.getSubject();
        if (null != subject) {
            return (String) subject.getPrincipal();
        }
        return null;
    }
}
