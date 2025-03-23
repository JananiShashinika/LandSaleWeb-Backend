package com.example.sale.controller;

import com.example.sale.dto.AppointmentDTO;
//import com.example.sale.dto.CommentDTO;
//import com.example.sale.entity.Appointment;
import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.Appointment;
import com.example.sale.repo.AppointmentRepo;
import com.example.sale.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private AppointmentRepo appointmentRepo;

    @PostMapping("/addAppointment")
    public AppointmentDTO addAppointments(@RequestBody AppointmentDTO appointmentDTO){
        return appointmentService.addAppointments(appointmentDTO);

//        return"Thank You for your Appointment, Our service Agent will contact you soon !" ;
    }


    @GetMapping("/appointmentReceipt")
    public String takeAppointments() {

        return "Your Appointment";
    }

    @GetMapping("/getAppointments")
    public List<AppointmentDTO> getAppointments(){

            return appointmentService.getAppointments();

    }
//    @GetMapping
//    public ResponseEntity<?> getAppointments() {
//        return ResponseEntity.ok(appointmentRepo.findAll());
//    }
    @PutMapping("/checkAppointment/{App_No}/status")
    public ResponseEntity<?> updateCheckedStatus(@PathVariable int App_No, @RequestBody AppointmentDTO appointmentDTO) {

        Appointment updated = appointmentService.updateCheckedStatus(App_No, appointmentDTO.isChecked());
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/deleteAppointment/{App_No}")
    public String deleteAppointment(@PathVariable int App_No){
        appointmentRepo.deleteById(App_No);
        return " Appointment deleted with id : " +App_No;
    }
}

