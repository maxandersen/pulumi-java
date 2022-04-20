// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.vmmigration_v1.inputs.VmUtilizationMetricsResponse;
import com.pulumi.googlenative.vmmigration_v1.inputs.VmwareVmDetailsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Utilization information of a single VM.
 * 
 */
public final class VmUtilizationInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final VmUtilizationInfoResponse Empty = new VmUtilizationInfoResponse();

    /**
     * Utilization metrics for this VM.
     * 
     */
    @Import(name="utilization", required=true)
      private final VmUtilizationMetricsResponse utilization;

    public VmUtilizationMetricsResponse utilization() {
        return this.utilization;
    }

    /**
     * The VM&#39;s ID in the source.
     * 
     */
    @Import(name="vmId", required=true)
      private final String vmId;

    public String vmId() {
        return this.vmId;
    }

    /**
     * The description of the VM in a Source of type Vmware.
     * 
     */
    @Import(name="vmwareVmDetails", required=true)
      private final VmwareVmDetailsResponse vmwareVmDetails;

    public VmwareVmDetailsResponse vmwareVmDetails() {
        return this.vmwareVmDetails;
    }

    public VmUtilizationInfoResponse(
        VmUtilizationMetricsResponse utilization,
        String vmId,
        VmwareVmDetailsResponse vmwareVmDetails) {
        this.utilization = Objects.requireNonNull(utilization, "expected parameter 'utilization' to be non-null");
        this.vmId = Objects.requireNonNull(vmId, "expected parameter 'vmId' to be non-null");
        this.vmwareVmDetails = Objects.requireNonNull(vmwareVmDetails, "expected parameter 'vmwareVmDetails' to be non-null");
    }

    private VmUtilizationInfoResponse() {
        this.utilization = null;
        this.vmId = null;
        this.vmwareVmDetails = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmUtilizationMetricsResponse utilization;
        private String vmId;
        private VmwareVmDetailsResponse vmwareVmDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.utilization = defaults.utilization;
    	      this.vmId = defaults.vmId;
    	      this.vmwareVmDetails = defaults.vmwareVmDetails;
        }

        public Builder utilization(VmUtilizationMetricsResponse utilization) {
            this.utilization = Objects.requireNonNull(utilization);
            return this;
        }
        public Builder vmId(String vmId) {
            this.vmId = Objects.requireNonNull(vmId);
            return this;
        }
        public Builder vmwareVmDetails(VmwareVmDetailsResponse vmwareVmDetails) {
            this.vmwareVmDetails = Objects.requireNonNull(vmwareVmDetails);
            return this;
        }        public VmUtilizationInfoResponse build() {
            return new VmUtilizationInfoResponse(utilization, vmId, vmwareVmDetails);
        }
    }
}
