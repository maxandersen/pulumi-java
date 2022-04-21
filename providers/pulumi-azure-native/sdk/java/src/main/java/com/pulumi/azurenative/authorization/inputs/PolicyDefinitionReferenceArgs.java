// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization.inputs;

import com.pulumi.azurenative.authorization.inputs.ParameterValuesValueArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The policy definition reference.
 * 
 */
public final class PolicyDefinitionReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyDefinitionReferenceArgs Empty = new PolicyDefinitionReferenceArgs();

    /**
     * The name of the groups that this policy definition reference belongs to.
     * 
     */
    @Import(name="groupNames")
    private @Nullable Output<List<String>> groupNames;

    public Optional<Output<List<String>>> groupNames() {
        return Optional.ofNullable(this.groupNames);
    }

    /**
     * The parameter values for the referenced policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterValuesValueArgs>> parameters;

    public Optional<Output<Map<String,ParameterValuesValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The ID of the policy definition or policy set definition.
     * 
     */
    @Import(name="policyDefinitionId", required=true)
    private Output<String> policyDefinitionId;

    public Output<String> policyDefinitionId() {
        return this.policyDefinitionId;
    }

    /**
     * A unique id (within the policy set definition) for this policy definition reference.
     * 
     */
    @Import(name="policyDefinitionReferenceId")
    private @Nullable Output<String> policyDefinitionReferenceId;

    public Optional<Output<String>> policyDefinitionReferenceId() {
        return Optional.ofNullable(this.policyDefinitionReferenceId);
    }

    private PolicyDefinitionReferenceArgs() {}

    private PolicyDefinitionReferenceArgs(PolicyDefinitionReferenceArgs $) {
        this.groupNames = $.groupNames;
        this.parameters = $.parameters;
        this.policyDefinitionId = $.policyDefinitionId;
        this.policyDefinitionReferenceId = $.policyDefinitionReferenceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDefinitionReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDefinitionReferenceArgs $;

        public Builder() {
            $ = new PolicyDefinitionReferenceArgs();
        }

        public Builder(PolicyDefinitionReferenceArgs defaults) {
            $ = new PolicyDefinitionReferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder groupNames(@Nullable Output<List<String>> groupNames) {
            $.groupNames = groupNames;
            return this;
        }

        public Builder groupNames(List<String> groupNames) {
            return groupNames(Output.of(groupNames));
        }

        public Builder groupNames(String... groupNames) {
            return groupNames(List.of(groupNames));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterValuesValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterValuesValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder policyDefinitionId(Output<String> policyDefinitionId) {
            $.policyDefinitionId = policyDefinitionId;
            return this;
        }

        public Builder policyDefinitionId(String policyDefinitionId) {
            return policyDefinitionId(Output.of(policyDefinitionId));
        }

        public Builder policyDefinitionReferenceId(@Nullable Output<String> policyDefinitionReferenceId) {
            $.policyDefinitionReferenceId = policyDefinitionReferenceId;
            return this;
        }

        public Builder policyDefinitionReferenceId(String policyDefinitionReferenceId) {
            return policyDefinitionReferenceId(Output.of(policyDefinitionReferenceId));
        }

        public PolicyDefinitionReferenceArgs build() {
            $.policyDefinitionId = Objects.requireNonNull($.policyDefinitionId, "expected parameter 'policyDefinitionId' to be non-null");
            return $;
        }
    }

}
