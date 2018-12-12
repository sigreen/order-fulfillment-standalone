
package orderfulfillment;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "automatic",
    "containerNames",
    "from"
})
public class ImageChangeParams {

    @JsonProperty("automatic")
    private boolean automatic;
    @JsonProperty("containerNames")
    private List<String> containerNames = new ArrayList<String>();
    @JsonProperty("from")
    private From from;

    /**
     * 
     * @return
     *     The automatic
     */
    @JsonProperty("automatic")
    public boolean isAutomatic() {
        return automatic;
    }

    /**
     * 
     * @param automatic
     *     The automatic
     */
    @JsonProperty("automatic")
    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    /**
     * 
     * @return
     *     The containerNames
     */
    @JsonProperty("containerNames")
    public List<String> getContainerNames() {
        return containerNames;
    }

    /**
     * 
     * @param containerNames
     *     The containerNames
     */
    @JsonProperty("containerNames")
    public void setContainerNames(List<String> containerNames) {
        this.containerNames = containerNames;
    }

    /**
     * 
     * @return
     *     The from
     */
    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

}
