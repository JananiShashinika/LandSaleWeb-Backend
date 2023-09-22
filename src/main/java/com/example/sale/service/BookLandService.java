package com.example.sale.service;

import com.example.sale.dto.BookLandDTO;

import com.example.sale.dto.UserRegDTO;
import com.example.sale.entity.BookLand;

import com.example.sale.entity.UserReg;
import com.example.sale.repo.BookLandRepo;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class BookLandService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private BookLandRepo bookLandRepo;

    public BookLandDTO saveBook(BookLandDTO bookLandDTO){
        bookLandRepo.save(modelMapper.map(bookLandDTO, BookLand.class));
        return bookLandDTO;
    }


    public List<BookLandDTO> getAllBookings() {
        List<BookLand>bookLandList=bookLandRepo.findAll();
        return modelMapper.map(bookLandList, new TypeToken<List<BookLandDTO>>(){}.getType());

    }

    public BookLandDTO updateBooking(BookLandDTO bookLandDTO){
        bookLandRepo.save(modelMapper.map(bookLandDTO, BookLand.class));
        return bookLandDTO;

    }

}
