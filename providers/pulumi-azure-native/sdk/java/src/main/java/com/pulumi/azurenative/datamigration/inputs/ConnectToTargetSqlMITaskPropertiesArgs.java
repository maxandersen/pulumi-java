// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ConnectToTargetSqlMITaskInputArgs;
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
public final class ConnectToTargetSqlMITaskPropertiesArgs extends ResourceArgs {

    public static final ConnectToTargetSqlMITaskPropertiesArgs Empty = new ConnectToTargetSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
    private @Nullable Output<ConnectToTargetSqlMITaskInputArgs> input;

    /**
     * @return Task input
     * 
     */
    public Optional<Output<ConnectToTargetSqlMITaskInputArgs>> input() {
        return Optional.ofNullable(this.input);
    }

    /**
     * Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI&#39;.
     * 
     */
    @Import(name="taskType", required=true)
    private Output<String> taskType;

    /**
     * @return Task type.
     * Expected value is &#39;ConnectToTarget.AzureSqlDbMI&#39;.
     * 
     */
    public Output<String> taskType() {
        return this.taskType;
    }

    private ConnectToTargetSqlMITaskPropertiesArgs() {}

    private ConnectToTargetSqlMITaskPropertiesArgs(ConnectToTargetSqlMITaskPropertiesArgs $) {
        this.input = $.input;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToTargetSqlMITaskPropertiesArgs $;

        public Builder() {
            $ = new ConnectToTargetSqlMITaskPropertiesArgs();
        }

        public Builder(ConnectToTargetSqlMITaskPropertiesArgs defaults) {
            $ = new ConnectToTargetSqlMITaskPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(@Nullable Output<ConnectToTargetSqlMITaskInputArgs> input) {
            $.input = input;
            return this;
        }

        /**
         * @param input Task input
         * 
         * @return builder
         * 
         */
        public Builder input(ConnectToTargetSqlMITaskInputArgs input) {
            return input(Output.of(input));
        }

        /**
         * @param taskType Task type.
         * Expected value is &#39;ConnectToTarget.AzureSqlDbMI&#39;.
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
         * Expected value is &#39;ConnectToTarget.AzureSqlDbMI&#39;.
         * 
         * @return builder
         * 
         */
        public Builder taskType(String taskType) {
            return taskType(Output.of(taskType));
        }

        public ConnectToTargetSqlMITaskPropertiesArgs build() {
            $.taskType = Codegen.stringProp("taskType").output().arg($.taskType).require();
            return $;
        }
    }

}
