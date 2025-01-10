package org.example;

import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;
import org.zaproxy.clientapi.gen.Pscan;

public class PassiveScanning {
    static void startPassiveScan(ClientApi api) throws ClientApiException {
        System.out.println("Starting passive scan...");
        Pscan pscan = new Pscan(api);
        pscan.setEnabled("true");
        System.out.println("Passive scan enabled.");
    }
}
