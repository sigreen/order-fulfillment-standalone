
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "httpGet",
    "initialDelaySeconds",
    "timeoutSeconds",
    "periodSeconds",
    "successThreshold",
    "failureThreshold"
})
public class LivenessProbe {

    @JsonProperty("httpGet")
    private HttpGet httpGet;
    @JsonProperty("initialDelaySeconds")
    private int initialDelaySeconds;
    @JsonProperty("timeoutSeconds")
    private int timeoutSeconds;
    @JsonProperty("periodSeconds")
    private int periodSeconds;
    @JsonProperty("successThreshold")
    private int successThreshold;
    @JsonProperty("failureThreshold")
    private int failureThreshold;

    /**
     * 
     * @return
     *     The httpGet
     */
    @JsonProperty("httpGet")
    public HttpGet getHttpGet() {
        return httpGet;
    }

    /**
     * 
     * @param httpGet
     *     The httpGet
     */
    @JsonProperty("httpGet")
    public void setHttpGet(HttpGet httpGet) {
        this.httpGet = httpGet;
    }

    /**
     * 
     * @return
     *     The initialDelaySeconds
     */
    @JsonProperty("initialDelaySeconds")
    public int getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    /**
     * 
     * @param initialDelaySeconds
     *     The initialDelaySeconds
     */
    @JsonProperty("initialDelaySeconds")
    public void setInitialDelaySeconds(int initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * 
     * @return
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public int getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * 
     * @param timeoutSeconds
     *     The timeoutSeconds
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(int timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * 
     * @return
     *     The periodSeconds
     */
    @JsonProperty("periodSeconds")
    public int getPeriodSeconds() {
        return periodSeconds;
    }

    /**
     * 
     * @param periodSeconds
     *     The periodSeconds
     */
    @JsonProperty("periodSeconds")
    public void setPeriodSeconds(int periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * 
     * @return
     *     The successThreshold
     */
    @JsonProperty("successThreshold")
    public int getSuccessThreshold() {
        return successThreshold;
    }

    /**
     * 
     * @param successThreshold
     *     The successThreshold
     */
    @JsonProperty("successThreshold")
    public void setSuccessThreshold(int successThreshold) {
        this.successThreshold = successThreshold;
    }

    /**
     * 
     * @return
     *     The failureThreshold
     */
    @JsonProperty("failureThreshold")
    public int getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * 
     * @param failureThreshold
     *     The failureThreshold
     */
    @JsonProperty("failureThreshold")
    public void setFailureThreshold(int failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

}
