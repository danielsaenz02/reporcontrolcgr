package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Form;
import com.cgr.cgrApp.repository.IFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
@Autowired
    private IFormRepository iFormRepository;


    public Form save(Form form){
        return iFormRepository.save(form);
    }
}
