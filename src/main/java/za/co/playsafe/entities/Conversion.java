package za.co.playsafe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conversion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double kelvin;
	private double celsius;

	private double miles;
	private double kilometer;

	private double pounds;
	private double kilograms;

	public Conversion() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPounds() {
		return pounds;
	}

	public void setPounds(double pounds) {
		this.pounds = pounds;
	}

	public double getKilograms() {
		return kilograms;
	}

	public void setKilograms(double kilograms) {
		this.kilograms = kilograms;
	}

	public double getKelvin() {
		return kelvin;
	}

	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public double getMiles() {
		return miles;
	}

	public void setMiles(double miles) {
		this.miles = miles;
	}

	public double getKilometer() {
		return kilometer;
	}

	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conversion other = (Conversion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conversion [id=" + id + ", kelvin=" + kelvin + ", celsius=" + celsius + ", miles=" + miles
				+ ", kilometer=" + kilometer + ", pounds=" + pounds + ", kilograms=" + kilograms + "]";
	}



}