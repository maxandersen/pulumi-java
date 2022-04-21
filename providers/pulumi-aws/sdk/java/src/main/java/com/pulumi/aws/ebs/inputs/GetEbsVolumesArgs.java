// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.aws.ebs.inputs.GetEbsVolumesFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEbsVolumesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEbsVolumesArgs Empty = new GetEbsVolumesArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetEbsVolumesFilter> filters;

    public Optional<List<GetEbsVolumesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired volumes.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetEbsVolumesArgs() {}

    private GetEbsVolumesArgs(GetEbsVolumesArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEbsVolumesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEbsVolumesArgs $;

        public Builder() {
            $ = new GetEbsVolumesArgs();
        }

        public Builder(GetEbsVolumesArgs defaults) {
            $ = new GetEbsVolumesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetEbsVolumesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetEbsVolumesFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetEbsVolumesArgs build() {
            return $;
        }
    }

}
