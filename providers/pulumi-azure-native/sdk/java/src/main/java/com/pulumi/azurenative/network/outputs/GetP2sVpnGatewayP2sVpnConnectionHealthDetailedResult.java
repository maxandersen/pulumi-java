// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult {
    /**
     * @return Returned sas url of the blob to which the p2s vpn connection detailed health will be written.
     * 
     */
    private final @Nullable String sasUrl;

    @CustomType.Constructor
    private GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult(@CustomType.Parameter("sasUrl") @Nullable String sasUrl) {
        this.sasUrl = sasUrl;
    }

    /**
     * @return Returned sas url of the blob to which the p2s vpn connection detailed health will be written.
     * 
     */
    public Optional<String> sasUrl() {
        return Optional.ofNullable(this.sasUrl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sasUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUrl = defaults.sasUrl;
        }

        public Builder sasUrl(@Nullable String sasUrl) {
            this.sasUrl = sasUrl;
            return this;
        }        public GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult build() {
            return new GetP2sVpnGatewayP2sVpnConnectionHealthDetailedResult(sasUrl);
        }
    }
}
