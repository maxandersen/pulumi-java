// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.outputs;

import com.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.outputs.AppendVariableActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureDataExplorerCommandActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureFunctionActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureMLBatchExecutionActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureMLExecutePipelineActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.AzureMLUpdateResourceActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ControlActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.CopyActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.CustomActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.DataLakeAnalyticsUSQLActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.DatabricksNotebookActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.DatabricksSparkJarActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.DatabricksSparkPythonActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.DeleteActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExecuteDataFlowActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExecutePipelineActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExecuteSSISPackageActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExecuteWranglingDataflowActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExecutionActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ExpressionResponse;
import com.pulumi.azurenative.datafactory.outputs.FailActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.FilterActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.ForEachActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.GetMetadataActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.HDInsightHiveActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.HDInsightMapReduceActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.HDInsightPigActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.HDInsightSparkActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.HDInsightStreamingActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.LookupActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SwitchActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.UntilActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IfConditionActivityResponse {
    /**
     * Activity depends on condition.
     * 
     */
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    /**
     * Activity description.
     * 
     */
    private final @Nullable String description;
    /**
     * An expression that would evaluate to Boolean. This is used to determine the block of activities (ifTrueActivities or ifFalseActivities) that will be executed.
     * 
     */
    private final ExpressionResponse expression;
    /**
     * List of activities to execute if expression is evaluated to false. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    private final @Nullable List<Object> ifFalseActivities;
    /**
     * List of activities to execute if expression is evaluated to true. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    private final @Nullable List<Object> ifTrueActivities;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Type of activity.
     * Expected value is &#39;IfCondition&#39;.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private IfConditionActivityResponse(
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") ExpressionResponse expression,
        @CustomType.Parameter("ifFalseActivities") @Nullable List<Object> ifFalseActivities,
        @CustomType.Parameter("ifTrueActivities") @Nullable List<Object> ifTrueActivities,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.dependsOn = dependsOn;
        this.description = description;
        this.expression = expression;
        this.ifFalseActivities = ifFalseActivities;
        this.ifTrueActivities = ifTrueActivities;
        this.name = name;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * Activity depends on condition.
     * 
    */
    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * Activity description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * An expression that would evaluate to Boolean. This is used to determine the block of activities (ifTrueActivities or ifFalseActivities) that will be executed.
     * 
    */
    public ExpressionResponse expression() {
        return this.expression;
    }
    /**
     * List of activities to execute if expression is evaluated to false. This is an optional property and if not provided, the activity will exit without any action.
     * 
    */
    public List<Object> ifFalseActivities() {
        return this.ifFalseActivities == null ? List.of() : this.ifFalseActivities;
    }
    /**
     * List of activities to execute if expression is evaluated to true. This is an optional property and if not provided, the activity will exit without any action.
     * 
    */
    public List<Object> ifTrueActivities() {
        return this.ifTrueActivities == null ? List.of() : this.ifTrueActivities;
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Type of activity.
     * Expected value is &#39;IfCondition&#39;.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Activity user properties.
     * 
    */
    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IfConditionActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private ExpressionResponse expression;
        private @Nullable List<Object> ifFalseActivities;
        private @Nullable List<Object> ifTrueActivities;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(IfConditionActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.ifFalseActivities = defaults.ifFalseActivities;
    	      this.ifTrueActivities = defaults.ifTrueActivities;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder dependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(ActivityDependencyResponse... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder expression(ExpressionResponse expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        public Builder ifFalseActivities(@Nullable List<Object> ifFalseActivities) {
            this.ifFalseActivities = ifFalseActivities;
            return this;
        }
        public Builder ifFalseActivities(Object... ifFalseActivities) {
            return ifFalseActivities(List.of(ifFalseActivities));
        }
        public Builder ifTrueActivities(@Nullable List<Object> ifTrueActivities) {
            this.ifTrueActivities = ifTrueActivities;
            return this;
        }
        public Builder ifTrueActivities(Object... ifTrueActivities) {
            return ifTrueActivities(List.of(ifTrueActivities));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(UserPropertyResponse... userProperties) {
            return userProperties(List.of(userProperties));
        }        public IfConditionActivityResponse build() {
            return new IfConditionActivityResponse(dependsOn, description, expression, ifFalseActivities, ifTrueActivities, name, type, userProperties);
        }
    }
}
