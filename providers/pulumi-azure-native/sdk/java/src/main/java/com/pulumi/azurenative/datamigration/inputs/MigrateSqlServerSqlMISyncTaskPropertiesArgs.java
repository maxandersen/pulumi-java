// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMISyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that migrates SQL Server databases to Azure SQL Database Managed Instance sync scenario
 * 
 */
public final class MigrateSqlServerSqlMISyncTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlMISyncTaskPropertiesArgs Empty = new MigrateSqlServerSqlMISyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<MigrateSqlServerSqlMISyncTaskInputArgs> input;

    public Output<MigrateSqlServerSqlMISyncTaskInputArgs> input() {
        return this.input == null ? Codegen.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is &#39;Migrate.SqlServer.AzureSqlDbMI.Sync.LRS&#39;.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlMISyncTaskPropertiesArgs(
        @Nullable Output<MigrateSqlServerSqlMISyncTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Codegen.stringProp("taskType").output().arg(taskType).require();
    }

    private MigrateSqlServerSqlMISyncTaskPropertiesArgs() {
        this.input = Codegen.empty();
        this.taskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMISyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MigrateSqlServerSqlMISyncTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMISyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<MigrateSqlServerSqlMISyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }
        public Builder input(@Nullable MigrateSqlServerSqlMISyncTaskInputArgs input) {
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
        }        public MigrateSqlServerSqlMISyncTaskPropertiesArgs build() {
            return new MigrateSqlServerSqlMISyncTaskPropertiesArgs(input, taskType);
        }
    }
}
