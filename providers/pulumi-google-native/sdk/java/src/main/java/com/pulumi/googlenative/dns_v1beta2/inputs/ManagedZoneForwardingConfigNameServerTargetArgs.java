// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dns_v1beta2.enums.ManagedZoneForwardingConfigNameServerTargetForwardingPath;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigNameServerTargetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigNameServerTargetArgs Empty = new ManagedZoneForwardingConfigNameServerTargetArgs();

    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @Import(name="forwardingPath")
      private final @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;

    public Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath() {
        return this.forwardingPath == null ? Codegen.empty() : this.forwardingPath;
    }

    /**
     * IPv4 address of a target name server.
     * 
     */
    @Import(name="ipv4Address")
      private final @Nullable Output<String> ipv4Address;

    public Output<String> ipv4Address() {
        return this.ipv4Address == null ? Codegen.empty() : this.ipv4Address;
    }

    /**
     * IPv6 address of a target name server. Does not accept both fields (ipv4 &amp; ipv6) being populated.
     * 
     */
    @Import(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    public Output<String> ipv6Address() {
        return this.ipv6Address == null ? Codegen.empty() : this.ipv6Address;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    public ManagedZoneForwardingConfigNameServerTargetArgs(
        @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath,
        @Nullable Output<String> ipv4Address,
        @Nullable Output<String> ipv6Address,
        @Nullable Output<String> kind) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
    }

    private ManagedZoneForwardingConfigNameServerTargetArgs() {
        this.forwardingPath = Codegen.empty();
        this.ipv4Address = Codegen.empty();
        this.ipv6Address = Codegen.empty();
        this.kind = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;
        private @Nullable Output<String> ipv4Address;
        private @Nullable Output<String> ipv6Address;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder forwardingPath(@Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }
        public Builder forwardingPath(@Nullable ManagedZoneForwardingConfigNameServerTargetForwardingPath forwardingPath) {
            this.forwardingPath = Codegen.ofNullable(forwardingPath);
            return this;
        }
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }
        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = Codegen.ofNullable(ipv4Address);
            return this;
        }
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Codegen.ofNullable(ipv6Address);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }        public ManagedZoneForwardingConfigNameServerTargetArgs build() {
            return new ManagedZoneForwardingConfigNameServerTargetArgs(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
