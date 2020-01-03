package org.csource.common;

/**
 * @author Administrator
 */
public class FastDfsConfig {

    /**
     * tracker Server 地址列表
     * 例如 192.168.25.201:22122,192.168.25.202:22122
     */
    private String trackerServer;

    private int connectTimeout = 5;

    private int networkTimeout = 30;

    private int trackerHttpPort = 80;

    private boolean antiStealToken = false;

    private String secretKey;

    private boolean connectionPoolEnabled = true;

    private int connectionPoolMaxCountPerEntry = 100;

    private int connectionPoolMaxIdleTime = 3600;

    private int connectionPoolMaxWaitTimeInMs = 1000;

    private String charset = "UTF-8";

    public String getTrackerServer() {
        return trackerServer;
    }

    public void setTrackerServer(String trackerServer) {
        this.trackerServer = trackerServer;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getNetworkTimeout() {
        return networkTimeout;
    }

    public void setNetworkTimeout(int networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    public int getTrackerHttpPort() {
        return trackerHttpPort;
    }

    public void setTrackerHttpPort(int trackerHttpPort) {
        this.trackerHttpPort = trackerHttpPort;
    }

    public boolean isAntiStealToken() {
        return antiStealToken;
    }

    public void setAntiStealToken(boolean antiStealToken) {
        this.antiStealToken = antiStealToken;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public boolean isConnectionPoolEnabled() {
        return connectionPoolEnabled;
    }

    public void setConnectionPoolEnabled(boolean connectionPoolEnabled) {
        this.connectionPoolEnabled = connectionPoolEnabled;
    }

    public int getConnectionPoolMaxCountPerEntry() {
        return connectionPoolMaxCountPerEntry;
    }

    public void setConnectionPoolMaxCountPerEntry(int connectionPoolMaxCountPerEntry) {
        this.connectionPoolMaxCountPerEntry = connectionPoolMaxCountPerEntry;
    }

    public int getConnectionPoolMaxIdleTime() {
        return connectionPoolMaxIdleTime;
    }

    public void setConnectionPoolMaxIdleTime(int connectionPoolMaxIdleTime) {
        this.connectionPoolMaxIdleTime = connectionPoolMaxIdleTime;
    }

    public int getConnectionPoolMaxWaitTimeInMs() {
        return connectionPoolMaxWaitTimeInMs;
    }

    public void setConnectionPoolMaxWaitTimeInMs(int connectionPoolMaxWaitTimeInMs) {
        this.connectionPoolMaxWaitTimeInMs = connectionPoolMaxWaitTimeInMs;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }
}
