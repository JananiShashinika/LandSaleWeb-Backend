package com.example.sale.service;

import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.entity.Comment;
import com.example.sale.entity.User;
import com.example.sale.repo.CommentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    public CommentDTO addComment(CommentDTO commentDTO) {
        commentRepo.save(modelMapper.map(commentDTO, Comment.class));
        return commentDTO;

    }


//    public void deleteComment(int ComID) {
//        commentRepo.delete(modelMapper.map(ComID, Comment.class));
//    }

//    public CommentDTO findById(int ComID){
//        Comment comment = commentRepo.findById(int ComID);
//        return modelMapper.map(comment,CommentDTO.class);
//    }
}
