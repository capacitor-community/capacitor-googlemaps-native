package com.hemangkumar.capacitorgooglemaps;

import androidx.annotation.Nullable;

import com.getcapacitor.JSObject;

import java.util.HashMap;

public abstract class JSObjectDefaults {
    private final HashMap<String, Object> defaults;

    private final HashMap<String, Object> actualValues = new HashMap<String, Object>(){};

    public JSObjectDefaults(HashMap<String, Object> defaults) {
        this.defaults = defaults;
    }

    private Object getObject(String key) {
        // get default value
        Object defaultObject = this.defaults.get(key);

        // then get actual value
        if (this.actualValues.containsKey(key)) {
            Object object = this.actualValues.get(key);
            if (object != null) {
                return object;
            }
        }

        if (defaultObject != null) {
            return defaultObject;
        }

        return null;
    }

    public boolean getBoolean(String key) {
        Object object = getObject(key);

        if (object != null) {
            return (boolean) object;
        }

        return false;
    }

    public void updateFromJSObject(@Nullable JSObject jsObject) {
        if (jsObject != null) {
            for (HashMap.Entry<String, Object> entry : defaults.entrySet()) {
                String key = entry.getKey();
                Object defaultValue = entry.getValue();

                if (defaultValue instanceof Boolean) {
                    if (jsObject.has(key)) {
                        Boolean newValue = jsObject.getBoolean(key, (Boolean) defaultValue);
                        if (newValue == null) {
                            newValue = (Boolean) defaultValue;
                        }
                        actualValues.put(key, (boolean) newValue);
                    }
                }
            }
        }
    }
}
