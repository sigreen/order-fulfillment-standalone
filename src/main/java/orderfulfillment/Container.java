
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
    "name",
    "image",
    "imagePullPolicy",
    "ports",
    "env",
    "livenessProbe",
    "readinessProbe"
})
public class Container {

    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private String image;
    @JsonProperty("imagePullPolicy")
    private String imagePullPolicy;
    @JsonProperty("ports")
    private List<Port> ports = new ArrayList<Port>();
    @JsonProperty("env")
    private List<Env> env = new ArrayList<Env>();
    @JsonProperty("livenessProbe")
    private LivenessProbe livenessProbe;
    @JsonProperty("readinessProbe")
    private ReadinessProbe readinessProbe;

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

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The imagePullPolicy
     */
    @JsonProperty("imagePullPolicy")
    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    /**
     * 
     * @param imagePullPolicy
     *     The imagePullPolicy
     */
    @JsonProperty("imagePullPolicy")
    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    /**
     * 
     * @return
     *     The ports
     */
    @JsonProperty("ports")
    public List<Port> getPorts() {
        return ports;
    }

    /**
     * 
     * @param ports
     *     The ports
     */
    @JsonProperty("ports")
    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    /**
     * 
     * @return
     *     The env
     */
    @JsonProperty("env")
    public List<Env> getEnv() {
        return env;
    }

    /**
     * 
     * @param env
     *     The env
     */
    @JsonProperty("env")
    public void setEnv(List<Env> env) {
        this.env = env;
    }

    /**
     * 
     * @return
     *     The livenessProbe
     */
    @JsonProperty("livenessProbe")
    public LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    /**
     * 
     * @param livenessProbe
     *     The livenessProbe
     */
    @JsonProperty("livenessProbe")
    public void setLivenessProbe(LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * 
     * @return
     *     The readinessProbe
     */
    @JsonProperty("readinessProbe")
    public ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    /**
     * 
     * @param readinessProbe
     *     The readinessProbe
     */
    @JsonProperty("readinessProbe")
    public void setReadinessProbe(ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

}
