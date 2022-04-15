// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationProtectionContainerMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetReplicationProtectionContainerMappingArgs Empty = new GetReplicationProtectionContainerMappingArgs();

    /**
     * Fabric name.
     * 
     */
    @Import(name="fabricName", required=true)
      private final String fabricName;

    public String fabricName() {
        return this.fabricName;
    }

    /**
     * Protection Container mapping name.
     * 
     */
    @Import(name="mappingName", required=true)
      private final String mappingName;

    public String mappingName() {
        return this.mappingName;
    }

    /**
     * Protection container name.
     * 
     */
    @Import(name="protectionContainerName", required=true)
      private final String protectionContainerName;

    public String protectionContainerName() {
        return this.protectionContainerName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String resourceName() {
        return this.resourceName;
    }

    public GetReplicationProtectionContainerMappingArgs(
        String fabricName,
        String mappingName,
        String protectionContainerName,
        String resourceGroupName,
        String resourceName) {
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.mappingName = Objects.requireNonNull(mappingName, "expected parameter 'mappingName' to be non-null");
        this.protectionContainerName = Objects.requireNonNull(protectionContainerName, "expected parameter 'protectionContainerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private GetReplicationProtectionContainerMappingArgs() {
        this.fabricName = null;
        this.mappingName = null;
        this.protectionContainerName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReplicationProtectionContainerMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String fabricName;
        private String mappingName;
        private String protectionContainerName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReplicationProtectionContainerMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fabricName = defaults.fabricName;
    	      this.mappingName = defaults.mappingName;
    	      this.protectionContainerName = defaults.protectionContainerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder fabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder mappingName(String mappingName) {
            this.mappingName = Objects.requireNonNull(mappingName);
            return this;
        }
        public Builder protectionContainerName(String protectionContainerName) {
            this.protectionContainerName = Objects.requireNonNull(protectionContainerName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public GetReplicationProtectionContainerMappingArgs build() {
            return new GetReplicationProtectionContainerMappingArgs(fabricName, mappingName, protectionContainerName, resourceGroupName, resourceName);
        }
    }
}
