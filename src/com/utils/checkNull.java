package com.utils;

import com.bean.User;

public class checkNull {
    public boolean resigerNull(User user){
        boolean flag = false;
        if(user.getName()!=null&&user.getEmail()!=null&&user.getPassword()!=null&&user.getPhone()!=null&&user.getSex()!=null&&user.getMarry()+""!=null&&user.getDepartment()!=null){
            flag = true;
        }
        return flag;
    }
    public boolean loginNull(User user){
        boolean flag = false;
        if(user.getName()!=null||user.getEmail()!=null||user.getPhone()!=null&&user.getPassword()!=null){
            flag = true;
        }
        return flag;
    }
    public boolean updateNull(User user){
        boolean flag = false;
        if(user.getPhone()!=null&&user.getEmail()!=null){
            flag = true;
        }
        return  flag;
    }
}
