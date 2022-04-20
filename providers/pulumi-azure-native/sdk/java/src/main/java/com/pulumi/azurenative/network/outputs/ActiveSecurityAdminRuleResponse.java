// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.azurenative.network.outputs.AddressPrefixItemResponse;
import com.pulumi.azurenative.network.outputs.ConfigurationGroupResponse;
import com.pulumi.azurenative.network.outputs.NetworkManagerSecurityGroupItemResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActiveSecurityAdminRuleResponse {
    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    private final String access;
    /**
     * Deployment time string.
     * 
     */
    private final @Nullable String commitTime;
    /**
     * A description of the security admin configuration.
     * 
     */
    private final @Nullable String configurationDescription;
    /**
     * A display name of the security admin configuration.
     * 
     */
    private final @Nullable String configurationDisplayName;
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    private final @Nullable String description;
    /**
     * The destination port ranges.
     * 
     */
    private final @Nullable List<String> destinationPortRanges;
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    private final @Nullable List<AddressPrefixItemResponse> destinations;
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    private final String direction;
    /**
     * A friendly name for the rule.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Resource ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Whether the rule is custom or default.
     * Expected value is &#39;Custom&#39;.
     * 
     */
    private final String kind;
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Network protocol this rule applies to.
     * 
     */
    private final String protocol;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Deployment region.
     * 
     */
    private final @Nullable String region;
    /**
     * Groups for rule collection
     * 
     */
    private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
    /**
     * A description of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDescription;
    /**
     * A display name of the rule collection.
     * 
     */
    private final @Nullable String ruleCollectionDisplayName;
    /**
     * Effective configuration groups.
     * 
     */
    private final @Nullable List<ConfigurationGroupResponse> ruleGroups;
    /**
     * The source port ranges.
     * 
     */
    private final @Nullable List<String> sourcePortRanges;
    /**
     * The CIDR or source IP ranges.
     * 
     */
    private final @Nullable List<AddressPrefixItemResponse> sources;

    @CustomType.Constructor
    private ActiveSecurityAdminRuleResponse(
        @CustomType.Parameter("access") String access,
        @CustomType.Parameter("commitTime") @Nullable String commitTime,
        @CustomType.Parameter("configurationDescription") @Nullable String configurationDescription,
        @CustomType.Parameter("configurationDisplayName") @Nullable String configurationDisplayName,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationPortRanges") @Nullable List<String> destinationPortRanges,
        @CustomType.Parameter("destinations") @Nullable List<AddressPrefixItemResponse> destinations,
        @CustomType.Parameter("direction") String direction,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("priority") @Nullable Integer priority,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("ruleCollectionAppliesToGroups") @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @CustomType.Parameter("ruleCollectionDescription") @Nullable String ruleCollectionDescription,
        @CustomType.Parameter("ruleCollectionDisplayName") @Nullable String ruleCollectionDisplayName,
        @CustomType.Parameter("ruleGroups") @Nullable List<ConfigurationGroupResponse> ruleGroups,
        @CustomType.Parameter("sourcePortRanges") @Nullable List<String> sourcePortRanges,
        @CustomType.Parameter("sources") @Nullable List<AddressPrefixItemResponse> sources) {
        this.access = access;
        this.commitTime = commitTime;
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = description;
        this.destinationPortRanges = destinationPortRanges;
        this.destinations = destinations;
        this.direction = direction;
        this.displayName = displayName;
        this.id = id;
        this.kind = kind;
        this.priority = priority;
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
     * Indicates the access allowed for this particular rule
     * 
    */
    public String access() {
        return this.access;
    }
    /**
     * Deployment time string.
     * 
    */
    public Optional<String> commitTime() {
        return Optional.ofNullable(this.commitTime);
    }
    /**
     * A description of the security admin configuration.
     * 
    */
    public Optional<String> configurationDescription() {
        return Optional.ofNullable(this.configurationDescription);
    }
    /**
     * A display name of the security admin configuration.
     * 
    */
    public Optional<String> configurationDisplayName() {
        return Optional.ofNullable(this.configurationDisplayName);
    }
    /**
     * A description for this rule. Restricted to 140 chars.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The destination port ranges.
     * 
    */
    public List<String> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }
    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
    */
    public List<AddressPrefixItemResponse> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
    */
    public String direction() {
        return this.direction;
    }
    /**
     * A friendly name for the rule.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Resource ID.
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Whether the rule is custom or default.
     * Expected value is &#39;Custom&#39;.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
    */
    public Optional<Integer> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Network protocol this rule applies to.
     * 
    */
    public String protocol() {
        return this.protocol;
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Deployment region.
     * 
    */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * Groups for rule collection
     * 
    */
    public List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }
    /**
     * A description of the rule collection.
     * 
    */
    public Optional<String> ruleCollectionDescription() {
        return Optional.ofNullable(this.ruleCollectionDescription);
    }
    /**
     * A display name of the rule collection.
     * 
    */
    public Optional<String> ruleCollectionDisplayName() {
        return Optional.ofNullable(this.ruleCollectionDisplayName);
    }
    /**
     * Effective configuration groups.
     * 
    */
    public List<ConfigurationGroupResponse> ruleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }
    /**
     * The source port ranges.
     * 
    */
    public List<String> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }
    /**
     * The CIDR or source IP ranges.
     * 
    */
    public List<AddressPrefixItemResponse> sources() {
        return this.sources == null ? List.of() : this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveSecurityAdminRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String access;
        private @Nullable String commitTime;
        private @Nullable String configurationDescription;
        private @Nullable String configurationDisplayName;
        private @Nullable String description;
        private @Nullable List<String> destinationPortRanges;
        private @Nullable List<AddressPrefixItemResponse> destinations;
        private String direction;
        private @Nullable String displayName;
        private @Nullable String id;
        private String kind;
        private @Nullable Integer priority;
        private String protocol;
        private String provisioningState;
        private @Nullable String region;
        private @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;
        private @Nullable String ruleCollectionDescription;
        private @Nullable String ruleCollectionDisplayName;
        private @Nullable List<ConfigurationGroupResponse> ruleGroups;
        private @Nullable List<String> sourcePortRanges;
        private @Nullable List<AddressPrefixItemResponse> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveSecurityAdminRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.commitTime = defaults.commitTime;
    	      this.configurationDescription = defaults.configurationDescription;
    	      this.configurationDisplayName = defaults.configurationDisplayName;
    	      this.description = defaults.description;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.destinations = defaults.destinations;
    	      this.direction = defaults.direction;
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.priority = defaults.priority;
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

        public Builder access(String access) {
            this.access = Objects.requireNonNull(access);
            return this;
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
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }
        public Builder destinationPortRanges(String... destinationPortRanges) {
            return destinationPortRanges(List.of(destinationPortRanges));
        }
        public Builder destinations(@Nullable List<AddressPrefixItemResponse> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(AddressPrefixItemResponse... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder direction(String direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
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
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
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
        public Builder sourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }
        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }
        public Builder sources(@Nullable List<AddressPrefixItemResponse> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(AddressPrefixItemResponse... sources) {
            return sources(List.of(sources));
        }        public ActiveSecurityAdminRuleResponse build() {
            return new ActiveSecurityAdminRuleResponse(access, commitTime, configurationDescription, configurationDisplayName, description, destinationPortRanges, destinations, direction, displayName, id, kind, priority, protocol, provisioningState, region, ruleCollectionAppliesToGroups, ruleCollectionDescription, ruleCollectionDisplayName, ruleGroups, sourcePortRanges, sources);
        }
    }
}
