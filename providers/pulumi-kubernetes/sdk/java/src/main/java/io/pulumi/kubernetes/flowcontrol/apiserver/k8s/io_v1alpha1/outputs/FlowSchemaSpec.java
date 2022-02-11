// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.FlowDistinguisherMethod;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.PolicyRulesWithSubjects;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.PriorityLevelConfigurationReference;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlowSchemaSpec {
    private final @Nullable FlowDistinguisherMethod distinguisherMethod;
    private final @Nullable Integer matchingPrecedence;
    private final PriorityLevelConfigurationReference priorityLevelConfiguration;
    private final @Nullable List<PolicyRulesWithSubjects> rules;

    @OutputCustomType.Constructor({"distinguisherMethod","matchingPrecedence","priorityLevelConfiguration","rules"})
    private FlowSchemaSpec(
        @Nullable FlowDistinguisherMethod distinguisherMethod,
        @Nullable Integer matchingPrecedence,
        PriorityLevelConfigurationReference priorityLevelConfiguration,
        @Nullable List<PolicyRulesWithSubjects> rules) {
        this.distinguisherMethod = distinguisherMethod;
        this.matchingPrecedence = matchingPrecedence;
        this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
        this.rules = rules;
    }

    public Optional<FlowDistinguisherMethod> getDistinguisherMethod() {
        return Optional.ofNullable(this.distinguisherMethod);
    }
    public Optional<Integer> getMatchingPrecedence() {
        return Optional.ofNullable(this.matchingPrecedence);
    }
    public PriorityLevelConfigurationReference getPriorityLevelConfiguration() {
        return this.priorityLevelConfiguration;
    }
    public List<PolicyRulesWithSubjects> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSchemaSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowDistinguisherMethod distinguisherMethod;
        private @Nullable Integer matchingPrecedence;
        private PriorityLevelConfigurationReference priorityLevelConfiguration;
        private @Nullable List<PolicyRulesWithSubjects> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSchemaSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distinguisherMethod = defaults.distinguisherMethod;
    	      this.matchingPrecedence = defaults.matchingPrecedence;
    	      this.priorityLevelConfiguration = defaults.priorityLevelConfiguration;
    	      this.rules = defaults.rules;
        }

        public Builder setDistinguisherMethod(@Nullable FlowDistinguisherMethod distinguisherMethod) {
            this.distinguisherMethod = distinguisherMethod;
            return this;
        }

        public Builder setMatchingPrecedence(@Nullable Integer matchingPrecedence) {
            this.matchingPrecedence = matchingPrecedence;
            return this;
        }

        public Builder setPriorityLevelConfiguration(PriorityLevelConfigurationReference priorityLevelConfiguration) {
            this.priorityLevelConfiguration = Objects.requireNonNull(priorityLevelConfiguration);
            return this;
        }

        public Builder setRules(@Nullable List<PolicyRulesWithSubjects> rules) {
            this.rules = rules;
            return this;
        }

        public FlowSchemaSpec build() {
            return new FlowSchemaSpec(distinguisherMethod, matchingPrecedence, priorityLevelConfiguration, rules);
        }
    }
}
