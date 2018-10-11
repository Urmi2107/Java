package pkgCollections;

import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String operatingSystem;
	private String processor;
	public Laptop(String company, String model, String operatingSystem) {
		super();
		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	@Override
	public boolean equals(Object o)
	{
		Laptop l=(Laptop)o;
		if(this.company.equals(l.company) && this.model.equals(l.model))
			return true;
		return false;
	}
	@Override
	public int hashCode()
	{
		return Objects.hash(company,model);
	}
	

}
