// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration of an Azure Firewall.
 * 
 */
public final class AzureFirewallIPConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AzureFirewallIPConfigurationResponse Empty = new AzureFirewallIPConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The Firewall Internal Load Balancer IP to be used as the next hop in User Defined Routes.
     * 
     */
    @Import(name="privateIPAddress", required=true)
      private final String privateIPAddress;

    public String privateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * The provisioning state of the Azure firewall IP configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Reference to the PublicIP resource. This field is a mandatory input if subnet is not null.
     * 
     */
    @Import(name="publicIPAddress")
      private final @Nullable SubResourceResponse publicIPAddress;

    public Optional<SubResourceResponse> publicIPAddress() {
        return this.publicIPAddress == null ? Optional.empty() : Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * Reference to the subnet resource. This resource must be named 'AzureFirewallSubnet' or 'AzureFirewallManagementSubnet'.
     * 
     */
    @Import(name="subnet")
      private final @Nullable SubResourceResponse subnet;

    public Optional<SubResourceResponse> subnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public AzureFirewallIPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String privateIPAddress,
        String provisioningState,
        @Nullable SubResourceResponse publicIPAddress,
        @Nullable SubResourceResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.privateIPAddress = Objects.requireNonNull(privateIPAddress, "expected parameter 'privateIPAddress' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicIPAddress = publicIPAddress;
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureFirewallIPConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.privateIPAddress = null;
        this.provisioningState = null;
        this.publicIPAddress = null;
        this.subnet = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String privateIPAddress;
        private String provisioningState;
        private @Nullable SubResourceResponse publicIPAddress;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateIPAddress = defaults.privateIPAddress;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddress = defaults.publicIPAddress;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder privateIPAddress(String privateIPAddress) {
            this.privateIPAddress = Objects.requireNonNull(privateIPAddress);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder publicIPAddress(@Nullable SubResourceResponse publicIPAddress) {
            this.publicIPAddress = publicIPAddress;
            return this;
        }
        public Builder subnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AzureFirewallIPConfigurationResponse build() {
            return new AzureFirewallIPConfigurationResponse(etag, id, name, privateIPAddress, provisioningState, publicIPAddress, subnet, type);
        }
    }
}
