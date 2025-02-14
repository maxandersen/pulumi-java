// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureFabricSpecificDetailsResponse {
    /**
     * @return The container Ids for the Azure fabric.
     * 
     */
    private final @Nullable List<String> containerIds;
    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;Azure&#39;.
     * 
     */
    private final String instanceType;
    /**
     * @return The Location for the Azure fabric.
     * 
     */
    private final @Nullable String location;

    @CustomType.Constructor
    private AzureFabricSpecificDetailsResponse(
        @CustomType.Parameter("containerIds") @Nullable List<String> containerIds,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("location") @Nullable String location) {
        this.containerIds = containerIds;
        this.instanceType = instanceType;
        this.location = location;
    }

    /**
     * @return The container Ids for the Azure fabric.
     * 
     */
    public List<String> containerIds() {
        return this.containerIds == null ? List.of() : this.containerIds;
    }
    /**
     * @return Gets the class type. Overridden in derived classes.
     * Expected value is &#39;Azure&#39;.
     * 
     */
    public String instanceType() {
        return this.instanceType;
    }
    /**
     * @return The Location for the Azure fabric.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> containerIds;
        private String instanceType;
        private @Nullable String location;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFabricSpecificDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerIds = defaults.containerIds;
    	      this.instanceType = defaults.instanceType;
    	      this.location = defaults.location;
        }

        public Builder containerIds(@Nullable List<String> containerIds) {
            this.containerIds = containerIds;
            return this;
        }
        public Builder containerIds(String... containerIds) {
            return containerIds(List.of(containerIds));
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }        public AzureFabricSpecificDetailsResponse build() {
            return new AzureFabricSpecificDetailsResponse(containerIds, instanceType, location);
        }
    }
}
