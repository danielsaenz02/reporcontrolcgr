package com.cgr.cgrApp.controller;

import com.cgr.cgrApp.entity.Form;
import com.cgr.cgrApp.entity.Usuario;
import com.cgr.cgrApp.exception.BadRequestCustom;
import com.cgr.cgrApp.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/survey")
@CrossOrigin({"*"})
public class SurveyController {

    @Autowired
    private SurveyService userService;

    @GetMapping("/userIdentification/{identificationNumber}")
    public ResponseEntity<?> findByIdentificationNumber(@PathVariable String identificationNumber) throws Exception {
        try {
            Usuario  usuario = userService.findByIdentificationNumber(identificationNumber).orElseThrow(() -> new BadRequestCustom("Por favor, diligencie el número de identificación asociado a su solicitud registrada en la Contraloría."));
            return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
        }catch (BadRequestCustom badMessage) {
            return new ResponseEntity<>(badMessage.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/form/create")
    public ResponseEntity<?> saveForm(@RequestBody Form form){
        Form form1 = userService.save(form);
        return new ResponseEntity<>(form1, HttpStatus.OK);
    }

}
