// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.enums.TargetPoolSessionAffinity;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetPoolArgs Empty = new TargetPoolArgs();

    /**
     * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1]. backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the &#34;force&#34; mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @Import(name="backupPool")
    private @Nullable Output<String> backupPool;

    public Optional<Output<String>> backupPool() {
        return Optional.ofNullable(this.backupPool);
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1]. If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the &#34;force&#34; mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @Import(name="failoverRatio")
    private @Nullable Output<Double> failoverRatio;

    public Optional<Output<Double>> failoverRatio() {
        return Optional.ofNullable(this.failoverRatio);
    }

    /**
     * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
     * 
     */
    @Import(name="healthChecks")
    private @Nullable Output<List<String>> healthChecks;

    public Optional<Output<List<String>>> healthChecks() {
        return Optional.ofNullable(this.healthChecks);
    }

    /**
     * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<String>> instances;

    public Optional<Output<List<String>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    @Import(name="sessionAffinity")
    private @Nullable Output<TargetPoolSessionAffinity> sessionAffinity;

    public Optional<Output<TargetPoolSessionAffinity>> sessionAffinity() {
        return Optional.ofNullable(this.sessionAffinity);
    }

    private TargetPoolArgs() {}

    private TargetPoolArgs(TargetPoolArgs $) {
        this.backupPool = $.backupPool;
        this.description = $.description;
        this.failoverRatio = $.failoverRatio;
        this.healthChecks = $.healthChecks;
        this.instances = $.instances;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.requestId = $.requestId;
        this.sessionAffinity = $.sessionAffinity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetPoolArgs $;

        public Builder() {
            $ = new TargetPoolArgs();
        }

        public Builder(TargetPoolArgs defaults) {
            $ = new TargetPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupPool(@Nullable Output<String> backupPool) {
            $.backupPool = backupPool;
            return this;
        }

        public Builder backupPool(String backupPool) {
            return backupPool(Output.of(backupPool));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            $.failoverRatio = failoverRatio;
            return this;
        }

        public Builder failoverRatio(Double failoverRatio) {
            return failoverRatio(Output.of(failoverRatio));
        }

        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            $.healthChecks = healthChecks;
            return this;
        }

        public Builder healthChecks(List<String> healthChecks) {
            return healthChecks(Output.of(healthChecks));
        }

        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }

        public Builder instances(@Nullable Output<List<String>> instances) {
            $.instances = instances;
            return this;
        }

        public Builder instances(List<String> instances) {
            return instances(Output.of(instances));
        }

        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        public Builder sessionAffinity(@Nullable Output<TargetPoolSessionAffinity> sessionAffinity) {
            $.sessionAffinity = sessionAffinity;
            return this;
        }

        public Builder sessionAffinity(TargetPoolSessionAffinity sessionAffinity) {
            return sessionAffinity(Output.of(sessionAffinity));
        }

        public TargetPoolArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
