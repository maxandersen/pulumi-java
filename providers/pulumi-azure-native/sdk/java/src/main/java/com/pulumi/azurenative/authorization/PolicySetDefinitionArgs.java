// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.authorization.enums.PolicyType;
import com.pulumi.azurenative.authorization.inputs.ParameterDefinitionsValueArgs;
import com.pulumi.azurenative.authorization.inputs.PolicyDefinitionGroupArgs;
import com.pulumi.azurenative.authorization.inputs.PolicyDefinitionReferenceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicySetDefinitionArgs extends ResourceArgs {

    public static final PolicySetDefinitionArgs Empty = new PolicySetDefinitionArgs();

    /**
     * The policy set definition description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The policy set definition description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The display name of the policy set definition.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The display name of the policy set definition.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Object> metadata;

    /**
     * @return The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Optional<Output<Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The policy set definition parameters that can be used in policy definition references.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters;

    /**
     * @return The policy set definition parameters that can be used in policy definition references.
     * 
     */
    public Optional<Output<Map<String,ParameterDefinitionsValueArgs>>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    /**
     * The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    @Import(name="policyDefinitionGroups")
    private @Nullable Output<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups;

    /**
     * @return The metadata describing groups of policy definition references within the policy set definition.
     * 
     */
    public Optional<Output<List<PolicyDefinitionGroupArgs>>> policyDefinitionGroups() {
        return Optional.ofNullable(this.policyDefinitionGroups);
    }

    /**
     * An array of policy definition references.
     * 
     */
    @Import(name="policyDefinitions", required=true)
    private Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions;

    /**
     * @return An array of policy definition references.
     * 
     */
    public Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions() {
        return this.policyDefinitions;
    }

    /**
     * The name of the policy set definition to create.
     * 
     */
    @Import(name="policySetDefinitionName")
    private @Nullable Output<String> policySetDefinitionName;

    /**
     * @return The name of the policy set definition to create.
     * 
     */
    public Optional<Output<String>> policySetDefinitionName() {
        return Optional.ofNullable(this.policySetDefinitionName);
    }

    /**
     * The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    @Import(name="policyType")
    private @Nullable Output<Either<String,PolicyType>> policyType;

    /**
     * @return The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
     * 
     */
    public Optional<Output<Either<String,PolicyType>>> policyType() {
        return Optional.ofNullable(this.policyType);
    }

    private PolicySetDefinitionArgs() {}

    private PolicySetDefinitionArgs(PolicySetDefinitionArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.metadata = $.metadata;
        this.parameters = $.parameters;
        this.policyDefinitionGroups = $.policyDefinitionGroups;
        this.policyDefinitions = $.policyDefinitions;
        this.policySetDefinitionName = $.policySetDefinitionName;
        this.policyType = $.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicySetDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicySetDefinitionArgs $;

        public Builder() {
            $ = new PolicySetDefinitionArgs();
        }

        public Builder(PolicySetDefinitionArgs defaults) {
            $ = new PolicySetDefinitionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The policy set definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The policy set definition description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName The display name of the policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param metadata The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(@Nullable Output<Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        /**
         * @param metadata The policy set definition metadata.  Metadata is an open ended object and is typically a collection of key value pairs.
         * 
         * @return builder
         * 
         */
        public Builder metadata(Object metadata) {
            return metadata(Output.of(metadata));
        }

        /**
         * @param parameters The policy set definition parameters that can be used in policy definition references.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<Map<String,ParameterDefinitionsValueArgs>> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters The policy set definition parameters that can be used in policy definition references.
         * 
         * @return builder
         * 
         */
        public Builder parameters(Map<String,ParameterDefinitionsValueArgs> parameters) {
            return parameters(Output.of(parameters));
        }

        /**
         * @param policyDefinitionGroups The metadata describing groups of policy definition references within the policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionGroups(@Nullable Output<List<PolicyDefinitionGroupArgs>> policyDefinitionGroups) {
            $.policyDefinitionGroups = policyDefinitionGroups;
            return this;
        }

        /**
         * @param policyDefinitionGroups The metadata describing groups of policy definition references within the policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionGroups(List<PolicyDefinitionGroupArgs> policyDefinitionGroups) {
            return policyDefinitionGroups(Output.of(policyDefinitionGroups));
        }

        /**
         * @param policyDefinitionGroups The metadata describing groups of policy definition references within the policy set definition.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitionGroups(PolicyDefinitionGroupArgs... policyDefinitionGroups) {
            return policyDefinitionGroups(List.of(policyDefinitionGroups));
        }

        /**
         * @param policyDefinitions An array of policy definition references.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitions(Output<List<PolicyDefinitionReferenceArgs>> policyDefinitions) {
            $.policyDefinitions = policyDefinitions;
            return this;
        }

        /**
         * @param policyDefinitions An array of policy definition references.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitions(List<PolicyDefinitionReferenceArgs> policyDefinitions) {
            return policyDefinitions(Output.of(policyDefinitions));
        }

        /**
         * @param policyDefinitions An array of policy definition references.
         * 
         * @return builder
         * 
         */
        public Builder policyDefinitions(PolicyDefinitionReferenceArgs... policyDefinitions) {
            return policyDefinitions(List.of(policyDefinitions));
        }

        /**
         * @param policySetDefinitionName The name of the policy set definition to create.
         * 
         * @return builder
         * 
         */
        public Builder policySetDefinitionName(@Nullable Output<String> policySetDefinitionName) {
            $.policySetDefinitionName = policySetDefinitionName;
            return this;
        }

        /**
         * @param policySetDefinitionName The name of the policy set definition to create.
         * 
         * @return builder
         * 
         */
        public Builder policySetDefinitionName(String policySetDefinitionName) {
            return policySetDefinitionName(Output.of(policySetDefinitionName));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(@Nullable Output<Either<String,PolicyType>> policyType) {
            $.policyType = policyType;
            return this;
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(Either<String,PolicyType> policyType) {
            return policyType(Output.of(policyType));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(String policyType) {
            return policyType(Either.ofLeft(policyType));
        }

        /**
         * @param policyType The type of policy definition. Possible values are NotSpecified, BuiltIn, Custom, and Static.
         * 
         * @return builder
         * 
         */
        public Builder policyType(PolicyType policyType) {
            return policyType(Either.ofRight(policyType));
        }

        public PolicySetDefinitionArgs build() {
            $.policyDefinitions = Objects.requireNonNull($.policyDefinitions, "expected parameter 'policyDefinitions' to be non-null");
            return $;
        }
    }

}
