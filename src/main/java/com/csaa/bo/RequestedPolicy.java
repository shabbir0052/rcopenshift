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
"dataSource"
})
public class RequestedPolicy {

@JsonProperty("policyNumber")
private String policyNumber;
@JsonProperty("dataSource")
private String dataSource;
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

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
