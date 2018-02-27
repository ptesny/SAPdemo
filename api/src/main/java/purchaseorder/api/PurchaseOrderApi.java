package purchaseorder.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import purchaseorder.entity.PurchaseOrder;

public class PurchaseOrderApi {

    private final String endpoint = "API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder";

    private final String baseUrl;
    private String token;

    public PurchaseOrderApi(String baseUrl, String token) {
        this.baseUrl = baseUrl;
        this.token = token;
    }

    public PurchaseOrder getPurchaseOrder(Long id) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("apikey", token);

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        String requestUrl = baseUrl + endpoint + "('" + id + "')";
        ResponseEntity<PurchaseOrder> respEntity = restTemplate.exchange(requestUrl, HttpMethod.GET, entity, PurchaseOrder.class);


        PurchaseOrder resp = respEntity.getBody();
        return resp;


    }
}
