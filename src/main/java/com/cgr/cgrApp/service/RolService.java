package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Rol;
import com.cgr.cgrApp.repository.IRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private IRolRepository iRolRepository;

    public List<Rol> getAll(){
        return iRolRepository.findAll();

    }

    public Rol save(Rol rol){
        return iRolRepository.save(rol);

    }

    public Rol findById(Long id){
        return iRolRepository.findById(id).orElse(null);
    }


}
