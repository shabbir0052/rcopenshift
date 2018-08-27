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
"requestedPolicy",
"convertedPolicy"
})
public class ConvertedPolicySummary {

@JsonProperty("requestedPolicy")
private RequestedPolicy requestedPolicy;
@JsonProperty("convertedPolicy")
private ConvertedPolicy convertedPolicy;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("requestedPolicy")
public RequestedPolicy getRequestedPolicy() {
return requestedPolicy;
}

@JsonProperty("requestedPolicy")
public void setRequestedPolicy(RequestedPolicy requestedPolicy) {
this.requestedPolicy = requestedPolicy;
}

@JsonProperty("convertedPolicy")
public ConvertedPolicy getConvertedPolicy() {
return convertedPolicy;
}

@JsonProperty("convertedPolicy")
public void setConvertedPolicy(ConvertedPolicy convertedPolicy) {
this.convertedPolicy = convertedPolicy;
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