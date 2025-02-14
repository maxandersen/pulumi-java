// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import com.pulumi.azurenative.network.outputs.ConfigurationGroupResponse;
import com.pulumi.azurenative.network.outputs.NetworkManagerSecurityGroupItemResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActiveDefaultSecurityUserRuleResponse {
    /**
     * @return Deployment time string.
     * 
     */
    private final @Nullable String commitTime;
    /**
     * @return A description of the security user configuration.
     * 
     */
    private final @Nullable String configurationDescription;
    /**
     * @return A display name of the security user configuration.
     * 
     */
    private final @Nullable String configurationDisplayName;
    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    private final String description;
    /**
     * @return The destination port ranges.
     * 
     */
    private final List<String> destinationPortRanges;
    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> destinations;
    /**
     * @return Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    private final String direction;
    /**
     * @return A friendly name for the rule.
     * 
     */
    private final String displayName;
    /**
     * @return Default rule flag.
     * 
     */
    private final @Nullable String flag;
    /**
     * @return Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Whether the rule is custom or default.
     * Expected value is &#39;Default&#39;.
     * 
     */
    private final String kind;
    /**
     * @return Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * @return The provisioning state of the security configuration user rule resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Deployment region.
     * 
     */
    private final @Nullable String region;
    /**
     * @return Groups for rule collection
     * 
     */
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
    /**
     * @return A description of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDescription;
    /**
     * @return A display name of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDisplayName;
    /**
     * @return Effective configuration groups.
     * 
     */
    private final @Nullable List<ConfigurationGroupResponse> ruleGroups;
    /**
     * @return The source port ranges.
     * 
     */
    private final List<String> sourcePortRanges;
    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    private final List<AddressPrefixItemResponse> sources;

    @CustomType.Constructor
    private ActiveDefaultSecurityUserRuleResponse(
        @CustomType.Parameter("commitTime") @Nullable String commitTime,
        @CustomType.Parameter("configurationDescription") @Nullable String configurationDescription,
        @CustomType.Parameter("configurationDisplayName") @Nullable String configurationDisplayName,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("destinationPortRanges") List<String> destinationPortRanges,
        @CustomType.Parameter("destinations") List<AddressPrefixItemResponse> destinations,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("flag") @Nullable String flag,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("ruleCollectionAppliesToGroups") @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @CustomType.Parameter("ruleCollectionDescription") @Nullable String ruleCollectionDescription,
        @CustomType.Parameter("ruleCollectionDisplayName") @Nullable String ruleCollectionDisplayName,
        @CustomType.Parameter("ruleGroups") @Nullable List<ConfigurationGroupResponse> ruleGroups,
        @CustomType.Parameter("sourcePortRanges") List<String> sourcePortRanges,
        @CustomType.Parameter("sources") List<AddressPrefixItemResponse> sources) {
        this.commitTime = commitTime;
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = description;
        this.destinationPortRanges = destinationPortRanges;
        this.destinations = destinations;
        this.direction = direction;
        this.displayName = displayName;
        this.flag = flag;
        this.id = id;
        this.kind = kind;
        this.protocol = protocol;
        this.provisioningState = provisioningState;
        this.region = region;
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        this.ruleCollectionDescription = ruleCollectionDescription;
        this.ruleCollectionDisplayName = ruleCollectionDisplayName;
        this.ruleGroups = ruleGroups;
        this.sourcePortRanges = sourcePortRanges;
        this.sources = sources;
    }

    /**
     * @return Deployment time string.
     * 
     */
    public Optional<String> commitTime() {
        return Optional.ofNullable(this.commitTime);
    }
    /**
     * @return A description of the security user configuration.
     * 
     */
    public Optional<String> configurationDescription() {
        return Optional.ofNullable(this.configurationDescription);
    }
    /**
     * @return A display name of the security user configuration.
     * 
     */
    public Optional<String> configurationDisplayName() {
        return Optional.ofNullable(this.configurationDisplayName);
    }
    /**
     * @return A description for this rule. Restricted to 140 chars.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The destination port ranges.
     * 
     */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges;
    }
    /**
     * @return The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> destinations() {
        return this.destinations;
    }
    /**
     * @return Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    public String direction() {
        return this.direction;
    }
    /**
     * @return A friendly name for the rule.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Default rule flag.
     * 
     */
    public Optional<String> flag() {
        return Optional.ofNullable(this.flag);
    }
    /**
     * @return Resource ID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Whether the rule is custom or default.
     * Expected value is &#39;Default&#39;.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return Network protocol this rule applies to.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The provisioning state of the security configuration user rule resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Deployment region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return Groups for rule collection
     * 
     */
    public List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }
    /**
     * @return A description of the rule collection.
     * 
     */
    public Optional<String> ruleCollectionDescription() {
        return Optional.ofNullable(this.ruleCollectionDescription);
    }
    /**
     * @return A display name of the rule collection.
     * 
     */
    public Optional<String> ruleCollectionDisplayName() {
        return Optional.ofNullable(this.ruleCollectionDisplayName);
    }
    /**
     * @return Effective configuration groups.
     * 
     */
    public List<ConfigurationGroupResponse> ruleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }
    /**
     * @return The source port ranges.
     * 
     */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges;
    }
    /**
     * @return The CIDR or source IP ranges.
     * 
     */
    public List<AddressPrefixItemResponse> sources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDefaultSecurityUserRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String commitTime;
        private @Nullable String configurationDescription;
        private @Nullable String configurationDisplayName;
        private String description;
        private List<String> destinationPortRanges;
        private List<AddressPrefixItemResponse> destinations;
        private String direction;
        private String displayName;
        private @Nullable String flag;
        private @Nullable String id;
        private String kind;
        private String protocol;
        private String provisioningState;
        private @Nullable String region;
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
        private @Nullable String ruleCollectionDescription;
        private @Nullable String ruleCollectionDisplayName;
        private @Nullable List<ConfigurationGroupResponse> ruleGroups;
        private List<String> sourcePortRanges;
        private List<AddressPrefixItemResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDefaultSecurityUserRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitTime = defaults.commitTime;
    	      this.configurationDescription = defaults.configurationDescription;
    	      this.configurationDisplayName = defaults.configurationDisplayName;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.flag = defaults.flag;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.region = defaults.region;
    	      this.ruleCollectionAppliesToGroups = defaults.ruleCollectionAppliesToGroups;
    	      this.ruleCollectionDescription = defaults.ruleCollectionDescription;
    	      this.ruleCollectionDisplayName = defaults.ruleCollectionDisplayName;
    	      this.ruleGroups = defaults.ruleGroups;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.sources = defaults.sources;
        }

        public Builder commitTime(@Nullable String commitTime) {
            this.commitTime = commitTime;
            return this;
        }
        public Builder configurationDescription(@Nullable String configurationDescription) {
            this.configurationDescription = configurationDescription;
            return this;
        }
        public Builder configurationDisplayName(@Nullable String configurationDisplayName) {
            this.configurationDisplayName = configurationDisplayName;
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder destinationPortRanges(List<String> destinationPortRanges) {
            this.destinationPortRanges = Objects.requireNonNull(destinationPortRanges);
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder destinations(List<AddressPrefixItemResponse> destinations) {
            this.destinations = Objects.requireNonNull(destinations);
            return this;
        }
        public Builder destinations(AddressPrefixItemResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder flag(@Nullable String flag) {
            this.flag = flag;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder ruleCollectionAppliesToGroups(@Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups) {
            this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
            return this;
        }
        public Builder ruleCollectionAppliesToGroups(NetworkManagerSecurityGroupItemResponse... ruleCollectionAppliesToGroups) {
            return ruleCollectionAppliesToGroups(List.of(ruleCollectionAppliesToGroups));
        }
        public Builder ruleCollectionDescription(@Nullable String ruleCollectionDescription) {
            this.ruleCollectionDescription = ruleCollectionDescription;
            return this;
        }
        public Builder ruleCollectionDisplayName(@Nullable String ruleCollectionDisplayName) {
            this.ruleCollectionDisplayName = ruleCollectionDisplayName;
            return this;
        }
        public Builder ruleGroups(@Nullable List<ConfigurationGroupResponse> ruleGroups) {
            this.ruleGroups = ruleGroups;
            return this;
        }
        public Builder ruleGroups(ConfigurationGroupResponse... ruleGroups) {
            return ruleGroups(List.of(ruleGroups));
        }
        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            this.sourcePortRanges = Objects.requireNonNull(sourcePortRanges);
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder sources(List<AddressPrefixItemResponse> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }
        public Builder sources(AddressPrefixItemResponse... sources) {
            return sources(List.of(sources));
        }        public ActiveDefaultSecurityUserRuleResponse build() {
            return new ActiveDefaultSecurityUserRuleResponse(commitTime, configurationDescription, configurationDisplayName, description, destinationPortRanges, destinations, direction, displayName, flag, id, kind, protocol, provisioningState, region, ruleCollectionAppliesToGroups, ruleCollectionDescription, ruleCollectionDisplayName, ruleGroups, sourcePortRanges, sources);
        }
    }
}
