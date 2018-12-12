
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "path",
    "port",
    "scheme"
})
public class HttpGet_ {

    @JsonProperty("path")
    private String path;
    @JsonProperty("port")
    private int port;
    @JsonProperty("scheme")
    private String scheme;

    /**
     * 
     * @return
     *     The path
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * 
     * @param path
     *     The path
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 
     * @return
     *     The port
     */
    @JsonProperty("port")
    public int getPort() {
        return port;
    }

    /**
     * 
     * @param port
     *     The port
     */
    @JsonProperty("port")
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * 
     * @return
     *     The scheme
     */
    @JsonProperty("scheme")
    public String getScheme() {
        return scheme;
    }

    /**
     * 
     * @param scheme
     *     The scheme
     */
    @JsonProperty("scheme")
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

}
