package com.example.sale.repo;

import com.example.sale.entity.UserReg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LogInRepo extends JpaRepository<UserReg,Integer> {

    @Query(value = "SELECT * FROM UserReg WHERE UserName = ?1 AND Password = ?2", nativeQuery = true)
    UserReg getUserByUserIDAndPassword(Integer UserID, String Password);

}
