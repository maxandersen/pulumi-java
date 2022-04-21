// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.SqlConnectionInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Input for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlSyncTaskInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final GetUserTablesSqlSyncTaskInputResponse Empty = new GetUserTablesSqlSyncTaskInputResponse();

    /**
     * List of source database names to collect tables for
     * 
     */
    @Import(name="selectedSourceDatabases", required=true)
    private List<String> selectedSourceDatabases;

    public List<String> selectedSourceDatabases() {
        return this.selectedSourceDatabases;
    }

    /**
     * List of target database names to collect tables for
     * 
     */
    @Import(name="selectedTargetDatabases", required=true)
    private List<String> selectedTargetDatabases;

    public List<String> selectedTargetDatabases() {
        return this.selectedTargetDatabases;
    }

    /**
     * Connection information for SQL Server
     * 
     */
    @Import(name="sourceConnectionInfo", required=true)
    private SqlConnectionInfoResponse sourceConnectionInfo;

    public SqlConnectionInfoResponse sourceConnectionInfo() {
        return this.sourceConnectionInfo;
    }

    /**
     * Connection information for SQL DB
     * 
     */
    @Import(name="targetConnectionInfo", required=true)
    private SqlConnectionInfoResponse targetConnectionInfo;

    public SqlConnectionInfoResponse targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    private GetUserTablesSqlSyncTaskInputResponse() {}

    private GetUserTablesSqlSyncTaskInputResponse(GetUserTablesSqlSyncTaskInputResponse $) {
        this.selectedSourceDatabases = $.selectedSourceDatabases;
        this.selectedTargetDatabases = $.selectedTargetDatabases;
        this.sourceConnectionInfo = $.sourceConnectionInfo;
        this.targetConnectionInfo = $.targetConnectionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUserTablesSqlSyncTaskInputResponse $;

        public Builder() {
            $ = new GetUserTablesSqlSyncTaskInputResponse();
        }

        public Builder(GetUserTablesSqlSyncTaskInputResponse defaults) {
            $ = new GetUserTablesSqlSyncTaskInputResponse(Objects.requireNonNull(defaults));
        }

        public Builder selectedSourceDatabases(List<String> selectedSourceDatabases) {
            $.selectedSourceDatabases = selectedSourceDatabases;
            return this;
        }

        public Builder selectedSourceDatabases(String... selectedSourceDatabases) {
            return selectedSourceDatabases(List.of(selectedSourceDatabases));
        }

        public Builder selectedTargetDatabases(List<String> selectedTargetDatabases) {
            $.selectedTargetDatabases = selectedTargetDatabases;
            return this;
        }

        public Builder selectedTargetDatabases(String... selectedTargetDatabases) {
            return selectedTargetDatabases(List.of(selectedTargetDatabases));
        }

        public Builder sourceConnectionInfo(SqlConnectionInfoResponse sourceConnectionInfo) {
            $.sourceConnectionInfo = sourceConnectionInfo;
            return this;
        }

        public Builder targetConnectionInfo(SqlConnectionInfoResponse targetConnectionInfo) {
            $.targetConnectionInfo = targetConnectionInfo;
            return this;
        }

        public GetUserTablesSqlSyncTaskInputResponse build() {
            $.selectedSourceDatabases = Objects.requireNonNull($.selectedSourceDatabases, "expected parameter 'selectedSourceDatabases' to be non-null");
            $.selectedTargetDatabases = Objects.requireNonNull($.selectedTargetDatabases, "expected parameter 'selectedTargetDatabases' to be non-null");
            $.sourceConnectionInfo = Objects.requireNonNull($.sourceConnectionInfo, "expected parameter 'sourceConnectionInfo' to be non-null");
            $.targetConnectionInfo = Objects.requireNonNull($.targetConnectionInfo, "expected parameter 'targetConnectionInfo' to be non-null");
            return $;
        }
    }

}
