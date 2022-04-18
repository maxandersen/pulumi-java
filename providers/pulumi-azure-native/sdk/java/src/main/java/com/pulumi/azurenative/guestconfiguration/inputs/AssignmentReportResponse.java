// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.azurenative.guestconfiguration.inputs.AssignmentInfoResponse;
import com.pulumi.azurenative.guestconfiguration.inputs.AssignmentReportResourceResponse;
import com.pulumi.azurenative.guestconfiguration.inputs.VMInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AssignmentReportResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignmentReportResponse Empty = new AssignmentReportResponse();

    /**
     * Configuration details of the guest configuration assignment.
     * 
     */
    @Import(name="assignment")
      private final @Nullable AssignmentInfoResponse assignment;

    public Optional<AssignmentInfoResponse> assignment() {
        return this.assignment == null ? Optional.empty() : Optional.ofNullable(this.assignment);
    }

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @Import(name="complianceStatus", required=true)
      private final String complianceStatus;

    public String complianceStatus() {
        return this.complianceStatus;
    }

    /**
     * End date and time of the guest configuration assignment compliance status check.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * ARM resource id of the report for the guest configuration assignment.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Type of report, Consistency or Initial
     * 
     */
    @Import(name="operationType", required=true)
      private final String operationType;

    public String operationType() {
        return this.operationType;
    }

    /**
     * GUID that identifies the guest configuration assignment report under a subscription, resource group.
     * 
     */
    @Import(name="reportId", required=true)
      private final String reportId;

    public String reportId() {
        return this.reportId;
    }

    /**
     * The list of resources for which guest configuration assignment compliance is checked.
     * 
     */
    @Import(name="resources")
      private final @Nullable List<AssignmentReportResourceResponse> resources;

    public List<AssignmentReportResourceResponse> resources() {
        return this.resources == null ? List.of() : this.resources;
    }

    /**
     * Start date and time of the guest configuration assignment compliance status check.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Information about the VM.
     * 
     */
    @Import(name="vm")
      private final @Nullable VMInfoResponse vm;

    public Optional<VMInfoResponse> vm() {
        return this.vm == null ? Optional.empty() : Optional.ofNullable(this.vm);
    }

    public AssignmentReportResponse(
        @Nullable AssignmentInfoResponse assignment,
        String complianceStatus,
        String endTime,
        String id,
        String operationType,
        String reportId,
        @Nullable List<AssignmentReportResourceResponse> resources,
        String startTime,
        @Nullable VMInfoResponse vm) {
        this.assignment = assignment;
        this.complianceStatus = Objects.requireNonNull(complianceStatus, "expected parameter 'complianceStatus' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.operationType = Objects.requireNonNull(operationType, "expected parameter 'operationType' to be non-null");
        this.reportId = Objects.requireNonNull(reportId, "expected parameter 'reportId' to be non-null");
        this.resources = resources;
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.vm = vm;
    }

    private AssignmentReportResponse() {
        this.assignment = null;
        this.complianceStatus = null;
        this.endTime = null;
        this.id = null;
        this.operationType = null;
        this.reportId = null;
        this.resources = List.of();
        this.startTime = null;
        this.vm = null;
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
