// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticloadbalancingv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetGroupStickinessArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetGroupStickinessArgs Empty = new TargetGroupStickinessArgs();

    /**
     * Only used when the type is `lb_cookie`. The time period, in seconds, during which requests from a client should be routed to the same target. After this time period expires, the load balancer-generated cookie is considered stale. The range is 1 second to 1 week (604800 seconds). The default value is 1 day (86400 seconds).
     * 
     */
    @Import(name="cookieDuration")
      private final @Nullable Output<Integer> cookieDuration;

    public Output<Integer> cookieDuration() {
        return this.cookieDuration == null ? Codegen.empty() : this.cookieDuration;
    }

    /**
     * Name of the application based cookie. AWSALB, AWSALBAPP, and AWSALBTG prefixes are reserved and cannot be used. Only needed when type is `app_cookie`.
     * 
     */
    @Import(name="cookieName")
      private final @Nullable Output<String> cookieName;

    public Output<String> cookieName() {
        return this.cookieName == null ? Codegen.empty() : this.cookieName;
    }

    /**
     * Boolean to enable / disable `stickiness`. Default is `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The type of sticky sessions. The only current possible values are `lb_cookie`, `app_cookie` for ALBs, and `source_ip` for NLBs.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public TargetGroupStickinessArgs(
        @Nullable Output<Integer> cookieDuration,
        @Nullable Output<String> cookieName,
        @Nullable Output<Boolean> enabled,
        Output<String> type) {
        this.cookieDuration = cookieDuration;
        this.cookieName = cookieName;
        this.enabled = enabled;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private TargetGroupStickinessArgs() {
        this.cookieDuration = Codegen.empty();
        this.cookieName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetGroupStickinessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> cookieDuration;
        private @Nullable Output<String> cookieName;
        private @Nullable Output<Boolean> enabled;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetGroupStickinessArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cookieDuration = defaults.cookieDuration;
    	      this.cookieName = defaults.cookieName;
    	      this.enabled = defaults.enabled;
    	      this.type = defaults.type;
        }

        public Builder cookieDuration(@Nullable Output<Integer> cookieDuration) {
            this.cookieDuration = cookieDuration;
            return this;
        }
        public Builder cookieDuration(@Nullable Integer cookieDuration) {
            this.cookieDuration = Codegen.ofNullable(cookieDuration);
            return this;
        }
        public Builder cookieName(@Nullable Output<String> cookieName) {
            this.cookieName = cookieName;
            return this;
        }
        public Builder cookieName(@Nullable String cookieName) {
            this.cookieName = Codegen.ofNullable(cookieName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public TargetGroupStickinessArgs build() {
            return new TargetGroupStickinessArgs(cookieDuration, cookieName, enabled, type);
        }
    }
}
