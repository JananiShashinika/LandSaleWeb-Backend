package com.example.sale.service;

import com.example.sale.dto.AppointmentDTO;
import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.entity.Appointment;
import com.example.sale.entity.Comment;
import com.example.sale.entity.User;
import com.example.sale.repo.AppointmentRepo;
//import com.example.sale.repo.CommentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

//import javax.persistence.Table;
import javax.transaction.Transactional;

@Service
@Transactional

public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    @Autowired
    private ModelMapper modelMapper;


//    public void addAppointments(AppointmentDTO appointmentDTO){
//        Appointment appointment = new Appointment(appointmentDTO.getApp_No(),appointmentDTO.getDate() ,
//                appointmentDTO.getTime(),
//                appointmentDTO.getAppointmentType());
//
//        appointmentRepo.save(appointment);
//
//    }

    public AppointmentDTO addAppointments(AppointmentDTO appointmentDTO) {
        appointmentRepo.save(modelMapper.map(appointmentDTO, Appointment.class));
        return appointmentDTO;
    }


//    public void takeAppointments(){
//    }


}
