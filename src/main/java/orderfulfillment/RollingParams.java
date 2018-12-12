
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "updatePeriodSeconds",
    "intervalSeconds",
    "timeoutSeconds",
    "maxUnavailable",
    "maxSurge"
})
public class RollingParams {

    @JsonProperty("updatePeriodSeconds")
    private int updatePeriodSeconds;
    @JsonProperty("intervalSeconds")
    private int intervalSeconds;
    @JsonProperty("timeoutSeconds")
    private int timeoutSeconds;
    @JsonProperty("maxUnavailable")
    private String maxUnavailable;
    @JsonProperty("maxSurge")
    private String maxSurge;

    /**
     * 
     * @return
     *     The updatePeriodSeconds
     */
    @JsonProperty("updatePeriodSeconds")
    public int getUpdatePeriodSeconds() {
        return updatePeriodSeconds;
    }

    /**
     * 
     * @param updatePeriodSeconds
     *     The updatePeriodSeconds
     */
    @JsonProperty("updatePeriodSeconds")
    public void setUpdatePeriodSeconds(int updatePeriodSeconds) {
        this.updatePeriodSeconds = updatePeriodSeconds;
    }

    /**
     * 
     * @return
     *     The intervalSeconds
     */
    @JsonProperty("intervalSeconds")
    public int getIntervalSeconds() {
        return intervalSeconds;
    }

    /**
     * 
     * @param intervalSeconds
     *     The intervalSeconds
     */
    @JsonProperty("intervalSeconds")
    public void setIntervalSeconds(int intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
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
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public String getMaxUnavailable() {
        return maxUnavailable;
    }

    /**
     * 
     * @param maxUnavailable
     *     The maxUnavailable
     */
    @JsonProperty("maxUnavailable")
    public void setMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * 
     * @return
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public String getMaxSurge() {
        return maxSurge;
    }

    /**
     * 
     * @param maxSurge
     *     The maxSurge
     */
    @JsonProperty("maxSurge")
    public void setMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
    }

}
