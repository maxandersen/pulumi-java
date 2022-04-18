// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicebus;

import com.pulumi.azurenative.servicebus.enums.FilterType;
import com.pulumi.azurenative.servicebus.inputs.ActionArgs;
import com.pulumi.azurenative.servicebus.inputs.CorrelationFilterArgs;
import com.pulumi.azurenative.servicebus.inputs.SqlFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Represents the filter actions which are allowed for the transformation of a message that have been matched by a filter expression.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<ActionArgs> action;

    public Output<ActionArgs> action() {
        return this.action == null ? Codegen.empty() : this.action;
    }

    /**
     * Properties of correlationFilter
     * 
     */
    @Import(name="correlationFilter")
      private final @Nullable Output<CorrelationFilterArgs> correlationFilter;

    public Output<CorrelationFilterArgs> correlationFilter() {
        return this.correlationFilter == null ? Codegen.empty() : this.correlationFilter;
    }

    /**
     * Filter type that is evaluated against a BrokeredMessage.
     * 
     */
    @Import(name="filterType")
      private final @Nullable Output<FilterType> filterType;

    public Output<FilterType> filterType() {
        return this.filterType == null ? Codegen.empty() : this.filterType;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> namespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rule name.
     * 
     */
    @Import(name="ruleName")
      private final @Nullable Output<String> ruleName;

    public Output<String> ruleName() {
        return this.ruleName == null ? Codegen.empty() : this.ruleName;
    }

    /**
     * Properties of sqlFilter
     * 
     */
    @Import(name="sqlFilter")
      private final @Nullable Output<SqlFilterArgs> sqlFilter;

    public Output<SqlFilterArgs> sqlFilter() {
        return this.sqlFilter == null ? Codegen.empty() : this.sqlFilter;
    }

    /**
     * The subscription name.
     * 
     */
    @Import(name="subscriptionName", required=true)
      private final Output<String> subscriptionName;

    public Output<String> subscriptionName() {
        return this.subscriptionName;
    }

    /**
     * The topic name.
     * 
     */
    @Import(name="topicName", required=true)
      private final Output<String> topicName;

    public Output<String> topicName() {
        return this.topicName;
    }

    public RuleArgs(
        @Nullable Output<ActionArgs> action,
        @Nullable Output<CorrelationFilterArgs> correlationFilter,
        @Nullable Output<FilterType> filterType,
        Output<String> namespaceName,
        Output<String> resourceGroupName,
        @Nullable Output<String> ruleName,
        @Nullable Output<SqlFilterArgs> sqlFilter,
        Output<String> subscriptionName,
        Output<String> topicName) {
        this.action = action;
        this.correlationFilter = correlationFilter;
        this.filterType = filterType;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.ruleName = ruleName;
        this.sqlFilter = sqlFilter;
        this.subscriptionName = Objects.requireNonNull(subscriptionName, "expected parameter 'subscriptionName' to be non-null");
        this.topicName = Objects.requireNonNull(topicName, "expected parameter 'topicName' to be non-null");
    }

    private RuleArgs() {
        this.action = Codegen.empty();
        this.correlationFilter = Codegen.empty();
        this.filterType = Codegen.empty();
        this.namespaceName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.ruleName = Codegen.empty();
        this.sqlFilter = Codegen.empty();
        this.subscriptionName = Codegen.empty();
        this.topicName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ActionArgs> action;
        private @Nullable Output<CorrelationFilterArgs> correlationFilter;
        private @Nullable Output<FilterType> filterType;
        private Output<String> namespaceName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> ruleName;
        private @Nullable Output<SqlFilterArgs> sqlFilter;
        private Output<String> subscriptionName;
        private Output<String> topicName;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.correlationFilter = defaults.correlationFilter;
    	      this.filterType = defaults.filterType;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.ruleName = defaults.ruleName;
    	      this.sqlFilter = defaults.sqlFilter;
    	      this.subscriptionName = defaults.subscriptionName;
    	      this.topicName = defaults.topicName;
        }

        public Builder action(@Nullable Output<ActionArgs> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable ActionArgs action) {
            this.action = Codegen.ofNullable(action);
            return this;
        }
        public Builder correlationFilter(@Nullable Output<CorrelationFilterArgs> correlationFilter) {
            this.correlationFilter = correlationFilter;
            return this;
        }
        public Builder correlationFilter(@Nullable CorrelationFilterArgs correlationFilter) {
            this.correlationFilter = Codegen.ofNullable(correlationFilter);
            return this;
        }
        public Builder filterType(@Nullable Output<FilterType> filterType) {
            this.filterType = filterType;
            return this;
        }
        public Builder filterType(@Nullable FilterType filterType) {
            this.filterType = Codegen.ofNullable(filterType);
            return this;
        }
        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder ruleName(@Nullable Output<String> ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = Codegen.ofNullable(ruleName);
            return this;
        }
        public Builder sqlFilter(@Nullable Output<SqlFilterArgs> sqlFilter) {
            this.sqlFilter = sqlFilter;
            return this;
        }
        public Builder sqlFilter(@Nullable SqlFilterArgs sqlFilter) {
            this.sqlFilter = Codegen.ofNullable(sqlFilter);
            return this;
        }
        public Builder subscriptionName(Output<String> subscriptionName) {
            this.subscriptionName = Objects.requireNonNull(subscriptionName);
            return this;
        }
        public Builder subscriptionName(String subscriptionName) {
            this.subscriptionName = Output.of(Objects.requireNonNull(subscriptionName));
            return this;
        }
        public Builder topicName(Output<String> topicName) {
            this.topicName = Objects.requireNonNull(topicName);
            return this;
        }
        public Builder topicName(String topicName) {
            this.topicName = Output.of(Objects.requireNonNull(topicName));
            return this;
        }        public RuleArgs build() {
            return new RuleArgs(action, correlationFilter, filterType, namespaceName, resourceGroupName, ruleName, sqlFilter, subscriptionName, topicName);
        }
    }
}
