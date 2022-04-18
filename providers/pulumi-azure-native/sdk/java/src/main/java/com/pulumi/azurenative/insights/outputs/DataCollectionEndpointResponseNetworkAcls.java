// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataCollectionEndpointResponseNetworkAcls {
    /**
     * The configuration to set whether network access from public internet to the endpoints are allowed.
     * 
     */
    private final @Nullable String publicNetworkAccess;

    @CustomType.Constructor
    private DataCollectionEndpointResponseNetworkAcls(@CustomType.Parameter("publicNetworkAccess") @Nullable String publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
    }

    /**
     * The configuration to set whether network access from public internet to the endpoints are allowed.
     * 
    */
    public Optional<String> publicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionEndpointResponseNetworkAcls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionEndpointResponseNetworkAcls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder publicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }        public DataCollectionEndpointResponseNetworkAcls build() {
            return new DataCollectionEndpointResponseNetworkAcls(publicNetworkAccess);
        }
    }
}
