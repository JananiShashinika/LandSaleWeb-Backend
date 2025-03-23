package com.example.sale.repo;

import com.example.sale.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Integer> {

    Optional<User> findByUsername(String username);




    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)
    User getUserByUserId(String id);

//    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2", nativeQuery = true)
//    User getUserByUserIDAndAddress(String userId, String address);

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 , USERNAME = ?2 AND PASSWORD = ?3", nativeQuery = true)
    User getUserByUserIdUsernamePassword(String id, String username, String password);
}
