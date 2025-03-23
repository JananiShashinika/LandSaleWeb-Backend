package com.example.sale.service;

import com.example.sale.dto.AppointmentDTO;
import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.Appointment;
import com.example.sale.entity.Comment;
import com.example.sale.entity.User;
import com.example.sale.entity.UserReg;
import com.example.sale.repo.AppointmentRepo;
//import com.example.sale.repo.CommentRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

//import javax.persistence.Table;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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

//    public AppointmentDTO addAppointments(AppointmentDTO appointmentDTO) {
//        appointmentRepo.save(modelMapper.map(appointmentDTO, Appointment.class));
//        return appointmentDTO;
//    }

    public AppointmentDTO addAppointments(AppointmentDTO appointmentDTO) {
        try {
            Appointment appointment = modelMapper.map(appointmentDTO, Appointment.class);
            appointmentRepo.save(appointment);
            return appointmentDTO;
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            throw new RuntimeException("Failed to save appointment: " + e.getMessage());
        }
    }
    public List<AppointmentDTO> getAppointments() {
        List<Appointment>appointmentList=appointmentRepo.findAll();
        return modelMapper.map(appointmentList, new TypeToken<List<AppointmentDTO>>(){}.getType());

    }

    public Appointment updateCheckedStatus(int App_No, boolean isChecked) {
        Appointment appointment = appointmentRepo.findById(App_No).orElse(null);
        if (appointment != null) {
            appointment.setChecked(isChecked);
            return appointmentRepo.save(appointment); // Save the updated appointment
        }
        return null; // Return null if appointment is not found
    }
    }
//    public void deleteAppointment(int App_No){
//        appointmentRepo.delete(modelMapper.map(App_No, Appointment.class));
//    }


//    public void takeAppointments(){
//    }



