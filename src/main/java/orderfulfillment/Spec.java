
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
    "strategy",
    "triggers",
    "replicas",
    "selector",
    "template"
})
public class Spec {

    @JsonProperty("strategy")
    private Strategy strategy;
    @JsonProperty("triggers")
    private List<Trigger> triggers = new ArrayList<Trigger>();
    @JsonProperty("replicas")
    private int replicas;
    @JsonProperty("selector")
    private Selector selector;
    @JsonProperty("template")
    private Template template;

    /**
     * 
     * @return
     *     The strategy
     */
    @JsonProperty("strategy")
    public Strategy getStrategy() {
        return strategy;
    }

    /**
     * 
     * @param strategy
     *     The strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 
     * @return
     *     The triggers
     */
    @JsonProperty("triggers")
    public List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * 
     * @param triggers
     *     The triggers
     */
    @JsonProperty("triggers")
    public void setTriggers(List<Trigger> triggers) {
        this.triggers = triggers;
    }

    /**
     * 
     * @return
     *     The replicas
     */
    @JsonProperty("replicas")
    public int getReplicas() {
        return replicas;
    }

    /**
     * 
     * @param replicas
     *     The replicas
     */
    @JsonProperty("replicas")
    public void setReplicas(int replicas) {
        this.replicas = replicas;
    }

    /**
     * 
     * @return
     *     The selector
     */
    @JsonProperty("selector")
    public Selector getSelector() {
        return selector;
    }

    /**
     * 
     * @param selector
     *     The selector
     */
    @JsonProperty("selector")
    public void setSelector(Selector selector) {
        this.selector = selector;
    }

    /**
     * 
     * @return
     *     The template
     */
    @JsonProperty("template")
    public Template getTemplate() {
        return template;
    }

    /**
     * 
     * @param template
     *     The template
     */
    @JsonProperty("template")
    public void setTemplate(Template template) {
        this.template = template;
    }

}
