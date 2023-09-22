package com.example.sale.repo;

import com.example.sale.entity.Comment;
//import com.example.sale.entity.User;
import com.example.sale.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {

//    @Query(value = "SELECT * FROM comment WHERE ComID ?1",nativeQuery = true)
//    static Comment findById(int ComID);




}
