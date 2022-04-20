// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetInstanceTemplateNetworkInterfaceAccessConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceTemplateNetworkInterfaceAccessConfig Empty = new GetInstanceTemplateNetworkInterfaceAccessConfig();

    /**
     * The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    @Import(name="natIp", required=true)
      private final String natIp;

    public String natIp() {
        return this.natIp;
    }

    /**
     * The [networking tier][network-tier] used for configuring
     * this instance template. This field can take the following values: PREMIUM or
     * STANDARD. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    @Import(name="networkTier", required=true)
      private final String networkTier;

    public String networkTier() {
        return this.networkTier;
    }

    @Import(name="publicPtrDomainName", required=true)
      private final String publicPtrDomainName;

    public String publicPtrDomainName() {
        return this.publicPtrDomainName;
    }

    public GetInstanceTemplateNetworkInterfaceAccessConfig(
        String natIp,
        String networkTier,
        String publicPtrDomainName) {
        this.natIp = Objects.requireNonNull(natIp, "expected parameter 'natIp' to be non-null");
        this.networkTier = Objects.requireNonNull(networkTier, "expected parameter 'networkTier' to be non-null");
        this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName, "expected parameter 'publicPtrDomainName' to be non-null");
    }

    private GetInstanceTemplateNetworkInterfaceAccessConfig() {
        this.natIp = null;
        this.networkTier = null;
        this.publicPtrDomainName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String natIp;
        private String networkTier;
        private String publicPtrDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceTemplateNetworkInterfaceAccessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.natIp = defaults.natIp;
    	      this.networkTier = defaults.networkTier;
    	      this.publicPtrDomainName = defaults.publicPtrDomainName;
        }

        public Builder natIp(String natIp) {
            this.natIp = Objects.requireNonNull(natIp);
            return this;
        }
        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        public Builder publicPtrDomainName(String publicPtrDomainName) {
            this.publicPtrDomainName = Objects.requireNonNull(publicPtrDomainName);
            return this;
        }        public GetInstanceTemplateNetworkInterfaceAccessConfig build() {
            return new GetInstanceTemplateNetworkInterfaceAccessConfig(natIp, networkTier, publicPtrDomainName);
        }
    }
}
