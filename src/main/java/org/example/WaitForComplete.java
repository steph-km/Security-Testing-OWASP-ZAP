package org.example;

import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

public class WaitForComplete {
    void waitForCompletion(ClientApi api, String scanType, String scanId) throws ClientApiException, InterruptedException {
        int progress = 0;
        while (progress < 100) {
            switch (scanType) {
                case "spider":
                    progress = Integer.parseInt(api.spider.status(scanId).toString());
                    break;
                case "ascan":
                    progress = Integer.parseInt(api.ascan.status(scanId).toString());
                    break;
            }
            System.out.println(scanType + " progress: " + progress + "%");
            Thread.sleep(1000);
        }
        System.out.println(scanType + " completed.");
    }
}
