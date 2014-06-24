package org.antczak.jenkins.client.model;

public class Build {
    private Number number;
    private String url;

    public Number getNumber() {
        return this.number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
