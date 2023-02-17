package com.cgr.cgrApp.repository;

import com.cgr.cgrApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    @Query("SELECT u FROM Users u WHERE u.email = :email")
    Optional<User> findByEmail(@Param("email") String email);

    @Query("SELECT u FROM Users u WHERE u.identificactionNumber = :identificationNumber")
    Optional<User> findByIdentificactionNumber(@Param("identificationNumber") String identificationNumber);


}
