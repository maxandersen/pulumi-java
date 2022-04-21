// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicConditionDevicePolicyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessLevelsAccessLevelBasicConditionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccessLevelsAccessLevelBasicConditionGetArgs Empty = new AccessLevelsAccessLevelBasicConditionGetArgs();

    /**
     * Device specific restrictions, all restrictions must hold for
     * the Condition to be true. If not specified, all devices are
     * allowed.
     * Structure is documented below.
     * 
     */
    @Import(name="devicePolicy")
    private @Nullable Output<AccessLevelsAccessLevelBasicConditionDevicePolicyGetArgs> devicePolicy;

    public Optional<Output<AccessLevelsAccessLevelBasicConditionDevicePolicyGetArgs>> devicePolicy() {
        return Optional.ofNullable(this.devicePolicy);
    }

    /**
     * A list of CIDR block IP subnetwork specification. May be IPv4
     * or IPv6.
     * Note that for a CIDR IP address block, the specified IP address
     * portion must be properly truncated (i.e. all the host bits must
     * be zero) or the input is considered malformed. For example,
     * &#34;192.0.2.0/24&#34; is accepted but &#34;192.0.2.1/24&#34; is not. Similarly,
     * for IPv6, &#34;2001:db8::/32&#34; is accepted whereas &#34;2001:db8::1/32&#34;
     * is not. The originating IP of a request must be in one of the
     * listed subnets in order for this Condition to be true.
     * If empty, all IP addresses are allowed.
     * 
     */
    @Import(name="ipSubnetworks")
    private @Nullable Output<List<String>> ipSubnetworks;

    public Optional<Output<List<String>>> ipSubnetworks() {
        return Optional.ofNullable(this.ipSubnetworks);
    }

    /**
     * An allowed list of members (users, service accounts).
     * Using groups is not supported yet.
     * The signed-in user originating the request must be a part of one
     * of the provided members. If not specified, a request may come
     * from any user (logged in/not logged in, not present in any
     * groups, etc.).
     * Formats: `user:{emailid}`, `serviceAccount:{emailid}`
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<String>> members;

    public Optional<Output<List<String>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * Whether to negate the Condition. If true, the Condition becomes
     * a NAND over its non-empty fields, each field must be false for
     * the Condition overall to be satisfied. Defaults to false.
     * 
     */
    @Import(name="negate")
    private @Nullable Output<Boolean> negate;

    public Optional<Output<Boolean>> negate() {
        return Optional.ofNullable(this.negate);
    }

    /**
     * The request must originate from one of the provided
     * countries/regions.
     * Format: A valid ISO 3166-1 alpha-2 code.
     * 
     */
    @Import(name="regions")
    private @Nullable Output<List<String>> regions;

    public Optional<Output<List<String>>> regions() {
        return Optional.ofNullable(this.regions);
    }

    /**
     * A list of other access levels defined in the same Policy,
     * referenced by resource name. Referencing an AccessLevel which
     * does not exist is an error. All access levels listed must be
     * granted for the Condition to be true.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Import(name="requiredAccessLevels")
    private @Nullable Output<List<String>> requiredAccessLevels;

    public Optional<Output<List<String>>> requiredAccessLevels() {
        return Optional.ofNullable(this.requiredAccessLevels);
    }

    private AccessLevelsAccessLevelBasicConditionGetArgs() {}

    private AccessLevelsAccessLevelBasicConditionGetArgs(AccessLevelsAccessLevelBasicConditionGetArgs $) {
        this.devicePolicy = $.devicePolicy;
        this.ipSubnetworks = $.ipSubnetworks;
        this.members = $.members;
        this.negate = $.negate;
        this.regions = $.regions;
        this.requiredAccessLevels = $.requiredAccessLevels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessLevelsAccessLevelBasicConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessLevelsAccessLevelBasicConditionGetArgs $;

        public Builder() {
            $ = new AccessLevelsAccessLevelBasicConditionGetArgs();
        }

        public Builder(AccessLevelsAccessLevelBasicConditionGetArgs defaults) {
            $ = new AccessLevelsAccessLevelBasicConditionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder devicePolicy(@Nullable Output<AccessLevelsAccessLevelBasicConditionDevicePolicyGetArgs> devicePolicy) {
            $.devicePolicy = devicePolicy;
            return this;
        }

        public Builder devicePolicy(AccessLevelsAccessLevelBasicConditionDevicePolicyGetArgs devicePolicy) {
            return devicePolicy(Output.of(devicePolicy));
        }

        public Builder ipSubnetworks(@Nullable Output<List<String>> ipSubnetworks) {
            $.ipSubnetworks = ipSubnetworks;
            return this;
        }

        public Builder ipSubnetworks(List<String> ipSubnetworks) {
            return ipSubnetworks(Output.of(ipSubnetworks));
        }

        public Builder ipSubnetworks(String... ipSubnetworks) {
            return ipSubnetworks(List.of(ipSubnetworks));
        }

        public Builder members(@Nullable Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        public Builder negate(@Nullable Output<Boolean> negate) {
            $.negate = negate;
            return this;
        }

        public Builder negate(Boolean negate) {
            return negate(Output.of(negate));
        }

        public Builder regions(@Nullable Output<List<String>> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(List<String> regions) {
            return regions(Output.of(regions));
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder requiredAccessLevels(@Nullable Output<List<String>> requiredAccessLevels) {
            $.requiredAccessLevels = requiredAccessLevels;
            return this;
        }

        public Builder requiredAccessLevels(List<String> requiredAccessLevels) {
            return requiredAccessLevels(Output.of(requiredAccessLevels));
        }

        public Builder requiredAccessLevels(String... requiredAccessLevels) {
            return requiredAccessLevels(List.of(requiredAccessLevels));
        }

        public AccessLevelsAccessLevelBasicConditionGetArgs build() {
            return $;
        }
    }

}
