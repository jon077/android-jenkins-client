
package org.antczak.jenkins.client.model;

import java.util.List;

public class Instance extends BaseModel{
   	private List<AssignedLabels> assignedLabels;
   	private String description;
   	private List<Jobs> jobs;
   	private String mode;
   	private String nodeDescription;
   	private String nodeName;
   	private Number numExecutors;
   	private OverallLoad overallLoad;
   	private PrimaryView primaryView;
   	private boolean quietingDown;
   	private Number slaveAgentPort;
   	private UnlabeledLoad unlabeledLoad;
   	private boolean useCrumbs;
   	private boolean useSecurity;
   	private List<Views> views;

 	public List<AssignedLabels> getAssignedLabels(){
		return this.assignedLabels;
	}
	public void setAssignedLabels(List<AssignedLabels> assignedLabels){
		this.assignedLabels = assignedLabels;
	}
 	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}
 	public List<Jobs> getJobs(){
		return this.jobs;
	}
	public void setJobs(List<Jobs> jobs){
		this.jobs = jobs;
	}
 	public String getMode(){
		return this.mode;
	}
	public void setMode(String mode){
		this.mode = mode;
	}
 	public String getNodeDescription(){
		return this.nodeDescription;
	}
	public void setNodeDescription(String nodeDescription){
		this.nodeDescription = nodeDescription;
	}
 	public String getNodeName(){
		return this.nodeName;
	}
	public void setNodeName(String nodeName){
		this.nodeName = nodeName;
	}
 	public Number getNumExecutors(){
		return this.numExecutors;
	}
	public void setNumExecutors(Number numExecutors){
		this.numExecutors = numExecutors;
	}
 	public OverallLoad getOverallLoad(){
		return this.overallLoad;
	}
	public void setOverallLoad(OverallLoad overallLoad){
		this.overallLoad = overallLoad;
	}
 	public PrimaryView getPrimaryView(){
		return this.primaryView;
	}
	public void setPrimaryView(PrimaryView primaryView){
		this.primaryView = primaryView;
	}
 	public boolean getQuietingDown(){
		return this.quietingDown;
	}
	public void setQuietingDown(boolean quietingDown){
		this.quietingDown = quietingDown;
	}
 	public Number getSlaveAgentPort(){
		return this.slaveAgentPort;
	}
	public void setSlaveAgentPort(Number slaveAgentPort){
		this.slaveAgentPort = slaveAgentPort;
	}
 	public UnlabeledLoad getUnlabeledLoad(){
		return this.unlabeledLoad;
	}
	public void setUnlabeledLoad(UnlabeledLoad unlabeledLoad){
		this.unlabeledLoad = unlabeledLoad;
	}
 	public boolean getUseCrumbs(){
		return this.useCrumbs;
	}
	public void setUseCrumbs(boolean useCrumbs){
		this.useCrumbs = useCrumbs;
	}
 	public boolean getUseSecurity(){
		return this.useSecurity;
	}
	public void setUseSecurity(boolean useSecurity){
		this.useSecurity = useSecurity;
	}
 	public List<Views> getViews(){
		return this.views;
	}
	public void setViews(List<Views> views){
		this.views = views;
	}
}
