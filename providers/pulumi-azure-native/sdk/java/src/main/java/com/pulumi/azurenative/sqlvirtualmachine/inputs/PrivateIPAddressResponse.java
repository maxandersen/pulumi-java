// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A private IP address bound to the availability group listener.
 * 
 */
public final class PrivateIPAddressResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrivateIPAddressResponse Empty = new PrivateIPAddressResponse();

    /**
     * Private IP address bound to the availability group listener.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable String ipAddress;

    public Optional<String> ipAddress() {
        return this.ipAddress == null ? Optional.empty() : Optional.ofNullable(this.ipAddress);
    }

    /**
     * Subnet used to include private IP.
     * 
     */
    @Import(name="subnetResourceId")
      private final @Nullable String subnetResourceId;

    public Optional<String> subnetResourceId() {
        return this.subnetResourceId == null ? Optional.empty() : Optional.ofNullable(this.subnetResourceId);
    }

    public PrivateIPAddressResponse(
        @Nullable String ipAddress,
        @Nullable String subnetResourceId) {
        this.ipAddress = ipAddress;
        this.subnetResourceId = subnetResourceId;
    }

    private PrivateIPAddressResponse() {
        this.ipAddress = null;
        this.subnetResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateIPAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ipAddress;
        private @Nullable String subnetResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateIPAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetResourceId = defaults.subnetResourceId;
        }

        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder subnetResourceId(@Nullable String subnetResourceId) {
            this.subnetResourceId = subnetResourceId;
            return this;
        }        public PrivateIPAddressResponse build() {
            return new PrivateIPAddressResponse(ipAddress, subnetResourceId);
        }
    }
}
