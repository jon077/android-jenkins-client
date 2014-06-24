package org.antczak.jenkins.client.model;

import java.util.List;

/**
 * Created by https://github.com/pawelantczak on 2014-06-16.
 */
public class Instance extends BaseModel {
    private String description;
    private List<Job> jobs;
    private List<Computer> computer = null;
    private String mode;
    private String nodeDescription;
    private String nodeName;
    private Number numExecutors;
    private boolean quietingDown;
    private Number slaveAgentPort;
    private boolean useCrumbs;
    private boolean useSecurity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public List<Computer> getComputers() {
        return computer;
    }

    public void setComputers(List<Computer> computers) {
        this.computer = computers;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNodeDescription() {
        return nodeDescription;
    }

    public void setNodeDescription(String nodeDescription) {
        this.nodeDescription = nodeDescription;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Number getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(Number numExecutors) {
        this.numExecutors = numExecutors;
    }

    public boolean isQuietingDown() {
        return quietingDown;
    }

    public void setQuietingDown(boolean quietingDown) {
        this.quietingDown = quietingDown;
    }

    public Number getSlaveAgentPort() {
        return slaveAgentPort;
    }

    public void setSlaveAgentPort(Number slaveAgentPort) {
        this.slaveAgentPort = slaveAgentPort;
    }

    public boolean isUseCrumbs() {
        return useCrumbs;
    }

    public void setUseCrumbs(boolean useCrumbs) {
        this.useCrumbs = useCrumbs;
    }

    public boolean isUseSecurity() {
        return useSecurity;
    }

    public void setUseSecurity(boolean useSecurity) {
        this.useSecurity = useSecurity;
    }
}
