package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Form;
import com.cgr.cgrApp.entity.User;
import com.cgr.cgrApp.entity.Usuario;
import com.cgr.cgrApp.repository.IFormRepository;
import com.cgr.cgrApp.repository.IUserRepository;
import com.cgr.cgrApp.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository iUserRepository;
    @Autowired
    private IFormRepository iFormRepository;

    @Autowired
    private IUsuarioRepository iUsuarioRepository;


    public List<User> getAll(){
        return iUserRepository.findAll();
    }

    public User save(User user){
        return iUserRepository.save(user);
    }

    public User findById(Long id){
        return iUserRepository.findById(id).orElse(null);
    }

    public Optional<User> findByEmail (String email){ return iUserRepository.findByEmail(email);}

    public Form save(Form form){
        return iFormRepository.save(form);
    }
    public Optional<Usuario> findByIdentificationNumber (String identificationNumber){ return iUsuarioRepository.findByIdentificationNumber(identificationNumber);}


}
