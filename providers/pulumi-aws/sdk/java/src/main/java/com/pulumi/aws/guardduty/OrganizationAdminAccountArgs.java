// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OrganizationAdminAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationAdminAccountArgs Empty = new OrganizationAdminAccountArgs();

    /**
     * AWS account identifier to designate as a delegated administrator for GuardDuty.
     * 
     */
    @Import(name="adminAccountId", required=true)
    private Output<String> adminAccountId;

    public Output<String> adminAccountId() {
        return this.adminAccountId;
    }

    private OrganizationAdminAccountArgs() {}

    private OrganizationAdminAccountArgs(OrganizationAdminAccountArgs $) {
        this.adminAccountId = $.adminAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationAdminAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationAdminAccountArgs $;

        public Builder() {
            $ = new OrganizationAdminAccountArgs();
        }

        public Builder(OrganizationAdminAccountArgs defaults) {
            $ = new OrganizationAdminAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder adminAccountId(Output<String> adminAccountId) {
            $.adminAccountId = adminAccountId;
            return this;
        }

        public Builder adminAccountId(String adminAccountId) {
            return adminAccountId(Output.of(adminAccountId));
        }

        public OrganizationAdminAccountArgs build() {
            $.adminAccountId = Objects.requireNonNull($.adminAccountId, "expected parameter 'adminAccountId' to be non-null");
            return $;
        }
    }

}
