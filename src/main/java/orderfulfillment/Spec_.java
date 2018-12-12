
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
    "terminationGracePeriodSeconds",
    "restartPolicy",
    "containers"
})
public class Spec_ {

    @JsonProperty("terminationGracePeriodSeconds")
    private int terminationGracePeriodSeconds;
    @JsonProperty("restartPolicy")
    private String restartPolicy;
    @JsonProperty("containers")
    private List<Container> containers = new ArrayList<Container>();

    /**
     * 
     * @return
     *     The terminationGracePeriodSeconds
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public int getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    /**
     * 
     * @param terminationGracePeriodSeconds
     *     The terminationGracePeriodSeconds
     */
    @JsonProperty("terminationGracePeriodSeconds")
    public void setTerminationGracePeriodSeconds(int terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    /**
     * 
     * @return
     *     The restartPolicy
     */
    @JsonProperty("restartPolicy")
    public String getRestartPolicy() {
        return restartPolicy;
    }

    /**
     * 
     * @param restartPolicy
     *     The restartPolicy
     */
    @JsonProperty("restartPolicy")
    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    /**
     * 
     * @return
     *     The containers
     */
    @JsonProperty("containers")
    public List<Container> getContainers() {
        return containers;
    }

    /**
     * 
     * @param containers
     *     The containers
     */
    @JsonProperty("containers")
    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

}
