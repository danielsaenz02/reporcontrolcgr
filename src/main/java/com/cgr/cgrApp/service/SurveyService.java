package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Form;
import com.cgr.cgrApp.entity.Usuario;
import com.cgr.cgrApp.repository.IFormRepository;
import com.cgr.cgrApp.repository.ISurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurveyService {

    @Autowired
    private IFormRepository iFormRepository;

    @Autowired
    private ISurveyRepository iUsuarioRepository;




    public Form save(Form form){
        return iFormRepository.save(form);
    }
    public Optional<Usuario> findByIdentificationNumber (String identificationNumber){ return iUsuarioRepository.findByIdentificationNumber(identificationNumber);}


}
