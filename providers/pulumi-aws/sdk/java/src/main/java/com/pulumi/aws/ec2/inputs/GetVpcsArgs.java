// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcsFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcsArgs Empty = new GetVpcsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetVpcsFilter> filters;

    public Optional<List<GetVpcsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired vpcs.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetVpcsArgs() {}

    private GetVpcsArgs(GetVpcsArgs $) {
        this.filters = $.filters;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcsArgs $;

        public Builder() {
            $ = new GetVpcsArgs();
        }

        public Builder(GetVpcsArgs defaults) {
            $ = new GetVpcsArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVpcsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVpcsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetVpcsArgs build() {
            return $;
        }
    }

}
