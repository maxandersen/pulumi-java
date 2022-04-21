// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.orgpolicy_v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.orgpolicy_v2.inputs.GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a Cloud Organization `PolicySpec` which is used to specify `Constraints` for configurations of Cloud Platform resources.
 * 
 */
public final class GoogleCloudOrgpolicyV2PolicySpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudOrgpolicyV2PolicySpecArgs Empty = new GoogleCloudOrgpolicyV2PolicySpecArgs();

    /**
     * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
     * 
     */
    @Import(name="inheritFromParent")
    private @Nullable Output<Boolean> inheritFromParent;

    public Optional<Output<Boolean>> inheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }

    /**
     * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
     * 
     */
    @Import(name="reset")
    private @Nullable Output<Boolean> reset;

    public Optional<Output<Boolean>> reset() {
        return Optional.ofNullable(this.reset);
    }

    /**
     * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs>> rules;

    public Optional<Output<List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private GoogleCloudOrgpolicyV2PolicySpecArgs() {}

    private GoogleCloudOrgpolicyV2PolicySpecArgs(GoogleCloudOrgpolicyV2PolicySpecArgs $) {
        this.etag = $.etag;
        this.inheritFromParent = $.inheritFromParent;
        this.reset = $.reset;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudOrgpolicyV2PolicySpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudOrgpolicyV2PolicySpecArgs $;

        public Builder() {
            $ = new GoogleCloudOrgpolicyV2PolicySpecArgs();
        }

        public Builder(GoogleCloudOrgpolicyV2PolicySpecArgs defaults) {
            $ = new GoogleCloudOrgpolicyV2PolicySpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder inheritFromParent(@Nullable Output<Boolean> inheritFromParent) {
            $.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder inheritFromParent(Boolean inheritFromParent) {
            return inheritFromParent(Output.of(inheritFromParent));
        }

        public Builder reset(@Nullable Output<Boolean> reset) {
            $.reset = reset;
            return this;
        }

        public Builder reset(Boolean reset) {
            return reset(Output.of(reset));
        }

        public Builder rules(@Nullable Output<List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        public Builder rules(List<GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        public Builder rules(GoogleCloudOrgpolicyV2PolicySpecPolicyRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public GoogleCloudOrgpolicyV2PolicySpecArgs build() {
            return $;
        }
    }

}
