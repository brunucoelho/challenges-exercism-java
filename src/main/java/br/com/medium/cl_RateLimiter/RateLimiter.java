package main.java.br.com.medium.cl_RateLimiter;

import java.time.Duration;
import java.time.Instant;

public class RateLimiter<K> {

    int limit;
    long seconds;
    Duration windowSize = Duration.ofNanos(seconds);
    TimeSource timeSource = new TimeSource(Instant.now());
    

    public RateLimiter(int limit, Duration windowSize, TimeSource timeSource) {
        this.limit = limit;
        this.windowSize = windowSize;
        this.timeSource = timeSource;
    }

    public boolean allow(K clientId) {
        
    }
}


