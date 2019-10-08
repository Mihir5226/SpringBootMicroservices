package com.plantplaces.dto;

public class SpecimenDTO 
{
	private int specimenId;
	private String latitide;
	private String longitude;
	private String description;
	
	public int getSpecimenId()
	{
		return specimenId;
	}
	public void setSpecimenId(int specimenId) 
	{
		this.specimenId = specimenId;
	}
	public String getLatitide() {
		return latitide;
	}
	public void setLatitide(String latitide) {
		this.latitide = latitide;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
