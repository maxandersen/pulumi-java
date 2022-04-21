// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates PostgreSQL databases to Azure Database for PostgreSQL for online migrations
 * 
 */
public final class MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs Empty = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input;

    public Optional<Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;Migrate.PostgreSql.AzureDbForPostgreSql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs() {}

    private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs $;

        public Builder() {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs();
        }

        public Builder(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
            $ = new MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder input(@Nullable Output<MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(MigratePostgreSqlAzureDbForPostgreSqlSyncTaskInputArgs input) {
            return input(Output.of(input));
        }

        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public MigratePostgreSqlAzureDbForPostgreSqlSyncTaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
