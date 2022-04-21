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
    private VmUtilizationMetricsResponse utilization;

    public VmUtilizationMetricsResponse utilization() {
        return this.utilization;
    }

    /**
     * The VM&#39;s ID in the source.
     * 
     */
    @Import(name="vmId", required=true)
    private String vmId;

    public String vmId() {
        return this.vmId;
    }

    /**
     * The description of the VM in a Source of type Vmware.
     * 
     */
    @Import(name="vmwareVmDetails", required=true)
    private VmwareVmDetailsResponse vmwareVmDetails;

    public VmwareVmDetailsResponse vmwareVmDetails() {
        return this.vmwareVmDetails;
    }

    private VmUtilizationInfoResponse() {}

    private VmUtilizationInfoResponse(VmUtilizationInfoResponse $) {
        this.utilization = $.utilization;
        this.vmId = $.vmId;
        this.vmwareVmDetails = $.vmwareVmDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VmUtilizationInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VmUtilizationInfoResponse $;

        public Builder() {
            $ = new VmUtilizationInfoResponse();
        }

        public Builder(VmUtilizationInfoResponse defaults) {
            $ = new VmUtilizationInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder utilization(VmUtilizationMetricsResponse utilization) {
            $.utilization = utilization;
            return this;
        }

        public Builder vmId(String vmId) {
            $.vmId = vmId;
            return this;
        }

        public Builder vmwareVmDetails(VmwareVmDetailsResponse vmwareVmDetails) {
            $.vmwareVmDetails = vmwareVmDetails;
            return this;
        }

        public VmUtilizationInfoResponse build() {
            $.utilization = Objects.requireNonNull($.utilization, "expected parameter 'utilization' to be non-null");
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            $.vmwareVmDetails = Objects.requireNonNull($.vmwareVmDetails, "expected parameter 'vmwareVmDetails' to be non-null");
            return $;
        }
    }

}
