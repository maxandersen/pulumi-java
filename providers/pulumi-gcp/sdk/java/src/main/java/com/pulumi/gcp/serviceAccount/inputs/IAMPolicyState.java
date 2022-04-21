// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.serviceAccount.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IAMPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final IAMPolicyState Empty = new IAMPolicyState();

    /**
     * (Computed) The etag of the service account IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @Import(name="policyData")
    private @Nullable Output<String> policyData;

    public Optional<Output<String>> policyData() {
        return Optional.ofNullable(this.policyData);
    }

    /**
     * The fully-qualified name of the service account to apply policy to.
     * 
     */
    @Import(name="serviceAccountId")
    private @Nullable Output<String> serviceAccountId;

    public Optional<Output<String>> serviceAccountId() {
        return Optional.ofNullable(this.serviceAccountId);
    }

    private IAMPolicyState() {}

    private IAMPolicyState(IAMPolicyState $) {
        this.etag = $.etag;
        this.policyData = $.policyData;
        this.serviceAccountId = $.serviceAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMPolicyState $;

        public Builder() {
            $ = new IAMPolicyState();
        }

        public Builder(IAMPolicyState defaults) {
            $ = new IAMPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder policyData(@Nullable Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public Builder serviceAccountId(@Nullable Output<String> serviceAccountId) {
            $.serviceAccountId = serviceAccountId;
            return this;
        }

        public Builder serviceAccountId(String serviceAccountId) {
            return serviceAccountId(Output.of(serviceAccountId));
        }

        public IAMPolicyState build() {
            return $;
        }
    }

}
