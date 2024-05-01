package com.nt.Runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.nt.Result.ResultView2;
import com.nt.Result.ResultView3;
import com.nt.Service.ICoronaService;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private ICoronaService service; 
	@Override
	public void run(String... args) throws Exception {
		try {
			//service.getVaccineInfoByCountry("japan").forEach(country->System.out.println(country));
			//service.getInfoByPriceDetails(400.23).forEach(price->System.out.println(price));
			/*
			 * service.getRequiredInfoDetails((Double) 400.23).forEach(price->{ for(Object
			 * info:price) { System.out.print(info+" "); } System.out.println(); } );
			 */
			//System.out.println("The Updated Redcord count="+service.UpdateRecord("Russia", "Smuthnik", 2300.56, "back"));
		//System.out.println("Deleted count:="+service.getDeletedDate("pla"));	
		System.out.println("Ssyetem Date:="+service.getSystemDate());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
