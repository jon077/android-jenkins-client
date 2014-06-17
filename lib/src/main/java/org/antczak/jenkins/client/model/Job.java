package org.antczak.jenkins.client.model;

/**
 * Created by https://github.com/pawelantczak on 2014-06-16.
 */
public class Job extends BaseModel {
    private String color;
    private String name;
    private String url;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
