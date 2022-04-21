// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessApprovalSettingsEnrolledServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessApprovalSettingsEnrolledServiceArgs Empty = new AccessApprovalSettingsEnrolledServiceArgs();

    /**
     * The product for which Access Approval will be enrolled. Allowed values are listed (case-sensitive):
     * all
     * appengine.googleapis.com
     * bigquery.googleapis.com
     * bigtable.googleapis.com
     * cloudkms.googleapis.com
     * compute.googleapis.com
     * dataflow.googleapis.com
     * iam.googleapis.com
     * pubsub.googleapis.com
     * storage.googleapis.com
     * 
     */
    @Import(name="cloudProduct", required=true)
    private Output<String> cloudProduct;

    public Output<String> cloudProduct() {
        return this.cloudProduct;
    }

    /**
     * The enrollment level of the service.
     * Default value is `BLOCK_ALL`.
     * Possible values are `BLOCK_ALL`.
     * 
     */
    @Import(name="enrollmentLevel")
    private @Nullable Output<String> enrollmentLevel;

    public Optional<Output<String>> enrollmentLevel() {
        return Optional.ofNullable(this.enrollmentLevel);
    }

    private AccessApprovalSettingsEnrolledServiceArgs() {}

    private AccessApprovalSettingsEnrolledServiceArgs(AccessApprovalSettingsEnrolledServiceArgs $) {
        this.cloudProduct = $.cloudProduct;
        this.enrollmentLevel = $.enrollmentLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessApprovalSettingsEnrolledServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessApprovalSettingsEnrolledServiceArgs $;

        public Builder() {
            $ = new AccessApprovalSettingsEnrolledServiceArgs();
        }

        public Builder(AccessApprovalSettingsEnrolledServiceArgs defaults) {
            $ = new AccessApprovalSettingsEnrolledServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudProduct(Output<String> cloudProduct) {
            $.cloudProduct = cloudProduct;
            return this;
        }

        public Builder cloudProduct(String cloudProduct) {
            return cloudProduct(Output.of(cloudProduct));
        }

        public Builder enrollmentLevel(@Nullable Output<String> enrollmentLevel) {
            $.enrollmentLevel = enrollmentLevel;
            return this;
        }

        public Builder enrollmentLevel(String enrollmentLevel) {
            return enrollmentLevel(Output.of(enrollmentLevel));
        }

        public AccessApprovalSettingsEnrolledServiceArgs build() {
            $.cloudProduct = Objects.requireNonNull($.cloudProduct, "expected parameter 'cloudProduct' to be non-null");
            return $;
        }
    }

}
