package com.cgr.cgrApp.service;


import com.cgr.cgrApp.repository.IAnnexeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnexeService {
    @Autowired
    private IAnnexeService iAnexoService;

    public void saveAnexo(Integer idComplaint, String name){
         iAnexoService.saveAnexo(idComplaint,name);
    }


}
