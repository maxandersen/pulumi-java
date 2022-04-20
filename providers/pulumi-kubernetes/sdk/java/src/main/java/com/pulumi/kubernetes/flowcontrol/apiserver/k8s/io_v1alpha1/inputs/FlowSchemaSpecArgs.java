// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.FlowDistinguisherMethodArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.PolicyRulesWithSubjectsArgs;
import com.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.PriorityLevelConfigurationReferenceArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FlowSchemaSpec describes how the FlowSchema&#39;s specification looks like.
 * 
 */
public final class FlowSchemaSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSchemaSpecArgs Empty = new FlowSchemaSpecArgs();

    /**
     * `distinguisherMethod` defines how to compute the flow distinguisher for requests that match this schema. `nil` specifies that the distinguisher is disabled and thus will always be the empty string.
     * 
     */
    @Import(name="distinguisherMethod")
      private final @Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod;

    public Output<FlowDistinguisherMethodArgs> distinguisherMethod() {
        return this.distinguisherMethod == null ? Codegen.empty() : this.distinguisherMethod;
    }

    /**
     * `matchingPrecedence` is used to choose among the FlowSchemas that match a given request. The chosen FlowSchema is among those with the numerically lowest (which we take to be logically highest) MatchingPrecedence.  Each MatchingPrecedence value must be non-negative. Note that if the precedence is not specified or zero, it will be set to 1000 as default.
     * 
     */
    @Import(name="matchingPrecedence")
      private final @Nullable Output<Integer> matchingPrecedence;

    public Output<Integer> matchingPrecedence() {
        return this.matchingPrecedence == null ? Codegen.empty() : this.matchingPrecedence;
    }

    /**
     * `priorityLevelConfiguration` should reference a PriorityLevelConfiguration in the cluster. If the reference cannot be resolved, the FlowSchema will be ignored and marked as invalid in its status. Required.
     * 
     */
    @Import(name="priorityLevelConfiguration", required=true)
      private final Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration;

    public Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }

    /**
     * `rules` describes which requests will match this flow schema. This FlowSchema matches a request if and only if at least one member of rules matches the request. if it is an empty slice, there will be no requests matching the FlowSchema.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules;

    public Output<List<PolicyRulesWithSubjectsArgs>> rules() {
        return this.rules == null ? Codegen.empty() : this.rules;
    }

    public FlowSchemaSpecArgs(
        @Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod,
        @Nullable Output<Integer> matchingPrecedence,
        Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration,
        @Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules) {
        this.distinguisherMethod = distinguisherMethod;
        this.matchingPrecedence = matchingPrecedence;
        this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration, "expected parameter 'priorityLevelConfiguration' to be non-null");
        this.rules = rules;
    }

    private FlowSchemaSpecArgs() {
        this.distinguisherMethod = Codegen.empty();
        this.matchingPrecedence = Codegen.empty();
        this.priorityLevelConfiguration = Codegen.empty();
        this.rules = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod;
        private @Nullable Output<Integer> matchingPrecedence;
        private Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration;
        private @Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinguisherMethod = defaults.distinguisherMethod;
    	      this.matchingPrecedence = defaults.matchingPrecedence;
    	      this.priorityLevelConfiguration = defaults.priorityLevelConfiguration;
    	      this.rules = defaults.rules;
        }

        public Builder distinguisherMethod(@Nullable Output<FlowDistinguisherMethodArgs> distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }
        public Builder distinguisherMethod(@Nullable FlowDistinguisherMethodArgs distinguisherMethod) {
            this.distinguisherMethod = Codegen.ofNullable(distinguisherMethod);
            return this;
        }
        public Builder matchingPrecedence(@Nullable Output<Integer> matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }
        public Builder matchingPrecedence(@Nullable Integer matchingPrecedence) {
            this.matchingPrecedence = Codegen.ofNullable(matchingPrecedence);
            return this;
        }
        public Builder priorityLevelConfiguration(Output<PriorityLevelConfigurationReferenceArgs> priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
            return this;
        }
        public Builder priorityLevelConfiguration(PriorityLevelConfigurationReferenceArgs priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Output.of(Objects.requireNonNull(priorityLevelConfiguration));
            return this;
        }
        public Builder rules(@Nullable Output<List<PolicyRulesWithSubjectsArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<PolicyRulesWithSubjectsArgs> rules) {
            this.rules = Codegen.ofNullable(rules);
            return this;
        }
        public Builder rules(PolicyRulesWithSubjectsArgs... rules) {
            return rules(List.of(rules));
        }        public FlowSchemaSpecArgs build() {
            return new FlowSchemaSpecArgs(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
        }
    }
}
