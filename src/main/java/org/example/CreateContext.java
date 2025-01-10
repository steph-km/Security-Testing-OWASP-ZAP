package org.example;

import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

public class CreateContext {

    Utils utils=new Utils();
    void createContext(ClientApi api, String contextName) throws ClientApiException {
        System.out.println("Creating context: " + contextName);
        api.context.newContext(contextName);
        api.context.includeInContext(contextName, utils.getTARGET_URL() + ".*");
        System.out.println("Context created and target URL included.");
    }
}
