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
@JsonPropertyOrder({ "_id", "name", "productModel", "courseUrl", "programs", "createdOn", "updatedOn" })
@Document
public class Product {

	@Id
	@JsonProperty("_id")
	@JsonPropertyDescription("_id")
	private String id;

	@JsonProperty("name")
	@JsonPropertyDescription("Prdouct Model Name")
	private String name;

	@JsonProperty("productModel")
	@JsonPropertyDescription("Product Model")
	private ProductModel productModel;

	@JsonProperty("courseUrl")
	@JsonPropertyDescription("Course URL")
	private String courseUrl;

	@JsonProperty("programs")
	@JsonPropertyDescription("EducationLevel")
	private List<EducationLevel> programs = new ArrayList<>();

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

	@JsonProperty("productModel")
	public ProductModel getProductModel() {
		return productModel;
	}

	@JsonProperty("productModel")
	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	@JsonProperty("courseUrl")
	public String getCourseUrl() {
		return courseUrl;
	}

	@JsonProperty("courseUrl")
	public void setCourseUrl(String courseUrl) {
		this.courseUrl = courseUrl;
	}

	@JsonProperty("programs")
	public List<EducationLevel> getPrograms() {
		return programs;
	}

	@JsonProperty("programs")
	public void setPrograms(List<EducationLevel> programs) {
		this.programs = programs;
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
		result = prime * result + ((courseUrl == null) ? 0 : courseUrl.hashCode());
		result = prime * result + ((createdOn == null) ? 0 : createdOn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((productModel == null) ? 0 : productModel.hashCode());
		result = prime * result + ((programs == null) ? 0 : programs.hashCode());
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
		Product other = (Product) obj;
		if (courseUrl == null) {
			if (other.courseUrl != null)
				return false;
		} else if (!courseUrl.equals(other.courseUrl))
			return false;
		if (createdOn == null) {
			if (other.createdOn != null)
				return false;
		} else if (!createdOn.equals(other.createdOn))
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
		if (productModel == null) {
			if (other.productModel != null)
				return false;
		} else if (!productModel.equals(other.productModel))
			return false;
		if (programs == null) {
			if (other.programs != null)
				return false;
		} else if (!programs.equals(other.programs))
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
		return "Product [id=" + id + ", name=" + name + ", productModel=" + productModel + ", courseUrl=" + courseUrl
				+ ", programs=" + programs + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn + "]";
	}
}
