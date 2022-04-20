// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleMatcherLayer4ConfigResponse;
import com.pulumi.googlenative.compute_alpha.inputs.FirewallPolicyRuleSecureTagResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a match condition that incoming traffic is evaluated against. Exactly one field must be specified.
 * 
 */
public final class FirewallPolicyRuleMatcherResponse extends com.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyRuleMatcherResponse Empty = new FirewallPolicyRuleMatcherResponse();

    /**
     * Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10.
     * 
     */
    @Import(name="destAddressGroups", required=true)
      private final List<String> destAddressGroups;

    public List<String> destAddressGroups() {
        return this.destAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic destination. Maximum number of destination fqdn allowed is 1000.
     * 
     */
    @Import(name="destFqdns", required=true)
      private final List<String> destFqdns;

    public List<String> destFqdns() {
        return this.destFqdns;
    }

    /**
     * CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="destIpRanges", required=true)
      private final List<String> destIpRanges;

    public List<String> destIpRanges() {
        return this.destIpRanges;
    }

    /**
     * Region codes whose IP addresses will be used to match for destination of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of dest region codes allowed is 5000.
     * 
     */
    @Import(name="destRegionCodes", required=true)
      private final List<String> destRegionCodes;

    public List<String> destRegionCodes() {
        return this.destRegionCodes;
    }

    /**
     * Pairs of IP protocols and ports that the rule should match.
     * 
     */
    @Import(name="layer4Configs", required=true)
      private final List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;

    public List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs() {
        return this.layer4Configs;
    }

    /**
     * Address groups which should be matched against the traffic source. Maximum number of source address groups is 10.
     * 
     */
    @Import(name="srcAddressGroups", required=true)
      private final List<String> srcAddressGroups;

    public List<String> srcAddressGroups() {
        return this.srcAddressGroups;
    }

    /**
     * Fully Qualified Domain Name (FQDN) which should be matched against traffic source. Maximum number of source fqdn allowed is 1000.
     * 
     */
    @Import(name="srcFqdns", required=true)
      private final List<String> srcFqdns;

    public List<String> srcFqdns() {
        return this.srcFqdns;
    }

    /**
     * CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
     * 
     */
    @Import(name="srcIpRanges", required=true)
      private final List<String> srcIpRanges;

    public List<String> srcIpRanges() {
        return this.srcIpRanges;
    }

    /**
     * Region codes whose IP addresses will be used to match for source of traffic. Should be specified as 2 letter country code defined as per ISO 3166 alpha-2 country codes. ex.&#34;US&#34; Maximum number of source region codes allowed is 5000.
     * 
     */
    @Import(name="srcRegionCodes", required=true)
      private final List<String> srcRegionCodes;

    public List<String> srcRegionCodes() {
        return this.srcRegionCodes;
    }

    /**
     * List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the srcSecureTag are INEFFECTIVE, and there is no srcIpRange, this rule will be ignored. Maximum number of source tag values allowed is 256.
     * 
     */
    @Import(name="srcSecureTags", required=true)
      private final List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

    public List<FirewallPolicyRuleSecureTagResponse> srcSecureTags() {
        return this.srcSecureTags;
    }

    public FirewallPolicyRuleMatcherResponse(
        List<String> destAddressGroups,
        List<String> destFqdns,
        List<String> destIpRanges,
        List<String> destRegionCodes,
        List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs,
        List<String> srcAddressGroups,
        List<String> srcFqdns,
        List<String> srcIpRanges,
        List<String> srcRegionCodes,
        List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
        this.destAddressGroups = Objects.requireNonNull(destAddressGroups, "expected parameter 'destAddressGroups' to be non-null");
        this.destFqdns = Objects.requireNonNull(destFqdns, "expected parameter 'destFqdns' to be non-null");
        this.destIpRanges = Objects.requireNonNull(destIpRanges, "expected parameter 'destIpRanges' to be non-null");
        this.destRegionCodes = Objects.requireNonNull(destRegionCodes, "expected parameter 'destRegionCodes' to be non-null");
        this.layer4Configs = Objects.requireNonNull(layer4Configs, "expected parameter 'layer4Configs' to be non-null");
        this.srcAddressGroups = Objects.requireNonNull(srcAddressGroups, "expected parameter 'srcAddressGroups' to be non-null");
        this.srcFqdns = Objects.requireNonNull(srcFqdns, "expected parameter 'srcFqdns' to be non-null");
        this.srcIpRanges = Objects.requireNonNull(srcIpRanges, "expected parameter 'srcIpRanges' to be non-null");
        this.srcRegionCodes = Objects.requireNonNull(srcRegionCodes, "expected parameter 'srcRegionCodes' to be non-null");
        this.srcSecureTags = Objects.requireNonNull(srcSecureTags, "expected parameter 'srcSecureTags' to be non-null");
    }

    private FirewallPolicyRuleMatcherResponse() {
        this.destAddressGroups = List.of();
        this.destFqdns = List.of();
        this.destIpRanges = List.of();
        this.destRegionCodes = List.of();
        this.layer4Configs = List.of();
        this.srcAddressGroups = List.of();
        this.srcFqdns = List.of();
        this.srcIpRanges = List.of();
        this.srcRegionCodes = List.of();
        this.srcSecureTags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyRuleMatcherResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> destAddressGroups;
        private List<String> destFqdns;
        private List<String> destIpRanges;
        private List<String> destRegionCodes;
        private List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs;
        private List<String> srcAddressGroups;
        private List<String> srcFqdns;
        private List<String> srcIpRanges;
        private List<String> srcRegionCodes;
        private List<FirewallPolicyRuleSecureTagResponse> srcSecureTags;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyRuleMatcherResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destAddressGroups = defaults.destAddressGroups;
    	      this.destFqdns = defaults.destFqdns;
    	      this.destIpRanges = defaults.destIpRanges;
    	      this.destRegionCodes = defaults.destRegionCodes;
    	      this.layer4Configs = defaults.layer4Configs;
    	      this.srcAddressGroups = defaults.srcAddressGroups;
    	      this.srcFqdns = defaults.srcFqdns;
    	      this.srcIpRanges = defaults.srcIpRanges;
    	      this.srcRegionCodes = defaults.srcRegionCodes;
    	      this.srcSecureTags = defaults.srcSecureTags;
        }

        public Builder destAddressGroups(List<String> destAddressGroups) {
            this.destAddressGroups = Objects.requireNonNull(destAddressGroups);
            return this;
        }
        public Builder destAddressGroups(String... destAddressGroups) {
            return destAddressGroups(List.of(destAddressGroups));
        }
        public Builder destFqdns(List<String> destFqdns) {
            this.destFqdns = Objects.requireNonNull(destFqdns);
            return this;
        }
        public Builder destFqdns(String... destFqdns) {
            return destFqdns(List.of(destFqdns));
        }
        public Builder destIpRanges(List<String> destIpRanges) {
            this.destIpRanges = Objects.requireNonNull(destIpRanges);
            return this;
        }
        public Builder destIpRanges(String... destIpRanges) {
            return destIpRanges(List.of(destIpRanges));
        }
        public Builder destRegionCodes(List<String> destRegionCodes) {
            this.destRegionCodes = Objects.requireNonNull(destRegionCodes);
            return this;
        }
        public Builder destRegionCodes(String... destRegionCodes) {
            return destRegionCodes(List.of(destRegionCodes));
        }
        public Builder layer4Configs(List<FirewallPolicyRuleMatcherLayer4ConfigResponse> layer4Configs) {
            this.layer4Configs = Objects.requireNonNull(layer4Configs);
            return this;
        }
        public Builder layer4Configs(FirewallPolicyRuleMatcherLayer4ConfigResponse... layer4Configs) {
            return layer4Configs(List.of(layer4Configs));
        }
        public Builder srcAddressGroups(List<String> srcAddressGroups) {
            this.srcAddressGroups = Objects.requireNonNull(srcAddressGroups);
            return this;
        }
        public Builder srcAddressGroups(String... srcAddressGroups) {
            return srcAddressGroups(List.of(srcAddressGroups));
        }
        public Builder srcFqdns(List<String> srcFqdns) {
            this.srcFqdns = Objects.requireNonNull(srcFqdns);
            return this;
        }
        public Builder srcFqdns(String... srcFqdns) {
            return srcFqdns(List.of(srcFqdns));
        }
        public Builder srcIpRanges(List<String> srcIpRanges) {
            this.srcIpRanges = Objects.requireNonNull(srcIpRanges);
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }
        public Builder srcRegionCodes(List<String> srcRegionCodes) {
            this.srcRegionCodes = Objects.requireNonNull(srcRegionCodes);
            return this;
        }
        public Builder srcRegionCodes(String... srcRegionCodes) {
            return srcRegionCodes(List.of(srcRegionCodes));
        }
        public Builder srcSecureTags(List<FirewallPolicyRuleSecureTagResponse> srcSecureTags) {
            this.srcSecureTags = Objects.requireNonNull(srcSecureTags);
            return this;
        }
        public Builder srcSecureTags(FirewallPolicyRuleSecureTagResponse... srcSecureTags) {
            return srcSecureTags(List.of(srcSecureTags));
        }        public FirewallPolicyRuleMatcherResponse build() {
            return new FirewallPolicyRuleMatcherResponse(destAddressGroups, destFqdns, destIpRanges, destRegionCodes, layer4Configs, srcAddressGroups, srcFqdns, srcIpRanges, srcRegionCodes, srcSecureTags);
        }
    }
}
