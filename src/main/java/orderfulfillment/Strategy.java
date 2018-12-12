
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "rollingParams"
})
public class Strategy {

    @JsonProperty("type")
    private String type;
    @JsonProperty("rollingParams")
    private RollingParams rollingParams;

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The rollingParams
     */
    @JsonProperty("rollingParams")
    public RollingParams getRollingParams() {
        return rollingParams;
    }

    /**
     * 
     * @param rollingParams
     *     The rollingParams
     */
    @JsonProperty("rollingParams")
    public void setRollingParams(RollingParams rollingParams) {
        this.rollingParams = rollingParams;
    }

}
