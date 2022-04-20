// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexibleAppVersionEndpointsApiServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionEndpointsApiServiceArgs Empty = new FlexibleAppVersionEndpointsApiServiceArgs();

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.
     * By default, the rollout strategy for Endpoints is &#34;FIXED&#34;. This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called &#34;MANAGED&#34;. When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
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
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
     */
    @Import(name="rolloutStrategy")
      private final @Nullable Output<String> rolloutStrategy;

    public Output<String> rolloutStrategy() {
        return this.rolloutStrategy == null ? Codegen.empty() : this.rolloutStrategy;
    }

    public FlexibleAppVersionEndpointsApiServiceArgs(
        @Nullable Output<String> configId,
        @Nullable Output<Boolean> disableTraceSampling,
        Output<String> name,
        @Nullable Output<String> rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.rolloutStrategy = rolloutStrategy;
    }

    private FlexibleAppVersionEndpointsApiServiceArgs() {
        this.configId = Codegen.empty();
        this.disableTraceSampling = Codegen.empty();
        this.name = Codegen.empty();
        this.rolloutStrategy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEndpointsApiServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configId;
        private @Nullable Output<Boolean> disableTraceSampling;
        private Output<String> name;
        private @Nullable Output<String> rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEndpointsApiServiceArgs defaults) {
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
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder rolloutStrategy(@Nullable Output<String> rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }
        public Builder rolloutStrategy(@Nullable String rolloutStrategy) {
            this.rolloutStrategy = Codegen.ofNullable(rolloutStrategy);
            return this;
        }        public FlexibleAppVersionEndpointsApiServiceArgs build() {
            return new FlexibleAppVersionEndpointsApiServiceArgs(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
