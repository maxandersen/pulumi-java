// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteActionArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteMatchArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteRetryPolicyArgs;
import com.pulumi.aws.appmesh.inputs.RouteSpecHttp2RouteTimeoutArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteSpecHttp2RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttp2RouteArgs Empty = new RouteSpecHttp2RouteArgs();

    /**
     * The action to take if a match is determined.
     * 
     */
    @Import(name="action", required=true)
    private Output<RouteSpecHttp2RouteActionArgs> action;

    public Output<RouteSpecHttp2RouteActionArgs> action() {
        return this.action;
    }

    /**
     * The criteria for determining an gRPC request match.
     * 
     */
    @Import(name="match", required=true)
    private Output<RouteSpecHttp2RouteMatchArgs> match;

    public Output<RouteSpecHttp2RouteMatchArgs> match() {
        return this.match;
    }

    /**
     * The retry policy.
     * 
     */
    @Import(name="retryPolicy")
    private @Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy;

    public Optional<Output<RouteSpecHttp2RouteRetryPolicyArgs>> retryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }

    /**
     * The types of timeouts.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout;

    public Optional<Output<RouteSpecHttp2RouteTimeoutArgs>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    private RouteSpecHttp2RouteArgs() {}

    private RouteSpecHttp2RouteArgs(RouteSpecHttp2RouteArgs $) {
        this.action = $.action;
        this.match = $.match;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteSpecHttp2RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttp2RouteArgs $;

        public Builder() {
            $ = new RouteSpecHttp2RouteArgs();
        }

        public Builder(RouteSpecHttp2RouteArgs defaults) {
            $ = new RouteSpecHttp2RouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder action(Output<RouteSpecHttp2RouteActionArgs> action) {
            $.action = action;
            return this;
        }

        public Builder action(RouteSpecHttp2RouteActionArgs action) {
            return action(Output.of(action));
        }

        public Builder match(Output<RouteSpecHttp2RouteMatchArgs> match) {
            $.match = match;
            return this;
        }

        public Builder match(RouteSpecHttp2RouteMatchArgs match) {
            return match(Output.of(match));
        }

        public Builder retryPolicy(@Nullable Output<RouteSpecHttp2RouteRetryPolicyArgs> retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        public Builder retryPolicy(RouteSpecHttp2RouteRetryPolicyArgs retryPolicy) {
            return retryPolicy(Output.of(retryPolicy));
        }

        public Builder timeout(@Nullable Output<RouteSpecHttp2RouteTimeoutArgs> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(RouteSpecHttp2RouteTimeoutArgs timeout) {
            return timeout(Output.of(timeout));
        }

        public RouteSpecHttp2RouteArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.match = Objects.requireNonNull($.match, "expected parameter 'match' to be non-null");
            return $;
        }
    }

}
