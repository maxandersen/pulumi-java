// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.ErrorDetailResponse;
import com.pulumi.azurenative.recoveryservices.inputs.WorkloadInquiryDetailsResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about inquired protectable items under a given container.
 * 
 */
public final class InquiryInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final InquiryInfoResponse Empty = new InquiryInfoResponse();

    /**
     * Error Details if the Status is non-success.
     * 
     */
    @Import(name="errorDetail")
      private final @Nullable ErrorDetailResponse errorDetail;

    public Optional<ErrorDetailResponse> errorDetail() {
        return this.errorDetail == null ? Optional.empty() : Optional.ofNullable(this.errorDetail);
    }

    /**
     * Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
     */
    @Import(name="inquiryDetails")
      private final @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;

    public List<WorkloadInquiryDetailsResponse> inquiryDetails() {
        return this.inquiryDetails == null ? List.of() : this.inquiryDetails;
    }

    /**
     * Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
     */
    @Import(name="status")
      private final @Nullable String status;

    public Optional<String> status() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    public InquiryInfoResponse(
        @Nullable ErrorDetailResponse errorDetail,
        @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails,
        @Nullable String status) {
        this.errorDetail = errorDetail;
        this.inquiryDetails = inquiryDetails;
        this.status = status;
    }

    private InquiryInfoResponse() {
        this.errorDetail = null;
        this.inquiryDetails = List.of();
        this.status = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InquiryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ErrorDetailResponse errorDetail;
        private @Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(InquiryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorDetail = defaults.errorDetail;
    	      this.inquiryDetails = defaults.inquiryDetails;
    	      this.status = defaults.status;
        }

        public Builder errorDetail(@Nullable ErrorDetailResponse errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public Builder inquiryDetails(@Nullable List<WorkloadInquiryDetailsResponse> inquiryDetails) {
            this.inquiryDetails = inquiryDetails;
            return this;
        }
        public Builder inquiryDetails(WorkloadInquiryDetailsResponse... inquiryDetails) {
            return inquiryDetails(List.of(inquiryDetails));
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public InquiryInfoResponse build() {
            return new InquiryInfoResponse(errorDetail, inquiryDetails, status);
        }
    }
}
