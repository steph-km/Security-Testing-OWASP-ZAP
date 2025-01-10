package org.example;

import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ApiResponseElement;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

public class ActiveScanning {
    WaitForComplete complete=new WaitForComplete();
    Utils utils=new Utils();
    void startActiveScan(ClientApi api) throws ClientApiException, InterruptedException {
        System.out.println("Starting active scan (includes SQL Injection, XSS, etc.)...");
        ApiResponse response = api.ascan.scan(utils.getTARGET_URL(), "True", "False", null, null, null);
        String scanId = ((ApiResponseElement) response).getValue(); // Capture the scan ID
        complete.waitForCompletion(api, "ascan", scanId);
    }
}
