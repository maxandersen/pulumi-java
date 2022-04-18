// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.FirewallPolicyRuleConditionApplicationProtocolResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule condition of type application.
 * 
 */
public final class ApplicationRuleConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApplicationRuleConditionResponse Empty = new ApplicationRuleConditionResponse();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
      private final @Nullable List<String> destinationAddresses;

    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    /**
     * List of FQDN Tags for this rule condition.
     * 
     */
    @Import(name="fqdnTags")
      private final @Nullable List<String> fqdnTags;

    public List<String> fqdnTags() {
        return this.fqdnTags == null ? List.of() : this.fqdnTags;
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Array of Application Protocols.
     * 
     */
    @Import(name="protocols")
      private final @Nullable List<FirewallPolicyRuleConditionApplicationProtocolResponse> protocols;

    public List<FirewallPolicyRuleConditionApplicationProtocolResponse> protocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }

    /**
     * Rule Condition Type.
     * Expected value is 'ApplicationRuleCondition'.
     * 
     */
    @Import(name="ruleConditionType", required=true)
      private final String ruleConditionType;

    public String ruleConditionType() {
        return this.ruleConditionType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable List<String> sourceAddresses;

    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable List<String> sourceIpGroups;

    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule condition.
     * 
     */
    @Import(name="targetFqdns")
      private final @Nullable List<String> targetFqdns;

    public List<String> targetFqdns() {
        return this.targetFqdns == null ? List.of() : this.targetFqdns;
    }

    public ApplicationRuleConditionResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> fqdnTags,
        @Nullable String name,
        @Nullable List<FirewallPolicyRuleConditionApplicationProtocolResponse> protocols,
        String ruleConditionType,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups,
        @Nullable List<String> targetFqdns) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.ruleConditionType = Objects.requireNonNull(ruleConditionType, "expected parameter 'ruleConditionType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
    }

    private ApplicationRuleConditionResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.fqdnTags = List.of();
        this.name = null;
        this.protocols = List.of();
        this.ruleConditionType = null;
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
        this.targetFqdns = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> fqdnTags;
        private @Nullable String name;
        private @Nullable List<FirewallPolicyRuleConditionApplicationProtocolResponse> protocols;
        private String ruleConditionType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable List<String> targetFqdns;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.ruleConditionType = defaults.ruleConditionType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
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
        public Builder fqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }
        public Builder fqdnTags(String... fqdnTags) {
            return fqdnTags(List.of(fqdnTags));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocols(@Nullable List<FirewallPolicyRuleConditionApplicationProtocolResponse> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(FirewallPolicyRuleConditionApplicationProtocolResponse... protocols) {
            return protocols(List.of(protocols));
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
        }
        public Builder targetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }
        public Builder targetFqdns(String... targetFqdns) {
            return targetFqdns(List.of(targetFqdns));
        }        public ApplicationRuleConditionResponse build() {
            return new ApplicationRuleConditionResponse(description, destinationAddresses, fqdnTags, name, protocols, ruleConditionType, sourceAddresses, sourceIpGroups, targetFqdns);
        }
    }
}
