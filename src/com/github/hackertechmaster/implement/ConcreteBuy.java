package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.User;
import com.github.hackertechmaster.UserManager;

public class ConcreteBuy implements com.github.hackertechmaster.interfaces.IBuy {
    @Override
    public boolean hasMoney(String username, int money) {
        User user = UserManager.INSTANCE.findUserByName(username);
        final boolean userfound = user != null;
        if (userfound){
            final boolean moneyEnough = user.getMoneyRemain() >= money;
            return moneyEnough;
        }
        return false;
    }
}
