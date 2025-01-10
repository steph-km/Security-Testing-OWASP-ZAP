package org.example;

import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Report {
    static void generateReport(ClientApi api) throws ClientApiException, java.io.IOException {
        System.out.println("Generating HTML report...");
        byte[] report = api.core.htmlreport();
        String reportPath = "C:/Users/Hp/Desktop/report.html"; // Replace with your desired path
        Files.write(Paths.get(reportPath), report);
        System.out.println("Report generated: " + reportPath);
    }
}
