// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.UsageProxy.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionProductArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionProductArgs Empty = new GetSubscriptionProductArgs();

    /**
     * The field to specify the type of product.
     * 
     */
    @Import(name="producttype")
    private @Nullable String producttype;

    /**
     * @return The field to specify the type of product.
     * 
     */
    public Optional<String> producttype() {
        return Optional.ofNullable(this.producttype);
    }

    /**
     * The subscription ID for which rewards information is requested for.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private String subscriptionId;

    /**
     * @return The subscription ID for which rewards information is requested for.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The OCID of the tenancy.
     * 
     */
    @Import(name="tenancyId", required=true)
    private String tenancyId;

    /**
     * @return The OCID of the tenancy.
     * 
     */
    public String tenancyId() {
        return this.tenancyId;
    }

    /**
     * The SPM Identifier for the usage period.
     * 
     */
    @Import(name="usagePeriodKey", required=true)
    private String usagePeriodKey;

    /**
     * @return The SPM Identifier for the usage period.
     * 
     */
    public String usagePeriodKey() {
        return this.usagePeriodKey;
    }

    private GetSubscriptionProductArgs() {}

    private GetSubscriptionProductArgs(GetSubscriptionProductArgs $) {
        this.producttype = $.producttype;
        this.subscriptionId = $.subscriptionId;
        this.tenancyId = $.tenancyId;
        this.usagePeriodKey = $.usagePeriodKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionProductArgs $;

        public Builder() {
            $ = new GetSubscriptionProductArgs();
        }

        public Builder(GetSubscriptionProductArgs defaults) {
            $ = new GetSubscriptionProductArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param producttype The field to specify the type of product.
         * 
         * @return builder
         * 
         */
        public Builder producttype(@Nullable String producttype) {
            $.producttype = producttype;
            return this;
        }

        /**
         * @param subscriptionId The subscription ID for which rewards information is requested for.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param tenancyId The OCID of the tenancy.
         * 
         * @return builder
         * 
         */
        public Builder tenancyId(String tenancyId) {
            $.tenancyId = tenancyId;
            return this;
        }

        /**
         * @param usagePeriodKey The SPM Identifier for the usage period.
         * 
         * @return builder
         * 
         */
        public Builder usagePeriodKey(String usagePeriodKey) {
            $.usagePeriodKey = usagePeriodKey;
            return this;
        }

        public GetSubscriptionProductArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            $.tenancyId = Objects.requireNonNull($.tenancyId, "expected parameter 'tenancyId' to be non-null");
            $.usagePeriodKey = Objects.requireNonNull($.usagePeriodKey, "expected parameter 'usagePeriodKey' to be non-null");
            return $;
        }
    }

}
