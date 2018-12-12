
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "deploymentConfig",
    "application"
})
public class Labels__ {

    @JsonProperty("deploymentConfig")
    private String deploymentConfig;
    @JsonProperty("application")
    private String application;

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

    /**
     * 
     * @return
     *     The application
     */
    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    /**
     * 
     * @param application
     *     The application
     */
    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

}
