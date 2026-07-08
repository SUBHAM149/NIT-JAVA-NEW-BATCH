package com.sub.program10;

import java.util.Properties;

public class EmailConfig {

    private Properties settings;

    public EmailConfig() {
        super();
    }

    public EmailConfig(Properties settings) {
        super();
        this.settings = settings;
    }

    public Properties getSettings() {
        return settings;
    }

    public void setSettings(Properties settings) {
        this.settings = settings;
    }

    @Override
    public String toString() {
        return "EmailConfig [settings=" + settings + "]";
    }

}
