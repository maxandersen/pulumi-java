// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Readiness checking configuration for VM instances. Unhealthy instances are removed from traffic rotation.
 * 
 */
public final class ReadinessCheckArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReadinessCheckArgs Empty = new ReadinessCheckArgs();

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully replies to a healthcheck until it is ready to serve traffic.
     * 
     */
    @Import(name="appStartTimeout")
    private @Nullable Output<String> appStartTimeout;

    public Optional<Output<String>> appStartTimeout() {
        return Optional.ofNullable(this.appStartTimeout);
    }

    /**
     * Interval between health checks.
     * 
     */
    @Import(name="checkInterval")
    private @Nullable Output<String> checkInterval;

    public Optional<Output<String>> checkInterval() {
        return Optional.ofNullable(this.checkInterval);
    }

    /**
     * Number of consecutive failed checks required before removing traffic.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * Host header to send when performing a HTTP Readiness check. Example: &#34;myapp.appspot.com&#34;
     * 
     */
    @Import(name="host")
    private @Nullable Output<String> host;

    public Optional<Output<String>> host() {
        return Optional.ofNullable(this.host);
    }

    /**
     * The request path.
     * 
     */
    @Import(name="path")
    private @Nullable Output<String> path;

    public Optional<Output<String>> path() {
        return Optional.ofNullable(this.path);
    }

    /**
     * Number of consecutive successful checks required before receiving traffic.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Integer> successThreshold;

    public Optional<Output<Integer>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * Time before the check is considered failed.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private ReadinessCheckArgs() {}

    private ReadinessCheckArgs(ReadinessCheckArgs $) {
        this.appStartTimeout = $.appStartTimeout;
        this.checkInterval = $.checkInterval;
        this.failureThreshold = $.failureThreshold;
        this.host = $.host;
        this.path = $.path;
        this.successThreshold = $.successThreshold;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReadinessCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReadinessCheckArgs $;

        public Builder() {
            $ = new ReadinessCheckArgs();
        }

        public Builder(ReadinessCheckArgs defaults) {
            $ = new ReadinessCheckArgs(Objects.requireNonNull(defaults));
        }

        public Builder appStartTimeout(@Nullable Output<String> appStartTimeout) {
            $.appStartTimeout = appStartTimeout;
            return this;
        }

        public Builder appStartTimeout(String appStartTimeout) {
            return appStartTimeout(Output.of(appStartTimeout));
        }

        public Builder checkInterval(@Nullable Output<String> checkInterval) {
            $.checkInterval = checkInterval;
            return this;
        }

        public Builder checkInterval(String checkInterval) {
            return checkInterval(Output.of(checkInterval));
        }

        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder path(@Nullable Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder successThreshold(@Nullable Output<Integer> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(Integer successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public ReadinessCheckArgs build() {
            return $;
        }
    }

}
