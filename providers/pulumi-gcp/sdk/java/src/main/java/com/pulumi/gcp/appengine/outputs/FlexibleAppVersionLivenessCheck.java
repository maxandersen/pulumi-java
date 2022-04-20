// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionLivenessCheck {
    /**
     * Interval between health checks.
     * 
     */
    private final @Nullable String checkInterval;
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    private final @Nullable Double failureThreshold;
    /**
     * Host header to send when performing a HTTP Readiness check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    private final @Nullable String host;
    /**
     * The initial delay before starting to execute the checks. Default: &#34;300s&#34;
     * 
     */
    private final @Nullable String initialDelay;
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    private final String path;
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    private final @Nullable Double successThreshold;
    /**
     * Time before the check is considered failed. Default: &#34;4s&#34;
     * 
     */
    private final @Nullable String timeout;

    @CustomType.Constructor
    private FlexibleAppVersionLivenessCheck(
        @CustomType.Parameter("checkInterval") @Nullable String checkInterval,
        @CustomType.Parameter("failureThreshold") @Nullable Double failureThreshold,
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("initialDelay") @Nullable String initialDelay,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("successThreshold") @Nullable Double successThreshold,
        @CustomType.Parameter("timeout") @Nullable String timeout) {
        this.checkInterval = checkInterval;
        this.failureThreshold = failureThreshold;
        this.host = host;
        this.initialDelay = initialDelay;
        this.path = path;
        this.successThreshold = successThreshold;
        this.timeout = timeout;
    }

    /**
     * Interval between health checks.
     * 
    */
    public Optional<String> checkInterval() {
        return Optional.ofNullable(this.checkInterval);
    }
    /**
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
    */
    public Optional<Double> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * Host header to send when performing a HTTP Readiness check. Example: &#34;myapp.appspot.com&#34;
     * 
    */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * The initial delay before starting to execute the checks. Default: &#34;300s&#34;
     * 
    */
    public Optional<String> initialDelay() {
        return Optional.ofNullable(this.initialDelay);
    }
    /**
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
    */
    public String path() {
        return this.path;
    }
    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
    */
    public Optional<Double> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }
    /**
     * Time before the check is considered failed. Default: &#34;4s&#34;
     * 
    */
    public Optional<String> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionLivenessCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String checkInterval;
        private @Nullable Double failureThreshold;
        private @Nullable String host;
        private @Nullable String initialDelay;
        private String path;
        private @Nullable Double successThreshold;
        private @Nullable String timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionLivenessCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkInterval = defaults.checkInterval;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.host = defaults.host;
    	      this.initialDelay = defaults.initialDelay;
    	      this.path = defaults.path;
    	      this.successThreshold = defaults.successThreshold;
    	      this.timeout = defaults.timeout;
        }

        public Builder checkInterval(@Nullable String checkInterval) {
            this.checkInterval = checkInterval;
            return this;
        }
        public Builder failureThreshold(@Nullable Double failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        public Builder initialDelay(@Nullable String initialDelay) {
            this.initialDelay = initialDelay;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder successThreshold(@Nullable Double successThreshold) {
            this.successThreshold = successThreshold;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = timeout;
            return this;
        }        public FlexibleAppVersionLivenessCheck build() {
            return new FlexibleAppVersionLivenessCheck(checkInterval, failureThreshold, host, initialDelay, path, successThreshold, timeout);
        }
    }
}
