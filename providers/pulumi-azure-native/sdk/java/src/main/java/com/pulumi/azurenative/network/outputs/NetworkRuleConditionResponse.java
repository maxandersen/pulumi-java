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
public final class NetworkRuleConditionResponse {
    /**
     * Description of the rule condition.
     * 
     */
    private final @Nullable String description;
    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * List of destination IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> destinationIpGroups;
    /**
     * List of destination ports.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    private final @Nullable List<String> ipProtocols;
    /**
     * Name of the rule condition.
     * 
     */
    private final @Nullable String name;
    /**
     * Rule Condition Type.
     * Expected value is &#39;NetworkRuleCondition&#39;.
     * 
     */
    private final String ruleConditionType;
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

    @CustomType.Constructor
    private NetworkRuleConditionResponse(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("destinationAddresses") @Nullable List<String> destinationAddresses,
        @CustomType.Parameter("destinationIpGroups") @Nullable List<String> destinationIpGroups,
        @CustomType.Parameter("destinationPorts") @Nullable List<String> destinationPorts,
        @CustomType.Parameter("ipProtocols") @Nullable List<String> ipProtocols,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("ruleConditionType") String ruleConditionType,
        @CustomType.Parameter("sourceAddresses") @Nullable List<String> sourceAddresses,
        @CustomType.Parameter("sourceIpGroups") @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = ruleConditionType;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    /**
     * Description of the rule condition.
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
     * List of destination IpGroups for this rule.
     * 
    */
    public List<String> destinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }
    /**
     * List of destination ports.
     * 
    */
    public List<String> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
    */
    public List<String> ipProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }
    /**
     * Name of the rule condition.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Rule Condition Type.
     * Expected value is &#39;NetworkRuleCondition&#39;.
     * 
    */
    public String ruleConditionType() {
        return this.ruleConditionType;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleConditionType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
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
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
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
        public Builder ruleConditionType(String ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
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
        }        public NetworkRuleConditionResponse build() {
            return new NetworkRuleConditionResponse(description, destinationAddresses, destinationIpGroups, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
