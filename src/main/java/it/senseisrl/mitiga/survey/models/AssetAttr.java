package it.senseisrl.mitiga.survey.models;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"attrId",
"extRef",
"name",
"value"
})
public class AssetAttr{

@JsonProperty("attrId")
public String attrId;
@JsonProperty("extRef")
public Object extRef;
@JsonProperty("name")
public String name;
@JsonProperty("value")
public String value;

}