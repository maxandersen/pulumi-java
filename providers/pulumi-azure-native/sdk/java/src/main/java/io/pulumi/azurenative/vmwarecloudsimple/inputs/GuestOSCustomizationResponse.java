// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.vmwarecloudsimple.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Guest OS Customization properties
 * 
 */
public final class GuestOSCustomizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final GuestOSCustomizationResponse Empty = new GuestOSCustomizationResponse();

    /**
     * List of dns servers to use
     * 
     */
    @Import(name="dnsServers")
      private final @Nullable List<String> dnsServers;

    public List<String> dnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }

    /**
     * Virtual Machine hostname
     * 
     */
    @Import(name="hostName")
      private final @Nullable String hostName;

    public Optional<String> hostName() {
        return this.hostName == null ? Optional.empty() : Optional.ofNullable(this.hostName);
    }

    /**
     * Password for login
     * 
     */
    @Import(name="password")
      private final @Nullable String password;

    public Optional<String> password() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * id of customization policy
     * 
     */
    @Import(name="policyId")
      private final @Nullable String policyId;

    public Optional<String> policyId() {
        return this.policyId == null ? Optional.empty() : Optional.ofNullable(this.policyId);
    }

    /**
     * Username for login
     * 
     */
    @Import(name="username")
      private final @Nullable String username;

    public Optional<String> username() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public GuestOSCustomizationResponse(
        @Nullable List<String> dnsServers,
        @Nullable String hostName,
        @Nullable String password,
        @Nullable String policyId,
        @Nullable String username) {
        this.dnsServers = dnsServers;
        this.hostName = hostName;
        this.password = password;
        this.policyId = policyId;
        this.username = username;
    }

    private GuestOSCustomizationResponse() {
        this.dnsServers = List.of();
        this.hostName = null;
        this.password = null;
        this.policyId = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestOSCustomizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> dnsServers;
        private @Nullable String hostName;
        private @Nullable String password;
        private @Nullable String policyId;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestOSCustomizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsServers = defaults.dnsServers;
    	      this.hostName = defaults.hostName;
    	      this.password = defaults.password;
    	      this.policyId = defaults.policyId;
    	      this.username = defaults.username;
        }

        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder policyId(@Nullable String policyId) {
            this.policyId = policyId;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public GuestOSCustomizationResponse build() {
            return new GuestOSCustomizationResponse(dnsServers, hostName, password, policyId, username);
        }
    }
}
