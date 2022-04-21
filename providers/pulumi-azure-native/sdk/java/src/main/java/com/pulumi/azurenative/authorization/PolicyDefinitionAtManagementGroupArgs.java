// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.PolicyType;
import com.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyDefinitionAtManagementGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyDefinitionAtManagementGroupArgs Empty = new PolicyDefinitionAtManagementGroupArgs();

    /**
     * The policy definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the policy definition.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the management group.
     * 
     */
    @Import(name="managementGroupId", required=true)
    private Output<String> managementGroupId;

    public Output<String> managementGroupId() {
        return this.managementGroupId;
    }

    /**
     * The policy definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The policy definition mode. Some examples are All, Indexed, Microsoft.KeyVault.Data.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * The parameter definitions for parameters used in the policy rule. The keys are the parameter names.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters;

    public Optional<Output<Map<String,ParameterDefinitionsValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The name of the policy definition to create.
     * 
     */
    @Import(name="policyDefinitionName")
    private @Nullable Output<String> policyDefinitionName;

    public Optional<Output<String>> policyDefinitionName() {
        return Optional.ofNullable(this.policyDefinitionName);
    }

    /**
     * The policy rule.
     * 
     */
    @Import(name="policyRule")
    private @Nullable Output<Object> policyRule;

    public Optional<Output<Object>> policyRule() {
        return Optional.ofNullable(this.policyRule);
    }

    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,PolicyType>> policyType;

    public Optional<Output<Either<String,PolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private PolicyDefinitionAtManagementGroupArgs() {}

    private PolicyDefinitionAtManagementGroupArgs(PolicyDefinitionAtManagementGroupArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.managementGroupId = $.managementGroupId;
        this.metadata = $.metadata;
        this.mode = $.mode;
        this.parameters = $.parameters;
        this.policyDefinitionName = $.policyDefinitionName;
        this.policyRule = $.policyRule;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyDefinitionAtManagementGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyDefinitionAtManagementGroupArgs $;

        public Builder() {
            $ = new PolicyDefinitionAtManagementGroupArgs();
        }

        public Builder(PolicyDefinitionAtManagementGroupArgs defaults) {
            $ = new PolicyDefinitionAtManagementGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder managementGroupId(Output<String> managementGroupId) {
            $.managementGroupId = managementGroupId;
            return this;
        }

        public Builder managementGroupId(String managementGroupId) {
            return managementGroupId(Output.of(managementGroupId));
        }

        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(Map<String,ParameterDefinitionsValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        public Builder policyDefinitionName(@Nullable Output<String> policyDefinitionName) {
            $.policyDefinitionName = policyDefinitionName;
            return this;
        }

        public Builder policyDefinitionName(String policyDefinitionName) {
            return policyDefinitionName(Output.of(policyDefinitionName));
        }

        public Builder policyRule(@Nullable Output<Object> policyRule) {
            $.policyRule = policyRule;
            return this;
        }

        public Builder policyRule(Object policyRule) {
            return policyRule(Output.of(policyRule));
        }

        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        public Builder policyType(Either<String,PolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        public PolicyDefinitionAtManagementGroupArgs build() {
            $.managementGroupId = Objects.requireNonNull($.managementGroupId, "expected parameter 'managementGroupId' to be non-null");
            $.mode = Codegen.stringProp("mode").output().arg($.mode).def("Indexed").getNullable();
            return $;
        }
    }

}
