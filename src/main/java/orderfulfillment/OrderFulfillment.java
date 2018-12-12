
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
    "kind",
    "apiVersion",
    "metadata",
    "labels",
    "parameters",
    "objects"
})
public class OrderFulfillment {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("apiVersion")
    private String apiVersion;
    @JsonProperty("metadata")
    private Metadata metadata;
    @JsonProperty("labels")
    private Labels labels;
    @JsonProperty("parameters")
    private List<Parameter> parameters = new ArrayList<Parameter>();
    @JsonProperty("objects")
    private List<Object> objects = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The kind
     */
    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    /**
     * 
     * @param kind
     *     The kind
     */
    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

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
     *     The metadata
     */
    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * 
     * @param metadata
     *     The metadata
     */
    @JsonProperty("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * 
     * @return
     *     The labels
     */
    @JsonProperty("labels")
    public Labels getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    @JsonProperty("labels")
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The parameters
     */
    @JsonProperty("parameters")
    public List<Parameter> getParameters() {
        return parameters;
    }

    /**
     * 
     * @param parameters
     *     The parameters
     */
    @JsonProperty("parameters")
    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    /**
     * 
     * @return
     *     The objects
     */
    @JsonProperty("objects")
    public List<Object> getObjects() {
        return objects;
    }

    /**
     * 
     * @param objects
     *     The objects
     */
    @JsonProperty("objects")
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

}
