package bw.pharma.dispensaryDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import bw.pharma.dispensaryDetails.entity.DispensaryEntity;
import bw.pharma.dispensaryDetails.model.Dispensary;
import bw.pharma.dispensaryDetails.service.DispensaryService;

@RestController
@CrossOrigin(origins="127.0.0.1")
public class DispensaryController {
	
	@Autowired
	DispensaryService dispensaryService;
	
	@RequestMapping (value = "getDispensaries", method = RequestMethod.GET)
	public List<Dispensary> getDispensaries() throws Exception{
		return dispensaryService.getAllDispensaries();
	}
	
	@RequestMapping(value= "addDispensary", method = RequestMethod.POST)
	public String addDispensary(@RequestBody DispensaryEntity dispensary) {
		return dispensaryService.addDispensary(dispensary);
	}
	
	@RequestMapping(value= "updateDispensary", method = RequestMethod.PUT)
	public String updateDispensary(@RequestBody DispensaryEntity dispensary) {
		return dispensaryService.updateDispensary(dispensary);
	}
	
	@RequestMapping(value= "removeDispensary", method = RequestMethod.DELETE)
	public String removeDispensary(@RequestBody DispensaryEntity dispensary) {
		return dispensaryService.removeDispensary(dispensary);
	}

}
