package com.example.sale.repo;

import com.example.sale.entity.User;
import com.example.sale.entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRegRepo extends JpaRepository<UserReg,Integer> {

//    @Query( "SELECT user FROM UserReg user WHERE user.UserName = :UserName")
//    public UserReg getUserRegByUserName(@Param("UserName") String UserName);

    @Query(value = "SELECT * FROM UserReg WHERE UserName = ?1 AND password = ?2", nativeQuery = true)
    UserReg getUserByUserNameAndPassword(String UserName, String password);

}
