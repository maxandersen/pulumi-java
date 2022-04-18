// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.ConnectionMonitorEndpointFilterItemResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorEndpointFilterResponse {
    /**
     * List of items in the filter.
     * 
     */
    private final @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items;
    /**
     * The behavior of the endpoint filter. Currently only 'Include' is supported.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ConnectionMonitorEndpointFilterResponse(
        @CustomType.Parameter("items") @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items,
        @CustomType.Parameter("type") @Nullable String type) {
        this.items = items;
        this.type = type;
    }

    /**
     * List of items in the filter.
     * 
    */
    public List<ConnectionMonitorEndpointFilterItemResponse> items() {
        return this.items == null ? List.of() : this.items;
    }
    /**
     * The behavior of the endpoint filter. Currently only 'Include' is supported.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorEndpointFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorEndpointFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.type = defaults.type;
        }

        public Builder items(@Nullable List<ConnectionMonitorEndpointFilterItemResponse> items) {
            this.items = items;
            return this;
        }
        public Builder items(ConnectionMonitorEndpointFilterItemResponse... items) {
            return items(List.of(items));
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public ConnectionMonitorEndpointFilterResponse build() {
            return new ConnectionMonitorEndpointFilterResponse(items, type);
        }
    }
}
