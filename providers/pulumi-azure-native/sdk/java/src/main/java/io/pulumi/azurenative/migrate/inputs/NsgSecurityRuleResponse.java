// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Security Rule data model for Network Security Groups.
 * 
 */
public final class NsgSecurityRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final NsgSecurityRuleResponse Empty = new NsgSecurityRuleResponse();

    /**
     * Gets or sets whether network traffic is allowed or denied.
     * Possible values are “Allow” and “Deny”.
     * 
     */
    @Import(name="access")
      private final @Nullable String access;

    public Optional<String> access() {
        return this.access == null ? Optional.empty() : Optional.ofNullable(this.access);
    }

    /**
     * Gets or sets a description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets destination address prefix. CIDR or source IP range.
     *  A “*” can also be used to match all source IPs. Default tags such
     * as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used.
     * 
     */
    @Import(name="destinationAddressPrefix")
      private final @Nullable String destinationAddressPrefix;

    public Optional<String> destinationAddressPrefix() {
        return this.destinationAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.destinationAddressPrefix);
    }

    /**
     * Gets or sets Destination Port or Range. Integer or range between
     * 0 and 65535. A “*” can also be used to match all ports.
     * 
     */
    @Import(name="destinationPortRange")
      private final @Nullable String destinationPortRange;

    public Optional<String> destinationPortRange() {
        return this.destinationPortRange == null ? Optional.empty() : Optional.ofNullable(this.destinationPortRange);
    }

    /**
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @Import(name="direction")
      private final @Nullable String direction;

    public Optional<String> direction() {
        return this.direction == null ? Optional.empty() : Optional.ofNullable(this.direction);
    }

    /**
     * Gets or sets the Security rule name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the priority of the rule. The value can be between
     * 100 and 4096. The priority number must be unique for each rule in the collection.
     * The lower the priority number, the higher the priority of the rule.
     * 
     */
    @Import(name="priority")
      private final @Nullable Integer priority;

    public Optional<Integer> priority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     * 
     */
    @Import(name="protocol")
      private final @Nullable String protocol;

    public Optional<String> protocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    /**
     * Gets or sets source address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs.  Default tags such as ‘VirtualNetwork’,
     * ‘AzureLoadBalancer’ and ‘Internet’ can also be used. If this is an ingress
     * rule, specifies where network traffic originates from.
     * 
     */
    @Import(name="sourceAddressPrefix")
      private final @Nullable String sourceAddressPrefix;

    public Optional<String> sourceAddressPrefix() {
        return this.sourceAddressPrefix == null ? Optional.empty() : Optional.ofNullable(this.sourceAddressPrefix);
    }

    /**
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     * 
     */
    @Import(name="sourcePortRange")
      private final @Nullable String sourcePortRange;

    public Optional<String> sourcePortRange() {
        return this.sourcePortRange == null ? Optional.empty() : Optional.ofNullable(this.sourcePortRange);
    }

    public NsgSecurityRuleResponse(
        @Nullable String access,
        @Nullable String description,
        @Nullable String destinationAddressPrefix,
        @Nullable String destinationPortRange,
        @Nullable String direction,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable String protocol,
        @Nullable String sourceAddressPrefix,
        @Nullable String sourcePortRange) {
        this.access = access;
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationPortRange = destinationPortRange;
        this.direction = direction;
        this.name = name;
        this.priority = priority;
        this.protocol = protocol;
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourcePortRange = sourcePortRange;
    }

    private NsgSecurityRuleResponse() {
        this.access = null;
        this.description = null;
        this.destinationAddressPrefix = null;
        this.destinationPortRange = null;
        this.direction = null;
        this.name = null;
        this.priority = null;
        this.protocol = null;
        this.sourceAddressPrefix = null;
        this.sourcePortRange = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsgSecurityRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable String destinationPortRange;
        private @Nullable String direction;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable String protocol;
        private @Nullable String sourceAddressPrefix;
        private @Nullable String sourcePortRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NsgSecurityRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourcePortRange = defaults.sourcePortRange;
        }

        public Builder access(@Nullable String access) {
            this.access = access;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }
        public Builder destinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder priority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }
        public Builder sourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }        public NsgSecurityRuleResponse build() {
            return new NsgSecurityRuleResponse(access, description, destinationAddressPrefix, destinationPortRange, direction, name, priority, protocol, sourceAddressPrefix, sourcePortRange);
        }
    }
}
