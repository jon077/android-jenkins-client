package org.antczak.jenkins.client.model;

import java.util.List;
import java.util.Map;

public class JobDetails extends Job {
    private List actions;
    private boolean buildable;
    private List<Build> builds;
    private boolean concurrentBuild;
    private String description;
    private String displayName;
    private String displayNameOrNull;
    private List downstreamProjects;
    private Map firstBuild;
    private List healthReport;
    private boolean inQueue;
    private boolean keepDependencies;
    private Build lastBuild;
    private Build lastCompletedBuild;
    private String lastFailedBuild;
    private Build lastStableBuild;
    private Build lastSuccessfulBuild;
    private String lastUnstableBuild;
    private String lastUnsuccessfulBuild;
    private List modules;
    private Number nextBuildNumber;
    private List property;
    private String queueItem;
    private List upstreamProjects;

    public List<Map> getActions() {
        return actions;
    }

    public void setActions(List<Map> actions) {
        this.actions = actions;
    }

    public boolean isBuildable() {
        return buildable;
    }

    public void setBuildable(boolean buildable) {
        this.buildable = buildable;
    }

    public List<Build> getBuilds() {
        return builds;
    }

    public void setBuilds(List<Build> builds) {
        this.builds = builds;
    }

    public boolean isConcurrentBuild() {
        return concurrentBuild;
    }

    public void setConcurrentBuild(boolean concurrentBuild) {
        this.concurrentBuild = concurrentBuild;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayNameOrNull() {
        return displayNameOrNull;
    }

    public void setDisplayNameOrNull(String displayNameOrNull) {
        this.displayNameOrNull = displayNameOrNull;
    }

    public List<Map> getDownstreamProjects() {
        return downstreamProjects;
    }

    public void setDownstreamProjects(List<Map> downstreamProjects) {
        this.downstreamProjects = downstreamProjects;
    }

    public Map getFirstBuild() {
        return firstBuild;
    }

    public void setFirstBuild(Map firstBuild) {
        this.firstBuild = firstBuild;
    }

    public List<Map> getHealthReport() {
        return healthReport;
    }

    public void setHealthReport(List<Map> healthReport) {
        this.healthReport = healthReport;
    }

    public boolean isInQueue() {
        return inQueue;
    }

    public void setInQueue(boolean inQueue) {
        this.inQueue = inQueue;
    }

    public boolean isKeepDependencies() {
        return keepDependencies;
    }

    public void setKeepDependencies(boolean keepDependencies) {
        this.keepDependencies = keepDependencies;
    }

    public Build getLastBuild() {
        return lastBuild;
    }

    public void setLastBuild(Build lastBuild) {
        this.lastBuild = lastBuild;
    }

    public Build getLastCompletedBuild() {
        return lastCompletedBuild;
    }

    public void setLastCompletedBuild(Build lastCompletedBuild) {
        this.lastCompletedBuild = lastCompletedBuild;
    }

    public String getLastFailedBuild() {
        return lastFailedBuild;
    }

    public void setLastFailedBuild(String lastFailedBuild) {
        this.lastFailedBuild = lastFailedBuild;
    }

    public Build getLastStableBuild() {
        return lastStableBuild;
    }

    public void setLastStableBuild(Build lastStableBuild) {
        this.lastStableBuild = lastStableBuild;
    }

    public Build getLastSuccessfulBuild() {
        return lastSuccessfulBuild;
    }

    public void setLastSuccessfulBuild(Build lastSuccessfulBuild) {
        this.lastSuccessfulBuild = lastSuccessfulBuild;
    }

    public String getLastUnstableBuild() {
        return lastUnstableBuild;
    }

    public void setLastUnstableBuild(String lastUnstableBuild) {
        this.lastUnstableBuild = lastUnstableBuild;
    }

    public String getLastUnsuccessfulBuild() {
        return lastUnsuccessfulBuild;
    }

    public void setLastUnsuccessfulBuild(String lastUnsuccessfulBuild) {
        this.lastUnsuccessfulBuild = lastUnsuccessfulBuild;
    }

    public List<Map> getModules() {
        return modules;
    }

    public void setModules(List<Map> modules) {
        this.modules = modules;
    }

    public Number getNextBuildNumber() {
        return nextBuildNumber;
    }

    public void setNextBuildNumber(Number nextBuildNumber) {
        this.nextBuildNumber = nextBuildNumber;
    }

    public List<Map> getProperty() {
        return property;
    }

    public void setProperty(List<Map> property) {
        this.property = property;
    }

    public String getQueueItem() {
        return queueItem;
    }

    public void setQueueItem(String queueItem) {
        this.queueItem = queueItem;
    }

    public List<Map> getUpstreamProjects() {
        return upstreamProjects;
    }

    public void setUpstreamProjects(List<Map> upstreamProjects) {
        this.upstreamProjects = upstreamProjects;
    }
}
