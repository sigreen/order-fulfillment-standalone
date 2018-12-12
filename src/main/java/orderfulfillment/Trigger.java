
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "type",
    "imageChangeParams"
})
public class Trigger {

    @JsonProperty("type")
    private String type;
    @JsonProperty("imageChangeParams")
    private ImageChangeParams imageChangeParams;

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
     *     The imageChangeParams
     */
    @JsonProperty("imageChangeParams")
    public ImageChangeParams getImageChangeParams() {
        return imageChangeParams;
    }

    /**
     * 
     * @param imageChangeParams
     *     The imageChangeParams
     */
    @JsonProperty("imageChangeParams")
    public void setImageChangeParams(ImageChangeParams imageChangeParams) {
        this.imageChangeParams = imageChangeParams;
    }

}
