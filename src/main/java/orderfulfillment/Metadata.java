
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "annotations",
    "name"
})
public class Metadata {

    @JsonProperty("annotations")
    private Annotations annotations;
    @JsonProperty("name")
    private String name;

    /**
     * 
     * @return
     *     The annotations
     */
    @JsonProperty("annotations")
    public Annotations getAnnotations() {
        return annotations;
    }

    /**
     * 
     * @param annotations
     *     The annotations
     */
    @JsonProperty("annotations")
    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
