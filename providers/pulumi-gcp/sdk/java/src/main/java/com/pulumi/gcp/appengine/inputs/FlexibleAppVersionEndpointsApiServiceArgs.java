// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<String> configId;

    public Optional<Output<String>> configId() {
        return Optional.ofNullable(this.configId);
    }

    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    @Import(name="disableTraceSampling")
    private @Nullable Output<Boolean> disableTraceSampling;

    public Optional<Output<Boolean>> disableTraceSampling() {
        return Optional.ofNullable(this.disableTraceSampling);
    }

    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

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
    private @Nullable Output<String> rolloutStrategy;

    public Optional<Output<String>> rolloutStrategy() {
        return Optional.ofNullable(this.rolloutStrategy);
    }

    private FlexibleAppVersionEndpointsApiServiceArgs() {}

    private FlexibleAppVersionEndpointsApiServiceArgs(FlexibleAppVersionEndpointsApiServiceArgs $) {
        this.configId = $.configId;
        this.disableTraceSampling = $.disableTraceSampling;
        this.name = $.name;
        this.rolloutStrategy = $.rolloutStrategy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionEndpointsApiServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionEndpointsApiServiceArgs $;

        public Builder() {
            $ = new FlexibleAppVersionEndpointsApiServiceArgs();
        }

        public Builder(FlexibleAppVersionEndpointsApiServiceArgs defaults) {
            $ = new FlexibleAppVersionEndpointsApiServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(@Nullable Output<String> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(String configId) {
            return configId(Output.of(configId));
        }

        public Builder disableTraceSampling(@Nullable Output<Boolean> disableTraceSampling) {
            $.disableTraceSampling = disableTraceSampling;
            return this;
        }

        public Builder disableTraceSampling(Boolean disableTraceSampling) {
            return disableTraceSampling(Output.of(disableTraceSampling));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder rolloutStrategy(@Nullable Output<String> rolloutStrategy) {
            $.rolloutStrategy = rolloutStrategy;
            return this;
        }

        public Builder rolloutStrategy(String rolloutStrategy) {
            return rolloutStrategy(Output.of(rolloutStrategy));
        }

        public FlexibleAppVersionEndpointsApiServiceArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
