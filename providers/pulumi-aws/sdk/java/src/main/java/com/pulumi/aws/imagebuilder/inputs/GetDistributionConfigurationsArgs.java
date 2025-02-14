// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.aws.imagebuilder.inputs.GetDistributionConfigurationsFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDistributionConfigurationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationsArgs Empty = new GetDistributionConfigurationsArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetDistributionConfigurationsFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetDistributionConfigurationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetDistributionConfigurationsArgs() {}

    private GetDistributionConfigurationsArgs(GetDistributionConfigurationsArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDistributionConfigurationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDistributionConfigurationsArgs $;

        public Builder() {
            $ = new GetDistributionConfigurationsArgs();
        }

        public Builder(GetDistributionConfigurationsArgs defaults) {
            $ = new GetDistributionConfigurationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetDistributionConfigurationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDistributionConfigurationsFilter... filters) {
            return filters(List.of(filters));
        }

        public GetDistributionConfigurationsArgs build() {
            return $;
        }
    }

}
