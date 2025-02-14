// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeConfigurationResponse {
    /**
     * @return Number of instances or nodes.
     * 
     */
    private final @Nullable Integer instanceCount;
    /**
     * @return SKU type to run on.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return Set to true for jobs running on local compute.
     * 
     */
    private final @Nullable Boolean isLocal;
    /**
     * @return Location for virtual cluster run.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Additional properties.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * @return ARM resource ID of the Compute you are targeting. If not provided the resource will be deployed as Managed.
     * 
     */
    private final @Nullable String target;

    @CustomType.Constructor
    private ComputeConfigurationResponse(
        @CustomType.Parameter("instanceCount") @Nullable Integer instanceCount,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("isLocal") @Nullable Boolean isLocal,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties,
        @CustomType.Parameter("target") @Nullable String target) {
        this.instanceCount = instanceCount;
        this.instanceType = instanceType;
        this.isLocal = isLocal;
        this.location = location;
        this.properties = properties;
        this.target = target;
    }

    /**
     * @return Number of instances or nodes.
     * 
     */
    public Optional<Integer> instanceCount() {
        return Optional.ofNullable(this.instanceCount);
    }
    /**
     * @return SKU type to run on.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Set to true for jobs running on local compute.
     * 
     */
    public Optional<Boolean> isLocal() {
        return Optional.ofNullable(this.isLocal);
    }
    /**
     * @return Location for virtual cluster run.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Additional properties.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return ARM resource ID of the Compute you are targeting. If not provided the resource will be deployed as Managed.
     * 
     */
    public Optional<String> target() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer instanceCount;
        private @Nullable String instanceType;
        private @Nullable Boolean isLocal;
        private @Nullable String location;
        private @Nullable Map<String,String> properties;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.instanceType = defaults.instanceType;
    	      this.isLocal = defaults.isLocal;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.target = defaults.target;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder isLocal(@Nullable Boolean isLocal) {
            this.isLocal = isLocal;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }        public ComputeConfigurationResponse build() {
            return new ComputeConfigurationResponse(instanceCount, instanceType, isLocal, location, properties, target);
        }
    }
}
