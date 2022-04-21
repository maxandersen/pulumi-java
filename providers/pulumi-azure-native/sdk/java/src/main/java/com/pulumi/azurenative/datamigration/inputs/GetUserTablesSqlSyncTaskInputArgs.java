// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlSyncTaskInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetUserTablesSqlSyncTaskInputArgs Empty = new GetUserTablesSqlSyncTaskInputArgs();

    /**
     * List of source database names to collect tables for
     * 
     */
    @Import(name="selectedSourceDatabases", required=true)
    private Output<List<String>> selectedSourceDatabases;

    public Output<List<String>> selectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    /**
     * List of target database names to collect tables for
     * 
     */
    @Import(name="selectedTargetDatabases", required=true)
    private Output<List<String>> selectedTargetDatabases;

    public Output<List<String>> selectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    /**
     * Connection information for SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> sourceConnectionInfo;

    public Output<SqlConnectionInfoArgs> sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for SQL DB
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private Output<SqlConnectionInfoArgs> targetConnectionInfo;

    public Output<SqlConnectionInfoArgs> targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private GetUserTablesSqlSyncTaskInputArgs() {}

    private GetUserTablesSqlSyncTaskInputArgs(GetUserTablesSqlSyncTaskInputArgs $) {
        this.selectedSourceDatabases = $.selectedSourceDatabases;
        this.selectedTargetDatabases = $.selectedTargetDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserTablesSqlSyncTaskInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserTablesSqlSyncTaskInputArgs $;

        public Builder() {
            $ = new GetUserTablesSqlSyncTaskInputArgs();
        }

        public Builder(GetUserTablesSqlSyncTaskInputArgs defaults) {
            $ = new GetUserTablesSqlSyncTaskInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder selectedSourceDatabases(Output<List<String>> selectedSourceDatabases) {
            $.selectedSourceDatabases = selectedSourceDatabases;
            return this;
        }

        public Builder selectedSourceDatabases(List<String> selectedSourceDatabases) {
            return selectedSourceDatabases(Output.of(selectedSourceDatabases));
        }

        public Builder selectedSourceDatabases(String... selectedSourceDatabases) {
            return selectedSourceDatabases(List.of(selectedSourceDatabases));
        }

        public Builder selectedTargetDatabases(Output<List<String>> selectedTargetDatabases) {
            $.selectedTargetDatabases = selectedTargetDatabases;
            return this;
        }

        public Builder selectedTargetDatabases(List<String> selectedTargetDatabases) {
            return selectedTargetDatabases(Output.of(selectedTargetDatabases));
        }

        public Builder selectedTargetDatabases(String... selectedTargetDatabases) {
            return selectedTargetDatabases(List.of(selectedTargetDatabases));
        }

        public Builder sourceConnectionInfo(Output<SqlConnectionInfoArgs> sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoArgs sourceConnectionInfo) {
            return sourceConnectionInfo(Output.of(sourceConnectionInfo));
        }

        public Builder targetConnectionInfo(Output<SqlConnectionInfoArgs> targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoArgs targetConnectionInfo) {
            return targetConnectionInfo(Output.of(targetConnectionInfo));
        }

        public GetUserTablesSqlSyncTaskInputArgs build() {
            $.selectedSourceDatabases = Objects.requireNonNull($.selectedSourceDatabases, "expected parameter 'selectedSourceDatabases' to be non-null");
            $.selectedTargetDatabases = Objects.requireNonNull($.selectedTargetDatabases, "expected parameter 'selectedTargetDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}
