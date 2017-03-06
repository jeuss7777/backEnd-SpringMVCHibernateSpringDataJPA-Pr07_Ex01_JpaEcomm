package com.jarana.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jarana.entities.Part;

@Repository("partDAO")
public interface PartDAO extends JpaRepository<Part, Integer> {

	 List<Part> findBypaPartNumber(String paPartNumber);
}
