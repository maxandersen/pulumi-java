// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Ocvp.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Ocvp.inputs.GetExsiHostsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetExsiHostsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExsiHostsArgs Empty = new GetExsiHostsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Compute instance.
     * 
     */
    @Import(name="computeInstanceId")
    private @Nullable String computeInstanceId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Compute instance.
     * 
     */
    public Optional<String> computeInstanceId() {
        return Optional.ofNullable(this.computeInstanceId);
    }

    /**
     * A filter to return only resources that match the given display name exactly.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the given display name exactly.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetExsiHostsFilter> filters;

    public Optional<List<GetExsiHostsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
     * 
     */
    @Import(name="sddcId")
    private @Nullable String sddcId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
     * 
     */
    public Optional<String> sddcId() {
        return Optional.ofNullable(this.sddcId);
    }

    /**
     * The lifecycle state of the resource.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The lifecycle state of the resource.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetExsiHostsArgs() {}

    private GetExsiHostsArgs(GetExsiHostsArgs $) {
        this.computeInstanceId = $.computeInstanceId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.sddcId = $.sddcId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExsiHostsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExsiHostsArgs $;

        public Builder() {
            $ = new GetExsiHostsArgs();
        }

        public Builder(GetExsiHostsArgs defaults) {
            $ = new GetExsiHostsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeInstanceId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Compute instance.
         * 
         * @return builder
         * 
         */
        public Builder computeInstanceId(@Nullable String computeInstanceId) {
            $.computeInstanceId = computeInstanceId;
            return this;
        }

        /**
         * @param displayName A filter to return only resources that match the given display name exactly.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetExsiHostsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetExsiHostsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param sddcId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the SDDC.
         * 
         * @return builder
         * 
         */
        public Builder sddcId(@Nullable String sddcId) {
            $.sddcId = sddcId;
            return this;
        }

        /**
         * @param state The lifecycle state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetExsiHostsArgs build() {
            return $;
        }
    }

}
