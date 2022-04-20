// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VpnConnectionVgwTelemetry {
    /**
     * The number of accepted routes.
     * 
     */
    private final @Nullable Integer acceptedRouteCount;
    /**
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * 
     */
    private final @Nullable String certificateArn;
    /**
     * The date and time of the last change in status.
     * 
     */
    private final @Nullable String lastStatusChange;
    /**
     * The Internet-routable IP address of the virtual private gateway&#39;s outside interface.
     * 
     */
    private final @Nullable String outsideIpAddress;
    /**
     * The status of the VPN tunnel.
     * 
     */
    private final @Nullable String status;
    /**
     * If an error occurs, a description of the error.
     * 
     */
    private final @Nullable String statusMessage;

    @CustomType.Constructor
    private VpnConnectionVgwTelemetry(
        @CustomType.Parameter("acceptedRouteCount") @Nullable Integer acceptedRouteCount,
        @CustomType.Parameter("certificateArn") @Nullable String certificateArn,
        @CustomType.Parameter("lastStatusChange") @Nullable String lastStatusChange,
        @CustomType.Parameter("outsideIpAddress") @Nullable String outsideIpAddress,
        @CustomType.Parameter("status") @Nullable String status,
        @CustomType.Parameter("statusMessage") @Nullable String statusMessage) {
        this.acceptedRouteCount = acceptedRouteCount;
        this.certificateArn = certificateArn;
        this.lastStatusChange = lastStatusChange;
        this.outsideIpAddress = outsideIpAddress;
        this.status = status;
        this.statusMessage = statusMessage;
    }

    /**
     * The number of accepted routes.
     * 
    */
    public Optional<Integer> acceptedRouteCount() {
        return Optional.ofNullable(this.acceptedRouteCount);
    }
    /**
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * 
    */
    public Optional<String> certificateArn() {
        return Optional.ofNullable(this.certificateArn);
    }
    /**
     * The date and time of the last change in status.
     * 
    */
    public Optional<String> lastStatusChange() {
        return Optional.ofNullable(this.lastStatusChange);
    }
    /**
     * The Internet-routable IP address of the virtual private gateway&#39;s outside interface.
     * 
    */
    public Optional<String> outsideIpAddress() {
        return Optional.ofNullable(this.outsideIpAddress);
    }
    /**
     * The status of the VPN tunnel.
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * If an error occurs, a description of the error.
     * 
    */
    public Optional<String> statusMessage() {
        return Optional.ofNullable(this.statusMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionVgwTelemetry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer acceptedRouteCount;
        private @Nullable String certificateArn;
        private @Nullable String lastStatusChange;
        private @Nullable String outsideIpAddress;
        private @Nullable String status;
        private @Nullable String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionVgwTelemetry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedRouteCount = defaults.acceptedRouteCount;
    	      this.certificateArn = defaults.certificateArn;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.outsideIpAddress = defaults.outsideIpAddress;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder acceptedRouteCount(@Nullable Integer acceptedRouteCount) {
            this.acceptedRouteCount = acceptedRouteCount;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder lastStatusChange(@Nullable String lastStatusChange) {
            this.lastStatusChange = lastStatusChange;
            return this;
        }
        public Builder outsideIpAddress(@Nullable String outsideIpAddress) {
            this.outsideIpAddress = outsideIpAddress;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public Builder statusMessage(@Nullable String statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }        public VpnConnectionVgwTelemetry build() {
            return new VpnConnectionVgwTelemetry(acceptedRouteCount, certificateArn, lastStatusChange, outsideIpAddress, status, statusMessage);
        }
    }
}
