// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.DynamicGroupQueryResponse;
import com.pulumi.googlenative.cloudidentity_v1beta1.inputs.DynamicGroupStatusResponse;
import java.util.List;
import java.util.Objects;


/**
 * Dynamic group metadata like queries and status.
 * 
 */
public final class DynamicGroupMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final DynamicGroupMetadataResponse Empty = new DynamicGroupMetadataResponse();

    /**
     * Memberships will be the union of all queries. Only one entry with USER resource is currently supported. Customers can create up to 100 dynamic groups.
     * 
     */
    @Import(name="queries", required=true)
    private List<DynamicGroupQueryResponse> queries;

    public List<DynamicGroupQueryResponse> queries() {
        return this.queries;
    }

    /**
     * Status of the dynamic group.
     * 
     */
    @Import(name="status", required=true)
    private DynamicGroupStatusResponse status;

    public DynamicGroupStatusResponse status() {
        return this.status;
    }

    private DynamicGroupMetadataResponse() {}

    private DynamicGroupMetadataResponse(DynamicGroupMetadataResponse $) {
        this.queries = $.queries;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicGroupMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicGroupMetadataResponse $;

        public Builder() {
            $ = new DynamicGroupMetadataResponse();
        }

        public Builder(DynamicGroupMetadataResponse defaults) {
            $ = new DynamicGroupMetadataResponse(Objects.requireNonNull(defaults));
        }

        public Builder queries(List<DynamicGroupQueryResponse> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(DynamicGroupQueryResponse... queries) {
            return queries(List.of(queries));
        }

        public Builder status(DynamicGroupStatusResponse status) {
            $.status = status;
            return this;
        }

        public DynamicGroupMetadataResponse build() {
            $.queries = Objects.requireNonNull($.queries, "expected parameter 'queries' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
