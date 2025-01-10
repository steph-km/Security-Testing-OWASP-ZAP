package org.example;

public class Utils {
    private  final String ZAP_ADDRESS = "localhost";
    private  final int ZAP_PORT = 8080;
    private  final String ZAP_API_KEY = "o24k9l786urnu09g0bang6l1gh"; // Add API key if needed
    private  final String TARGET_URL = "http://localhost:3000/#/"; // Replace with the actual URL
    private String contextName = "FruitJuiceContext";

    public String getZAP_ADDRESS() {
        return ZAP_ADDRESS;
    }

    public int getZAP_PORT() {
        return ZAP_PORT;
    }

    public String getZAP_API_KEY() {
        return ZAP_API_KEY;
    }

    public String getTARGET_URL() {
        return TARGET_URL;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }
}
