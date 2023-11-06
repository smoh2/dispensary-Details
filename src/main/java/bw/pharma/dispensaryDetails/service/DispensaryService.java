package bw.pharma.dispensaryDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bw.pharma.dispensaryDetails.entity.DispensaryEntity;
import bw.pharma.dispensaryDetails.model.Dispensary;
import bw.pharma.dispensaryDetails.repository.DispensaryRepository;

@Service
public class DispensaryService {
	
	@Autowired
	DispensaryRepository dispensaryRepository;
	
public List<Dispensary> getAllDispensaries() throws Exception {
		
		try{
				List<DispensaryEntity> dispensaries = dispensaryRepository.findAll();
				List<Dispensary> customDispensaries = new ArrayList<>();
				dispensaries.stream().forEachOrdered(d -> {
					Dispensary dispensary = new Dispensary();
					BeanUtils.copyProperties(d, dispensary);
					customDispensaries.add(dispensary);
				});
				return customDispensaries;
		}
		catch(Exception ex) {
			throw ex;
		}
	}
	
	public String addDispensary(DispensaryEntity dispensary) {
		
		try {
			if(!dispensaryRepository.existsByDispNameAndDispLocation(dispensary.getDispName(), dispensary.getDispLocation())) {
				dispensaryRepository.save(dispensary);
				return "Dispensary added successfully";
				
			}else {return "Dispensary already exists";}
		}
		catch(Exception ex) {
			throw ex;
		}
	
	}
	public String removeDispensary(DispensaryEntity dispensary) {
		
		try {
			if(dispensaryRepository.existsByDispNameAndDispLocation(dispensary.getDispName(), dispensary.getDispLocation())) {
				dispensaryRepository.delete(dispensary);
				return "Dispensary removed from list successfully";
			}
			else {return "Dispensary does not exist";}
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}
		
	public String updateDispensary(DispensaryEntity dispensary) {
		try {
			if(dispensaryRepository.existsByDispNameAndDispLocation(dispensary.getDispName(), dispensary.getDispLocation())) {
				dispensaryRepository.save(dispensary);
				return "Dispensary details updated successfully";
			}
			else {return "Dispensary does not exist";}
		}
		catch(Exception ex) {
			throw ex;
		}
	}

}



