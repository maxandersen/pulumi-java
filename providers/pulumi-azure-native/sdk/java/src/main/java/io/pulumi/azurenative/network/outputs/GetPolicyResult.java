// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.CustomRuleListResponse;
import io.pulumi.azurenative.network.outputs.FrontDoorPolicySettingsResponse;
import io.pulumi.azurenative.network.outputs.FrontendEndpointLinkResponse;
import io.pulumi.azurenative.network.outputs.ManagedRuleSetListResponse;
import io.pulumi.azurenative.network.outputs.RoutingRuleLinkResponse;
import io.pulumi.azurenative.network.outputs.SecurityPolicyLinkResponse;
import io.pulumi.azurenative.network.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyResult {
    /**
     * Describes custom rules inside the policy.
     * 
     */
    private final @Nullable CustomRuleListResponse customRules;
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
     */
    private final @Nullable String etag;
    /**
     * Describes Frontend Endpoints associated with this Web Application Firewall policy.
     * 
     */
    private final List<FrontendEndpointLinkResponse> frontendEndpointLinks;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Describes managed rules inside the policy.
     * 
     */
    private final @Nullable ManagedRuleSetListResponse managedRules;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Describes settings for the policy.
     * 
     */
    private final @Nullable FrontDoorPolicySettingsResponse policySettings;
    /**
     * Provisioning state of the policy.
     * 
     */
    private final String provisioningState;
    private final String resourceState;
    /**
     * Describes Routing Rules associated with this Web Application Firewall policy.
     * 
     */
    private final List<RoutingRuleLinkResponse> routingRuleLinks;
    /**
     * Describes Security Policy associated with this Web Application Firewall policy.
     * 
     */
    private final List<SecurityPolicyLinkResponse> securityPolicyLinks;
    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
     */
    private final @Nullable SkuResponse sku;
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

    @CustomType.Constructor
    private GetPolicyResult(
        @CustomType.Parameter("customRules") @Nullable CustomRuleListResponse customRules,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("frontendEndpointLinks") List<FrontendEndpointLinkResponse> frontendEndpointLinks,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("managedRules") @Nullable ManagedRuleSetListResponse managedRules,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("policySettings") @Nullable FrontDoorPolicySettingsResponse policySettings,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("resourceState") String resourceState,
        @CustomType.Parameter("routingRuleLinks") List<RoutingRuleLinkResponse> routingRuleLinks,
        @CustomType.Parameter("securityPolicyLinks") List<SecurityPolicyLinkResponse> securityPolicyLinks,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.customRules = customRules;
        this.etag = etag;
        this.frontendEndpointLinks = frontendEndpointLinks;
        this.id = id;
        this.location = location;
        this.managedRules = managedRules;
        this.name = name;
        this.policySettings = policySettings;
        this.provisioningState = provisioningState;
        this.resourceState = resourceState;
        this.routingRuleLinks = routingRuleLinks;
        this.securityPolicyLinks = securityPolicyLinks;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * Describes custom rules inside the policy.
     * 
    */
    public Optional<CustomRuleListResponse> customRules() {
        return Optional.ofNullable(this.customRules);
    }
    /**
     * Gets a unique read-only string that changes whenever the resource is updated.
     * 
    */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * Describes Frontend Endpoints associated with this Web Application Firewall policy.
     * 
    */
    public List<FrontendEndpointLinkResponse> frontendEndpointLinks() {
        return this.frontendEndpointLinks;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Describes managed rules inside the policy.
     * 
    */
    public Optional<ManagedRuleSetListResponse> managedRules() {
        return Optional.ofNullable(this.managedRules);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Describes settings for the policy.
     * 
    */
    public Optional<FrontDoorPolicySettingsResponse> policySettings() {
        return Optional.ofNullable(this.policySettings);
    }
    /**
     * Provisioning state of the policy.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    public String resourceState() {
        return this.resourceState;
    }
    /**
     * Describes Routing Rules associated with this Web Application Firewall policy.
     * 
    */
    public List<RoutingRuleLinkResponse> routingRuleLinks() {
        return this.routingRuleLinks;
    }
    /**
     * Describes Security Policy associated with this Web Application Firewall policy.
     * 
    */
    public List<SecurityPolicyLinkResponse> securityPolicyLinks() {
        return this.securityPolicyLinks;
    }
    /**
     * The pricing tier of web application firewall policy. Defaults to Classic_AzureFrontDoor if not specified.
     * 
    */
    public Optional<SkuResponse> sku() {
        return Optional.ofNullable(this.sku);
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomRuleListResponse customRules;
        private @Nullable String etag;
        private List<FrontendEndpointLinkResponse> frontendEndpointLinks;
        private String id;
        private @Nullable String location;
        private @Nullable ManagedRuleSetListResponse managedRules;
        private String name;
        private @Nullable FrontDoorPolicySettingsResponse policySettings;
        private String provisioningState;
        private String resourceState;
        private List<RoutingRuleLinkResponse> routingRuleLinks;
        private List<SecurityPolicyLinkResponse> securityPolicyLinks;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRules = defaults.customRules;
    	      this.etag = defaults.etag;
    	      this.frontendEndpointLinks = defaults.frontendEndpointLinks;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.managedRules = defaults.managedRules;
    	      this.name = defaults.name;
    	      this.policySettings = defaults.policySettings;
    	      this.provisioningState = defaults.provisioningState;
    	      this.resourceState = defaults.resourceState;
    	      this.routingRuleLinks = defaults.routingRuleLinks;
    	      this.securityPolicyLinks = defaults.securityPolicyLinks;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder customRules(@Nullable CustomRuleListResponse customRules) {
            this.customRules = customRules;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }
        public Builder frontendEndpointLinks(List<FrontendEndpointLinkResponse> frontendEndpointLinks) {
            this.frontendEndpointLinks = Objects.requireNonNull(frontendEndpointLinks);
            return this;
        }
        public Builder frontendEndpointLinks(FrontendEndpointLinkResponse... frontendEndpointLinks) {
            return frontendEndpointLinks(List.of(frontendEndpointLinks));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder managedRules(@Nullable ManagedRuleSetListResponse managedRules) {
            this.managedRules = managedRules;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder policySettings(@Nullable FrontDoorPolicySettingsResponse policySettings) {
            this.policySettings = policySettings;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder resourceState(String resourceState) {
            this.resourceState = Objects.requireNonNull(resourceState);
            return this;
        }
        public Builder routingRuleLinks(List<RoutingRuleLinkResponse> routingRuleLinks) {
            this.routingRuleLinks = Objects.requireNonNull(routingRuleLinks);
            return this;
        }
        public Builder routingRuleLinks(RoutingRuleLinkResponse... routingRuleLinks) {
            return routingRuleLinks(List.of(routingRuleLinks));
        }
        public Builder securityPolicyLinks(List<SecurityPolicyLinkResponse> securityPolicyLinks) {
            this.securityPolicyLinks = Objects.requireNonNull(securityPolicyLinks);
            return this;
        }
        public Builder securityPolicyLinks(SecurityPolicyLinkResponse... securityPolicyLinks) {
            return securityPolicyLinks(List.of(securityPolicyLinks));
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPolicyResult build() {
            return new GetPolicyResult(customRules, etag, frontendEndpointLinks, id, location, managedRules, name, policySettings, provisioningState, resourceState, routingRuleLinks, securityPolicyLinks, sku, tags, type);
        }
    }
}
