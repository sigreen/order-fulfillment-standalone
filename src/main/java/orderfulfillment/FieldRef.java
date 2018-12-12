
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "apiVersion",
    "fieldPath"
})
public class FieldRef {

    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("fieldPath")
    private String fieldPath;

    /**
     * 
     * @return
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public String getApiVersion() {
        return apiVersion;
    }

    /**
     * 
     * @param apiVersion
     *     The apiVersion
     */
    @JsonProperty("apiVersion")
    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    /**
     * 
     * @return
     *     The fieldPath
     */
    @JsonProperty("fieldPath")
    public String getFieldPath() {
        return fieldPath;
    }

    /**
     * 
     * @param fieldPath
     *     The fieldPath
     */
    @JsonProperty("fieldPath")
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

}
