// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbTaskPropertiesArgs Empty = new MigrateSqlServerSqlDbTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input;

    public Optional<Output<MigrateSqlServerSqlDbTaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;Migrate.SqlServer.SqlDb&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    private MigrateSqlServerSqlDbTaskPropertiesArgs() {}

    private MigrateSqlServerSqlDbTaskPropertiesArgs(MigrateSqlServerSqlDbTaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateSqlServerSqlDbTaskPropertiesArgs $;

        public Builder() {
            $ = new MigrateSqlServerSqlDbTaskPropertiesArgs();
        }

        public Builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
            $ = new MigrateSqlServerSqlDbTaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder input(@Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(MigrateSqlServerSqlDbTaskInputArgs input) {
            return input(Output.of(input));
        }

        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public MigrateSqlServerSqlDbTaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
