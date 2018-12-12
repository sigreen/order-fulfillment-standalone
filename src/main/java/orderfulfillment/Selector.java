
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "deploymentConfig"
})
public class Selector {

    @JsonProperty("deploymentConfig")
    private String deploymentConfig;

    /**
     * 
     * @return
     *     The deploymentConfig
     */
    @JsonProperty("deploymentConfig")
    public String getDeploymentConfig() {
        return deploymentConfig;
    }

    /**
     * 
     * @param deploymentConfig
     *     The deploymentConfig
     */
    @JsonProperty("deploymentConfig")
    public void setDeploymentConfig(String deploymentConfig) {
        this.deploymentConfig = deploymentConfig;
    }

}
