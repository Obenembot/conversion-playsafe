package za.co.playsafe.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import za.co.playsafe.entities.Conversion;
import za.co.playsafe.services.ConversionService;

@RestController
@CrossOrigin(origins = "*")
public class ConversionController {

	
	@Autowired
	private ConversionService conversionService;
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/kelvin")
	public double kelvinToCelsius(@RequestBody Conversion kelvin) {
		
		return this.conversionService.kelvinToCelsius(kelvin.getKelvin());
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/miles")
	public double milesToKilometer (@RequestBody Conversion  miles) {
		
		return this.conversionService.milesToKilometer(miles.getMiles());
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/pounds")
	public double poundsToKilograms(@RequestBody Conversion pounds) {
		
		return this.conversionService.poundsToKilograms(pounds.getPounds());
	}
}
