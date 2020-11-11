package za.co.playsafe.services;

import org.springframework.stereotype.Service;

import za.co.playsafe.exceptions.InvalidFigureException;

@Service
public class ConversionService {


	// Kelvin to celsius
	public double kelvinToCelsius(double kelvin) {

		double celsius = 0;

		if (kelvin > 0) {

			celsius = kelvin - 273.15;
		} else {
			throw new InvalidFigureException(kelvin);
		}

		return celsius;
	}

	// miles to kilometers
	public double milesToKilometer(double miles) {

		double kilometer = 0;
		if (miles > 0) {

			kilometer = miles / 0.6214;

		} else {
			throw new InvalidFigureException(miles);
		}
		return kilometer;
	}

	// Pounds To Kilograms
	public double poundsToKilograms(double pounds) {

		double kilo = 0;
		if (pounds > 0) {

			kilo = pounds * 0.45;
		} else {
			throw new InvalidFigureException(pounds);
		}

		return kilo;
	}
}
