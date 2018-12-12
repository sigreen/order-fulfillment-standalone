
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "description",
    "iconClass",
    "tags"
})
public class Annotations {

    @JsonProperty("description")
    private String description;
    @JsonProperty("iconClass")
    private String iconClass;
    @JsonProperty("tags")
    private String tags;

    /**
     * 
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The iconClass
     */
    @JsonProperty("iconClass")
    public String getIconClass() {
        return iconClass;
    }

    /**
     * 
     * @param iconClass
     *     The iconClass
     */
    @JsonProperty("iconClass")
    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public String getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

}
