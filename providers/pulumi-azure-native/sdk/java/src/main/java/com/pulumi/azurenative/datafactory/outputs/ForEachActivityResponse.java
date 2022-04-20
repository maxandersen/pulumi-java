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
import com.pulumi.azurenative.datafactory.outputs.UntilActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.outputs.ValidationActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WaitActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WebActivityResponse;
import com.pulumi.azurenative.datafactory.outputs.WebHookActivityResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ForEachActivityResponse {
    /**
     * List of activities to execute .
     * 
     */
    private final List<Object> activities;
    /**
     * Batch count to be used for controlling the number of parallel execution (when isSequential is set to false).
     * 
     */
    private final @Nullable Integer batchCount;
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
     * Should the loop be executed in sequence or in parallel (max 50)
     * 
     */
    private final @Nullable Boolean isSequential;
    /**
     * Collection to iterate.
     * 
     */
    private final ExpressionResponse items;
    /**
     * Activity name.
     * 
     */
    private final String name;
    /**
     * Type of activity.
     * Expected value is &#39;ForEach&#39;.
     * 
     */
    private final String type;
    /**
     * Activity user properties.
     * 
     */
    private final @Nullable List<UserPropertyResponse> userProperties;

    @CustomType.Constructor
    private ForEachActivityResponse(
        @CustomType.Parameter("activities") List<Object> activities,
        @CustomType.Parameter("batchCount") @Nullable Integer batchCount,
        @CustomType.Parameter("dependsOn") @Nullable List<ActivityDependencyResponse> dependsOn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("isSequential") @Nullable Boolean isSequential,
        @CustomType.Parameter("items") ExpressionResponse items,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("userProperties") @Nullable List<UserPropertyResponse> userProperties) {
        this.activities = activities;
        this.batchCount = batchCount;
        this.dependsOn = dependsOn;
        this.description = description;
        this.isSequential = isSequential;
        this.items = items;
        this.name = name;
        this.type = type;
        this.userProperties = userProperties;
    }

    /**
     * List of activities to execute .
     * 
    */
    public List<Object> activities() {
        return this.activities;
    }
    /**
     * Batch count to be used for controlling the number of parallel execution (when isSequential is set to false).
     * 
    */
    public Optional<Integer> batchCount() {
        return Optional.ofNullable(this.batchCount);
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
     * Should the loop be executed in sequence or in parallel (max 50)
     * 
    */
    public Optional<Boolean> isSequential() {
        return Optional.ofNullable(this.isSequential);
    }
    /**
     * Collection to iterate.
     * 
    */
    public ExpressionResponse items() {
        return this.items;
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
     * Expected value is &#39;ForEach&#39;.
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

    public static Builder builder(ForEachActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Object> activities;
        private @Nullable Integer batchCount;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Boolean isSequential;
        private ExpressionResponse items;
        private String name;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ForEachActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activities = defaults.activities;
    	      this.batchCount = defaults.batchCount;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.isSequential = defaults.isSequential;
    	      this.items = defaults.items;
    	      this.name = defaults.name;
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
        public Builder batchCount(@Nullable Integer batchCount) {
            this.batchCount = batchCount;
            return this;
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
        public Builder isSequential(@Nullable Boolean isSequential) {
            this.isSequential = isSequential;
            return this;
        }
        public Builder items(ExpressionResponse items) {
            this.items = Objects.requireNonNull(items);
            return this;
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
        }        public ForEachActivityResponse build() {
            return new ForEachActivityResponse(activities, batchCount, dependsOn, description, isSequential, items, name, type, userProperties);
        }
    }
}
