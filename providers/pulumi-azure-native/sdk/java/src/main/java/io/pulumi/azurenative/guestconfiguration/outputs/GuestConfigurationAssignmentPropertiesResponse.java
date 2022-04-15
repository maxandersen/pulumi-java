// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.outputs;

import io.pulumi.azurenative.guestconfiguration.outputs.AssignmentReportResponse;
import io.pulumi.azurenative.guestconfiguration.outputs.GuestConfigurationNavigationResponse;
import io.pulumi.azurenative.guestconfiguration.outputs.VMSSVMInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestConfigurationAssignmentPropertiesResponse {
    /**
     * Combined hash of the configuration package and parameters.
     * 
     */
    private final String assignmentHash;
    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    private final String complianceStatus;
    /**
     * The source which initiated the guest configuration assignment. Ex: Azure Policy
     * 
     */
    private final @Nullable String context;
    /**
     * The guest configuration to assign.
     * 
     */
    private final @Nullable GuestConfigurationNavigationResponse guestConfiguration;
    /**
     * Date and time when last compliance status was checked.
     * 
     */
    private final String lastComplianceStatusChecked;
    /**
     * Last reported guest configuration assignment report.
     * 
     */
    private final @Nullable AssignmentReportResponse latestAssignmentReport;
    /**
     * Id of the latest report for the guest configuration assignment.
     * 
     */
    private final String latestReportId;
    /**
     * parameter hash for the guest configuration assignment.
     * 
     */
    private final String parameterHash;
    /**
     * The provisioning state, which only appears in the response.
     * 
     */
    private final String provisioningState;
    /**
     * Type of the resource - VMSS / VM
     * 
     */
    private final String resourceType;
    /**
     * VM resource Id.
     * 
     */
    private final String targetResourceId;
    /**
     * The list of VM Compliance data for VMSS
     * 
     */
    private final @Nullable List<VMSSVMInfoResponse> vmssVMList;

    @CustomType.Constructor
    private GuestConfigurationAssignmentPropertiesResponse(
        @CustomType.Parameter("assignmentHash") String assignmentHash,
        @CustomType.Parameter("complianceStatus") String complianceStatus,
        @CustomType.Parameter("context") @Nullable String context,
        @CustomType.Parameter("guestConfiguration") @Nullable GuestConfigurationNavigationResponse guestConfiguration,
        @CustomType.Parameter("lastComplianceStatusChecked") String lastComplianceStatusChecked,
        @CustomType.Parameter("latestAssignmentReport") @Nullable AssignmentReportResponse latestAssignmentReport,
        @CustomType.Parameter("latestReportId") String latestReportId,
        @CustomType.Parameter("parameterHash") String parameterHash,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("targetResourceId") String targetResourceId,
        @CustomType.Parameter("vmssVMList") @Nullable List<VMSSVMInfoResponse> vmssVMList) {
        this.assignmentHash = assignmentHash;
        this.complianceStatus = complianceStatus;
        this.context = context;
        this.guestConfiguration = guestConfiguration;
        this.lastComplianceStatusChecked = lastComplianceStatusChecked;
        this.latestAssignmentReport = latestAssignmentReport;
        this.latestReportId = latestReportId;
        this.parameterHash = parameterHash;
        this.provisioningState = provisioningState;
        this.resourceType = resourceType;
        this.targetResourceId = targetResourceId;
        this.vmssVMList = vmssVMList;
    }

    /**
     * Combined hash of the configuration package and parameters.
     * 
    */
    public String assignmentHash() {
        return this.assignmentHash;
    }
    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
    */
    public String complianceStatus() {
        return this.complianceStatus;
    }
    /**
     * The source which initiated the guest configuration assignment. Ex: Azure Policy
     * 
    */
    public Optional<String> context() {
        return Optional.ofNullable(this.context);
    }
    /**
     * The guest configuration to assign.
     * 
    */
    public Optional<GuestConfigurationNavigationResponse> guestConfiguration() {
        return Optional.ofNullable(this.guestConfiguration);
    }
    /**
     * Date and time when last compliance status was checked.
     * 
    */
    public String lastComplianceStatusChecked() {
        return this.lastComplianceStatusChecked;
    }
    /**
     * Last reported guest configuration assignment report.
     * 
    */
    public Optional<AssignmentReportResponse> latestAssignmentReport() {
        return Optional.ofNullable(this.latestAssignmentReport);
    }
    /**
     * Id of the latest report for the guest configuration assignment.
     * 
    */
    public String latestReportId() {
        return this.latestReportId;
    }
    /**
     * parameter hash for the guest configuration assignment.
     * 
    */
    public String parameterHash() {
        return this.parameterHash;
    }
    /**
     * The provisioning state, which only appears in the response.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Type of the resource - VMSS / VM
     * 
    */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * VM resource Id.
     * 
    */
    public String targetResourceId() {
        return this.targetResourceId;
    }
    /**
     * The list of VM Compliance data for VMSS
     * 
    */
    public List<VMSSVMInfoResponse> vmssVMList() {
        return this.vmssVMList == null ? List.of() : this.vmssVMList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationAssignmentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentHash;
        private String complianceStatus;
        private @Nullable String context;
        private @Nullable GuestConfigurationNavigationResponse guestConfiguration;
        private String lastComplianceStatusChecked;
        private @Nullable AssignmentReportResponse latestAssignmentReport;
        private String latestReportId;
        private String parameterHash;
        private String provisioningState;
        private String resourceType;
        private String targetResourceId;
        private @Nullable List<VMSSVMInfoResponse> vmssVMList;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationAssignmentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentHash = defaults.assignmentHash;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.context = defaults.context;
    	      this.guestConfiguration = defaults.guestConfiguration;
    	      this.lastComplianceStatusChecked = defaults.lastComplianceStatusChecked;
    	      this.latestAssignmentReport = defaults.latestAssignmentReport;
    	      this.latestReportId = defaults.latestReportId;
    	      this.parameterHash = defaults.parameterHash;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceType = defaults.resourceType;
    	      this.targetResourceId = defaults.targetResourceId;
    	      this.vmssVMList = defaults.vmssVMList;
        }

        public Builder assignmentHash(String assignmentHash) {
            this.assignmentHash = Objects.requireNonNull(assignmentHash);
            return this;
        }
        public Builder complianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }
        public Builder context(@Nullable String context) {
            this.context = context;
            return this;
        }
        public Builder guestConfiguration(@Nullable GuestConfigurationNavigationResponse guestConfiguration) {
            this.guestConfiguration = guestConfiguration;
            return this;
        }
        public Builder lastComplianceStatusChecked(String lastComplianceStatusChecked) {
            this.lastComplianceStatusChecked = Objects.requireNonNull(lastComplianceStatusChecked);
            return this;
        }
        public Builder latestAssignmentReport(@Nullable AssignmentReportResponse latestAssignmentReport) {
            this.latestAssignmentReport = latestAssignmentReport;
            return this;
        }
        public Builder latestReportId(String latestReportId) {
            this.latestReportId = Objects.requireNonNull(latestReportId);
            return this;
        }
        public Builder parameterHash(String parameterHash) {
            this.parameterHash = Objects.requireNonNull(parameterHash);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = Objects.requireNonNull(targetResourceId);
            return this;
        }
        public Builder vmssVMList(@Nullable List<VMSSVMInfoResponse> vmssVMList) {
            this.vmssVMList = vmssVMList;
            return this;
        }
        public Builder vmssVMList(VMSSVMInfoResponse... vmssVMList) {
            return vmssVMList(List.of(vmssVMList));
        }        public GuestConfigurationAssignmentPropertiesResponse build() {
            return new GuestConfigurationAssignmentPropertiesResponse(assignmentHash, complianceStatus, context, guestConfiguration, lastComplianceStatusChecked, latestAssignmentReport, latestReportId, parameterHash, provisioningState, resourceType, targetResourceId, vmssVMList);
        }
    }
}
