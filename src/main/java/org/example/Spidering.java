//package org.example;
//
//import org.zaproxy.clientapi.core.ApiResponse;
//import org.zaproxy.clientapi.core.ApiResponseElement;
//import org.zaproxy.clientapi.core.ClientApi;
//import org.zaproxy.clientapi.core.ClientApiException;
//
//
//
//public class Spidering {
//    static WaitForComplete complete=new WaitForComplete();
//    static Utils utils=new Utils();
//    static void startSpiderScan(ClientApi api) throws ClientApiException, InterruptedException {
//        System.out.println("Starting spider scan...");
//        ApiResponse response = api.spider.scan(utils.getTARGET_URL(), null, null, null, null);
//        String scanId = ((ApiResponseElement) response).getValue(); // Capture the scan ID
//        complete.waitForCompletion(api, "spider", scanId);
//    }
//
//}
