package purchaseorder.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrder {

    @JsonProperty("d")
    private PurchaseOrderD d;

    public PurchaseOrder() {

    }

    public PurchaseOrderD getD() {
        return d;
    }

    public void setD(PurchaseOrderD d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "d='" + d.toString() + '\'' + '}';
    }
}
