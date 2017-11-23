package com.github.hackertechmaster.implement;

import com.github.hackertechmaster.interfaces.IRegister;

public class ConcreteRegister implements IRegister {
    @Override
    public boolean register(String username, String password) {
        return false;
    }
}
