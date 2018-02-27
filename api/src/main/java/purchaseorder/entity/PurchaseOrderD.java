package purchaseorder.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PurchaseOrderD {
    @JsonProperty("PurchaseOrder")
    private String PurchaseOrder;

    @JsonProperty("CompanyCode")
    private String CompanyCode;

    @JsonProperty("PurchaseOrderType")
    private String PurchaseOrderType;

    public PurchaseOrderD() {}

    public String getPurchaseOrder() {
        return PurchaseOrder;
    }

    public void setPurchaseOrder(String purchaseOrder) {
        PurchaseOrder = purchaseOrder;
    }

    public String getCompanyCode() {
        return CompanyCode;
    }

    public void setCompanyCode(String companyCode) {
        CompanyCode = companyCode;
    }

    public String getPurchaseOrderType() {
        return PurchaseOrderType;
    }

    public void setPurchaseOrderType(String purchaseOrderType) {
        PurchaseOrderType = purchaseOrderType;
    }

    @Override
    public String toString() {
        return "d{" +
                "purchaseOrder='" + PurchaseOrder + '\'' +
                "companyCode='" + CompanyCode + '\'' +
                ", purchaseOrderType=" + PurchaseOrderType +
                '}';
    }
}
