// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetOrganizationPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyArgs Empty = new GetOrganizationPolicyArgs();

    @Import(name="organizationId", required=true)
    private String organizationId;

    public String organizationId() {
        return this.organizationId;
    }

    @Import(name="policyId", required=true)
    private String policyId;

    public String policyId() {
        return this.policyId;
    }

    private GetOrganizationPolicyArgs() {}

    private GetOrganizationPolicyArgs(GetOrganizationPolicyArgs $) {
        this.organizationId = $.organizationId;
        this.policyId = $.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationPolicyArgs $;

        public Builder() {
            $ = new GetOrganizationPolicyArgs();
        }

        public Builder(GetOrganizationPolicyArgs defaults) {
            $ = new GetOrganizationPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder organizationId(String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        public Builder policyId(String policyId) {
            $.policyId = policyId;
            return this;
        }

        public GetOrganizationPolicyArgs build() {
            $.organizationId = Objects.requireNonNull($.organizationId, "expected parameter 'organizationId' to be non-null");
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            return $;
        }
    }

}
