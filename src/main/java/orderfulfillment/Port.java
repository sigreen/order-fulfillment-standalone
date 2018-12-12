
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "name",
    "containerPort",
    "protocol"
})
public class Port {

    @JsonProperty("name")
    private String name;
    @JsonProperty("containerPort")
    private int containerPort;
    @JsonProperty("protocol")
    private String protocol;

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
     *     The containerPort
     */
    @JsonProperty("containerPort")
    public int getContainerPort() {
        return containerPort;
    }

    /**
     * 
     * @param containerPort
     *     The containerPort
     */
    @JsonProperty("containerPort")
    public void setContainerPort(int containerPort) {
        this.containerPort = containerPort;
    }

    /**
     * 
     * @return
     *     The protocol
     */
    @JsonProperty("protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * 
     * @param protocol
     *     The protocol
     */
    @JsonProperty("protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}
