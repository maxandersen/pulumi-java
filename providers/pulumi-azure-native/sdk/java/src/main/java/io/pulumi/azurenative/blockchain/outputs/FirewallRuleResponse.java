// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.blockchain.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FirewallRuleResponse {
    /**
     * Gets or sets the end IP address of the firewall rule range.
     * 
     */
    private final @Nullable String endIpAddress;
    /**
     * Gets or sets the name of the firewall rules.
     * 
     */
    private final @Nullable String ruleName;
    /**
     * Gets or sets the start IP address of the firewall rule range.
     * 
     */
    private final @Nullable String startIpAddress;

    @CustomType.Constructor
    private FirewallRuleResponse(
        @CustomType.Parameter("endIpAddress") @Nullable String endIpAddress,
        @CustomType.Parameter("ruleName") @Nullable String ruleName,
        @CustomType.Parameter("startIpAddress") @Nullable String startIpAddress) {
        this.endIpAddress = endIpAddress;
        this.ruleName = ruleName;
        this.startIpAddress = startIpAddress;
    }

    /**
     * Gets or sets the end IP address of the firewall rule range.
     * 
    */
    public Optional<String> endIpAddress() {
        return Optional.ofNullable(this.endIpAddress);
    }
    /**
     * Gets or sets the name of the firewall rules.
     * 
    */
    public Optional<String> ruleName() {
        return Optional.ofNullable(this.ruleName);
    }
    /**
     * Gets or sets the start IP address of the firewall rule range.
     * 
    */
    public Optional<String> startIpAddress() {
        return Optional.ofNullable(this.startIpAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endIpAddress;
        private @Nullable String ruleName;
        private @Nullable String startIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endIpAddress = defaults.endIpAddress;
    	      this.ruleName = defaults.ruleName;
    	      this.startIpAddress = defaults.startIpAddress;
        }

        public Builder endIpAddress(@Nullable String endIpAddress) {
            this.endIpAddress = endIpAddress;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder startIpAddress(@Nullable String startIpAddress) {
            this.startIpAddress = startIpAddress;
            return this;
        }        public FirewallRuleResponse build() {
            return new FirewallRuleResponse(endIpAddress, ruleName, startIpAddress);
        }
    }
}
