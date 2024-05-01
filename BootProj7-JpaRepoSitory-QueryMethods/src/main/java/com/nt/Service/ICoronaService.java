package com.nt.Service;

import java.util.Date;
import java.util.List;

import com.nt.Entity.CoronaVaccine;

public interface ICoronaService {
	List<CoronaVaccine> getVaccineInfoByCountry(String country);
	List<CoronaVaccine> getInfoByPriceDetails(Double price);
	List<Object[]> getRequiredInfoDetails(Double price);
	int UpdateRecord(String Company,String Name,Double price, String  Cname);
	int getDeletedDate(String name);
	Date getSystemDate();

}
