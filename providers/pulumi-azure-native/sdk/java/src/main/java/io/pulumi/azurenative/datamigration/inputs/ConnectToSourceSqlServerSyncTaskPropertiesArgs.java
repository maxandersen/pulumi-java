// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToSourceSqlServerTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to SQL Server and source server requirements for online migration
 * 
 */
public final class ConnectToSourceSqlServerSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToSourceSqlServerSyncTaskPropertiesArgs Empty = new ConnectToSourceSqlServerSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ConnectToSourceSqlServerTaskInputArgs> input;

    public Output<ConnectToSourceSqlServerTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToSource.SqlServer.Sync'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public ConnectToSourceSqlServerSyncTaskPropertiesArgs(
        @Nullable Output<ConnectToSourceSqlServerTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToSourceSqlServerSyncTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourceSqlServerSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConnectToSourceSqlServerTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourceSqlServerSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ConnectToSourceSqlServerTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable ConnectToSourceSqlServerTaskInputArgs input) {
            this.input = Codegen.ofNullable(input);
            return this;
        }
        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }        public ConnectToSourceSqlServerSyncTaskPropertiesArgs build() {
            return new ConnectToSourceSqlServerSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
