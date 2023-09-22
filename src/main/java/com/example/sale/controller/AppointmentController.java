package com.example.sale.controller;

import com.example.sale.dto.AppointmentDTO;
//import com.example.sale.dto.CommentDTO;
//import com.example.sale.entity.Appointment;
import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.repo.AppointmentRepo;
import com.example.sale.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1")
@CrossOrigin
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private AppointmentRepo appointmentRepo;

    @PostMapping("/addAppointment")
    public AppointmentDTO addAppointments(@RequestBody AppointmentDTO appointmentDTO){
        return appointmentService.addAppointments(appointmentDTO);

        //return"Thank You for your Appointment, Our service Agent will contact you soon !" ;
    }


    @GetMapping("/appointmentReceipt")
    public String takeAppointments() {
        return "Your Appointment";
    }


        @DeleteMapping("/deleteAppointment/{App_No}")
        public String deleteAppointment(@PathVariable int App_No){
            appointmentRepo.deleteById(App_No);
            return " Appointment deleted with id : " +App_No;
    }
}

