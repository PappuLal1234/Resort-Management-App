package com.restaurant.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Resort")

public class Resort {
	@Id
	private int resortId;

	private String resortName;
	private String specialty;
	private String address;
	private int nOfStaff;

	public int getResortId() {
		return resortId;
	}

	public String getResortName() {
		return resortName;
	}

	public String getSpecialty() {
		return specialty;
	}

	public String getAddress() {
		return address;
	}

	public int getnOfStaff() {
		return nOfStaff;
	}

	public void setResortId(int resortId) {
		this.resortId = resortId;
	}

	public void setResortName(String resortName) {
		this.resortName = resortName;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setnOfStaff(int nOfStaff) {
		this.nOfStaff = nOfStaff;
	}

	public Resort(int resortId, String resortName, String specialty, String address, int nOfStaff) {
		super();
		this.resortId = resortId;
		this.resortName = resortName;
		this.specialty = specialty;
		this.address = address;
		this.nOfStaff = nOfStaff;
	}

	public Resort() {
		super();
		// TODO Auto-generated constructor stub
	}

}
