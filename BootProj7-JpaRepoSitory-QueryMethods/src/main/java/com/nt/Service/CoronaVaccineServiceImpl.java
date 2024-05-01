package com.nt.Service;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nt.Entity.CoronaVaccine;
import com.nt.Repo.IcoronaVaccineRepo;
import com.nt.Result.View;
@Service("CoronaService")
public class CoronaVaccineServiceImpl implements ICoronaService {
@Autowired
private  IcoronaVaccineRepo repo;

@Override
public List<CoronaVaccine> getVaccineInfoByCountry(String country) {
	// TODO Auto-generated method stub
	return repo.getVaccineDetailsByCountry(country);
}

@Override
public List<CoronaVaccine> getInfoByPriceDetails(Double price) {
	// TODO Auto-generated method stub
	return repo.getVaccineDetailsByPriceOrderByName(price);
}

@Override
public List<Object[]> getRequiredInfoDetails(Double price) {
	// TODO Auto-generated method stub
	return repo.getRequiredInfoVaccine(price);
}

@Override
public int UpdateRecord(String Company, String Name, Double price, String Cname) {
	// TODO Auto-generated method stub
	return repo.getUpdatedCount(Company, Name, price, Cname);
}

@Override
public int getDeletedDate(String name) {
	// TODO Auto-generated method stub
	return repo.getDeletdCount(name);
}

@Override
public Date getSystemDate() {
	// TODO Auto-generated method stub
	return repo.getSysDate();
}

}
