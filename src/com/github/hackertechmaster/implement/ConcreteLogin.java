package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.User;
import com.github.hackertechmaster.UserManager;

public class ConcreteLogin implements com.github.hackertechmaster.interfaces.ILogin {
    @Override
    public int login(String username, String password) {
        User user = UserManager.INSTANCE.findUserByName(username);
        final boolean userfound = user != null;
        if (userfound){
         final boolean password1 = password.equals(user.getPassword());
         return password1 ? OK : ERR_NOT_MATCHED;
        }else
        {return ERR_NOT_MATCHED;}
    }
}
