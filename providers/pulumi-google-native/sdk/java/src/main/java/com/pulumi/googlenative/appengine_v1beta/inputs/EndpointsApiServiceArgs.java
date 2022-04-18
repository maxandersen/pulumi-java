// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1beta.enums.EndpointsApiServiceRolloutStrategy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The Endpoints API Service provides tooling for serving Open API and gRPC endpoints via an NGINX proxy. Only valid for App Engine Flexible environment deployments.The fields here refer to the name and configuration ID of a "service" resource in the Service Management API (https://cloud.google.com/service-management/overview).
 * 
 */
public final class EndpointsApiServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointsApiServiceArgs Empty = new EndpointsApiServiceArgs();

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example "2016-09-19r1".By default, the rollout strategy for Endpoints is RolloutStrategy.FIXED. This means that Endpoints starts up with a particular configuration ID. When a new configuration is rolled out, Endpoints must be given the new configuration ID. The config_id field is used to give the configuration ID and is required in this case.Endpoints also has a rollout strategy called RolloutStrategy.MANAGED. When using this, Endpoints fetches the latest configuration and does not need the configuration ID. In this case, config_id must be omitted.
     * 
     */
    @Import(name="configId")
      private final @Nullable Output<String> configId;

    public Output<String> configId() {
        return this.configId == null ? Codegen.empty() : this.configId;
    }

    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    @Import(name="disableTraceSampling")
      private final @Nullable Output<Boolean> disableTraceSampling;

    public Output<Boolean> disableTraceSampling() {
        return this.disableTraceSampling == null ? Codegen.empty() : this.disableTraceSampling;
    }

    /**
     * Endpoints service name which is the name of the "service" resource in the Service Management API. For example "myapi.endpoints.myproject.cloud.goog"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Endpoints rollout strategy. If FIXED, config_id must be specified. If MANAGED, config_id must be omitted.
     * 
     */
    @Import(name="rolloutStrategy")
      private final @Nullable Output<EndpointsApiServiceRolloutStrategy> rolloutStrategy;

    public Output<EndpointsApiServiceRolloutStrategy> rolloutStrategy() {
        return this.rolloutStrategy == null ? Codegen.empty() : this.rolloutStrategy;
    }

    public EndpointsApiServiceArgs(
        @Nullable Output<String> configId,
        @Nullable Output<Boolean> disableTraceSampling,
        @Nullable Output<String> name,
        @Nullable Output<EndpointsApiServiceRolloutStrategy> rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = name;
        this.rolloutStrategy = rolloutStrategy;
    }

    private EndpointsApiServiceArgs() {
        this.configId = Codegen.empty();
        this.disableTraceSampling = Codegen.empty();
        this.name = Codegen.empty();
        this.rolloutStrategy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointsApiServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configId;
        private @Nullable Output<Boolean> disableTraceSampling;
        private @Nullable Output<String> name;
        private @Nullable Output<EndpointsApiServiceRolloutStrategy> rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointsApiServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder configId(@Nullable Output<String> configId) {
            this.configId = configId;
            return this;
        }
        public Builder configId(@Nullable String configId) {
            this.configId = Codegen.ofNullable(configId);
            return this;
        }
        public Builder disableTraceSampling(@Nullable Output<Boolean> disableTraceSampling) {
            this.disableTraceSampling = disableTraceSampling;
            return this;
        }
        public Builder disableTraceSampling(@Nullable Boolean disableTraceSampling) {
            this.disableTraceSampling = Codegen.ofNullable(disableTraceSampling);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder rolloutStrategy(@Nullable Output<EndpointsApiServiceRolloutStrategy> rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }
        public Builder rolloutStrategy(@Nullable EndpointsApiServiceRolloutStrategy rolloutStrategy) {
            this.rolloutStrategy = Codegen.ofNullable(rolloutStrategy);
            return this;
        }        public EndpointsApiServiceArgs build() {
            return new EndpointsApiServiceArgs(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
