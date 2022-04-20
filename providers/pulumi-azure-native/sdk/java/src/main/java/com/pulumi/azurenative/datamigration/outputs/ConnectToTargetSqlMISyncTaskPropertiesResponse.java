// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlMISyncTaskInputResponse;
import com.pulumi.azurenative.datamigration.outputs.ConnectToTargetSqlMISyncTaskOutputResponse;
import com.pulumi.azurenative.datamigration.outputs.MigrateMISyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandPropertiesResponse;
import com.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectToTargetSqlMISyncTaskPropertiesResponse {
    /**
     * Array of command properties.
     * 
     */
    private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    private final List<ODataErrorResponse> errors;
    /**
     * Task input
     * 
     */
    private final @Nullable ConnectToTargetSqlMISyncTaskInputResponse input;
    /**
     * Task output. This is ignored if submitted.
     * 
     */
    private final List<ConnectToTargetSqlMISyncTaskOutputResponse> output;
    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    private final String state;
    /**
     * Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
     * 
     */
    private final String taskType;

    @CustomType.Constructor
    private ConnectToTargetSqlMISyncTaskPropertiesResponse(
        @CustomType.Parameter("commands") List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        @CustomType.Parameter("errors") List<ODataErrorResponse> errors,
        @CustomType.Parameter("input") @Nullable ConnectToTargetSqlMISyncTaskInputResponse input,
        @CustomType.Parameter("output") List<ConnectToTargetSqlMISyncTaskOutputResponse> output,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("taskType") String taskType) {
        this.commands = commands;
        this.errors = errors;
        this.input = input;
        this.output = output;
        this.state = state;
        this.taskType = taskType;
    }

    /**
     * Array of command properties.
     * 
    */
    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands() {
        return this.commands;
    }
    /**
     * Array of errors. This is ignored if submitted.
     * 
    */
    public List<ODataErrorResponse> errors() {
        return this.errors;
    }
    /**
     * Task input
     * 
    */
    public Optional<ConnectToTargetSqlMISyncTaskInputResponse> input() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Task output. This is ignored if submitted.
     * 
    */
    public List<ConnectToTargetSqlMISyncTaskOutputResponse> output() {
        return this.output;
    }
    /**
     * The state of the task. This is ignored if submitted.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
     * 
    */
    public String taskType() {
        return this.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetSqlMISyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable ConnectToTargetSqlMISyncTaskInputResponse input;
        private List<ConnectToTargetSqlMISyncTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetSqlMISyncTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }
        public Builder commands(Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>... commands) {
            return commands(List.of(commands));
        }
        public Builder errors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(ODataErrorResponse... errors) {
            return errors(List.of(errors));
        }
        public Builder input(@Nullable ConnectToTargetSqlMISyncTaskInputResponse input) {
            this.input = input;
            return this;
        }
        public Builder output(List<ConnectToTargetSqlMISyncTaskOutputResponse> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }
        public Builder output(ConnectToTargetSqlMISyncTaskOutputResponse... output) {
            return output(List.of(output));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }        public ConnectToTargetSqlMISyncTaskPropertiesResponse build() {
            return new ConnectToTargetSqlMISyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
