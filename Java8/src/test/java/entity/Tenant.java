package test.java.entity;

import java.util.Arrays;
import java.util.List;

public class Tenant {
	int tenantId;
	String tenantName;
	String ownerName;
	String apartmentNumber;
	String buildingName;

	public Tenant(int tenantId, String tenantName, String ownerName, String apartmentNumber, String buildingName) {
		super();
		this.tenantId = tenantId;
		this.tenantName = tenantName;
		this.ownerName = ownerName;
		this.apartmentNumber = apartmentNumber;
		this.buildingName = buildingName;
	}

	public int getTenantId() {
		return tenantId;
	}

	public void setTenantId(int tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public static List<Tenant> getTenantList() {
		List<Tenant> tenants = Arrays.asList(
				new Tenant(1, "Mohan", "Owner-Varun", "B1-1001", "Genesis"),
				new Tenant(2, "Sohan", "Owner-Indra", "D1-502", "Genesis"),
				new Tenant(3, "Radhika", "Owner-Ramesh", "B3-902", "Genesis"),
				new Tenant(4, "Anmol", "Owner-Ramesh", "D1-303", "Genesis"),
				new Tenant(5, "Kishan", "Owner-Ramesh", "B2-403", "Genesis"),
				new Tenant(6, "Goyal", "Owner-Varun", "B1-712", "Genesis"),
				new Tenant(7, "Bagedi", "Owner-Indra", "A2-104", "Genesis"),
				new Tenant(8, "Rhythm", "Owner-Varun", "B3-201", "Genesis"),
				new Tenant(9, "Niraj", "Owner-Indra", "A1-311", "Genesis"));
		return tenants;
	}
}
