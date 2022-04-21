// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resiliencehub;

import com.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyDataLocationConstraint;
import com.pulumi.awsnative.resiliencehub.enums.ResiliencyPolicyTier;
import com.pulumi.awsnative.resiliencehub.inputs.ResiliencyPolicyPolicyMapArgs;
import com.pulumi.awsnative.resiliencehub.inputs.ResiliencyPolicyTagMapArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResiliencyPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResiliencyPolicyArgs Empty = new ResiliencyPolicyArgs();

    /**
     * Data Location Constraint of the Policy.
     * 
     */
    @Import(name="dataLocationConstraint")
    private @Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint;

    public Optional<Output<ResiliencyPolicyDataLocationConstraint>> dataLocationConstraint() {
        return Optional.ofNullable(this.dataLocationConstraint);
    }

    @Import(name="policy", required=true)
    private Output<ResiliencyPolicyPolicyMapArgs> policy;

    public Output<ResiliencyPolicyPolicyMapArgs> policy() {
        return this.policy;
    }

    /**
     * Description of Resiliency Policy.
     * 
     */
    @Import(name="policyDescription")
    private @Nullable Output<String> policyDescription;

    public Optional<Output<String>> policyDescription() {
        return Optional.ofNullable(this.policyDescription);
    }

    /**
     * Name of Resiliency Policy.
     * 
     */
    @Import(name="policyName", required=true)
    private Output<String> policyName;

    public Output<String> policyName() {
        return this.policyName;
    }

    @Import(name="tags")
    private @Nullable Output<ResiliencyPolicyTagMapArgs> tags;

    public Optional<Output<ResiliencyPolicyTagMapArgs>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Resiliency Policy Tier.
     * 
     */
    @Import(name="tier", required=true)
    private Output<ResiliencyPolicyTier> tier;

    public Output<ResiliencyPolicyTier> tier() {
        return this.tier;
    }

    private ResiliencyPolicyArgs() {}

    private ResiliencyPolicyArgs(ResiliencyPolicyArgs $) {
        this.dataLocationConstraint = $.dataLocationConstraint;
        this.policy = $.policy;
        this.policyDescription = $.policyDescription;
        this.policyName = $.policyName;
        this.tags = $.tags;
        this.tier = $.tier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResiliencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResiliencyPolicyArgs $;

        public Builder() {
            $ = new ResiliencyPolicyArgs();
        }

        public Builder(ResiliencyPolicyArgs defaults) {
            $ = new ResiliencyPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder dataLocationConstraint(@Nullable Output<ResiliencyPolicyDataLocationConstraint> dataLocationConstraint) {
            $.dataLocationConstraint = dataLocationConstraint;
            return this;
        }

        public Builder dataLocationConstraint(ResiliencyPolicyDataLocationConstraint dataLocationConstraint) {
            return dataLocationConstraint(Output.of(dataLocationConstraint));
        }

        public Builder policy(Output<ResiliencyPolicyPolicyMapArgs> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(ResiliencyPolicyPolicyMapArgs policy) {
            return policy(Output.of(policy));
        }

        public Builder policyDescription(@Nullable Output<String> policyDescription) {
            $.policyDescription = policyDescription;
            return this;
        }

        public Builder policyDescription(String policyDescription) {
            return policyDescription(Output.of(policyDescription));
        }

        public Builder policyName(Output<String> policyName) {
            $.policyName = policyName;
            return this;
        }

        public Builder policyName(String policyName) {
            return policyName(Output.of(policyName));
        }

        public Builder tags(@Nullable Output<ResiliencyPolicyTagMapArgs> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(ResiliencyPolicyTagMapArgs tags) {
            return tags(Output.of(tags));
        }

        public Builder tier(Output<ResiliencyPolicyTier> tier) {
            $.tier = tier;
            return this;
        }

        public Builder tier(ResiliencyPolicyTier tier) {
            return tier(Output.of(tier));
        }

        public ResiliencyPolicyArgs build() {
            $.policy = Objects.requireNonNull($.policy, "expected parameter 'policy' to be non-null");
            $.policyName = Objects.requireNonNull($.policyName, "expected parameter 'policyName' to be non-null");
            $.tier = Objects.requireNonNull($.tier, "expected parameter 'tier' to be non-null");
            return $;
        }
    }

}
