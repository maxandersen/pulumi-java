// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.GetMeshSpecEgressFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class GetMeshSpec extends com.pulumi.resources.InvokeArgs {

    public static final GetMeshSpec Empty = new GetMeshSpec();

    /**
     * The egress filter rules for the service mesh.
     * 
     */
    @Import(name="egressFilters", required=true)
    private List<GetMeshSpecEgressFilter> egressFilters;

    public List<GetMeshSpecEgressFilter> egressFilters() {
        return this.egressFilters;
    }

    private GetMeshSpec() {}

    private GetMeshSpec(GetMeshSpec $) {
        this.egressFilters = $.egressFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMeshSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMeshSpec $;

        public Builder() {
            $ = new GetMeshSpec();
        }

        public Builder(GetMeshSpec defaults) {
            $ = new GetMeshSpec(Objects.requireNonNull(defaults));
        }

        public Builder egressFilters(List<GetMeshSpecEgressFilter> egressFilters) {
            $.egressFilters = egressFilters;
            return this;
        }

        public Builder egressFilters(GetMeshSpecEgressFilter... egressFilters) {
            return egressFilters(List.of(egressFilters));
        }

        public GetMeshSpec build() {
            $.egressFilters = Objects.requireNonNull($.egressFilters, "expected parameter 'egressFilters' to be non-null");
            return $;
        }
    }

}
