// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.outputs;

import com.pulumi.azurenative.guestconfiguration.outputs.AssignmentInfoResponse;
import com.pulumi.azurenative.guestconfiguration.outputs.AssignmentReportResourceResponse;
import com.pulumi.azurenative.guestconfiguration.outputs.VMInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AssignmentReportResponse {
    /**
     * @return Configuration details of the guest configuration assignment.
     * 
     */
    private final @Nullable AssignmentInfoResponse assignment;
    /**
     * @return A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    private final String complianceStatus;
    /**
     * @return End date and time of the guest configuration assignment compliance status check.
     * 
     */
    private final String endTime;
    /**
     * @return ARM resource id of the report for the guest configuration assignment.
     * 
     */
    private final String id;
    /**
     * @return Type of report, Consistency or Initial
     * 
     */
    private final String operationType;
    /**
     * @return GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
     */
    private final String reportId;
    /**
     * @return The list of resources for which guest configuration assignment compliance is checked.
     * 
     */
    private final @Nullable List<AssignmentReportResourceResponse> resources;
    /**
     * @return Start date and time of the guest configuration assignment compliance status check.
     * 
     */
    private final String startTime;
    /**
     * @return Information about the VM.
     * 
     */
    private final @Nullable VMInfoResponse vm;

    @CustomType.Constructor
    private AssignmentReportResponse(
        @CustomType.Parameter("assignment") @Nullable AssignmentInfoResponse assignment,
        @CustomType.Parameter("complianceStatus") String complianceStatus,
        @CustomType.Parameter("endTime") String endTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("operationType") String operationType,
        @CustomType.Parameter("reportId") String reportId,
        @CustomType.Parameter("resources") @Nullable List<AssignmentReportResourceResponse> resources,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("vm") @Nullable VMInfoResponse vm) {
        this.assignment = assignment;
        this.complianceStatus = complianceStatus;
        this.endTime = endTime;
        this.id = id;
        this.operationType = operationType;
        this.reportId = reportId;
        this.resources = resources;
        this.startTime = startTime;
        this.vm = vm;
    }

    /**
     * @return Configuration details of the guest configuration assignment.
     * 
     */
    public Optional<AssignmentInfoResponse> assignment() {
        return Optional.ofNullable(this.assignment);
    }
    /**
     * @return A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    public String complianceStatus() {
        return this.complianceStatus;
    }
    /**
     * @return End date and time of the guest configuration assignment compliance status check.
     * 
     */
    public String endTime() {
        return this.endTime;
    }
    /**
     * @return ARM resource id of the report for the guest configuration assignment.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Type of report, Consistency or Initial
     * 
     */
    public String operationType() {
        return this.operationType;
    }
    /**
     * @return GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
     */
    public String reportId() {
        return this.reportId;
    }
    /**
     * @return The list of resources for which guest configuration assignment compliance is checked.
     * 
     */
    public List<AssignmentReportResourceResponse> resources() {
        return this.resources == null ? List.of() : this.resources;
    }
    /**
     * @return Start date and time of the guest configuration assignment compliance status check.
     * 
     */
    public String startTime() {
        return this.startTime;
    }
    /**
     * @return Information about the VM.
     * 
     */
    public Optional<VMInfoResponse> vm() {
        return Optional.ofNullable(this.vm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentReportResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AssignmentInfoResponse assignment;
        private String complianceStatus;
        private String endTime;
        private String id;
        private String operationType;
        private String reportId;
        private @Nullable List<AssignmentReportResourceResponse> resources;
        private String startTime;
        private @Nullable VMInfoResponse vm;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentReportResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignment = defaults.assignment;
    	      this.complianceStatus = defaults.complianceStatus;
    	      this.endTime = defaults.endTime;
    	      this.id = defaults.id;
    	      this.operationType = defaults.operationType;
    	      this.reportId = defaults.reportId;
    	      this.resources = defaults.resources;
    	      this.startTime = defaults.startTime;
    	      this.vm = defaults.vm;
        }

        public Builder assignment(@Nullable AssignmentInfoResponse assignment) {
            this.assignment = assignment;
            return this;
        }
        public Builder complianceStatus(String complianceStatus) {
            this.complianceStatus = Objects.requireNonNull(complianceStatus);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder operationType(String operationType) {
            this.operationType = Objects.requireNonNull(operationType);
            return this;
        }
        public Builder reportId(String reportId) {
            this.reportId = Objects.requireNonNull(reportId);
            return this;
        }
        public Builder resources(@Nullable List<AssignmentReportResourceResponse> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(AssignmentReportResourceResponse... resources) {
            return resources(List.of(resources));
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder vm(@Nullable VMInfoResponse vm) {
            this.vm = vm;
            return this;
        }        public AssignmentReportResponse build() {
            return new AssignmentReportResponse(assignment, complianceStatus, endTime, id, operationType, reportId, resources, startTime, vm);
        }
    }
}
