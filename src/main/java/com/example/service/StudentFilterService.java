package com.example.service;

import com.example.entities.Interest;
import com.example.entities.Opportunity;
import com.example.repositories.InterestRepository;
import com.example.repositories.OpportunityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFilterService {

    @Autowired
    InterestRepository interestRepository;

    @Autowired
    OpportunityRepository opportunityRepository;

    public List<Interest> getInterestList(String find) {
        List<Interest> newList = new ArrayList<>();
        for (Interest inter : interestRepository.findAll())
            if (inter.getDescription().equals(find)) {
                newList.add(inter);
            }
        return newList;
    }

    public List<Opportunity> getOpportunityList(String find) {
        List<Opportunity> newList = new ArrayList<>();
        for (Opportunity op : opportunityRepository.findAll())
            if (op.getDescription().equals(find)) {
                newList.add(op);
            }
        return newList;
    }

}
