// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement;

import io.pulumi.azurenative.operationsmanagement.inputs.ManagementAssociationPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagementAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementAssociationArgs Empty = new ManagementAssociationArgs();

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * User ManagementAssociation Name.
     * 
     */
    @Import(name="managementAssociationName")
      private final @Nullable Output<String> managementAssociationName;

    public Output<String> managementAssociationName() {
        return this.managementAssociationName == null ? Codegen.empty() : this.managementAssociationName;
    }

    /**
     * Properties for ManagementAssociation object supported by the OperationsManagement resource provider.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<ManagementAssociationPropertiesArgs> properties;

    public Output<ManagementAssociationPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    /**
     * Provider name for the parent resource.
     * 
     */
    @Import(name="providerName", required=true)
      private final Output<String> providerName;

    public Output<String> providerName() {
        return this.providerName;
    }

    /**
     * The name of the resource group to get. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Parent resource name.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> resourceName() {
        return this.resourceName;
    }

    /**
     * Resource type for the parent resource
     * 
     */
    @Import(name="resourceType", required=true)
      private final Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    public ManagementAssociationArgs(
        @Nullable Output<String> location,
        @Nullable Output<String> managementAssociationName,
        @Nullable Output<ManagementAssociationPropertiesArgs> properties,
        Output<String> providerName,
        Output<String> resourceGroupName,
        Output<String> resourceName,
        Output<String> resourceType) {
        this.location = location;
        this.managementAssociationName = managementAssociationName;
        this.properties = properties;
        this.providerName = Objects.requireNonNull(providerName, "expected parameter 'providerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
    }

    private ManagementAssociationArgs() {
        this.location = Codegen.empty();
        this.managementAssociationName = Codegen.empty();
        this.properties = Codegen.empty();
        this.providerName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.resourceName = Codegen.empty();
        this.resourceType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;
        private @Nullable Output<String> managementAssociationName;
        private @Nullable Output<ManagementAssociationPropertiesArgs> properties;
        private Output<String> providerName;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;
        private Output<String> resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.managementAssociationName = defaults.managementAssociationName;
    	      this.properties = defaults.properties;
    	      this.providerName = defaults.providerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder managementAssociationName(@Nullable Output<String> managementAssociationName) {
            this.managementAssociationName = managementAssociationName;
            return this;
        }
        public Builder managementAssociationName(@Nullable String managementAssociationName) {
            this.managementAssociationName = Codegen.ofNullable(managementAssociationName);
            return this;
        }
        public Builder properties(@Nullable Output<ManagementAssociationPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable ManagementAssociationPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }
        public Builder providerName(Output<String> providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        public Builder providerName(String providerName) {
            this.providerName = Output.of(Objects.requireNonNull(providerName));
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
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }
        public Builder resourceType(Output<String> resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Output.of(Objects.requireNonNull(resourceType));
            return this;
        }        public ManagementAssociationArgs build() {
            return new ManagementAssociationArgs(location, managementAssociationName, properties, providerName, resourceGroupName, resourceName, resourceType);
        }
    }
}
