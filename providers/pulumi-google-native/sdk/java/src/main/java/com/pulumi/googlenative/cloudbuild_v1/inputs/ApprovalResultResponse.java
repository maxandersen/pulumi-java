// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ApprovalResult describes the decision and associated metadata of a manual approval of a build.
 * 
 */
public final class ApprovalResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApprovalResultResponse Empty = new ApprovalResultResponse();

    /**
     * The time when the approval decision was made.
     * 
     */
    @Import(name="approvalTime", required=true)
      private final String approvalTime;

    public String approvalTime() {
        return this.approvalTime;
    }

    /**
     * Email of the user that called the ApproveBuild API to approve or reject a build at the time that the API was called.
     * 
     */
    @Import(name="approverAccount", required=true)
      private final String approverAccount;

    public String approverAccount() {
        return this.approverAccount;
    }

    /**
     * Optional. An optional comment for this manual approval result.
     * 
     */
    @Import(name="comment", required=true)
      private final String comment;

    public String comment() {
        return this.comment;
    }

    /**
     * The decision of this manual approval.
     * 
     */
    @Import(name="decision", required=true)
      private final String decision;

    public String decision() {
        return this.decision;
    }

    /**
     * Optional. An optional URL tied to this manual approval result. This field is essentially the same as comment, except that it will be rendered by the UI differently. An example use case is a link to an external job that approved this Build.
     * 
     */
    @Import(name="url", required=true)
      private final String url;

    public String url() {
        return this.url;
    }

    public ApprovalResultResponse(
        String approvalTime,
        String approverAccount,
        String comment,
        String decision,
        String url) {
        this.approvalTime = Objects.requireNonNull(approvalTime, "expected parameter 'approvalTime' to be non-null");
        this.approverAccount = Objects.requireNonNull(approverAccount, "expected parameter 'approverAccount' to be non-null");
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.decision = Objects.requireNonNull(decision, "expected parameter 'decision' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private ApprovalResultResponse() {
        this.approvalTime = null;
        this.approverAccount = null;
        this.comment = null;
        this.decision = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApprovalResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvalTime;
        private String approverAccount;
        private String comment;
        private String decision;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(ApprovalResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalTime = defaults.approvalTime;
    	      this.approverAccount = defaults.approverAccount;
    	      this.comment = defaults.comment;
    	      this.decision = defaults.decision;
    	      this.url = defaults.url;
        }

        public Builder approvalTime(String approvalTime) {
            this.approvalTime = Objects.requireNonNull(approvalTime);
            return this;
        }
        public Builder approverAccount(String approverAccount) {
            this.approverAccount = Objects.requireNonNull(approverAccount);
            return this;
        }
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder decision(String decision) {
            this.decision = Objects.requireNonNull(decision);
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }        public ApprovalResultResponse build() {
            return new ApprovalResultResponse(approvalTime, approverAccount, comment, decision, url);
        }
    }
}
