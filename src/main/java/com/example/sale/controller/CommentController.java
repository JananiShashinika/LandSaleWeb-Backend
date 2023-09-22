package com.example.sale.controller;

import com.example.sale.dto.CommentDTO;
import com.example.sale.dto.UserDTO;
import com.example.sale.entity.Comment;
import com.example.sale.repo.CommentRepo;
import com.example.sale.service.CommentService;
import com.example.sale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1")
@CrossOrigin


public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepo commentRepo;

    @PostMapping("/saveComment")
    public CommentDTO addComments(@PathVariable CommentDTO commentDTO) {
       return commentService.addComment(commentDTO);
    }



    @GetMapping("/comments")
    public String getAllComments() {
        return "all comments ";      //commentService.addComment();
    }


    @DeleteMapping("/deleteComment/{ComID}")
    public String deleteComment(@PathVariable int ComID){
        commentRepo.deleteById(ComID);
        return " Comment deleted with id : " +ComID;
    }
}






