// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.vmmigration_v1.inputs.VmUtilizationMetricsArgs;
import com.pulumi.googlenative.vmmigration_v1.inputs.VmwareVmDetailsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Utilization information of a single VM.
 * 
 */
public final class VmUtilizationInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final VmUtilizationInfoArgs Empty = new VmUtilizationInfoArgs();

    /**
     * Utilization metrics for this VM.
     * 
     */
    @Import(name="utilization")
      private final @Nullable Output<VmUtilizationMetricsArgs> utilization;

    public Output<VmUtilizationMetricsArgs> utilization() {
        return this.utilization == null ? Codegen.empty() : this.utilization;
    }

    /**
     * The VM&#39;s ID in the source.
     * 
     */
    @Import(name="vmId")
      private final @Nullable Output<String> vmId;

    public Output<String> vmId() {
        return this.vmId == null ? Codegen.empty() : this.vmId;
    }

    /**
     * The description of the VM in a Source of type Vmware.
     * 
     */
    @Import(name="vmwareVmDetails")
      private final @Nullable Output<VmwareVmDetailsArgs> vmwareVmDetails;

    public Output<VmwareVmDetailsArgs> vmwareVmDetails() {
        return this.vmwareVmDetails == null ? Codegen.empty() : this.vmwareVmDetails;
    }

    public VmUtilizationInfoArgs(
        @Nullable Output<VmUtilizationMetricsArgs> utilization,
        @Nullable Output<String> vmId,
        @Nullable Output<VmwareVmDetailsArgs> vmwareVmDetails) {
        this.utilization = utilization;
        this.vmId = vmId;
        this.vmwareVmDetails = vmwareVmDetails;
    }

    private VmUtilizationInfoArgs() {
        this.utilization = Codegen.empty();
        this.vmId = Codegen.empty();
        this.vmwareVmDetails = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VmUtilizationMetricsArgs> utilization;
        private @Nullable Output<String> vmId;
        private @Nullable Output<VmwareVmDetailsArgs> vmwareVmDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilization = defaults.utilization;
    	      this.vmId = defaults.vmId;
    	      this.vmwareVmDetails = defaults.vmwareVmDetails;
        }

        public Builder utilization(@Nullable Output<VmUtilizationMetricsArgs> utilization) {
            this.utilization = utilization;
            return this;
        }
        public Builder utilization(@Nullable VmUtilizationMetricsArgs utilization) {
            this.utilization = Codegen.ofNullable(utilization);
            return this;
        }
        public Builder vmId(@Nullable Output<String> vmId) {
            this.vmId = vmId;
            return this;
        }
        public Builder vmId(@Nullable String vmId) {
            this.vmId = Codegen.ofNullable(vmId);
            return this;
        }
        public Builder vmwareVmDetails(@Nullable Output<VmwareVmDetailsArgs> vmwareVmDetails) {
            this.vmwareVmDetails = vmwareVmDetails;
            return this;
        }
        public Builder vmwareVmDetails(@Nullable VmwareVmDetailsArgs vmwareVmDetails) {
            this.vmwareVmDetails = Codegen.ofNullable(vmwareVmDetails);
            return this;
        }        public VmUtilizationInfoArgs build() {
            return new VmUtilizationInfoArgs(utilization, vmId, vmwareVmDetails);
        }
    }
}
