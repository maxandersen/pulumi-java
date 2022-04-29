// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.enums.FirewallPolicyRuleConditionNetworkProtocol;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule condition of type network.
 * 
 */
public final class NetworkRuleConditionArgs extends ResourceArgs {

    public static final NetworkRuleConditionArgs Empty = new NetworkRuleConditionArgs();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the rule condition.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
    private @Nullable Output<List<String>> destinationAddresses;

    /**
     * @return List of destination IP addresses or Service Tags.
     * 
     */
    public Optional<Output<List<String>>> destinationAddresses() {
        return Optional.ofNullable(this.destinationAddresses);
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
    private @Nullable Output<List<String>> destinationIpGroups;

    /**
     * @return List of destination IpGroups for this rule.
     * 
     */
    public Optional<Output<List<String>>> destinationIpGroups() {
        return Optional.ofNullable(this.destinationIpGroups);
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
    private @Nullable Output<List<String>> destinationPorts;

    /**
     * @return List of destination ports.
     * 
     */
    public Optional<Output<List<String>>> destinationPorts() {
        return Optional.ofNullable(this.destinationPorts);
    }

    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
    private @Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols;

    /**
     * @return Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    public Optional<Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>>> ipProtocols() {
        return Optional.ofNullable(this.ipProtocols);
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the rule condition.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Rule Condition Type.
     * Expected value is &#39;NetworkRuleCondition&#39;.
     * 
     */
    @Import(name="ruleConditionType", required=true)
    private Output<String> ruleConditionType;

    /**
     * @return Rule Condition Type.
     * Expected value is &#39;NetworkRuleCondition&#39;.
     * 
     */
    public Output<String> ruleConditionType() {
        return this.ruleConditionType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
    private @Nullable Output<List<String>> sourceAddresses;

    /**
     * @return List of source IP addresses for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceAddresses() {
        return Optional.ofNullable(this.sourceAddresses);
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
    private @Nullable Output<List<String>> sourceIpGroups;

    /**
     * @return List of source IpGroups for this rule.
     * 
     */
    public Optional<Output<List<String>>> sourceIpGroups() {
        return Optional.ofNullable(this.sourceIpGroups);
    }

    private NetworkRuleConditionArgs() {}

    private NetworkRuleConditionArgs(NetworkRuleConditionArgs $) {
        this.description = $.description;
        this.destinationAddresses = $.destinationAddresses;
        this.destinationIpGroups = $.destinationIpGroups;
        this.destinationPorts = $.destinationPorts;
        this.ipProtocols = $.ipProtocols;
        this.name = $.name;
        this.ruleConditionType = $.ruleConditionType;
        this.sourceAddresses = $.sourceAddresses;
        this.sourceIpGroups = $.sourceIpGroups;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkRuleConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkRuleConditionArgs $;

        public Builder() {
            $ = new NetworkRuleConditionArgs();
        }

        public Builder(NetworkRuleConditionArgs defaults) {
            $ = new NetworkRuleConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(@Nullable Output<List<String>> destinationAddresses) {
            $.destinationAddresses = destinationAddresses;
            return this;
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(List<String> destinationAddresses) {
            return destinationAddresses(Output.of(destinationAddresses));
        }

        /**
         * @param destinationAddresses List of destination IP addresses or Service Tags.
         * 
         * @return builder
         * 
         */
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }

        /**
         * @param destinationIpGroups List of destination IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpGroups(@Nullable Output<List<String>> destinationIpGroups) {
            $.destinationIpGroups = destinationIpGroups;
            return this;
        }

        /**
         * @param destinationIpGroups List of destination IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpGroups(List<String> destinationIpGroups) {
            return destinationIpGroups(Output.of(destinationIpGroups));
        }

        /**
         * @param destinationIpGroups List of destination IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(@Nullable Output<List<String>> destinationPorts) {
            $.destinationPorts = destinationPorts;
            return this;
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(List<String> destinationPorts) {
            return destinationPorts(Output.of(destinationPorts));
        }

        /**
         * @param destinationPorts List of destination ports.
         * 
         * @return builder
         * 
         */
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }

        /**
         * @param ipProtocols Array of FirewallPolicyRuleConditionNetworkProtocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(@Nullable Output<List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>>> ipProtocols) {
            $.ipProtocols = ipProtocols;
            return this;
        }

        /**
         * @param ipProtocols Array of FirewallPolicyRuleConditionNetworkProtocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(List<Either<String,FirewallPolicyRuleConditionNetworkProtocol>> ipProtocols) {
            return ipProtocols(Output.of(ipProtocols));
        }

        /**
         * @param ipProtocols Array of FirewallPolicyRuleConditionNetworkProtocols.
         * 
         * @return builder
         * 
         */
        public Builder ipProtocols(Either<String,FirewallPolicyRuleConditionNetworkProtocol>... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }

        /**
         * @param name Name of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the rule condition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ruleConditionType Rule Condition Type.
         * Expected value is &#39;NetworkRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(Output<String> ruleConditionType) {
            $.ruleConditionType = ruleConditionType;
            return this;
        }

        /**
         * @param ruleConditionType Rule Condition Type.
         * Expected value is &#39;NetworkRuleCondition&#39;.
         * 
         * @return builder
         * 
         */
        public Builder ruleConditionType(String ruleConditionType) {
            return ruleConditionType(Output.of(ruleConditionType));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(@Nullable Output<List<String>> sourceAddresses) {
            $.sourceAddresses = sourceAddresses;
            return this;
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(List<String> sourceAddresses) {
            return sourceAddresses(Output.of(sourceAddresses));
        }

        /**
         * @param sourceAddresses List of source IP addresses for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(@Nullable Output<List<String>> sourceIpGroups) {
            $.sourceIpGroups = sourceIpGroups;
            return this;
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(List<String> sourceIpGroups) {
            return sourceIpGroups(Output.of(sourceIpGroups));
        }

        /**
         * @param sourceIpGroups List of source IpGroups for this rule.
         * 
         * @return builder
         * 
         */
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }

        public NetworkRuleConditionArgs build() {
            $.ruleConditionType = Codegen.stringProp("ruleConditionType").output().arg($.ruleConditionType).require();
            return $;
        }
    }

}
