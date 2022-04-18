// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.AddressPrefixItemResponse;
import com.pulumi.azurenative.network.inputs.ConfigurationGroupResponse;
import com.pulumi.azurenative.network.inputs.NetworkManagerSecurityGroupItemResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Network admin rule.
 * 
 */
public final class ActiveSecurityAdminRuleResponse extends com.pulumi.resources.InvokeArgs {

    public static final ActiveSecurityAdminRuleResponse Empty = new ActiveSecurityAdminRuleResponse();

    /**
     * Indicates the access allowed for this particular rule
     * 
     */
    @Import(name="access", required=true)
      private final String access;

    public String access() {
        return this.access;
    }

    /**
     * Deployment time string.
     * 
     */
    @Import(name="commitTime")
      private final @Nullable String commitTime;

    public Optional<String> commitTime() {
        return this.commitTime == null ? Optional.empty() : Optional.ofNullable(this.commitTime);
    }

    /**
     * A description of the security admin configuration.
     * 
     */
    @Import(name="configurationDescription")
      private final @Nullable String configurationDescription;

    public Optional<String> configurationDescription() {
        return this.configurationDescription == null ? Optional.empty() : Optional.ofNullable(this.configurationDescription);
    }

    /**
     * A display name of the security admin configuration.
     * 
     */
    @Import(name="configurationDisplayName")
      private final @Nullable String configurationDisplayName;

    public Optional<String> configurationDisplayName() {
        return this.configurationDisplayName == null ? Optional.empty() : Optional.ofNullable(this.configurationDisplayName);
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The destination port ranges.
     * 
     */
    @Import(name="destinationPortRanges")
      private final @Nullable List<String> destinationPortRanges;

    public List<String> destinationPortRanges() {
        return this.destinationPortRanges == null ? List.of() : this.destinationPortRanges;
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @Import(name="destinations")
      private final @Nullable List<AddressPrefixItemResponse> destinations;

    public List<AddressPrefixItemResponse> destinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }

    /**
     * Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     */
    @Import(name="direction", required=true)
      private final String direction;

    public String direction() {
        return this.direction;
    }

    /**
     * A friendly name for the rule.
     * 
     */
    @Import(name="displayName")
      private final @Nullable String displayName;

    public Optional<String> displayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
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
     * Whether the rule is custom or default.
     * Expected value is 'Custom'.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The priority of the rule. The value can be between 1 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> priority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @Import(name="protocol", required=true)
      private final String protocol;

    public String protocol() {
        return this.protocol;
    }

    /**
     * The provisioning state of the resource.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Deployment region.
     * 
     */
    @Import(name="region")
      private final @Nullable String region;

    public Optional<String> region() {
        return this.region == null ? Optional.empty() : Optional.ofNullable(this.region);
    }

    /**
     * Groups for rule collection
     * 
     */
    @Import(name="ruleCollectionAppliesToGroups")
      private final @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups;

    public List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups() {
        return this.ruleCollectionAppliesToGroups == null ? List.of() : this.ruleCollectionAppliesToGroups;
    }

    /**
     * A description of the rule collection.
     * 
     */
    @Import(name="ruleCollectionDescription")
      private final @Nullable String ruleCollectionDescription;

    public Optional<String> ruleCollectionDescription() {
        return this.ruleCollectionDescription == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDescription);
    }

    /**
     * A display name of the rule collection.
     * 
     */
    @Import(name="ruleCollectionDisplayName")
      private final @Nullable String ruleCollectionDisplayName;

    public Optional<String> ruleCollectionDisplayName() {
        return this.ruleCollectionDisplayName == null ? Optional.empty() : Optional.ofNullable(this.ruleCollectionDisplayName);
    }

    /**
     * Effective configuration groups.
     * 
     */
    @Import(name="ruleGroups")
      private final @Nullable List<ConfigurationGroupResponse> ruleGroups;

    public List<ConfigurationGroupResponse> ruleGroups() {
        return this.ruleGroups == null ? List.of() : this.ruleGroups;
    }

    /**
     * The source port ranges.
     * 
     */
    @Import(name="sourcePortRanges")
      private final @Nullable List<String> sourcePortRanges;

    public List<String> sourcePortRanges() {
        return this.sourcePortRanges == null ? List.of() : this.sourcePortRanges;
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @Import(name="sources")
      private final @Nullable List<AddressPrefixItemResponse> sources;

    public List<AddressPrefixItemResponse> sources() {
        return this.sources == null ? List.of() : this.sources;
    }

    public ActiveSecurityAdminRuleResponse(
        String access,
        @Nullable String commitTime,
        @Nullable String configurationDescription,
        @Nullable String configurationDisplayName,
        @Nullable String description,
        @Nullable List<String> destinationPortRanges,
        @Nullable List<AddressPrefixItemResponse> destinations,
        String direction,
        @Nullable String displayName,
        @Nullable String id,
        String kind,
        @Nullable Integer priority,
        String protocol,
        String provisioningState,
        @Nullable String region,
        @Nullable List<NetworkManagerSecurityGroupItemResponse> ruleCollectionAppliesToGroups,
        @Nullable String ruleCollectionDescription,
        @Nullable String ruleCollectionDisplayName,
        @Nullable List<ConfigurationGroupResponse> ruleGroups,
        @Nullable List<String> sourcePortRanges,
        @Nullable List<AddressPrefixItemResponse> sources) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.commitTime = commitTime;
        this.configurationDescription = configurationDescription;
        this.configurationDisplayName = configurationDisplayName;
        this.description = description;
        this.destinationPortRanges = destinationPortRanges;
        this.destinations = destinations;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.displayName = displayName;
        this.id = id;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.priority = priority;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.region = region;
        this.ruleCollectionAppliesToGroups = ruleCollectionAppliesToGroups;
        this.ruleCollectionDescription = ruleCollectionDescription;
        this.ruleCollectionDisplayName = ruleCollectionDisplayName;
        this.ruleGroups = ruleGroups;
        this.sourcePortRanges = sourcePortRanges;
        this.sources = sources;
    }

    private ActiveSecurityAdminRuleResponse() {
        this.access = null;
        this.commitTime = null;
        this.configurationDescription = null;
        this.configurationDisplayName = null;
        this.description = null;
        this.destinationPortRanges = List.of();
        this.destinations = List.of();
        this.direction = null;
        this.displayName = null;
        this.id = null;
        this.kind = null;
        this.priority = null;
        this.protocol = null;
        this.provisioningState = null;
        this.region = null;
        this.ruleCollectionAppliesToGroups = List.of();
        this.ruleCollectionDescription = null;
        this.ruleCollectionDisplayName = null;
        this.ruleGroups = List.of();
        this.sourcePortRanges = List.of();
        this.sources = List.of();
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
