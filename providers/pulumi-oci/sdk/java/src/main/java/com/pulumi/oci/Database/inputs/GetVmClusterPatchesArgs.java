// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Database.inputs.GetVmClusterPatchesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVmClusterPatchesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterPatchesArgs Empty = new GetVmClusterPatchesArgs();

    @Import(name="filters")
    private @Nullable List<GetVmClusterPatchesFilter> filters;

    public Optional<List<GetVmClusterPatchesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="vmClusterId", required=true)
    private String vmClusterId;

    /**
     * @return The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String vmClusterId() {
        return this.vmClusterId;
    }

    private GetVmClusterPatchesArgs() {}

    private GetVmClusterPatchesArgs(GetVmClusterPatchesArgs $) {
        this.filters = $.filters;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterPatchesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterPatchesArgs $;

        public Builder() {
            $ = new GetVmClusterPatchesArgs();
        }

        public Builder(GetVmClusterPatchesArgs defaults) {
            $ = new GetVmClusterPatchesArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetVmClusterPatchesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetVmClusterPatchesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        public GetVmClusterPatchesArgs build() {
            $.vmClusterId = Objects.requireNonNull($.vmClusterId, "expected parameter 'vmClusterId' to be non-null");
            return $;
        }
    }

}
