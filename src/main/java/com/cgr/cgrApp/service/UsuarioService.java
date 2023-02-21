package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Usuario;
import com.cgr.cgrApp.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service

public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public Optional<Usuario> findByIdentificationNumber (String identificationNumber){ return iUsuarioRepository.findByIdentificactionNumber(identificationNumber);}

}
