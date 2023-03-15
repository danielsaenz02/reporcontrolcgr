package com.cgr.cgrApp.repository;


import com.cgr.cgrApp.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISurveyRepository extends JpaRepository<Usuario,Long> {
    @Query("SELECT u FROM Usuario u WHERE u.identification_number = :identificationNumber")
    Optional<Usuario> findByIdentificationNumber(@Param("identificationNumber") String identificationNumber);
}
