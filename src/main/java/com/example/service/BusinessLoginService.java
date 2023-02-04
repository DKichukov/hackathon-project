package com.example.service;

import com.example.entities.Business;
import com.example.entities.UserBusiness;
import com.example.repositories.BusinessRepository;
import com.example.repositories.UserBusinessRepository;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessLoginService {
    @Autowired
    UserBusinessRepository userBusinessRepository;
    public UserBusiness getBusinessId(String email, String password) {
        List<UserBusiness> userBusList = userBusinessRepository.findAll();
        System.out.println(userBusList);
        UserBusiness usr = new UserBusiness();
        for (UserBusiness userBusiness : userBusList) {
                    if(userBusiness.getBusiness().getEmail().equals(email)&&userBusiness.getPassword().equals(password)) {
                      usr = userBusiness;
                      System.out.println(" email ---> " + userBusiness.getBusiness().getEmail());
                      System.out.println(" pass ---->" + userBusiness.getPassword());
                        System.out.println(email);
                        System.out.println(password);
                    }
             }
        return usr;
    }
}
