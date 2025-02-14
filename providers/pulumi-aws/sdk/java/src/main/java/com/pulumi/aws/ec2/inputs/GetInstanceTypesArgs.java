// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetInstanceTypesFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceTypesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTypesArgs Empty = new GetInstanceTypesArgs();

    /**
     * One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetInstanceTypesFilter> filters;

    /**
     * @return One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
     * 
     */
    public Optional<List<GetInstanceTypesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetInstanceTypesArgs() {}

    private GetInstanceTypesArgs(GetInstanceTypesArgs $) {
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceTypesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceTypesArgs $;

        public Builder() {
            $ = new GetInstanceTypesArgs();
        }

        public Builder(GetInstanceTypesArgs defaults) {
            $ = new GetInstanceTypesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetInstanceTypesFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters One or more configuration blocks containing name-values filters. See the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstanceTypes.html) for supported filters. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetInstanceTypesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetInstanceTypesArgs build() {
            return $;
        }
    }

}
