// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse;
import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure Database For PostgreSQL server and target server requirements for online migration
 * 
 */
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse Empty = new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @Import(name="commands", required=true)
    private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @Import(name="errors", required=true)
    private List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> errors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input;

    public Optional<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @Import(name="output", required=true)
    private List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output;

    public List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToTarget.AzureDbForPostgreSql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private String taskType;

    public String taskType() {
        return this.taskType;
    }

    private ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse() {}

    private ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse $) {
        this.commands = $.commands;
        this.errors = $.errors;
        this.input = $.input;
        this.output = $.output;
        this.state = $.state;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse $;

        public Builder() {
            $ = new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse();
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse defaults) {
            $ = new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            $.commands = commands;
            return this;
        }

        public Builder commands(Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>... commands) {
            return commands(List.of(commands));
        }

        public Builder errors(List<ODataErrorResponse> errors) {
            $.errors = errors;
            return this;
        }

        public Builder errors(ODataErrorResponse... errors) {
            return errors(List.of(errors));
        }

        public Builder input(@Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputResponse input) {
            $.input = input;
            return this;
        }

        public Builder output(List<ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse> output) {
            $.output = output;
            return this;
        }

        public Builder output(ConnectToTargetAzureDbForPostgreSqlSyncTaskOutputResponse... output) {
            return output(List.of(output));
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public Builder taskType(String taskType) {
            $.taskType = taskType;
            return this;
        }

        public ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesResponse build() {
            $.commands = Objects.requireNonNull($.commands, "expected parameter 'commands' to be non-null");
            $.errors = Objects.requireNonNull($.errors, "expected parameter 'errors' to be non-null");
            $.output = Objects.requireNonNull($.output, "expected parameter 'output' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            $.taskType = Codegen.stringProp("taskType").arg($.taskType).require();
            return $;
        }
    }

}
