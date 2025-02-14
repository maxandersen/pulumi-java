// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.MeteringComputation.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.MeteringComputation.inputs.GetQueriesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetQueriesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetQueriesArgs Empty = new GetQueriesArgs();

    /**
     * The compartment ID in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The compartment ID in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetQueriesFilter> filters;

    public Optional<List<GetQueriesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    private GetQueriesArgs() {}

    private GetQueriesArgs(GetQueriesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetQueriesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetQueriesArgs $;

        public Builder() {
            $ = new GetQueriesArgs();
        }

        public Builder(GetQueriesArgs defaults) {
            $ = new GetQueriesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The compartment ID in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetQueriesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetQueriesFilter... filters) {
            return filters(List.of(filters));
        }

        public GetQueriesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
