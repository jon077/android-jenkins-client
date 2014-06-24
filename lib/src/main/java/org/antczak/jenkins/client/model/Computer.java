package org.antczak.jenkins.client.model;

import java.util.List;
import java.util.Map;

/**
 * Created by https://github.com/pawelantczak on 2014-06-17.
 */
public class Computer extends BaseModel {
    private List actions;
    private String displayName;
    private List executors;
    private String icon;
    private boolean idle;
    private boolean jnlpAgent;
    private boolean launchSupported;
    private Map loadStatistics;
    private boolean manualLaunchAllowed;
    private Map monitorData;
    private Number numExecutors;
    private boolean offline;
    private String offlineCause;
    private String offlineCauseReason;
    private List oneOffExecutors;
    private boolean temporarilyOffline;

    public Number getNumExecutors() {
        return numExecutors;
    }

    public void setNumExecutors(Number numExecutors) {
        this.numExecutors = numExecutors;
    }

    public List getActions() {
        return actions;
    }

    public void setActions(List actions) {
        this.actions = actions;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public List getExecutors() {
        return executors;
    }

    public void setExecutors(List executors) {
        this.executors = executors;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public boolean isIdle() {
        return idle;
    }

    public void setIdle(boolean idle) {
        this.idle = idle;
    }

    public boolean isJnlpAgent() {
        return jnlpAgent;
    }

    public void setJnlpAgent(boolean jnlpAgent) {
        this.jnlpAgent = jnlpAgent;
    }

    public boolean isLaunchSupported() {
        return launchSupported;
    }

    public void setLaunchSupported(boolean launchSupported) {
        this.launchSupported = launchSupported;
    }

    public Map getLoadStatistics() {
        return loadStatistics;
    }

    public void setLoadStatistics(Map loadStatistics) {
        this.loadStatistics = loadStatistics;
    }

    public boolean isManualLaunchAllowed() {
        return manualLaunchAllowed;
    }

    public void setManualLaunchAllowed(boolean manualLaunchAllowed) {
        this.manualLaunchAllowed = manualLaunchAllowed;
    }

    public Map<String, Map> getMonitorData() {
        return monitorData;
    }

    public void setMonitorData(Map<String, Map> monitorData) {
        this.monitorData = monitorData;
    }

    public boolean isOffline() {
        return offline;
    }

    public void setOffline(boolean offline) {
        this.offline = offline;
    }

    public String getOfflineCause() {
        return offlineCause;
    }

    public void setOfflineCause(String offlineCause) {
        this.offlineCause = offlineCause;
    }

    public String getOfflineCauseReason() {
        return offlineCauseReason;
    }

    public void setOfflineCauseReason(String offlineCauseReason) {
        this.offlineCauseReason = offlineCauseReason;
    }

    public List getOneOffExecutors() {
        return oneOffExecutors;
    }

    public void setOneOffExecutors(List oneOffExecutors) {
        this.oneOffExecutors = oneOffExecutors;
    }

    public boolean isTemporarilyOffline() {
        return temporarilyOffline;
    }

    public void setTemporarilyOffline(boolean temporarilyOffline) {
        this.temporarilyOffline = temporarilyOffline;
    }
}
