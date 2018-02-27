package demo;

import purchaseorder.api.PurchaseOrderApi;
import purchaseorder.entity.PurchaseOrder;

public class Main {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.err.println("You must provide a valid apikey argument: -Papikey=YOUR_API_KEY");
            return;
        }

        String token = args[0];
        String sandboxApiUrl = "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/";

        PurchaseOrderApi api = new PurchaseOrderApi(sandboxApiUrl, token);

        PurchaseOrder result = api.getPurchaseOrder(4500000001L);

        System.out.println(result);
    }
}
