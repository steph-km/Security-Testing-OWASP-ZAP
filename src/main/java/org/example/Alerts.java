package org.example;

import org.zaproxy.clientapi.core.*;

public class Alerts {

    Utils utils=new Utils();
    void displayAlerts(ClientApi api) throws ClientApiException {
        System.out.println("Fetching scan alerts...");
        ApiResponse response = api.core.alerts(utils.getTARGET_URL(),  null, null);

        if (response instanceof ApiResponseList) {
            ApiResponseList alertList = (ApiResponseList) response;
            for (ApiResponse alert : alertList.getItems()) {
                if (alert instanceof ApiResponseSet) {
                    ApiResponseSet alertSet = (ApiResponseSet) alert;
                    System.out.println("Alert: " + alertSet.getAttribute("alert"));
                    System.out.println("Risk: " + alertSet.getAttribute("risk"));
                    System.out.println("URL: " + alertSet.getAttribute("url"));
                    System.out.println("Parameter: " + alertSet.getAttribute("param"));
                    System.out.println("Solution: " + alertSet.getAttribute("solution"));
                    System.out.println("Description: " + alertSet.getAttribute("description"));
                    System.out.println("--------------------------------------------------");
                }
            }
        } else {
            System.out.println("No alerts found or unexpected response format.");
        }
    }
}
