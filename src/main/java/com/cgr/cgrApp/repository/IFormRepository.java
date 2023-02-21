package com.cgr.cgrApp.repository;

import com.cgr.cgrApp.entity.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormRepository extends JpaRepository<Form,Long> {
}
