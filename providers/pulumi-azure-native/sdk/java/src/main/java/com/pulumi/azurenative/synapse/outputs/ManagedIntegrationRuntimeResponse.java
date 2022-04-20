// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.azurenative.synapse.outputs.IntegrationRuntimeComputePropertiesResponse;
import com.pulumi.azurenative.synapse.outputs.IntegrationRuntimeSsisPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedIntegrationRuntimeResponse {
    /**
     * The compute resource for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
    /**
     * Integration runtime description.
     * 
     */
    private final @Nullable String description;
    /**
     * SSIS properties for managed integration runtime.
     * 
     */
    private final @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
     */
    private final String state;
    /**
     * The type of integration runtime.
     * Expected value is &#39;Managed&#39;.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ManagedIntegrationRuntimeResponse(
        @CustomType.Parameter("computeProperties") @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("ssisProperties") @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type) {
        this.computeProperties = computeProperties;
        this.description = description;
        this.ssisProperties = ssisProperties;
        this.state = state;
        this.type = type;
    }

    /**
     * The compute resource for managed integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeComputePropertiesResponse> computeProperties() {
        return Optional.ofNullable(this.computeProperties);
    }
    /**
     * Integration runtime description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * SSIS properties for managed integration runtime.
     * 
    */
    public Optional<IntegrationRuntimeSsisPropertiesResponse> ssisProperties() {
        return Optional.ofNullable(this.ssisProperties);
    }
    /**
     * Integration runtime state, only valid for managed dedicated integration runtime.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The type of integration runtime.
     * Expected value is &#39;Managed&#39;.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIntegrationRuntimeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable IntegrationRuntimeComputePropertiesResponse computeProperties;
        private @Nullable String description;
        private @Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIntegrationRuntimeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeProperties = defaults.computeProperties;
    	      this.description = defaults.description;
    	      this.ssisProperties = defaults.ssisProperties;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder computeProperties(@Nullable IntegrationRuntimeComputePropertiesResponse computeProperties) {
            this.computeProperties = computeProperties;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder ssisProperties(@Nullable IntegrationRuntimeSsisPropertiesResponse ssisProperties) {
            this.ssisProperties = ssisProperties;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ManagedIntegrationRuntimeResponse build() {
            return new ManagedIntegrationRuntimeResponse(computeProperties, description, ssisProperties, state, type);
        }
    }
}
