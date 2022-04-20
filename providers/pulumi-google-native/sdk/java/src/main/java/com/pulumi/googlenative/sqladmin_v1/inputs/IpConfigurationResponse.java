// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1.inputs.AclEntryResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * IP Management configuration.
 * 
 */
public final class IpConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final IpConfigurationResponse Empty = new IpConfigurationResponse();

    /**
     * The name of the allocated ip range for the private ip CloudSQL instance. For example: &#34;google-managed-services-default&#34;. If set, the instance ip will be created in the allocated range. The range name must comply with [RFC 1035](https://tools.ietf.org/html/rfc1035). Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?.`
     * 
     */
    @Import(name="allocatedIpRange", required=true)
      private final String allocatedIpRange;

    public String allocatedIpRange() {
        return this.allocatedIpRange;
    }

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. In &#39;CIDR&#39; notation, also known as &#39;slash&#39; notation (for example: `157.197.200.0/24`).
     * 
     */
    @Import(name="authorizedNetworks", required=true)
      private final List<AclEntryResponse> authorizedNetworks;

    public List<AclEntryResponse> authorizedNetworks() {
        return this.authorizedNetworks;
    }

    /**
     * Whether the instance is assigned a public IP address or not.
     * 
     */
    @Import(name="ipv4Enabled", required=true)
      private final Boolean ipv4Enabled;

    public Boolean ipv4Enabled() {
        return this.ipv4Enabled;
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `/projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @Import(name="privateNetwork", required=true)
      private final String privateNetwork;

    public String privateNetwork() {
        return this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP are enforced or not.
     * 
     */
    @Import(name="requireSsl", required=true)
      private final Boolean requireSsl;

    public Boolean requireSsl() {
        return this.requireSsl;
    }

    public IpConfigurationResponse(
        String allocatedIpRange,
        List<AclEntryResponse> authorizedNetworks,
        Boolean ipv4Enabled,
        String privateNetwork,
        Boolean requireSsl) {
        this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange, "expected parameter 'allocatedIpRange' to be non-null");
        this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks, "expected parameter 'authorizedNetworks' to be non-null");
        this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled, "expected parameter 'ipv4Enabled' to be non-null");
        this.privateNetwork = Objects.requireNonNull(privateNetwork, "expected parameter 'privateNetwork' to be non-null");
        this.requireSsl = Objects.requireNonNull(requireSsl, "expected parameter 'requireSsl' to be non-null");
    }

    private IpConfigurationResponse() {
        this.allocatedIpRange = null;
        this.authorizedNetworks = List.of();
        this.ipv4Enabled = null;
        this.privateNetwork = null;
        this.requireSsl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocatedIpRange;
        private List<AclEntryResponse> authorizedNetworks;
        private Boolean ipv4Enabled;
        private String privateNetwork;
        private Boolean requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(IpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder allocatedIpRange(String allocatedIpRange) {
            this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange);
            return this;
        }
        public Builder authorizedNetworks(List<AclEntryResponse> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(AclEntryResponse... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder ipv4Enabled(Boolean ipv4Enabled) {
            this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled);
            return this;
        }
        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }
        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }        public IpConfigurationResponse build() {
            return new IpConfigurationResponse(allocatedIpRange, authorizedNetworks, ipv4Enabled, privateNetwork, requireSsl);
        }
    }
}
