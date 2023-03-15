package com.cgr.cgrApp.repository;

import com.cgr.cgrApp.entity.Annexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IAnnexeService extends JpaRepository<Annexe, Long> {
    @Modifying
    @Query(nativeQuery = true, value = "INSERT INTO Annexes (complaints_id,name) values (:complaints_id,:name)")
    @Transactional
    void saveAnexo(@Param("complaints_id") Integer complaints_id,@Param("name") String name);
}
