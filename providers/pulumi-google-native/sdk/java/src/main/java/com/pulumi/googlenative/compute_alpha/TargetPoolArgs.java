// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.TargetPoolSessionAffinity;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetPoolArgs Empty = new TargetPoolArgs();

    /**
     * The server-defined URL for the resource. This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool, and its failoverRatio field is properly set to a value between [0, 1]. backupPool and failoverRatio together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below failoverRatio, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio and backupPool are not set, or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @Import(name="backupPool")
      private final @Nullable Output<String> backupPool;

    public Output<String> backupPool() {
        return this.backupPool == null ? Codegen.empty() : this.backupPool;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * This field is applicable only when the containing target pool is serving a forwarding rule as the primary pool (i.e., not as a backup pool to some other target pool). The value of the field must be in [0, 1]. If set, backupPool must also be set. They together define the fallback behavior of the primary target pool: if the ratio of the healthy instances in the primary pool is at or below this number, traffic arriving at the load-balanced IP will be directed to the backup pool. In case where failoverRatio is not set or all the instances in the backup pool are unhealthy, the traffic will be directed back to the primary pool in the "force" mode, where traffic will be spread to the healthy instances with the best effort, or to all instances when no instance is healthy.
     * 
     */
    @Import(name="failoverRatio")
      private final @Nullable Output<Double> failoverRatio;

    public Output<Double> failoverRatio() {
        return this.failoverRatio == null ? Codegen.empty() : this.failoverRatio;
    }

    /**
     * The URL of the HttpHealthCheck resource. A member instance in this pool is considered healthy if and only if the health checks pass. Only legacy HttpHealthChecks are supported. Only one health check may be specified.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<List<String>> healthChecks;

    public Output<List<String>> healthChecks() {
        return this.healthChecks == null ? Codegen.empty() : this.healthChecks;
    }

    /**
     * A list of resource URLs to the virtual machine instances serving this pool. They must live in zones contained in the same region as this pool.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Session affinity option, must be one of the following values: NONE: Connections from the same client IP may go to any instance in the pool. CLIENT_IP: Connections from the same client IP will go to the same instance in the pool while that instance remains healthy. CLIENT_IP_PROTO: Connections from the same client IP with the same IP protocol will go to the same instance in the pool while that instance remains healthy.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<TargetPoolSessionAffinity> sessionAffinity;

    public Output<TargetPoolSessionAffinity> sessionAffinity() {
        return this.sessionAffinity == null ? Codegen.empty() : this.sessionAffinity;
    }

    public TargetPoolArgs(
        @Nullable Output<String> backupPool,
        @Nullable Output<String> description,
        @Nullable Output<Double> failoverRatio,
        @Nullable Output<List<String>> healthChecks,
        @Nullable Output<List<String>> instances,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<TargetPoolSessionAffinity> sessionAffinity) {
        this.backupPool = backupPool;
        this.description = description;
        this.failoverRatio = failoverRatio;
        this.healthChecks = healthChecks;
        this.instances = instances;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.sessionAffinity = sessionAffinity;
    }

    private TargetPoolArgs() {
        this.backupPool = Codegen.empty();
        this.description = Codegen.empty();
        this.failoverRatio = Codegen.empty();
        this.healthChecks = Codegen.empty();
        this.instances = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sessionAffinity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> backupPool;
        private @Nullable Output<String> description;
        private @Nullable Output<Double> failoverRatio;
        private @Nullable Output<List<String>> healthChecks;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<TargetPoolSessionAffinity> sessionAffinity;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupPool = defaults.backupPool;
    	      this.description = defaults.description;
    	      this.failoverRatio = defaults.failoverRatio;
    	      this.healthChecks = defaults.healthChecks;
    	      this.instances = defaults.instances;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.sessionAffinity = defaults.sessionAffinity;
        }

        public Builder backupPool(@Nullable Output<String> backupPool) {
            this.backupPool = backupPool;
            return this;
        }
        public Builder backupPool(@Nullable String backupPool) {
            this.backupPool = Codegen.ofNullable(backupPool);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder failoverRatio(@Nullable Output<Double> failoverRatio) {
            this.failoverRatio = failoverRatio;
            return this;
        }
        public Builder failoverRatio(@Nullable Double failoverRatio) {
            this.failoverRatio = Codegen.ofNullable(failoverRatio);
            return this;
        }
        public Builder healthChecks(@Nullable Output<List<String>> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable List<String> healthChecks) {
            this.healthChecks = Codegen.ofNullable(healthChecks);
            return this;
        }
        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<TargetPoolSessionAffinity> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable TargetPoolSessionAffinity sessionAffinity) {
            this.sessionAffinity = Codegen.ofNullable(sessionAffinity);
            return this;
        }        public TargetPoolArgs build() {
            return new TargetPoolArgs(backupPool, description, failoverRatio, healthChecks, instances, name, project, region, requestId, sessionAffinity);
        }
    }
}
