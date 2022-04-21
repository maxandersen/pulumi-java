// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.remotebuildexecution_v1alpha.enums.GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines whether a feature can be used or what values are accepted.
 * 
 */
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs Empty = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs();

    /**
     * A list of acceptable values. Only effective when the policy is `RESTRICTED`.
     * 
     */
    @Import(name="allowedValues")
    private @Nullable Output<List<String>> allowedValues;

    public Optional<Output<List<String>>> allowedValues() {
        return Optional.ofNullable(this.allowedValues);
    }

    /**
     * The policy of the feature.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy;

    public Optional<Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy>> policy() {
        return Optional.ofNullable(this.policy);
    }

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs() {}

    private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs $) {
        this.allowedValues = $.allowedValues;
        this.policy = $.policy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs $;

        public Builder() {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs();
        }

        public Builder(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs defaults) {
            $ = new GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedValues(@Nullable Output<List<String>> allowedValues) {
            $.allowedValues = allowedValues;
            return this;
        }

        public Builder allowedValues(List<String> allowedValues) {
            return allowedValues(Output.of(allowedValues));
        }

        public Builder allowedValues(String... allowedValues) {
            return allowedValues(List.of(allowedValues));
        }

        public Builder policy(@Nullable Output<GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy> policy) {
            $.policy = policy;
            return this;
        }

        public Builder policy(GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeaturePolicy policy) {
            return policy(Output.of(policy));
        }

        public GoogleDevtoolsRemotebuildexecutionAdminV1alphaFeaturePolicyFeatureArgs build() {
            return $;
        }
    }

}
