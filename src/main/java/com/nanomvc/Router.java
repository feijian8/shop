package com.nanomvc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Router {

    public abstract Map<String, String> routes();

    public Map<String, String> reverseRoutes() {
        Map reversRoutes = null;
        if (routes() != null) {
            reversRoutes = new HashMap();
            for (Map.Entry entry : routes().entrySet()) {
                if (!reversRoutes.containsKey(entry.getValue())) {
                    reversRoutes.put(entry.getValue(), entry.getKey());
                }
            }
        }
        return reversRoutes;
    }
}