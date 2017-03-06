package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Sale;

@Repository("saleDAO")
public interface SaleDAO extends JpaRepository<Sale, Integer> {

	 //List<Sale> findBy-ReplaceFIELD(TYPE FIELD);
}
