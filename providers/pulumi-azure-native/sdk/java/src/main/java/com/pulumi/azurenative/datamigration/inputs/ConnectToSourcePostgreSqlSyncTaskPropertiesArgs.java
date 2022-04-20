// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToSourcePostgreSqlSyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to PostgreSQL server and source server requirements for online migration
 * 
 */
public final class ConnectToSourcePostgreSqlSyncTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectToSourcePostgreSqlSyncTaskPropertiesArgs Empty = new ConnectToSourcePostgreSqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input;

    public Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToSource.PostgreSql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public ConnectToSourcePostgreSqlSyncTaskPropertiesArgs(
        @Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Codegen.stringProp("taskType").output().arg(taskType).require();
    }

    private ConnectToSourcePostgreSqlSyncTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable ConnectToSourcePostgreSqlSyncTaskInputArgs input) {
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
        }        public ConnectToSourcePostgreSqlSyncTaskPropertiesArgs build() {
            return new ConnectToSourcePostgreSqlSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
