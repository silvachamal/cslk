package com.vaadin.tutorial.crm.backend.service.impl;

import java.util.List;

import com.vaadin.tutorial.crm.backend.entity.User;
import com.vaadin.tutorial.crm.backend.repository.UserData;
import com.vaadin.tutorial.crm.backend.service.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Testimpl implements Test {

    @Autowired
    private UserData userData;

    @Override
    public String findall() {
        return "testiso";
    }

    @Override
    public List<User> findDat() {
        return userData.findAll();
    }

}