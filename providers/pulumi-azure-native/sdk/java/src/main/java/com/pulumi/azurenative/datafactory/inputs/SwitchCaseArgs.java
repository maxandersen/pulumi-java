// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.azurenative.datafactory.inputs.AppendVariableActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureDataExplorerCommandActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureFunctionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLBatchExecutionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLExecutePipelineActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.AzureMLUpdateResourceActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ControlActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.CopyActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.CustomActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DataLakeAnalyticsUSQLActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksNotebookActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkJarActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DatabricksSparkPythonActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.DeleteActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteDataFlowActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecutePipelineActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteSSISPackageActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecuteWranglingDataflowActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ExecutionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.FailActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.FilterActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ForEachActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.GetMetadataActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightHiveActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightMapReduceActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightPigActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightSparkActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.HDInsightStreamingActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.IfConditionActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.LookupActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ScriptActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SetVariableActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SqlServerStoredProcedureActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.SwitchActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.UntilActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.ValidationActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WaitActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WebActivityArgs;
import com.pulumi.azurenative.datafactory.inputs.WebHookActivityArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Switch cases with have a value and corresponding activities.
 * 
 */
public final class SwitchCaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwitchCaseArgs Empty = new SwitchCaseArgs();

    /**
     * List of activities to execute for satisfied case condition.
     * 
     */
    @Import(name="activities")
    private @Nullable Output<List<Object>> activities;

    /**
     * @return List of activities to execute for satisfied case condition.
     * 
     */
    public Optional<Output<List<Object>>> activities() {
        return Optional.ofNullable(this.activities);
    }

    /**
     * Expected value that satisfies the expression result of the &#39;on&#39; property.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Expected value that satisfies the expression result of the &#39;on&#39; property.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private SwitchCaseArgs() {}

    private SwitchCaseArgs(SwitchCaseArgs $) {
        this.activities = $.activities;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwitchCaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwitchCaseArgs $;

        public Builder() {
            $ = new SwitchCaseArgs();
        }

        public Builder(SwitchCaseArgs defaults) {
            $ = new SwitchCaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activities List of activities to execute for satisfied case condition.
         * 
         * @return builder
         * 
         */
        public Builder activities(@Nullable Output<List<Object>> activities) {
            $.activities = activities;
            return this;
        }

        /**
         * @param activities List of activities to execute for satisfied case condition.
         * 
         * @return builder
         * 
         */
        public Builder activities(List<Object> activities) {
            return activities(Output.of(activities));
        }

        /**
         * @param activities List of activities to execute for satisfied case condition.
         * 
         * @return builder
         * 
         */
        public Builder activities(Object... activities) {
            return activities(List.of(activities));
        }

        /**
         * @param value Expected value that satisfies the expression result of the &#39;on&#39; property.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Expected value that satisfies the expression result of the &#39;on&#39; property.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SwitchCaseArgs build() {
            return $;
        }
    }

}
