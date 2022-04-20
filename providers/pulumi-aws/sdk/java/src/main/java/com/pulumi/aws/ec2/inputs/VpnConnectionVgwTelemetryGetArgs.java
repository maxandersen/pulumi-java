// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnConnectionVgwTelemetryGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnConnectionVgwTelemetryGetArgs Empty = new VpnConnectionVgwTelemetryGetArgs();

    /**
     * The number of accepted routes.
     * 
     */
    @Import(name="acceptedRouteCount")
      private final @Nullable Output<Integer> acceptedRouteCount;

    public Output<Integer> acceptedRouteCount() {
        return this.acceptedRouteCount == null ? Codegen.empty() : this.acceptedRouteCount;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPN tunnel endpoint certificate.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> certificateArn() {
        return this.certificateArn == null ? Codegen.empty() : this.certificateArn;
    }

    /**
     * The date and time of the last change in status.
     * 
     */
    @Import(name="lastStatusChange")
      private final @Nullable Output<String> lastStatusChange;

    public Output<String> lastStatusChange() {
        return this.lastStatusChange == null ? Codegen.empty() : this.lastStatusChange;
    }

    /**
     * The Internet-routable IP address of the virtual private gateway&#39;s outside interface.
     * 
     */
    @Import(name="outsideIpAddress")
      private final @Nullable Output<String> outsideIpAddress;

    public Output<String> outsideIpAddress() {
        return this.outsideIpAddress == null ? Codegen.empty() : this.outsideIpAddress;
    }

    /**
     * The status of the VPN tunnel.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * If an error occurs, a description of the error.
     * 
     */
    @Import(name="statusMessage")
      private final @Nullable Output<String> statusMessage;

    public Output<String> statusMessage() {
        return this.statusMessage == null ? Codegen.empty() : this.statusMessage;
    }

    public VpnConnectionVgwTelemetryGetArgs(
        @Nullable Output<Integer> acceptedRouteCount,
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> lastStatusChange,
        @Nullable Output<String> outsideIpAddress,
        @Nullable Output<String> status,
        @Nullable Output<String> statusMessage) {
        this.acceptedRouteCount = acceptedRouteCount;
        this.certificateArn = certificateArn;
        this.lastStatusChange = lastStatusChange;
        this.outsideIpAddress = outsideIpAddress;
        this.status = status;
        this.statusMessage = statusMessage;
    }

    private VpnConnectionVgwTelemetryGetArgs() {
        this.acceptedRouteCount = Codegen.empty();
        this.certificateArn = Codegen.empty();
        this.lastStatusChange = Codegen.empty();
        this.outsideIpAddress = Codegen.empty();
        this.status = Codegen.empty();
        this.statusMessage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnConnectionVgwTelemetryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> acceptedRouteCount;
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> lastStatusChange;
        private @Nullable Output<String> outsideIpAddress;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnConnectionVgwTelemetryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedRouteCount = defaults.acceptedRouteCount;
    	      this.certificateArn = defaults.certificateArn;
    	      this.lastStatusChange = defaults.lastStatusChange;
    	      this.outsideIpAddress = defaults.outsideIpAddress;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder acceptedRouteCount(@Nullable Output<Integer> acceptedRouteCount) {
            this.acceptedRouteCount = acceptedRouteCount;
            return this;
        }
        public Builder acceptedRouteCount(@Nullable Integer acceptedRouteCount) {
            this.acceptedRouteCount = Codegen.ofNullable(acceptedRouteCount);
            return this;
        }
        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Codegen.ofNullable(certificateArn);
            return this;
        }
        public Builder lastStatusChange(@Nullable Output<String> lastStatusChange) {
            this.lastStatusChange = lastStatusChange;
            return this;
        }
        public Builder lastStatusChange(@Nullable String lastStatusChange) {
            this.lastStatusChange = Codegen.ofNullable(lastStatusChange);
            return this;
        }
        public Builder outsideIpAddress(@Nullable Output<String> outsideIpAddress) {
            this.outsideIpAddress = outsideIpAddress;
            return this;
        }
        public Builder outsideIpAddress(@Nullable String outsideIpAddress) {
            this.outsideIpAddress = Codegen.ofNullable(outsideIpAddress);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder statusMessage(@Nullable Output<String> statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public Builder statusMessage(@Nullable String statusMessage) {
            this.statusMessage = Codegen.ofNullable(statusMessage);
            return this;
        }        public VpnConnectionVgwTelemetryGetArgs build() {
            return new VpnConnectionVgwTelemetryGetArgs(acceptedRouteCount, certificateArn, lastStatusChange, outsideIpAddress, status, statusMessage);
        }
    }
}
