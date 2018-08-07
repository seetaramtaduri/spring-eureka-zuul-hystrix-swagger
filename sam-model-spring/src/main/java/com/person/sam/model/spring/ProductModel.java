
package com.person.sam.model.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "_id", "name", "geo", "services", "createdOn", "updatedOn" })
@Document
public class ProductModel {

	@Id
	@JsonProperty("_id")
	@JsonPropertyDescription("_id")
	private String id;

	@JsonProperty("name")
	@JsonPropertyDescription("Prdouct Model Name")
	private String name;

	@JsonProperty("geo")
	@JsonPropertyDescription("Product Model Location")
	private String geo;

	@JsonProperty("services")
	@JsonPropertyDescription("Services")
	private List<Service> services = new ArrayList<>();

	@JsonProperty("createdOn")
	@JsonPropertyDescription("Auditing purpose")
	private String createdOn;

	@JsonProperty("updatedOn")
	@JsonPropertyDescription("Auditing purpose")
	private String updatedOn;

	
	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("geo")
	public String getGeo() {
		return geo;
	}

	@JsonProperty("geo")
	public void setGeo(String geo) {
		this.geo = geo;
	}

	@JsonProperty("services")
	public List<Service> getServices() {
		return services;
	}

	@JsonProperty("services")
	public void setServices(List<Service> services) {
		this.services = services;
	}

	@JsonProperty("createdOn")
	public String getCreatedOn() {
		return createdOn;
	}

	@JsonProperty("createdOn")
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	@JsonProperty("updatedOn")
	public String getUpdatedOn() {
		return updatedOn;
	}

	@JsonProperty("updatedOn")
	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((geo == null) ? 0 : geo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((services == null) ? 0 : services.hashCode());
		result = prime * result + ((updatedOn == null) ? 0 : updatedOn.hashCode());
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
		ProductModel other = (ProductModel) obj;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
			return false;
		if (geo == null) {
			if (other.geo != null)
				return false;
		} else if (!geo.equals(other.geo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (services == null) {
			if (other.services != null)
				return false;
		} else if (!services.equals(other.services))
			return false;
		if (updatedOn == null) {
			if (other.updatedOn != null)
				return false;
		} else if (!updatedOn.equals(other.updatedOn))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", geo=" + geo + ", services=" + services + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}
}
