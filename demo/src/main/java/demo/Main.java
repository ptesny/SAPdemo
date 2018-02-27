package demo;

import purchaseorder.api.PurchaseOrderApi;
import purchaseorder.entity.PurchaseOrder;

public class Main {
    public static void main(String[] args) {
        String sandboxApiUrl = "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/";
        String token = "xR1thAmP6rh3RHNHYDsr68UJcugdNZ2y";
        PurchaseOrderApi api = new PurchaseOrderApi(sandboxApiUrl, token);

        PurchaseOrder result = api.getPurchaseOrder(4500000001L);

        System.out.println(result);
    }
}
