package com.example.sale.controller;

import com.example.sale.dto.BookLandDTO;

import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.BookLand;
import com.example.sale.repo.BookLandRepo;

import com.example.sale.service.BookLandService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value  = "api/v1/bookLand")
@CrossOrigin

public class BookLandController {
    @Autowired
    private BookLandService bookLandService;
    @Autowired
    private BookLandRepo bookLandRepo;


    @PostMapping("/addBook")
    public BookLandDTO saveData(@RequestBody BookLandDTO bookLandDTO) {
        return bookLandService.saveBook(bookLandDTO);
    }


    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable int id){
        bookLandRepo.deleteById(id);
        return "Booking deleted with id : " +id;

    }
    @GetMapping("/getBookings")
    public List<BookLandDTO> getAllBookings(){
        return bookLandService.getAllBookings();
    }

    @PutMapping("/updateBooking")
    public BookLandDTO updateUser(@RequestBody BookLandDTO bookLandDTO) {
        return bookLandService.updateBooking(bookLandDTO);
    }



}


