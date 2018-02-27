## SAP Demo

A simple client for the SAP Purchase Order api

## To use

Build the `api` project:

```
./gradlew api:build
```

## Demo application

To run the demo application:
```
./gradlew demo:run -Papikey=YOUR_API_KEY
```

Sample output:
```
> Task :demo:run
15:50:43.666 [main] DEBUG org.springframework.web.client.RestTemplate - Created GET request for "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder('4500000001')"
15:50:43.740 [main] DEBUG org.springframework.web.client.RestTemplate - Setting request Accept header to [application/json, application/*+json]
15:50:43.741 [main] DEBUG org.springframework.web.client.RestTemplate - Writing [parameters] using [org.springframework.http.converter.StringHttpMessageConverter@17baae6e]
15:50:45.128 [main] DEBUG org.springframework.web.client.RestTemplate - GET request for "https://sandbox.api.sap.com/s4hanacloud/sap/opu/odata/sap/API_PURCHASEORDER_PROCESS_SRV/A_PurchaseOrder('4500000001')" resulted in 200 (OK)
15:50:45.129 [main] DEBUG org.springframework.web.client.RestTemplate - Reading [class purchaseorder.entity.PurchaseOrder] as "application/json;charset=utf-8" using [org.springframework.http.converter.json.MappingJackson2HttpMessageConverter@402bba4f]
PurchaseOrder{d='d{purchaseOrder='4500000001'companyCode='1710', purchaseOrderType=NB}'}

Process finished with exit code 0
```