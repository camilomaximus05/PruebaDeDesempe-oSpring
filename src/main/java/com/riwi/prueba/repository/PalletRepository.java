package com.riwi.prueba.repository;

import com.riwi.prueba.model.Pallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PalletRepository  extends JpaRepository<Pallet, Long> {

}
