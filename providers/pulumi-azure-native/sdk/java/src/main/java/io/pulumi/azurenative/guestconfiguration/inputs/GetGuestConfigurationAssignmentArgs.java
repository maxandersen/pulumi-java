// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetGuestConfigurationAssignmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGuestConfigurationAssignmentArgs Empty = new GetGuestConfigurationAssignmentArgs();

    /**
     * The guest configuration assignment name.
     * 
     */
    @Import(name="guestConfigurationAssignmentName", required=true)
      private final String guestConfigurationAssignmentName;

    public String guestConfigurationAssignmentName() {
        return this.guestConfigurationAssignmentName;
    }

    /**
     * The resource group name.
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

    public GetGuestConfigurationAssignmentArgs(
        String guestConfigurationAssignmentName,
        String resourceGroupName,
        String vmName) {
        this.guestConfigurationAssignmentName = Objects.requireNonNull(guestConfigurationAssignmentName, "expected parameter 'guestConfigurationAssignmentName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmName = Objects.requireNonNull(vmName, "expected parameter 'vmName' to be non-null");
    }

    private GetGuestConfigurationAssignmentArgs() {
        this.guestConfigurationAssignmentName = null;
        this.resourceGroupName = null;
        this.vmName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuestConfigurationAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String guestConfigurationAssignmentName;
        private String resourceGroupName;
        private String vmName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuestConfigurationAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestConfigurationAssignmentName = defaults.guestConfigurationAssignmentName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmName = defaults.vmName;
        }

        public Builder guestConfigurationAssignmentName(String guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = Objects.requireNonNull(guestConfigurationAssignmentName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vmName(String vmName) {
            this.vmName = Objects.requireNonNull(vmName);
            return this;
        }        public GetGuestConfigurationAssignmentArgs build() {
            return new GetGuestConfigurationAssignmentArgs(guestConfigurationAssignmentName, resourceGroupName, vmName);
        }
    }
}
