// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.ActivityDependencyResponse;
import com.pulumi.azurenative.datafactory.inputs.AppendVariableActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ControlActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.CopyActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.CustomActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.DeleteActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExecutionActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ExpressionResponse;
import com.pulumi.azurenative.datafactory.inputs.FailActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.FilterActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.ForEachActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.GetMetadataActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.IfConditionActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.LookupActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.SetVariableActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.SwitchCaseResponse;
import com.pulumi.azurenative.datafactory.inputs.UntilActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.UserPropertyResponse;
import com.pulumi.azurenative.datafactory.inputs.ValidationActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.WaitActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.WebActivityResponse;
import com.pulumi.azurenative.datafactory.inputs.WebHookActivityResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This activity evaluates an expression and executes activities under the cases property that correspond to the expression evaluation expected in the equals property.
 * 
 */
public final class SwitchActivityResponse extends com.pulumi.resources.InvokeArgs {

    public static final SwitchActivityResponse Empty = new SwitchActivityResponse();

    /**
     * List of cases that correspond to expected values of the &#39;on&#39; property. This is an optional property and if not provided, the activity will execute activities provided in defaultActivities.
     * 
     */
    @Import(name="cases")
      private final @Nullable List<SwitchCaseResponse> cases;

    public List<SwitchCaseResponse> cases() {
        return this.cases == null ? List.of() : this.cases;
    }

    /**
     * List of activities to execute if no case condition is satisfied. This is an optional property and if not provided, the activity will exit without any action.
     * 
     */
    @Import(name="defaultActivities")
      private final @Nullable List<Object> defaultActivities;

    public List<Object> defaultActivities() {
        return this.defaultActivities == null ? List.of() : this.defaultActivities;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable List<ActivityDependencyResponse> dependsOn;

    public List<ActivityDependencyResponse> dependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * An expression that would evaluate to a string or integer. This is used to determine the block of activities in cases that will be executed.
     * 
     */
    @Import(name="on", required=true)
      private final ExpressionResponse on;

    public ExpressionResponse on() {
        return this.on;
    }

    /**
     * Type of activity.
     * Expected value is &#39;Switch&#39;.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable List<UserPropertyResponse> userProperties;

    public List<UserPropertyResponse> userProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public SwitchActivityResponse(
        @Nullable List<SwitchCaseResponse> cases,
        @Nullable List<Object> defaultActivities,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        String name,
        ExpressionResponse on,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.cases = cases;
        this.defaultActivities = defaultActivities;
        this.dependsOn = dependsOn;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.on = Objects.requireNonNull(on, "expected parameter 'on' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).require();
        this.userProperties = userProperties;
    }

    private SwitchActivityResponse() {
        this.cases = List.of();
        this.defaultActivities = List.of();
        this.dependsOn = List.of();
        this.description = null;
        this.name = null;
        this.on = null;
        this.type = null;
        this.userProperties = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SwitchActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SwitchCaseResponse> cases;
        private @Nullable List<Object> defaultActivities;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private String name;
        private ExpressionResponse on;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(SwitchActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cases = defaults.cases;
    	      this.defaultActivities = defaults.defaultActivities;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.on = defaults.on;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder cases(@Nullable List<SwitchCaseResponse> cases) {
            this.cases = cases;
            return this;
        }
        public Builder cases(SwitchCaseResponse... cases) {
            return cases(List.of(cases));
        }
        public Builder defaultActivities(@Nullable List<Object> defaultActivities) {
            this.defaultActivities = defaultActivities;
            return this;
        }
        public Builder defaultActivities(Object... defaultActivities) {
            return defaultActivities(List.of(defaultActivities));
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder on(ExpressionResponse on) {
            this.on = Objects.requireNonNull(on);
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
        }        public SwitchActivityResponse build() {
            return new SwitchActivityResponse(cases, defaultActivities, dependsOn, description, name, on, type, userProperties);
        }
    }
}
