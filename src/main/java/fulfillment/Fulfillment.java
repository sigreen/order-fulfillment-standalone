
package fulfillment;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "itemId",
    "itemName",
    "itemDescription",
    "itemQty",
    "unitPrice"
})
public class Fulfillment {

    @JsonProperty("itemId")
    private int itemId;
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("itemDescription")
    private String itemDescription;
    @JsonProperty("itemQty")
    private String itemQty;
    @JsonProperty("unitPrice")
    private String unitPrice;

    /**
     * 
     * @return
     *     The itemId
     */
    @JsonProperty("itemId")
    public int getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId
     *     The itemId
     */
    @JsonProperty("itemId")
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * 
     * @return
     *     The itemName
     */
    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    /**
     * 
     * @param itemName
     *     The itemName
     */
    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 
     * @return
     *     The itemDescription
     */
    @JsonProperty("itemDescription")
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * 
     * @param itemDescription
     *     The itemDescription
     */
    @JsonProperty("itemDescription")
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * 
     * @return
     *     The itemQty
     */
    @JsonProperty("itemQty")
    public String getItemQty() {
        return itemQty;
    }

    /**
     * 
     * @param itemQty
     *     The itemQty
     */
    @JsonProperty("itemQty")
    public void setItemQty(String itemQty) {
        this.itemQty = itemQty;
    }

    /**
     * 
     * @return
     *     The unitPrice
     */
    @JsonProperty("unitPrice")
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * @param unitPrice
     *     The unitPrice
     */
    @JsonProperty("unitPrice")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

}
