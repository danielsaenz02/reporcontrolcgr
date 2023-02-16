package com.cgr.cgrApp.service;

import com.cgr.cgrApp.entity.Complaint;
import com.cgr.cgrApp.repository.IComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplaintService {
    @Autowired
    private IComplaintService iComplaintService;

    public Complaint findById(Long idComplaint){
        return iComplaintService.findById(idComplaint).orElse(null);
    }

    public void updateComplaintById(Integer idComplaint){
         iComplaintService.updateComplaint(idComplaint);
    }
}
