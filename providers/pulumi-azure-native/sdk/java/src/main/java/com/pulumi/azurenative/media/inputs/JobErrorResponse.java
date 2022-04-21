// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.inputs.JobErrorDetailResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Details of JobOutput errors.
 * 
 */
public final class JobErrorResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobErrorResponse Empty = new JobErrorResponse();

    /**
     * Helps with categorization of errors.
     * 
     */
    @Import(name="category", required=true)
    private String category;

    public String category() {
        return this.category;
    }

    /**
     * Error code describing the error.
     * 
     */
    @Import(name="code", required=true)
    private String code;

    public String code() {
        return this.code;
    }

    /**
     * An array of details about specific errors that led to this reported error.
     * 
     */
    @Import(name="details", required=true)
    private List<JobErrorDetailResponse> details;

    public List<JobErrorDetailResponse> details() {
        return this.details;
    }

    /**
     * A human-readable language-dependent representation of the error.
     * 
     */
    @Import(name="message", required=true)
    private String message;

    public String message() {
        return this.message;
    }

    /**
     * Indicates that it may be possible to retry the Job. If retry is unsuccessful, please contact Azure support via Azure Portal.
     * 
     */
    @Import(name="retry", required=true)
    private String retry;

    public String retry() {
        return this.retry;
    }

    private JobErrorResponse() {}

    private JobErrorResponse(JobErrorResponse $) {
        this.category = $.category;
        this.code = $.code;
        this.details = $.details;
        this.message = $.message;
        this.retry = $.retry;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobErrorResponse $;

        public Builder() {
            $ = new JobErrorResponse();
        }

        public Builder(JobErrorResponse defaults) {
            $ = new JobErrorResponse(Objects.requireNonNull(defaults));
        }

        public Builder category(String category) {
            $.category = category;
            return this;
        }

        public Builder code(String code) {
            $.code = code;
            return this;
        }

        public Builder details(List<JobErrorDetailResponse> details) {
            $.details = details;
            return this;
        }

        public Builder details(JobErrorDetailResponse... details) {
            return details(List.of(details));
        }

        public Builder message(String message) {
            $.message = message;
            return this;
        }

        public Builder retry(String retry) {
            $.retry = retry;
            return this;
        }

        public JobErrorResponse build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.code = Objects.requireNonNull($.code, "expected parameter 'code' to be non-null");
            $.details = Objects.requireNonNull($.details, "expected parameter 'details' to be non-null");
            $.message = Objects.requireNonNull($.message, "expected parameter 'message' to be non-null");
            $.retry = Objects.requireNonNull($.retry, "expected parameter 'retry' to be non-null");
            return $;
        }
    }

}
