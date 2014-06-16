
package org.antczak.jenkins.client.model;

import java.util.List;

public class Jobs{
   	private String color;
   	private String name;
   	private String url;

 	public String getColor(){
		return this.color;
	}
	public void setColor(String color){
		this.color = color;
	}
 	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}
}
