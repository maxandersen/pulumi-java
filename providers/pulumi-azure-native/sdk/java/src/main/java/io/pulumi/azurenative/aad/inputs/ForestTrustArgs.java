// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Forest Trust Setting
 * 
 */
public final class ForestTrustArgs extends io.pulumi.resources.ResourceArgs {

    public static final ForestTrustArgs Empty = new ForestTrustArgs();

    /**
     * Friendly Name
     * 
     */
    @Import(name="friendlyName")
      private final @Nullable Output<String> friendlyName;

    public Output<String> friendlyName() {
        return this.friendlyName == null ? Codegen.empty() : this.friendlyName;
    }

    /**
     * Remote Dns ips
     * 
     */
    @Import(name="remoteDnsIps")
      private final @Nullable Output<String> remoteDnsIps;

    public Output<String> remoteDnsIps() {
        return this.remoteDnsIps == null ? Codegen.empty() : this.remoteDnsIps;
    }

    /**
     * Trust Direction
     * 
     */
    @Import(name="trustDirection")
      private final @Nullable Output<String> trustDirection;

    public Output<String> trustDirection() {
        return this.trustDirection == null ? Codegen.empty() : this.trustDirection;
    }

    /**
     * Trust Password
     * 
     */
    @Import(name="trustPassword")
      private final @Nullable Output<String> trustPassword;

    public Output<String> trustPassword() {
        return this.trustPassword == null ? Codegen.empty() : this.trustPassword;
    }

    /**
     * Trusted Domain FQDN
     * 
     */
    @Import(name="trustedDomainFqdn")
      private final @Nullable Output<String> trustedDomainFqdn;

    public Output<String> trustedDomainFqdn() {
        return this.trustedDomainFqdn == null ? Codegen.empty() : this.trustedDomainFqdn;
    }

    public ForestTrustArgs(
        @Nullable Output<String> friendlyName,
        @Nullable Output<String> remoteDnsIps,
        @Nullable Output<String> trustDirection,
        @Nullable Output<String> trustPassword,
        @Nullable Output<String> trustedDomainFqdn) {
        this.friendlyName = friendlyName;
        this.remoteDnsIps = remoteDnsIps;
        this.trustDirection = trustDirection;
        this.trustPassword = trustPassword;
        this.trustedDomainFqdn = trustedDomainFqdn;
    }

    private ForestTrustArgs() {
        this.friendlyName = Codegen.empty();
        this.remoteDnsIps = Codegen.empty();
        this.trustDirection = Codegen.empty();
        this.trustPassword = Codegen.empty();
        this.trustedDomainFqdn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ForestTrustArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> friendlyName;
        private @Nullable Output<String> remoteDnsIps;
        private @Nullable Output<String> trustDirection;
        private @Nullable Output<String> trustPassword;
        private @Nullable Output<String> trustedDomainFqdn;

        public Builder() {
    	      // Empty
        }

        public Builder(ForestTrustArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.remoteDnsIps = defaults.remoteDnsIps;
    	      this.trustDirection = defaults.trustDirection;
    	      this.trustPassword = defaults.trustPassword;
    	      this.trustedDomainFqdn = defaults.trustedDomainFqdn;
        }

        public Builder friendlyName(@Nullable Output<String> friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = Codegen.ofNullable(friendlyName);
            return this;
        }
        public Builder remoteDnsIps(@Nullable Output<String> remoteDnsIps) {
            this.remoteDnsIps = remoteDnsIps;
            return this;
        }
        public Builder remoteDnsIps(@Nullable String remoteDnsIps) {
            this.remoteDnsIps = Codegen.ofNullable(remoteDnsIps);
            return this;
        }
        public Builder trustDirection(@Nullable Output<String> trustDirection) {
            this.trustDirection = trustDirection;
            return this;
        }
        public Builder trustDirection(@Nullable String trustDirection) {
            this.trustDirection = Codegen.ofNullable(trustDirection);
            return this;
        }
        public Builder trustPassword(@Nullable Output<String> trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }
        public Builder trustPassword(@Nullable String trustPassword) {
            this.trustPassword = Codegen.ofNullable(trustPassword);
            return this;
        }
        public Builder trustedDomainFqdn(@Nullable Output<String> trustedDomainFqdn) {
            this.trustedDomainFqdn = trustedDomainFqdn;
            return this;
        }
        public Builder trustedDomainFqdn(@Nullable String trustedDomainFqdn) {
            this.trustedDomainFqdn = Codegen.ofNullable(trustedDomainFqdn);
            return this;
        }        public ForestTrustArgs build() {
            return new ForestTrustArgs(friendlyName, remoteDnsIps, trustDirection, trustPassword, trustedDomainFqdn);
        }
    }
}
