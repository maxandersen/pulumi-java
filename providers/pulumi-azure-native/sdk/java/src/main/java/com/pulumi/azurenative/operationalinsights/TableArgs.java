// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights;

import com.pulumi.azurenative.operationalinsights.enums.TablePlanEnum;
import com.pulumi.azurenative.operationalinsights.inputs.RestoredLogsArgs;
import com.pulumi.azurenative.operationalinsights.inputs.SchemaArgs;
import com.pulumi.azurenative.operationalinsights.inputs.SearchResultsArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * The table plan.
     * 
     */
    @Import(name="plan")
    private @Nullable Output<Either<String,TablePlanEnum>> plan;

    public Optional<Output<Either<String,TablePlanEnum>>> plan() {
        return Optional.ofNullable(this.plan);
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Parameters of the restore operation that initiated this table.
     * 
     */
    @Import(name="restoredLogs")
    private @Nullable Output<RestoredLogsArgs> restoredLogs;

    public Optional<Output<RestoredLogsArgs>> restoredLogs() {
        return Optional.ofNullable(this.restoredLogs);
    }

    /**
     * The data table data retention in days, between 4 and 730. Setting this property to null will default to the workspace retention.
     * 
     */
    @Import(name="retentionInDays")
    private @Nullable Output<Integer> retentionInDays;

    public Optional<Output<Integer>> retentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }

    /**
     * Table schema.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<SchemaArgs> schema;

    public Optional<Output<SchemaArgs>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Parameters of the search job that initiated this table.
     * 
     */
    @Import(name="searchResults")
    private @Nullable Output<SearchResultsArgs> searchResults;

    public Optional<Output<SearchResultsArgs>> searchResults() {
        return Optional.ofNullable(this.searchResults);
    }

    /**
     * The name of the table.
     * 
     */
    @Import(name="tableName")
    private @Nullable Output<String> tableName;

    public Optional<Output<String>> tableName() {
        return Optional.ofNullable(this.tableName);
    }

    /**
     * The table data total retention in days, between 4 and 2555. Setting this property to null will default to table retention.
     * 
     */
    @Import(name="totalRetentionInDays")
    private @Nullable Output<Integer> totalRetentionInDays;

    public Optional<Output<Integer>> totalRetentionInDays() {
        return Optional.ofNullable(this.totalRetentionInDays);
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
    private Output<String> workspaceName;

    public Output<String> workspaceName() {
        return this.workspaceName;
    }

    private TableArgs() {}

    private TableArgs(TableArgs $) {
        this.plan = $.plan;
        this.resourceGroupName = $.resourceGroupName;
        this.restoredLogs = $.restoredLogs;
        this.retentionInDays = $.retentionInDays;
        this.schema = $.schema;
        this.searchResults = $.searchResults;
        this.tableName = $.tableName;
        this.totalRetentionInDays = $.totalRetentionInDays;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableArgs $;

        public Builder() {
            $ = new TableArgs();
        }

        public Builder(TableArgs defaults) {
            $ = new TableArgs(Objects.requireNonNull(defaults));
        }

        public Builder plan(@Nullable Output<Either<String,TablePlanEnum>> plan) {
            $.plan = plan;
            return this;
        }

        public Builder plan(Either<String,TablePlanEnum> plan) {
            return plan(Output.of(plan));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder restoredLogs(@Nullable Output<RestoredLogsArgs> restoredLogs) {
            $.restoredLogs = restoredLogs;
            return this;
        }

        public Builder restoredLogs(RestoredLogsArgs restoredLogs) {
            return restoredLogs(Output.of(restoredLogs));
        }

        public Builder retentionInDays(@Nullable Output<Integer> retentionInDays) {
            $.retentionInDays = retentionInDays;
            return this;
        }

        public Builder retentionInDays(Integer retentionInDays) {
            return retentionInDays(Output.of(retentionInDays));
        }

        public Builder schema(@Nullable Output<SchemaArgs> schema) {
            $.schema = schema;
            return this;
        }

        public Builder schema(SchemaArgs schema) {
            return schema(Output.of(schema));
        }

        public Builder searchResults(@Nullable Output<SearchResultsArgs> searchResults) {
            $.searchResults = searchResults;
            return this;
        }

        public Builder searchResults(SearchResultsArgs searchResults) {
            return searchResults(Output.of(searchResults));
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public Builder totalRetentionInDays(@Nullable Output<Integer> totalRetentionInDays) {
            $.totalRetentionInDays = totalRetentionInDays;
            return this;
        }

        public Builder totalRetentionInDays(Integer totalRetentionInDays) {
            return totalRetentionInDays(Output.of(totalRetentionInDays));
        }

        public Builder workspaceName(Output<String> workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            return workspaceName(Output.of(workspaceName));
        }

        public TableArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
