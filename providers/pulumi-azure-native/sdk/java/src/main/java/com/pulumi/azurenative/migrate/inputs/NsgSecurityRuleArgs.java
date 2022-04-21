// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Security Rule data model for Network Security Groups.
 * 
 */
public final class NsgSecurityRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NsgSecurityRuleArgs Empty = new NsgSecurityRuleArgs();

    /**
     * Gets or sets whether network traffic is allowed or denied.
     * Possible values are “Allow” and “Deny”.
     * 
     */
    @Import(name="access")
    private @Nullable Output<String> access;

    public Optional<Output<String>> access() {
        return Optional.ofNullable(this.access);
    }

    /**
     * Gets or sets a description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Gets or sets destination address prefix. CIDR or source IP range.
     *  A “*” can also be used to match all source IPs. Default tags such
     * as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used.
     * 
     */
    @Import(name="destinationAddressPrefix")
    private @Nullable Output<String> destinationAddressPrefix;

    public Optional<Output<String>> destinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }

    /**
     * Gets or sets Destination Port or Range. Integer or range between
     * 0 and 65535. A “*” can also be used to match all ports.
     * 
     */
    @Import(name="destinationPortRange")
    private @Nullable Output<String> destinationPortRange;

    public Optional<Output<String>> destinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }

    /**
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @Import(name="direction")
    private @Nullable Output<String> direction;

    public Optional<Output<String>> direction() {
        return Optional.ofNullable(this.direction);
    }

    /**
     * Gets or sets the Security rule name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Gets or sets the priority of the rule. The value can be between
     * 100 and 4096. The priority number must be unique for each rule in the collection.
     * The lower the priority number, the higher the priority of the rule.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     * 
     */
    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    /**
     * Gets or sets source address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs.  Default tags such as ‘VirtualNetwork’,
     * ‘AzureLoadBalancer’ and ‘Internet’ can also be used. If this is an ingress
     * rule, specifies where network traffic originates from.
     * 
     */
    @Import(name="sourceAddressPrefix")
    private @Nullable Output<String> sourceAddressPrefix;

    public Optional<Output<String>> sourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }

    /**
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     * 
     */
    @Import(name="sourcePortRange")
    private @Nullable Output<String> sourcePortRange;

    public Optional<Output<String>> sourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    private NsgSecurityRuleArgs() {}

    private NsgSecurityRuleArgs(NsgSecurityRuleArgs $) {
        this.access = $.access;
        this.description = $.description;
        this.destinationAddressPrefix = $.destinationAddressPrefix;
        this.destinationPortRange = $.destinationPortRange;
        this.direction = $.direction;
        this.name = $.name;
        this.priority = $.priority;
        this.protocol = $.protocol;
        this.sourceAddressPrefix = $.sourceAddressPrefix;
        this.sourcePortRange = $.sourcePortRange;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NsgSecurityRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NsgSecurityRuleArgs $;

        public Builder() {
            $ = new NsgSecurityRuleArgs();
        }

        public Builder(NsgSecurityRuleArgs defaults) {
            $ = new NsgSecurityRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder access(@Nullable Output<String> access) {
            $.access = access;
            return this;
        }

        public Builder access(String access) {
            return access(Output.of(access));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder destinationAddressPrefix(@Nullable Output<String> destinationAddressPrefix) {
            $.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder destinationAddressPrefix(String destinationAddressPrefix) {
            return destinationAddressPrefix(Output.of(destinationAddressPrefix));
        }

        public Builder destinationPortRange(@Nullable Output<String> destinationPortRange) {
            $.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder destinationPortRange(String destinationPortRange) {
            return destinationPortRange(Output.of(destinationPortRange));
        }

        public Builder direction(@Nullable Output<String> direction) {
            $.direction = direction;
            return this;
        }

        public Builder direction(String direction) {
            return direction(Output.of(direction));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder sourceAddressPrefix(@Nullable Output<String> sourceAddressPrefix) {
            $.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            return sourceAddressPrefix(Output.of(sourceAddressPrefix));
        }

        public Builder sourcePortRange(@Nullable Output<String> sourcePortRange) {
            $.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder sourcePortRange(String sourcePortRange) {
            return sourcePortRange(Output.of(sourcePortRange));
        }

        public NsgSecurityRuleArgs build() {
            return $;
        }
    }

}
