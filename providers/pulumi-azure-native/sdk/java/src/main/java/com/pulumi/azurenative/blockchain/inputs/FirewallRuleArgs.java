// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blockchain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Ip range for firewall rules
 * 
 */
public final class FirewallRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallRuleArgs Empty = new FirewallRuleArgs();

    /**
     * Gets or sets the end IP address of the firewall rule range.
     * 
     */
    @Import(name="endIpAddress")
    private @Nullable Output<String> endIpAddress;

    /**
     * @return Gets or sets the end IP address of the firewall rule range.
     * 
     */
    public Optional<Output<String>> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }

    /**
     * Gets or sets the name of the firewall rules.
     * 
     */
    @Import(name="ruleName")
    private @Nullable Output<String> ruleName;

    /**
     * @return Gets or sets the name of the firewall rules.
     * 
     */
    public Optional<Output<String>> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }

    /**
     * Gets or sets the start IP address of the firewall rule range.
     * 
     */
    @Import(name="startIpAddress")
    private @Nullable Output<String> startIpAddress;

    /**
     * @return Gets or sets the start IP address of the firewall rule range.
     * 
     */
    public Optional<Output<String>> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }

    private FirewallRuleArgs() {}

    private FirewallRuleArgs(FirewallRuleArgs $) {
        this.endIpAddress = $.endIpAddress;
        this.ruleName = $.ruleName;
        this.startIpAddress = $.startIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallRuleArgs $;

        public Builder() {
            $ = new FirewallRuleArgs();
        }

        public Builder(FirewallRuleArgs defaults) {
            $ = new FirewallRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endIpAddress Gets or sets the end IP address of the firewall rule range.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(@Nullable Output<String> endIpAddress) {
            $.endIpAddress = endIpAddress;
            return this;
        }

        /**
         * @param endIpAddress Gets or sets the end IP address of the firewall rule range.
         * 
         * @return builder
         * 
         */
        public Builder endIpAddress(String endIpAddress) {
            return endIpAddress(Output.of(endIpAddress));
        }

        /**
         * @param ruleName Gets or sets the name of the firewall rules.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(@Nullable Output<String> ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        /**
         * @param ruleName Gets or sets the name of the firewall rules.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            return ruleName(Output.of(ruleName));
        }

        /**
         * @param startIpAddress Gets or sets the start IP address of the firewall rule range.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(@Nullable Output<String> startIpAddress) {
            $.startIpAddress = startIpAddress;
            return this;
        }

        /**
         * @param startIpAddress Gets or sets the start IP address of the firewall rule range.
         * 
         * @return builder
         * 
         */
        public Builder startIpAddress(String startIpAddress) {
            return startIpAddress(Output.of(startIpAddress));
        }

        public FirewallRuleArgs build() {
            return $;
        }
    }

}
