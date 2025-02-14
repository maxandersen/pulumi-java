// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Core.inputs.GetIpv6sFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpv6sArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpv6sArgs Empty = new GetIpv6sArgs();

    @Import(name="filters")
    private @Nullable List<GetIpv6sFilter> filters;

    public Optional<List<GetIpv6sFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * An IP address. This could be either IPv4 or IPv6, depending on the resource. Example: `10.0.3.3`
     * 
     */
    @Import(name="ipAddress")
    private @Nullable String ipAddress;

    /**
     * @return An IP address. This could be either IPv4 or IPv6, depending on the resource. Example: `10.0.3.3`
     * 
     */
    public Optional<String> ipAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    /**
     * The OCID of the subnet.
     * 
     */
    @Import(name="subnetId")
    private @Nullable String subnetId;

    /**
     * @return The OCID of the subnet.
     * 
     */
    public Optional<String> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The OCID of the VNIC.
     * 
     */
    @Import(name="vnicId")
    private @Nullable String vnicId;

    /**
     * @return The OCID of the VNIC.
     * 
     */
    public Optional<String> vnicId() {
        return Optional.ofNullable(this.vnicId);
    }

    private GetIpv6sArgs() {}

    private GetIpv6sArgs(GetIpv6sArgs $) {
        this.filters = $.filters;
        this.ipAddress = $.ipAddress;
        this.subnetId = $.subnetId;
        this.vnicId = $.vnicId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpv6sArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpv6sArgs $;

        public Builder() {
            $ = new GetIpv6sArgs();
        }

        public Builder(GetIpv6sArgs defaults) {
            $ = new GetIpv6sArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetIpv6sFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetIpv6sFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param ipAddress An IP address. This could be either IPv4 or IPv6, depending on the resource. Example: `10.0.3.3`
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(@Nullable String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param subnetId The OCID of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable String subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param vnicId The OCID of the VNIC.
         * 
         * @return builder
         * 
         */
        public Builder vnicId(@Nullable String vnicId) {
            $.vnicId = vnicId;
            return this;
        }

        public GetIpv6sArgs build() {
            return $;
        }
    }

}
