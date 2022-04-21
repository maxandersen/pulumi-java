// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlexibleAppVersionReadinessCheckGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionReadinessCheckGetArgs Empty = new FlexibleAppVersionReadinessCheckGetArgs();

    /**
     * A maximum time limit on application initialization, measured from moment the application successfully
     * replies to a healthcheck until it is ready to serve traffic. Default: &#34;300s&#34;
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
     * Number of consecutive failed checks required before considering the VM unhealthy. Default: 4.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Double> failureThreshold;

    public Optional<Output<Double>> failureThreshold() {
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
     * Path to the static files matched by the URL pattern, from the application root directory.
     * The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    public Output<String> path() {
        return this.path;
    }

    /**
     * Number of consecutive successful checks required before considering the VM healthy. Default: 2.
     * 
     */
    @Import(name="successThreshold")
    private @Nullable Output<Double> successThreshold;

    public Optional<Output<Double>> successThreshold() {
        return Optional.ofNullable(this.successThreshold);
    }

    /**
     * Time before the check is considered failed. Default: &#34;4s&#34;
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<String> timeout;

    public Optional<Output<String>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private FlexibleAppVersionReadinessCheckGetArgs() {}

    private FlexibleAppVersionReadinessCheckGetArgs(FlexibleAppVersionReadinessCheckGetArgs $) {
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
    public static Builder builder(FlexibleAppVersionReadinessCheckGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionReadinessCheckGetArgs $;

        public Builder() {
            $ = new FlexibleAppVersionReadinessCheckGetArgs();
        }

        public Builder(FlexibleAppVersionReadinessCheckGetArgs defaults) {
            $ = new FlexibleAppVersionReadinessCheckGetArgs(Objects.requireNonNull(defaults));
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

        public Builder failureThreshold(@Nullable Output<Double> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        public Builder failureThreshold(Double failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        public Builder host(@Nullable Output<String> host) {
            $.host = host;
            return this;
        }

        public Builder host(String host) {
            return host(Output.of(host));
        }

        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        public Builder path(String path) {
            return path(Output.of(path));
        }

        public Builder successThreshold(@Nullable Output<Double> successThreshold) {
            $.successThreshold = successThreshold;
            return this;
        }

        public Builder successThreshold(Double successThreshold) {
            return successThreshold(Output.of(successThreshold));
        }

        public Builder timeout(@Nullable Output<String> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(String timeout) {
            return timeout(Output.of(timeout));
        }

        public FlexibleAppVersionReadinessCheckGetArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
