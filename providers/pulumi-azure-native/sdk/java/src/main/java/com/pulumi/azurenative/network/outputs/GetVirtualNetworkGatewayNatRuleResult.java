// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.VpnNatRuleMappingResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualNetworkGatewayNatRuleResult {
    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * @return The private IP address external mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> externalMappings;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return The private IP address internal mapping for NAT.
     * 
     */
    private final @Nullable List<VpnNatRuleMappingResponse> internalMappings;
    /**
     * @return The IP Configuration ID this NAT rule applies to.
     * 
     */
    private final @Nullable String ipConfigurationId;
    /**
     * @return The Source NAT direction of a VPN NAT.
     * 
     */
    private final @Nullable String mode;
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    private final @Nullable String name;
    /**
     * @return The provisioning state of the NAT Rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetVirtualNetworkGatewayNatRuleResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("externalMappings") @Nullable List<VpnNatRuleMappingResponse> externalMappings,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("internalMappings") @Nullable List<VpnNatRuleMappingResponse> internalMappings,
        @CustomType.Parameter("ipConfigurationId") @Nullable String ipConfigurationId,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.externalMappings = externalMappings;
        this.id = id;
        this.internalMappings = internalMappings;
        this.ipConfigurationId = ipConfigurationId;
        this.mode = mode;
        this.name = name;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The private IP address external mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> externalMappings() {
        return this.externalMappings == null ? List.of() : this.externalMappings;
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The private IP address internal mapping for NAT.
     * 
     */
    public List<VpnNatRuleMappingResponse> internalMappings() {
        return this.internalMappings == null ? List.of() : this.internalMappings;
    }
    /**
     * @return The IP Configuration ID this NAT rule applies to.
     * 
     */
    public Optional<String> ipConfigurationId() {
        return Optional.ofNullable(this.ipConfigurationId);
    }
    /**
     * @return The Source NAT direction of a VPN NAT.
     * 
     */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * @return The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The provisioning state of the NAT Rule resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkGatewayNatRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable List<VpnNatRuleMappingResponse> externalMappings;
        private @Nullable String id;
        private @Nullable List<VpnNatRuleMappingResponse> internalMappings;
        private @Nullable String ipConfigurationId;
        private @Nullable String mode;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkGatewayNatRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.externalMappings = defaults.externalMappings;
    	      this.id = defaults.id;
    	      this.internalMappings = defaults.internalMappings;
    	      this.ipConfigurationId = defaults.ipConfigurationId;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder externalMappings(@Nullable List<VpnNatRuleMappingResponse> externalMappings) {
            this.externalMappings = externalMappings;
            return this;
        }
        public Builder externalMappings(VpnNatRuleMappingResponse... externalMappings) {
            return externalMappings(List.of(externalMappings));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder internalMappings(@Nullable List<VpnNatRuleMappingResponse> internalMappings) {
            this.internalMappings = internalMappings;
            return this;
        }
        public Builder internalMappings(VpnNatRuleMappingResponse... internalMappings) {
            return internalMappings(List.of(internalMappings));
        }
        public Builder ipConfigurationId(@Nullable String ipConfigurationId) {
            this.ipConfigurationId = ipConfigurationId;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetVirtualNetworkGatewayNatRuleResult build() {
            return new GetVirtualNetworkGatewayNatRuleResult(etag, externalMappings, id, internalMappings, ipConfigurationId, mode, name, provisioningState, type);
        }
    }
}
