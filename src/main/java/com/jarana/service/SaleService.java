package com.jarana.service;
import java.util.List;

import com.jarana.entities.Sale;
public interface SaleService {
	public List<Sale> findAll();
//	public Sale findOne(TYPE PK);
//	public List<Sale> findBy-ReplaceFIELD(TYPE FIELD);
	public void create (Sale sale);
	public void update (Sale sale);
	public void delete (Sale sale);
}
