
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "metadata",
    "spec"
})
public class Template {

    @JsonProperty("metadata")
    private Metadata__ metadata;
    @JsonProperty("spec")
    private Spec_ spec;

    /**
     * 
     * @return
     *     The metadata
     */
    @JsonProperty("metadata")
    public Metadata__ getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata__ metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The spec
     */
    @JsonProperty("spec")
    public Spec_ getSpec() {
        return spec;
    }

    /**
     * 
     * @param spec
     *     The spec
     */
    @JsonProperty("spec")
    public void setSpec(Spec_ spec) {
        this.spec = spec;
    }

}
