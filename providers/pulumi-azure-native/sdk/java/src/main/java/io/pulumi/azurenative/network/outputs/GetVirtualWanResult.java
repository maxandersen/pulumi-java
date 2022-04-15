// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVirtualWanResult {
    /**
     * True if branch to branch traffic is allowed.
     * 
     */
    private final @Nullable Boolean allowBranchToBranchTraffic;
    /**
     * True if Vnet to Vnet traffic is allowed.
     * 
     */
    private final @Nullable Boolean allowVnetToVnetTraffic;
    /**
     * Vpn encryption to be disabled or not.
     * 
     */
    private final @Nullable Boolean disableVpnEncryption;
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final String etag;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The office local breakout category.
     * 
     */
    private final String office365LocalBreakoutCategory;
    /**
     * The provisioning state of the virtual WAN resource.
     * 
     */
    private final String provisioningState;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * List of VirtualHubs in the VirtualWAN.
     * 
     */
    private final List<SubResourceResponse> virtualHubs;
    /**
     * List of VpnSites in the VirtualWAN.
     * 
     */
    private final List<SubResourceResponse> vpnSites;

    @CustomType.Constructor
    private GetVirtualWanResult(
        @CustomType.Parameter("allowBranchToBranchTraffic") @Nullable Boolean allowBranchToBranchTraffic,
        @CustomType.Parameter("allowVnetToVnetTraffic") @Nullable Boolean allowVnetToVnetTraffic,
        @CustomType.Parameter("disableVpnEncryption") @Nullable Boolean disableVpnEncryption,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("office365LocalBreakoutCategory") String office365LocalBreakoutCategory,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualHubs") List<SubResourceResponse> virtualHubs,
        @CustomType.Parameter("vpnSites") List<SubResourceResponse> vpnSites) {
        this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
        this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
        this.disableVpnEncryption = disableVpnEncryption;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.office365LocalBreakoutCategory = office365LocalBreakoutCategory;
        this.provisioningState = provisioningState;
        this.tags = tags;
        this.type = type;
        this.virtualHubs = virtualHubs;
        this.vpnSites = vpnSites;
    }

    /**
     * True if branch to branch traffic is allowed.
     * 
    */
    public Optional<Boolean> allowBranchToBranchTraffic() {
        return Optional.ofNullable(this.allowBranchToBranchTraffic);
    }
    /**
     * True if Vnet to Vnet traffic is allowed.
     * 
    */
    public Optional<Boolean> allowVnetToVnetTraffic() {
        return Optional.ofNullable(this.allowVnetToVnetTraffic);
    }
    /**
     * Vpn encryption to be disabled or not.
     * 
    */
    public Optional<Boolean> disableVpnEncryption() {
        return Optional.ofNullable(this.disableVpnEncryption);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Resource location.
     * 
    */
    public String location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The office local breakout category.
     * 
    */
    public String office365LocalBreakoutCategory() {
        return this.office365LocalBreakoutCategory;
    }
    /**
     * The provisioning state of the virtual WAN resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * List of VirtualHubs in the VirtualWAN.
     * 
    */
    public List<SubResourceResponse> virtualHubs() {
        return this.virtualHubs;
    }
    /**
     * List of VpnSites in the VirtualWAN.
     * 
    */
    public List<SubResourceResponse> vpnSites() {
        return this.vpnSites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualWanResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowBranchToBranchTraffic;
        private @Nullable Boolean allowVnetToVnetTraffic;
        private @Nullable Boolean disableVpnEncryption;
        private String etag;
        private @Nullable String id;
        private String location;
        private String name;
        private String office365LocalBreakoutCategory;
        private String provisioningState;
        private @Nullable Map<String,String> tags;
        private String type;
        private List<SubResourceResponse> virtualHubs;
        private List<SubResourceResponse> vpnSites;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualWanResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowBranchToBranchTraffic = defaults.allowBranchToBranchTraffic;
    	      this.allowVnetToVnetTraffic = defaults.allowVnetToVnetTraffic;
    	      this.disableVpnEncryption = defaults.disableVpnEncryption;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.office365LocalBreakoutCategory = defaults.office365LocalBreakoutCategory;
    	      this.provisioningState = defaults.provisioningState;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.virtualHubs = defaults.virtualHubs;
    	      this.vpnSites = defaults.vpnSites;
        }

        public Builder allowBranchToBranchTraffic(@Nullable Boolean allowBranchToBranchTraffic) {
            this.allowBranchToBranchTraffic = allowBranchToBranchTraffic;
            return this;
        }
        public Builder allowVnetToVnetTraffic(@Nullable Boolean allowVnetToVnetTraffic) {
            this.allowVnetToVnetTraffic = allowVnetToVnetTraffic;
            return this;
        }
        public Builder disableVpnEncryption(@Nullable Boolean disableVpnEncryption) {
            this.disableVpnEncryption = disableVpnEncryption;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder office365LocalBreakoutCategory(String office365LocalBreakoutCategory) {
            this.office365LocalBreakoutCategory = Objects.requireNonNull(office365LocalBreakoutCategory);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualHubs(List<SubResourceResponse> virtualHubs) {
            this.virtualHubs = Objects.requireNonNull(virtualHubs);
            return this;
        }
        public Builder virtualHubs(SubResourceResponse... virtualHubs) {
            return virtualHubs(List.of(virtualHubs));
        }
        public Builder vpnSites(List<SubResourceResponse> vpnSites) {
            this.vpnSites = Objects.requireNonNull(vpnSites);
            return this;
        }
        public Builder vpnSites(SubResourceResponse... vpnSites) {
            return vpnSites(List.of(vpnSites));
        }        public GetVirtualWanResult build() {
            return new GetVirtualWanResult(allowBranchToBranchTraffic, allowVnetToVnetTraffic, disableVpnEncryption, etag, id, location, name, office365LocalBreakoutCategory, provisioningState, tags, type, virtualHubs, vpnSites);
        }
    }
}
