// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * IP address information for a virtual network adapter reported by the fabric.
 * 
 */
public final class NicIPAddressSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NicIPAddressSettingsResponse Empty = new NicIPAddressSettingsResponse();

    /**
     * Gets the ip address allocation method.
     * 
     */
    @Import(name="allocationMethod", required=true)
    private String allocationMethod;

    public String allocationMethod() {
        return this.allocationMethod;
    }

    /**
     * Gets the ip address for the nic.
     * 
     */
    @Import(name="ipAddress", required=true)
    private String ipAddress;

    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Gets the mask.
     * 
     */
    @Import(name="subnetMask", required=true)
    private String subnetMask;

    public String subnetMask() {
        return this.subnetMask;
    }

    private NicIPAddressSettingsResponse() {}

    private NicIPAddressSettingsResponse(NicIPAddressSettingsResponse $) {
        this.allocationMethod = $.allocationMethod;
        this.ipAddress = $.ipAddress;
        this.subnetMask = $.subnetMask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NicIPAddressSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NicIPAddressSettingsResponse $;

        public Builder() {
            $ = new NicIPAddressSettingsResponse();
        }

        public Builder(NicIPAddressSettingsResponse defaults) {
            $ = new NicIPAddressSettingsResponse(Objects.requireNonNull(defaults));
        }

        public Builder allocationMethod(String allocationMethod) {
            $.allocationMethod = allocationMethod;
            return this;
        }

        public Builder ipAddress(String ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        public Builder subnetMask(String subnetMask) {
            $.subnetMask = subnetMask;
            return this;
        }

        public NicIPAddressSettingsResponse build() {
            $.allocationMethod = Objects.requireNonNull($.allocationMethod, "expected parameter 'allocationMethod' to be non-null");
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            $.subnetMask = Objects.requireNonNull($.subnetMask, "expected parameter 'subnetMask' to be non-null");
            return $;
        }
    }

}
