// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.NetworkSecurityGroupRuleAccess;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkSecurityGroupRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkSecurityGroupRuleArgs Empty = new NetworkSecurityGroupRuleArgs();

    @Import(name="access", required=true)
    private Output<NetworkSecurityGroupRuleAccess> access;

    public Output<NetworkSecurityGroupRuleAccess> access() {
        return this.access;
    }

    /**
     * Priorities within a pool must be unique and are evaluated in order of priority. The lower the number the higher the priority. For example, rules could be specified with order numbers of 150, 250, and 350. The rule with the order number of 150 takes precedence over the rule that has an order of 250. Allowed priorities are 150 to 4096. If any reserved or duplicate values are provided the request fails with HTTP status code 400.
     * 
     */
    @Import(name="priority", required=true)
    private Output<Integer> priority;

    public Output<Integer> priority() {
        return this.priority;
    }

    /**
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e. 192.168.1.0/24), default tag, or * (for all addresses).  If any other values are provided the request fails with HTTP status code 400.
     * 
     */
    @Import(name="sourceAddressPrefix", required=true)
    private Output<String> sourceAddressPrefix;

    public Output<String> sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Valid values are &#39;*&#39; (for all ports 0 - 65535) or arrays of ports or port ranges (i.e. 100-200). The ports should in the range of 0 to 65535 and the port ranges or ports can&#39;t overlap. If any other values are provided the request fails with HTTP status code 400. Default value will be *.
     * 
     */
    @Import(name="sourcePortRanges")
    private @Nullable Output<List<String>> sourcePortRanges;

    public Optional<Output<List<String>>> sourcePortRanges() {
        return Optional.ofNullable(this.sourcePortRanges);
    }

    private NetworkSecurityGroupRuleArgs() {}

    private NetworkSecurityGroupRuleArgs(NetworkSecurityGroupRuleArgs $) {
        this.access = $.access;
        this.priority = $.priority;
        this.sourceAddressPrefix = $.sourceAddressPrefix;
        this.sourcePortRanges = $.sourcePortRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkSecurityGroupRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkSecurityGroupRuleArgs $;

        public Builder() {
            $ = new NetworkSecurityGroupRuleArgs();
        }

        public Builder(NetworkSecurityGroupRuleArgs defaults) {
            $ = new NetworkSecurityGroupRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder access(Output<NetworkSecurityGroupRuleAccess> access) {
            $.access = access;
            return this;
        }

        public Builder access(NetworkSecurityGroupRuleAccess access) {
            return access(Output.of(access));
        }

        public Builder priority(Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        public Builder sourceAddressPrefix(Output<String> sourceAddressPrefix) {
            $.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder sourceAddressPrefix(String sourceAddressPrefix) {
            return sourceAddressPrefix(Output.of(sourceAddressPrefix));
        }

        public Builder sourcePortRanges(@Nullable Output<List<String>> sourcePortRanges) {
            $.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public Builder sourcePortRanges(List<String> sourcePortRanges) {
            return sourcePortRanges(Output.of(sourcePortRanges));
        }

        public Builder sourcePortRanges(String... sourcePortRanges) {
            return sourcePortRanges(List.of(sourcePortRanges));
        }

        public NetworkSecurityGroupRuleArgs build() {
            $.access = Objects.requireNonNull($.access, "expected parameter 'access' to be non-null");
            $.priority = Objects.requireNonNull($.priority, "expected parameter 'priority' to be non-null");
            $.sourceAddressPrefix = Objects.requireNonNull($.sourceAddressPrefix, "expected parameter 'sourceAddressPrefix' to be non-null");
            return $;
        }
    }

}
