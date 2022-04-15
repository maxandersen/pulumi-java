// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.delegatednetwork;

import io.pulumi.azurenative.delegatednetwork.inputs.ControllerDetailsArgs;
import io.pulumi.azurenative.delegatednetwork.inputs.SubnetDetailsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DelegatedSubnetServiceDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DelegatedSubnetServiceDetailsArgs Empty = new DelegatedSubnetServiceDetailsArgs();

    /**
     * Properties of the controller.
     * 
     */
    @Import(name="controllerDetails")
      private final @Nullable Output<ControllerDetailsArgs> controllerDetails;

    public Output<ControllerDetailsArgs> controllerDetails() {
        return this.controllerDetails == null ? Codegen.empty() : this.controllerDetails;
    }

    /**
     * Location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource. It must be a minimum of 3 characters, and a maximum of 63.
     * 
     */
    @Import(name="resourceName")
      private final @Nullable Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName == null ? Codegen.empty() : this.resourceName;
    }

    /**
     * subnet details
     * 
     */
    @Import(name="subnetDetails")
      private final @Nullable Output<SubnetDetailsArgs> subnetDetails;

    public Output<SubnetDetailsArgs> subnetDetails() {
        return this.subnetDetails == null ? Codegen.empty() : this.subnetDetails;
    }

    /**
     * The resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DelegatedSubnetServiceDetailsArgs(
        @Nullable Output<ControllerDetailsArgs> controllerDetails,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<String> resourceName,
        @Nullable Output<SubnetDetailsArgs> subnetDetails,
        @Nullable Output<Map<String,String>> tags) {
        this.controllerDetails = controllerDetails;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.subnetDetails = subnetDetails;
        this.tags = tags;
    }

    private DelegatedSubnetServiceDetailsArgs() {
        this.controllerDetails = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.subnetDetails = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DelegatedSubnetServiceDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ControllerDetailsArgs> controllerDetails;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> resourceName;
        private @Nullable Output<SubnetDetailsArgs> subnetDetails;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DelegatedSubnetServiceDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.controllerDetails = defaults.controllerDetails;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.subnetDetails = defaults.subnetDetails;
    	      this.tags = defaults.tags;
        }

        public Builder controllerDetails(@Nullable Output<ControllerDetailsArgs> controllerDetails) {
            this.controllerDetails = controllerDetails;
            return this;
        }
        public Builder controllerDetails(@Nullable ControllerDetailsArgs controllerDetails) {
            this.controllerDetails = Codegen.ofNullable(controllerDetails);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(@Nullable Output<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public Builder resourceName(@Nullable String resourceName) {
            this.resourceName = Codegen.ofNullable(resourceName);
            return this;
        }
        public Builder subnetDetails(@Nullable Output<SubnetDetailsArgs> subnetDetails) {
            this.subnetDetails = subnetDetails;
            return this;
        }
        public Builder subnetDetails(@Nullable SubnetDetailsArgs subnetDetails) {
            this.subnetDetails = Codegen.ofNullable(subnetDetails);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DelegatedSubnetServiceDetailsArgs build() {
            return new DelegatedSubnetServiceDetailsArgs(controllerDetails, location, resourceGroupName, resourceName, subnetDetails, tags);
        }
    }
}
