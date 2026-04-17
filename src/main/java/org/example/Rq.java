package org.example;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String cmd;
    private Map<String, String> params;

    public Rq(String input) {
        String[] parts = input.split("\\?", 2);
        this.cmd = parts[0].trim();
        this.params = new HashMap<>();

        if (parts.length > 1) {
            String[] paramParts = parts[1].split("&");
            for (String param : paramParts) {
                String[] kv = param.split("=", 2);
                if (kv.length == 2) {
                    params.put(kv[0].trim(), kv[1].trim());
                }
            }
        }
    }

    public String getCmd() { return cmd; }

    public int getIntParam(String key, int defaultValue) {
        String val = params.get(key);
        if (val == null) return defaultValue;
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}
