// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.FirewallPolicyRuleMatchLayer4ConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyRuleMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyRuleMatchArgs Empty = new FirewallPolicyRuleMatchArgs();

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 256.
     * 
     */
    @Import(name="destIpRanges")
    private @Nullable Output<List<String>> destIpRanges;

    public Optional<Output<List<String>>> destIpRanges() {
        return Optional.ofNullable(this.destIpRanges);
    }

    /**
     * Pairs of IP protocols and ports that the rule should match. Structure is documented below.
     * 
     */
    @Import(name="layer4Configs", required=true)
    private Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs;

    public Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs() {
        return this.layer4Configs;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 256.
     * 
     */
    @Import(name="srcIpRanges")
    private @Nullable Output<List<String>> srcIpRanges;

    public Optional<Output<List<String>>> srcIpRanges() {
        return Optional.ofNullable(this.srcIpRanges);
    }

    private FirewallPolicyRuleMatchArgs() {}

    private FirewallPolicyRuleMatchArgs(FirewallPolicyRuleMatchArgs $) {
        this.destIpRanges = $.destIpRanges;
        this.layer4Configs = $.layer4Configs;
        this.srcIpRanges = $.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FirewallPolicyRuleMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyRuleMatchArgs $;

        public Builder() {
            $ = new FirewallPolicyRuleMatchArgs();
        }

        public Builder(FirewallPolicyRuleMatchArgs defaults) {
            $ = new FirewallPolicyRuleMatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder destIpRanges(@Nullable Output<List<String>> destIpRanges) {
            $.destIpRanges = destIpRanges;
            return this;
        }

        public Builder destIpRanges(List<String> destIpRanges) {
            return destIpRanges(Output.of(destIpRanges));
        }

        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }

        public Builder layer4Configs(Output<List<FirewallPolicyRuleMatchLayer4ConfigArgs>> layer4Configs) {
            $.layer4Configs = layer4Configs;
            return this;
        }

        public Builder layer4Configs(List<FirewallPolicyRuleMatchLayer4ConfigArgs> layer4Configs) {
            return layer4Configs(Output.of(layer4Configs));
        }

        public Builder layer4Configs(FirewallPolicyRuleMatchLayer4ConfigArgs... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }

        public Builder srcIpRanges(@Nullable Output<List<String>> srcIpRanges) {
            $.srcIpRanges = srcIpRanges;
            return this;
        }

        public Builder srcIpRanges(List<String> srcIpRanges) {
            return srcIpRanges(Output.of(srcIpRanges));
        }

        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }

        public FirewallPolicyRuleMatchArgs build() {
            $.layer4Configs = Objects.requireNonNull($.layer4Configs, "expected parameter 'layer4Configs' to be non-null");
            return $;
        }
    }

}
