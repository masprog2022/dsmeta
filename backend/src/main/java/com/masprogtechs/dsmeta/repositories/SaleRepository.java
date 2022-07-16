package com.masprogtechs.dsmeta.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masprogtechs.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	List<Sale> findAll();

}
