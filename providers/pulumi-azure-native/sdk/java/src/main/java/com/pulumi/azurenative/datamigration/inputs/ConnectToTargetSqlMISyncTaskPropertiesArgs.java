// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetSqlMISyncTaskInputArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure SQL Database Managed Instance
 * 
 */
public final class ConnectToTargetSqlMISyncTaskPropertiesArgs extends ResourceArgs {

    public static final ConnectToTargetSqlMISyncTaskPropertiesArgs Empty = new ConnectToTargetSqlMISyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<ConnectToTargetSqlMISyncTaskInputArgs> input;

    /**
     * @return Task input
     * 
     */
    public Optional<Output<ConnectToTargetSqlMISyncTaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private ConnectToTargetSqlMISyncTaskPropertiesArgs() {}

    private ConnectToTargetSqlMISyncTaskPropertiesArgs(ConnectToTargetSqlMISyncTaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToTargetSqlMISyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToTargetSqlMISyncTaskPropertiesArgs $;

        public Builder() {
            $ = new ConnectToTargetSqlMISyncTaskPropertiesArgs();
        }

        public Builder(ConnectToTargetSqlMISyncTaskPropertiesArgs defaults) {
            $ = new ConnectToTargetSqlMISyncTaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<ConnectToTargetSqlMISyncTaskInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(ConnectToTargetSqlMISyncTaskInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(Output<String> taskType) {
            $.taskType = taskType;
            return this;
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ConnectToTarget.AzureSqlDbMI.Sync.LRS&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ConnectToTargetSqlMISyncTaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
