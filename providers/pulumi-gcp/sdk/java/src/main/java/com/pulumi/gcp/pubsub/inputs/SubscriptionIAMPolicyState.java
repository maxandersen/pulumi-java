// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubscriptionIAMPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionIAMPolicyState Empty = new SubscriptionIAMPolicyState();

    /**
     * (Computed) The etag of the subscription&#39;s IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
      private final @Nullable Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData == null ? Codegen.empty() : this.policyData;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The subscription name or id to bind to attach IAM policy to.
     * 
     */
    @Import(name="subscription")
      private final @Nullable Output<String> subscription;

    public Output<String> subscription() {
        return this.subscription == null ? Codegen.empty() : this.subscription;
    }

    public SubscriptionIAMPolicyState(
        @Nullable Output<String> etag,
        @Nullable Output<String> policyData,
        @Nullable Output<String> project,
        @Nullable Output<String> subscription) {
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
        this.subscription = subscription;
    }

    private SubscriptionIAMPolicyState() {
        this.etag = Codegen.empty();
        this.policyData = Codegen.empty();
        this.project = Codegen.empty();
        this.subscription = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionIAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> etag;
        private @Nullable Output<String> policyData;
        private @Nullable Output<String> project;
        private @Nullable Output<String> subscription;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionIAMPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.subscription = defaults.subscription;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder policyData(@Nullable Output<String> policyData) {
            this.policyData = policyData;
            return this;
        }
        public Builder policyData(@Nullable String policyData) {
            this.policyData = Codegen.ofNullable(policyData);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder subscription(@Nullable Output<String> subscription) {
            this.subscription = subscription;
            return this;
        }
        public Builder subscription(@Nullable String subscription) {
            this.subscription = Codegen.ofNullable(subscription);
            return this;
        }        public SubscriptionIAMPolicyState build() {
            return new SubscriptionIAMPolicyState(etag, policyData, project, subscription);
        }
    }
}
