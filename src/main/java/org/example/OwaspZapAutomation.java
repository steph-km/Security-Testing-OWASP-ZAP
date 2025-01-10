package org.example;


import org.zaproxy.clientapi.core.ClientApi;

public class OwaspZapAutomation {

    static Utils utils=new Utils();

    static CreateContext createContext=new CreateContext();
    static PassiveScanning startPassiveScan=new PassiveScanning();
    static Spidering spidering=new Spidering();
    static ActiveScanning activeScanning=new ActiveScanning();
    static Report report=new Report();
    static Alerts alerts=new Alerts();

    public static void main(String[] args) {
        String contextName = "FruitJuiceContext";
        ClientApi api = new ClientApi(utils.getZAP_ADDRESS(), utils.getZAP_PORT(), utils.getZAP_API_KEY());

        try {
            // 1. Add the target site to the context
            createContext.createContext(api, contextName);

            // 2. Passive Scan
            startPassiveScan.startPassiveScan(api);

            // 3. Spider Scan
            Spidering.startSpiderScan(api);

            // 5. Active Scan (includes SQL Injection, XSS, etc.)
            activeScanning.startActiveScan(api);

            // 6. Generate and save the report
            report.generateReport(api);

            // 7. Display alerts in the console
            alerts.displayAlerts(api);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
