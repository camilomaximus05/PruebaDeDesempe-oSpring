package com.riwi.prueba.repository;

import com.riwi.prueba.model.Load;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoadRepository extends JpaRepository<Load, Long> {

    @Query("UPDATE Load SET status = :newStatus WHERE id = :id")
    Optional<Load> updateLoadStatus(@Param("id") Long loadId, @Param("newStatus") String newStatus);

    @Query("UPDATE Load SET status = 'DAMAGE' WHERE id = :id")
    void updateLoadToDamage(@Param("id") Long loadId);

}
