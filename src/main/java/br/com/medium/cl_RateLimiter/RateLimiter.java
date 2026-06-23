package main.java.br.com.medium.cl_RateLimiter;

import java.time.Duration;

public class RateLimiter<K> {

    int limit;
    Duration windowSize;
    TimeSource timeSource;

    public RateLimiter(int limit, Duration windowSize, TimeSource timeSource) {
        this.limit = limit;
        this.windowSize = windowSize;
        this.timeSource = timeSource;

        }

    public boolean allow(K clientId) {
        if (timeSource == null) {
            throw new IllegalArgumentException("Time source cannot be null");
        }
        // Implementation for allowing requests
        return true;
    }
}

