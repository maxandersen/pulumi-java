// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionMonitorSourceResponse {
    /**
     * @return The source port used by connection monitor.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The ID of the resource used as the source by connection monitor.
     * 
     */
    private final String resourceId;

    @CustomType.Constructor
    private ConnectionMonitorSourceResponse(
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("resourceId") String resourceId) {
        this.port = port;
        this.resourceId = resourceId;
    }

    /**
     * @return The source port used by connection monitor.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The ID of the resource used as the source by connection monitor.
     * 
     */
    public String resourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public ConnectionMonitorSourceResponse build() {
            return new ConnectionMonitorSourceResponse(port, resourceId);
        }
    }
}
