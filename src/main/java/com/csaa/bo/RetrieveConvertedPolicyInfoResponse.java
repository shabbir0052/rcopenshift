package com.csaa.bo;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"convertedPolicyInfo"
})
public class RetrieveConvertedPolicyInfoResponse {

@JsonProperty("convertedPolicyInfo")
private List<ConvertedPolicySummary> convertedPolicyInfo = null;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("convertedPolicyInfo")
public List<ConvertedPolicySummary> getConvertedPolicyInfo() {
	if(this.convertedPolicyInfo==null) {
		this.convertedPolicyInfo= new ArrayList<ConvertedPolicySummary>();
	}
return convertedPolicyInfo;
}

@JsonProperty("convertedPolicyInfo")
public void setConvertedPolicyInfo(List<ConvertedPolicySummary> convertedPolicyInfo) {
this.convertedPolicyInfo = convertedPolicyInfo;
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
