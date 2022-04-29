// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.WorkloadInquiryDetailsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about inquired protectable items under a given container.
 * 
 */
public final class InquiryInfoArgs extends ResourceArgs {

    public static final InquiryInfoArgs Empty = new InquiryInfoArgs();

    /**
     * Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
     */
    @Import(name="inquiryDetails")
    private @Nullable Output<List<WorkloadInquiryDetailsArgs>> inquiryDetails;

    /**
     * @return Inquiry Details which will have workload specific details.
     * For e.g. - For SQL and oracle this will contain different details.
     * 
     */
    public Optional<Output<List<WorkloadInquiryDetailsArgs>>> inquiryDetails() {
        return Optional.ofNullable(this.inquiryDetails);
    }

    /**
     * Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Inquiry Status for this container such as
     * InProgress | Failed | Succeeded
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private InquiryInfoArgs() {}

    private InquiryInfoArgs(InquiryInfoArgs $) {
        this.inquiryDetails = $.inquiryDetails;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InquiryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InquiryInfoArgs $;

        public Builder() {
            $ = new InquiryInfoArgs();
        }

        public Builder(InquiryInfoArgs defaults) {
            $ = new InquiryInfoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inquiryDetails Inquiry Details which will have workload specific details.
         * For e.g. - For SQL and oracle this will contain different details.
         * 
         * @return builder
         * 
         */
        public Builder inquiryDetails(@Nullable Output<List<WorkloadInquiryDetailsArgs>> inquiryDetails) {
            $.inquiryDetails = inquiryDetails;
            return this;
        }

        /**
         * @param inquiryDetails Inquiry Details which will have workload specific details.
         * For e.g. - For SQL and oracle this will contain different details.
         * 
         * @return builder
         * 
         */
        public Builder inquiryDetails(List<WorkloadInquiryDetailsArgs> inquiryDetails) {
            return inquiryDetails(Output.of(inquiryDetails));
        }

        /**
         * @param inquiryDetails Inquiry Details which will have workload specific details.
         * For e.g. - For SQL and oracle this will contain different details.
         * 
         * @return builder
         * 
         */
        public Builder inquiryDetails(WorkloadInquiryDetailsArgs... inquiryDetails) {
            return inquiryDetails(List.of(inquiryDetails));
        }

        /**
         * @param status Inquiry Status for this container such as
         * InProgress | Failed | Succeeded
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Inquiry Status for this container such as
         * InProgress | Failed | Succeeded
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public InquiryInfoArgs build() {
            return $;
        }
    }

}
