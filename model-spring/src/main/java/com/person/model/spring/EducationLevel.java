package com.person.model.spring;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"_id",
    "educationLevelCode",
    "educationLevelDescription",
    "affiliationCode",
    "affiliationName"
})
@Document
public class EducationLevel {

	@Id
	@JsonProperty("_id")
    private String id;
	
    @JsonProperty("educationLevelCode")
    private String educationLevelCode;

    @JsonProperty("educationLevelDescription")
    private String educationLevelDescription;
    
    @JsonProperty("affiliationCode")
    private String affiliationCode;
    
    @JsonProperty("affiliationName")
    private String affiliationName;

    @JsonProperty("_id")
    public String getId() {
		return id;
	}

    @JsonProperty("_id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("educationLevelCode")
    public String getEducationLevelCode() {
        return educationLevelCode;
    }

    @JsonProperty("educationLevelCode")
    public void setEducationLevelCode(String educationLevelCode) {
        this.educationLevelCode = educationLevelCode;
    }

    @JsonProperty("educationLevelDescription")
    public String getEducationLevelDescription() {
        return educationLevelDescription;
    }

    @JsonProperty("educationLevelDescription")
    public void setEducationLevelDescription(String educationLevelDescription) {
        this.educationLevelDescription = educationLevelDescription;
    }

    @JsonProperty("affiliationCode")
	public String getAffiliationCode() {
		return affiliationCode;
	}

    @JsonProperty("affiliationCode")
	public void setAffiliationCode(String affiliationCode) {
		this.affiliationCode = affiliationCode;
	}

    @JsonProperty("affiliationName")
	public String getAffiliationName() {
		return affiliationName;
	}

    @JsonProperty("affiliationName")
	public void setAffiliationName(String affiliationName) {
		this.affiliationName = affiliationName;
	}

}
