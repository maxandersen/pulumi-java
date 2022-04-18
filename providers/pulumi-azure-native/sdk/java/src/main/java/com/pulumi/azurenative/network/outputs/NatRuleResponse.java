// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NatRuleResponse {
    /**
     * Description of the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * List of destination ports.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
     */
    private final @Nullable List<String> ipProtocols;
    /**
     * Name of the rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Rule Type.
     * Expected value is 'NatRule'.
     * 
     */
    private final String ruleType;
    /**
     * List of source IP addresses for this rule.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * List of source IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;
    /**
     * The translated address for this NAT rule.
     * 
     */
    private final @Nullable String translatedAddress;
    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    private final @Nullable String translatedFqdn;
    /**
     * The translated port for this NAT rule.
     * 
     */
    private final @Nullable String translatedPort;

    @CustomType.Constructor
    private NatRuleResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @CustomType.Parameter("ipProtocols") @Nullable List<String> ipProtocols,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("ruleType") String ruleType,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups,
        @CustomType.Parameter("translatedAddress") @Nullable String translatedAddress,
        @CustomType.Parameter("translatedFqdn") @Nullable String translatedFqdn,
        @CustomType.Parameter("translatedPort") @Nullable String translatedPort) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleType = ruleType;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.translatedAddress = translatedAddress;
        this.translatedFqdn = translatedFqdn;
        this.translatedPort = translatedPort;
    }

    /**
     * Description of the rule.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of destination IP addresses or Service Tags.
     * 
    */
    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * List of destination ports.
     * 
    */
    public List<String> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * Array of FirewallPolicyRuleNetworkProtocols.
     * 
    */
    public List<String> ipProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }
    /**
     * Name of the rule.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Rule Type.
     * Expected value is 'NatRule'.
     * 
    */
    public String ruleType() {
        return this.ruleType;
    }
    /**
     * List of source IP addresses for this rule.
     * 
    */
    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * List of source IpGroups for this rule.
     * 
    */
    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }
    /**
     * The translated address for this NAT rule.
     * 
    */
    public Optional<String> translatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }
    /**
     * The translated FQDN for this NAT rule.
     * 
    */
    public Optional<String> translatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }
    /**
     * The translated port for this NAT rule.
     * 
    */
    public Optional<String> translatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable String translatedAddress;
        private @Nullable String translatedFqdn;
        private @Nullable String translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(NatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedFqdn = defaults.translatedFqdn;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }
        public Builder translatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }
        public Builder translatedFqdn(@Nullable String translatedFqdn) {
            this.translatedFqdn = translatedFqdn;
            return this;
        }
        public Builder translatedPort(@Nullable String translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }        public NatRuleResponse build() {
            return new NatRuleResponse(description, destinationAddresses, destinationPorts, ipProtocols, name, ruleType, sourceAddresses, sourceIpGroups, translatedAddress, translatedFqdn, translatedPort);
        }
    }
}
