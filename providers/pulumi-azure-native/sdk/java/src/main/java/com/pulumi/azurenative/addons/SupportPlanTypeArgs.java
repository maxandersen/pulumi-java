// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.addons;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SupportPlanTypeArgs extends com.pulumi.resources.ResourceArgs {

    public static final SupportPlanTypeArgs Empty = new SupportPlanTypeArgs();

    /**
     * The Canonical support plan type.
     * 
     */
    @Import(name="planTypeName")
    private @Nullable Output<String> planTypeName;

    /**
     * @return The Canonical support plan type.
     * 
     */
    public Optional<Output<String>> planTypeName() {
        return Optional.ofNullable(this.planTypeName);
    }

    /**
     * The support plan type. For now the only valid type is &#34;canonical&#34;.
     * 
     */
    @Import(name="providerName", required=true)
    private Output<String> providerName;

    /**
     * @return The support plan type. For now the only valid type is &#34;canonical&#34;.
     * 
     */
    public Output<String> providerName() {
        return this.providerName;
    }

    private SupportPlanTypeArgs() {}

    private SupportPlanTypeArgs(SupportPlanTypeArgs $) {
        this.planTypeName = $.planTypeName;
        this.providerName = $.providerName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SupportPlanTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SupportPlanTypeArgs $;

        public Builder() {
            $ = new SupportPlanTypeArgs();
        }

        public Builder(SupportPlanTypeArgs defaults) {
            $ = new SupportPlanTypeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param planTypeName The Canonical support plan type.
         * 
         * @return builder
         * 
         */
        public Builder planTypeName(@Nullable Output<String> planTypeName) {
            $.planTypeName = planTypeName;
            return this;
        }

        /**
         * @param planTypeName The Canonical support plan type.
         * 
         * @return builder
         * 
         */
        public Builder planTypeName(String planTypeName) {
            return planTypeName(Output.of(planTypeName));
        }

        /**
         * @param providerName The support plan type. For now the only valid type is &#34;canonical&#34;.
         * 
         * @return builder
         * 
         */
        public Builder providerName(Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName The support plan type. For now the only valid type is &#34;canonical&#34;.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        public SupportPlanTypeArgs build() {
            $.providerName = Objects.requireNonNull($.providerName, "expected parameter 'providerName' to be non-null");
            return $;
        }
    }

}
