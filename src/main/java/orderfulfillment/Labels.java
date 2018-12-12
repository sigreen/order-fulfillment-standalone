
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "template"
})
public class Labels {

    @JsonProperty("template")
    private String template;

    /**
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public String getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(String template) {
        this.template = template;
    }

}
