package com.csaa.bo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"policyNumber",
"dataSource",
"type",
"status",
"conversionEffectiveDate"
})
public class ConvertedPolicy {

@JsonProperty("policyNumber")
private String policyNumber;
@JsonProperty("dataSource")
private String dataSource;
@JsonProperty("type")
private String type;
@JsonProperty("status")
private String status;
@JsonProperty("conversionEffectiveDate")
private String conversionEffectiveDate;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("policyNumber")
public String getPolicyNumber() {
return policyNumber;
}

@JsonProperty("policyNumber")
public void setPolicyNumber(String policyNumber) {
this.policyNumber = policyNumber;
}

@JsonProperty("dataSource")
public String getDataSource() {
return dataSource;
}

@JsonProperty("dataSource")
public void setDataSource(String dataSource) {
this.dataSource = dataSource;
}

@JsonProperty("type")
public String getType() {
return type;
}

@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

@JsonProperty("status")
public String getStatus() {
return status;
}

@JsonProperty("status")
public void setStatus(String status) {
this.status = status;
}

@JsonProperty("conversionEffectiveDate")
public String getConversionEffectiveDate() {
return conversionEffectiveDate;
}

@JsonProperty("conversionEffectiveDate")
public void setConversionEffectiveDate(String conversionEffectiveDate) {
this.conversionEffectiveDate = conversionEffectiveDate;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
