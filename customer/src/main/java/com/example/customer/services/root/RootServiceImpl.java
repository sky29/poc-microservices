package com.example.customer.services.root;

import com.example.customer.models.root.RootModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RootServiceImpl implements RootService {

    @Autowired
    private RootModel rootModel;

    @Override
    public String showMessage() {
        return rootModel.getMessage();
    }

    

}