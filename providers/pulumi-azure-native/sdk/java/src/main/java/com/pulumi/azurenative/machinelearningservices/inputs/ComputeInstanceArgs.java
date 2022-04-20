// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ComputeInstancePropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning compute instance.
 * 
 */
public final class ComputeInstanceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComputeInstanceArgs Empty = new ComputeInstanceArgs();

    /**
     * Location for the underlying compute
     * 
     */
    @Import(name="computeLocation")
      private final @Nullable Output<String> computeLocation;

    public Output<String> computeLocation() {
        return this.computeLocation == null ? Codegen.empty() : this.computeLocation;
    }

    /**
     * The type of compute
     * Expected value is &#39;ComputeInstance&#39;.
     * 
     */
    @Import(name="computeType", required=true)
      private final Output<String> computeType;

    public Output<String> computeType() {
        return this.computeType;
    }

    /**
     * The description of the Machine Learning compute.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Compute Instance properties
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ComputeInstancePropertiesArgs> properties;

    public Output<ComputeInstancePropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * ARM resource id of the underlying compute
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public ComputeInstanceArgs(
        @Nullable Output<String> computeLocation,
        Output<String> computeType,
        @Nullable Output<String> description,
        @Nullable Output<ComputeInstancePropertiesArgs> properties,
        @Nullable Output<String> resourceId) {
        this.computeLocation = computeLocation;
        this.computeType = Codegen.stringProp("computeType").output().arg(computeType).require();
        this.description = description;
        this.properties = properties;
        this.resourceId = resourceId;
    }

    private ComputeInstanceArgs() {
        this.computeLocation = Codegen.empty();
        this.computeType = Codegen.empty();
        this.description = Codegen.empty();
        this.properties = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> computeLocation;
        private Output<String> computeType;
        private @Nullable Output<String> description;
        private @Nullable Output<ComputeInstancePropertiesArgs> properties;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeLocation = defaults.computeLocation;
    	      this.computeType = defaults.computeType;
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder computeLocation(@Nullable Output<String> computeLocation) {
            this.computeLocation = computeLocation;
            return this;
        }
        public Builder computeLocation(@Nullable String computeLocation) {
            this.computeLocation = Codegen.ofNullable(computeLocation);
            return this;
        }
        public Builder computeType(Output<String> computeType) {
            this.computeType = Objects.requireNonNull(computeType);
            return this;
        }
        public Builder computeType(String computeType) {
            this.computeType = Output.of(Objects.requireNonNull(computeType));
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
        public Builder properties(@Nullable Output<ComputeInstancePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ComputeInstancePropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public ComputeInstanceArgs build() {
            return new ComputeInstanceArgs(computeLocation, computeType, description, properties, resourceId);
        }
    }
}
