package com.nt.Repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.CoronaVaccine;

public interface IcoronaVaccineRepo extends JpaRepository<CoronaVaccine, Long> {
	@Query("FROM CoronaVaccine WHERE country = :country")
	List<CoronaVaccine> getVaccineDetailsByCountry(@Param("country") String country);

	
	@Query("FROM CoronaVaccine WHERE price >= :price ORDER BY name")
	List<CoronaVaccine> getVaccineDetailsByPriceOrderByName(@Param("price") Double price);
	
	@Query(" select country ,price,name FROM CoronaVaccine WHERE price >= :price ")
	List<Object[]> getRequiredInfoVaccine(Double price);
	
	@Modifying
	@Query("UPDATE CoronaVaccine SET company = :company, name = :name, price = :price WHERE country = :cname")
	@Transactional
	int getUpdatedCount(@Param(value = "company") String company, @Param(value = "name") String name,
	                    @Param(value = "price") Double price, @Param(value = "cname") String  cname);
	
	@Modifying
	@Query("Delete from CoronaVaccine where name= :name")
	@Transactional
	int getDeletdCount(String name);
	
	@Query(value = "select sysdate from dual",nativeQuery = true)
	@Transactional
	Date getSysDate();

}
