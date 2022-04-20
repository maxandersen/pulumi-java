// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionEndpointsApiService {
    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.
     * By default, the rollout strategy for Endpoints is &#34;FIXED&#34;. This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called &#34;MANAGED&#34;. When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
     * 
     */
    private final @Nullable String configId;
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
     */
    private final @Nullable Boolean disableTraceSampling;
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
     */
    private final String name;
    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
     */
    private final @Nullable String rolloutStrategy;

    @CustomType.Constructor
    private FlexibleAppVersionEndpointsApiService(
        @CustomType.Parameter("configId") @Nullable String configId,
        @CustomType.Parameter("disableTraceSampling") @Nullable Boolean disableTraceSampling,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("rolloutStrategy") @Nullable String rolloutStrategy) {
        this.configId = configId;
        this.disableTraceSampling = disableTraceSampling;
        this.name = name;
        this.rolloutStrategy = rolloutStrategy;
    }

    /**
     * Endpoints service configuration ID as specified by the Service Management API. For example &#34;2016-09-19r1&#34;.
     * By default, the rollout strategy for Endpoints is &#34;FIXED&#34;. This means that Endpoints starts up with a particular configuration ID.
     * When a new configuration is rolled out, Endpoints must be given the new configuration ID. The configId field is used to give the configuration ID
     * and is required in this case.
     * Endpoints also has a rollout strategy called &#34;MANAGED&#34;. When using this, Endpoints fetches the latest configuration and does not need
     * the configuration ID. In this case, configId must be omitted.
     * 
    */
    public Optional<String> configId() {
        return Optional.ofNullable(this.configId);
    }
    /**
     * Enable or disable trace sampling. By default, this is set to false for enabled.
     * 
    */
    public Optional<Boolean> disableTraceSampling() {
        return Optional.ofNullable(this.disableTraceSampling);
    }
    /**
     * Full Serverless VPC Access Connector name e.g. /projects/my-project/locations/us-central1/connectors/c1.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Endpoints rollout strategy. If FIXED, configId must be specified. If MANAGED, configId must be omitted.
     * Default value is `FIXED`.
     * Possible values are `FIXED` and `MANAGED`.
     * 
    */
    public Optional<String> rolloutStrategy() {
        return Optional.ofNullable(this.rolloutStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionEndpointsApiService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configId;
        private @Nullable Boolean disableTraceSampling;
        private String name;
        private @Nullable String rolloutStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexibleAppVersionEndpointsApiService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configId = defaults.configId;
    	      this.disableTraceSampling = defaults.disableTraceSampling;
    	      this.name = defaults.name;
    	      this.rolloutStrategy = defaults.rolloutStrategy;
        }

        public Builder configId(@Nullable String configId) {
            this.configId = configId;
            return this;
        }
        public Builder disableTraceSampling(@Nullable Boolean disableTraceSampling) {
            this.disableTraceSampling = disableTraceSampling;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder rolloutStrategy(@Nullable String rolloutStrategy) {
            this.rolloutStrategy = rolloutStrategy;
            return this;
        }        public FlexibleAppVersionEndpointsApiService build() {
            return new FlexibleAppVersionEndpointsApiService(configId, disableTraceSampling, name, rolloutStrategy);
        }
    }
}
