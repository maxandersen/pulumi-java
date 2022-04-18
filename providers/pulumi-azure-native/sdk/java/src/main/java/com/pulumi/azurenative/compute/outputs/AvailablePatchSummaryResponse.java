// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.ApiErrorResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AvailablePatchSummaryResponse {
    /**
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     * 
     */
    private final String assessmentActivityId;
    /**
     * The number of critical or security patches that have been detected as available and not yet installed.
     * 
     */
    private final Integer criticalAndSecurityPatchCount;
    /**
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     * 
     */
    private final ApiErrorResponse error;
    /**
     * The UTC timestamp when the operation began.
     * 
     */
    private final String lastModifiedTime;
    /**
     * The number of all available patches excluding critical and security.
     * 
     */
    private final Integer otherPatchCount;
    /**
     * The overall reboot status of the VM. It will be true when partially installed patches require a reboot to complete installation but the reboot has not yet occurred.
     * 
     */
    private final Boolean rebootPending;
    /**
     * The UTC timestamp when the operation began.
     * 
     */
    private final String startTime;
    /**
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     * 
     */
    private final String status;

    @CustomType.Constructor
    private AvailablePatchSummaryResponse(
        @CustomType.Parameter("assessmentActivityId") String assessmentActivityId,
        @CustomType.Parameter("criticalAndSecurityPatchCount") Integer criticalAndSecurityPatchCount,
        @CustomType.Parameter("error") ApiErrorResponse error,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("otherPatchCount") Integer otherPatchCount,
        @CustomType.Parameter("rebootPending") Boolean rebootPending,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status) {
        this.assessmentActivityId = assessmentActivityId;
        this.criticalAndSecurityPatchCount = criticalAndSecurityPatchCount;
        this.error = error;
        this.lastModifiedTime = lastModifiedTime;
        this.otherPatchCount = otherPatchCount;
        this.rebootPending = rebootPending;
        this.startTime = startTime;
        this.status = status;
    }

    /**
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     * 
    */
    public String assessmentActivityId() {
        return this.assessmentActivityId;
    }
    /**
     * The number of critical or security patches that have been detected as available and not yet installed.
     * 
    */
    public Integer criticalAndSecurityPatchCount() {
        return this.criticalAndSecurityPatchCount;
    }
    /**
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     * 
    */
    public ApiErrorResponse error() {
        return this.error;
    }
    /**
     * The UTC timestamp when the operation began.
     * 
    */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * The number of all available patches excluding critical and security.
     * 
    */
    public Integer otherPatchCount() {
        return this.otherPatchCount;
    }
    /**
     * The overall reboot status of the VM. It will be true when partially installed patches require a reboot to complete installation but the reboot has not yet occurred.
     * 
    */
    public Boolean rebootPending() {
        return this.rebootPending;
    }
    /**
     * The UTC timestamp when the operation began.
     * 
    */
    public String startTime() {
        return this.startTime;
    }
    /**
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     * 
    */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailablePatchSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentActivityId;
        private Integer criticalAndSecurityPatchCount;
        private ApiErrorResponse error;
        private String lastModifiedTime;
        private Integer otherPatchCount;
        private Boolean rebootPending;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailablePatchSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentActivityId = defaults.assessmentActivityId;
    	      this.criticalAndSecurityPatchCount = defaults.criticalAndSecurityPatchCount;
    	      this.error = defaults.error;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.otherPatchCount = defaults.otherPatchCount;
    	      this.rebootPending = defaults.rebootPending;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder assessmentActivityId(String assessmentActivityId) {
            this.assessmentActivityId = Objects.requireNonNull(assessmentActivityId);
            return this;
        }
        public Builder criticalAndSecurityPatchCount(Integer criticalAndSecurityPatchCount) {
            this.criticalAndSecurityPatchCount = Objects.requireNonNull(criticalAndSecurityPatchCount);
            return this;
        }
        public Builder error(ApiErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder otherPatchCount(Integer otherPatchCount) {
            this.otherPatchCount = Objects.requireNonNull(otherPatchCount);
            return this;
        }
        public Builder rebootPending(Boolean rebootPending) {
            this.rebootPending = Objects.requireNonNull(rebootPending);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public AvailablePatchSummaryResponse build() {
            return new AvailablePatchSummaryResponse(assessmentActivityId, criticalAndSecurityPatchCount, error, lastModifiedTime, otherPatchCount, rebootPending, startTime, status);
        }
    }
}
