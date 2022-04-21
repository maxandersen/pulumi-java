// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToSourcePostgreSqlSyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input;

    public Optional<Output<ConnectToSourcePostgreSqlSyncTaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToSource.PostgreSql.Sync&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    public Output<String> taskType() {
        return this.taskType;
    }

    private ConnectToSourcePostgreSqlSyncTaskPropertiesArgs() {}

    private ConnectToSourcePostgreSqlSyncTaskPropertiesArgs(ConnectToSourcePostgreSqlSyncTaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToSourcePostgreSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToSourcePostgreSqlSyncTaskPropertiesArgs $;

        public Builder() {
            $ = new ConnectToSourcePostgreSqlSyncTaskPropertiesArgs();
        }

        public Builder(ConnectToSourcePostgreSqlSyncTaskPropertiesArgs defaults) {
            $ = new ConnectToSourcePostgreSqlSyncTaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder input(@Nullable Output<ConnectToSourcePostgreSqlSyncTaskInputArgs> input) {
            $.input = input;
            return this;
        }

        public Builder input(ConnectToSourcePostgreSqlSyncTaskInputArgs input) {
            return input(Output.of(input));
        }

        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ConnectToSourcePostgreSqlSyncTaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
