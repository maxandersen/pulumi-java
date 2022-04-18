// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.AvailablePatchSummaryResponse;
import com.pulumi.azurenative.compute.inputs.InstanceViewStatusResponse;
import com.pulumi.azurenative.compute.inputs.LastPatchInstallationSummaryResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The status of virtual machine patch operations.
 * 
 */
public final class VirtualMachinePatchStatusResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualMachinePatchStatusResponse Empty = new VirtualMachinePatchStatusResponse();

    /**
     * The available patch summary of the latest assessment operation for the virtual machine.
     * 
     */
    @Import(name="availablePatchSummary")
      private final @Nullable AvailablePatchSummaryResponse availablePatchSummary;

    public Optional<AvailablePatchSummaryResponse> availablePatchSummary() {
        return this.availablePatchSummary == null ? Optional.empty() : Optional.ofNullable(this.availablePatchSummary);
    }

    /**
     * The enablement status of the specified patchMode
     * 
     */
    @Import(name="configurationStatuses", required=true)
      private final List<InstanceViewStatusResponse> configurationStatuses;

    public List<InstanceViewStatusResponse> configurationStatuses() {
        return this.configurationStatuses;
    }

    /**
     * The installation summary of the latest installation operation for the virtual machine.
     * 
     */
    @Import(name="lastPatchInstallationSummary")
      private final @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

    public Optional<LastPatchInstallationSummaryResponse> lastPatchInstallationSummary() {
        return this.lastPatchInstallationSummary == null ? Optional.empty() : Optional.ofNullable(this.lastPatchInstallationSummary);
    }

    public VirtualMachinePatchStatusResponse(
        @Nullable AvailablePatchSummaryResponse availablePatchSummary,
        List<InstanceViewStatusResponse> configurationStatuses,
        @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
        this.availablePatchSummary = availablePatchSummary;
        this.configurationStatuses = Objects.requireNonNull(configurationStatuses, "expected parameter 'configurationStatuses' to be non-null");
        this.lastPatchInstallationSummary = lastPatchInstallationSummary;
    }

    private VirtualMachinePatchStatusResponse() {
        this.availablePatchSummary = null;
        this.configurationStatuses = List.of();
        this.lastPatchInstallationSummary = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePatchStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AvailablePatchSummaryResponse availablePatchSummary;
        private List<InstanceViewStatusResponse> configurationStatuses;
        private @Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePatchStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availablePatchSummary = defaults.availablePatchSummary;
    	      this.configurationStatuses = defaults.configurationStatuses;
    	      this.lastPatchInstallationSummary = defaults.lastPatchInstallationSummary;
        }

        public Builder availablePatchSummary(@Nullable AvailablePatchSummaryResponse availablePatchSummary) {
            this.availablePatchSummary = availablePatchSummary;
            return this;
        }
        public Builder configurationStatuses(List<InstanceViewStatusResponse> configurationStatuses) {
            this.configurationStatuses = Objects.requireNonNull(configurationStatuses);
            return this;
        }
        public Builder configurationStatuses(InstanceViewStatusResponse... configurationStatuses) {
            return configurationStatuses(List.of(configurationStatuses));
        }
        public Builder lastPatchInstallationSummary(@Nullable LastPatchInstallationSummaryResponse lastPatchInstallationSummary) {
            this.lastPatchInstallationSummary = lastPatchInstallationSummary;
            return this;
        }        public VirtualMachinePatchStatusResponse build() {
            return new VirtualMachinePatchStatusResponse(availablePatchSummary, configurationStatuses, lastPatchInstallationSummary);
        }
    }
}
