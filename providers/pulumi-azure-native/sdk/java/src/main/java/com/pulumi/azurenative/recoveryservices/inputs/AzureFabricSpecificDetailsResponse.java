// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Azure Fabric Specific Details.
 * 
 */
public final class AzureFabricSpecificDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFabricSpecificDetailsResponse Empty = new AzureFabricSpecificDetailsResponse();

    /**
     * The container Ids for the Azure fabric.
     * 
     */
    @Import(name="containerIds")
      private final @Nullable List<String> containerIds;

    public List<String> containerIds() {
        return this.containerIds == null ? List.of() : this.containerIds;
    }

    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is &#39;Azure&#39;.
     * 
     */
    @Import(name="instanceType", required=true)
      private final String instanceType;

    public String instanceType() {
        return this.instanceType;
    }

    /**
     * The Location for the Azure fabric.
     * 
     */
    @Import(name="location")
      private final @Nullable String location;

    public Optional<String> location() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    public AzureFabricSpecificDetailsResponse(
        @Nullable List<String> containerIds,
        String instanceType,
        @Nullable String location) {
        this.containerIds = containerIds;
        this.instanceType = Codegen.stringProp("instanceType").arg(instanceType).require();
        this.location = location;
    }

    private AzureFabricSpecificDetailsResponse() {
        this.containerIds = List.of();
        this.instanceType = null;
        this.location = null;
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
