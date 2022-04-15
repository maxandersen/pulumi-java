// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationProfileAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationProfileAssignmentArgs Empty = new GetConfigurationProfileAssignmentArgs();

    /**
     * The configuration profile assignment name.
     * 
     */
    @Import(name="configurationProfileAssignmentName", required=true)
      private final String configurationProfileAssignmentName;

    public String configurationProfileAssignmentName() {
        return this.configurationProfileAssignmentName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @Import(name="vmName", required=true)
      private final String vmName;

    public String vmName() {
        return this.vmName;
    }

    public GetConfigurationProfileAssignmentArgs(
        String configurationProfileAssignmentName,
        String resourceGroupName,
        String vmName) {
        this.configurationProfileAssignmentName = Objects.requireNonNull(configurationProfileAssignmentName, "expected parameter 'configurationProfileAssignmentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GetConfigurationProfileAssignmentArgs() {
        this.configurationProfileAssignmentName = null;
        this.resourceGroupName = null;
        this.vmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationProfileAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configurationProfileAssignmentName;
        private String resourceGroupName;
        private String vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationProfileAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationProfileAssignmentName = defaults.configurationProfileAssignmentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmName = defaults.vmName;
        }

        public Builder configurationProfileAssignmentName(String configurationProfileAssignmentName) {
            this.configurationProfileAssignmentName = Objects.requireNonNull(configurationProfileAssignmentName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }        public GetConfigurationProfileAssignmentArgs build() {
            return new GetConfigurationProfileAssignmentArgs(configurationProfileAssignmentName, resourceGroupName, vmName);
        }
    }
}
