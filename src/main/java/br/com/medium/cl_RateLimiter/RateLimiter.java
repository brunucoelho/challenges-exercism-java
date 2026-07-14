package main.java.br.com.medium.cl_RateLimiter;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter<K> {

    int limit = 0;
    Duration windowSize;
    TimeSource timeSource;
    Map<K, ClientInfo> infoClient = new HashMap<K, ClientInfo>();

    static class ClientInfo {
        int requestCount;
        Instant windowStart;

        ClientInfo(int requestCount, Instant windowStart) {
            this.requestCount = requestCount;
            this.windowStart = windowStart;
        }
    }

    public RateLimiter(int limit, Duration windowSize, TimeSource timeSource) {
        this.limit = limit;
        this.windowSize = windowSize;
        this.timeSource = timeSource;
    }

    public boolean allow(K clientId) {
        Instant now = timeSource.now();

        if (!infoClient.containsKey(clientId)) {
            infoClient.put(clientId, new ClientInfo(1, now));
            return true;
        }

        ClientInfo clientInfo = infoClient.get(clientId);

        if (!now.isBefore(clientInfo.windowStart.plus(windowSize))) {
            clientInfo.requestCount = 1;
            clientInfo.windowStart = now;
            return true;
        }

        if (clientInfo.requestCount < limit) {
            clientInfo.requestCount++;
            return true;
        } 

        return false;
    }
}