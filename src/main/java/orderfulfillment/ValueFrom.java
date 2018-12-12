
package orderfulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "fieldRef"
})
public class ValueFrom {

    @JsonProperty("fieldRef")
    private FieldRef fieldRef;

    /**
     * 
     * @return
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public FieldRef getFieldRef() {
        return fieldRef;
    }

    /**
     * 
     * @param fieldRef
     *     The fieldRef
     */
    @JsonProperty("fieldRef")
    public void setFieldRef(FieldRef fieldRef) {
        this.fieldRef = fieldRef;
    }

}
