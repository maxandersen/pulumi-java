// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectivityGroupItemResponse {
    /**
     * @return Group connectivity type.
     * 
     */
    private final @Nullable String groupConnectivity;
    /**
     * @return Flag if global is supported.
     * 
     */
    private final @Nullable String isGlobal;
    /**
     * @return Network group Id.
     * 
     */
    private final @Nullable String networkGroupId;
    /**
     * @return Flag if need to use hub gateway.
     * 
     */
    private final @Nullable String useHubGateway;

    @CustomType.Constructor
    private ConnectivityGroupItemResponse(
        @CustomType.Parameter("groupConnectivity") @Nullable String groupConnectivity,
        @CustomType.Parameter("isGlobal") @Nullable String isGlobal,
        @CustomType.Parameter("networkGroupId") @Nullable String networkGroupId,
        @CustomType.Parameter("useHubGateway") @Nullable String useHubGateway) {
        this.groupConnectivity = groupConnectivity;
        this.isGlobal = isGlobal;
        this.networkGroupId = networkGroupId;
        this.useHubGateway = useHubGateway;
    }

    /**
     * @return Group connectivity type.
     * 
     */
    public Optional<String> groupConnectivity() {
        return Optional.ofNullable(this.groupConnectivity);
    }
    /**
     * @return Flag if global is supported.
     * 
     */
    public Optional<String> isGlobal() {
        return Optional.ofNullable(this.isGlobal);
    }
    /**
     * @return Network group Id.
     * 
     */
    public Optional<String> networkGroupId() {
        return Optional.ofNullable(this.networkGroupId);
    }
    /**
     * @return Flag if need to use hub gateway.
     * 
     */
    public Optional<String> useHubGateway() {
        return Optional.ofNullable(this.useHubGateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectivityGroupItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String groupConnectivity;
        private @Nullable String isGlobal;
        private @Nullable String networkGroupId;
        private @Nullable String useHubGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectivityGroupItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupConnectivity = defaults.groupConnectivity;
    	      this.isGlobal = defaults.isGlobal;
    	      this.networkGroupId = defaults.networkGroupId;
    	      this.useHubGateway = defaults.useHubGateway;
        }

        public Builder groupConnectivity(@Nullable String groupConnectivity) {
            this.groupConnectivity = groupConnectivity;
            return this;
        }
        public Builder isGlobal(@Nullable String isGlobal) {
            this.isGlobal = isGlobal;
            return this;
        }
        public Builder networkGroupId(@Nullable String networkGroupId) {
            this.networkGroupId = networkGroupId;
            return this;
        }
        public Builder useHubGateway(@Nullable String useHubGateway) {
            this.useHubGateway = useHubGateway;
            return this;
        }        public ConnectivityGroupItemResponse build() {
            return new ConnectivityGroupItemResponse(groupConnectivity, isGlobal, networkGroupId, useHubGateway);
        }
    }
}
