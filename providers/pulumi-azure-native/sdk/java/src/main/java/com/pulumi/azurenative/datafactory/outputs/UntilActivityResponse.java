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
import com.pulumi.azurenative.datafactory.outputs.IfConditionActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.LookupActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SetVariableActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SqlServerStoredProcedureActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.SwitchActivityResponse;
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
public final class UntilActivityResponse {
    /**
     * List of activities to execute.
     * 
     */
    private final List<Object> activities;
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
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
     */
    private final ExpressionResponse expression;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    private final @Nullable Object timeout;
    /**
     * Type of activity.
     * Expected value is 'Until'.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private UntilActivityResponse(
        @CustomType.Parameter("activities") List<Object> activities,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("expression") ExpressionResponse expression,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("timeout") @Nullable Object timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.activities = activities;
        this.dependsOn = dependsOn;
        this.description = description;
        this.expression = expression;
        this.name = name;
        this.timeout = timeout;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * List of activities to execute.
     * 
    */
    public List<Object> activities() {
        return this.activities;
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
     * An expression that would evaluate to Boolean. The loop will continue until this expression evaluates to true
     * 
    */
    public ExpressionResponse expression() {
        return this.expression;
    }
    /**
     * Activity name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies the timeout for the activity to run. If there is no value specified, it takes the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
    */
    public Optional<Object> timeout() {
        return Optional.ofNullable(this.timeout);
    }
    /**
     * Type of activity.
     * Expected value is 'Until'.
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

    public static Builder builder(UntilActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> activities;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private ExpressionResponse expression;
        private String name;
        private @Nullable Object timeout;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(UntilActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.expression = defaults.expression;
    	      this.name = defaults.name;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder activities(List<Object> activities) {
            this.activities = Objects.requireNonNull(activities);
            return this;
        }
        public Builder activities(Object... activities) {
            return activities(List.of(activities));
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder timeout(@Nullable Object timeout) {
            this.timeout = timeout;
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
        }        public UntilActivityResponse build() {
            return new UntilActivityResponse(activities, dependsOn, description, expression, name, timeout, type, userProperties);
        }
    }
}
