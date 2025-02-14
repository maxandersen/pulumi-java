// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.awsnative.customerprofiles.enums.IntegrationTaskType;
import com.pulumi.awsnative.customerprofiles.inputs.IntegrationConnectorOperatorArgs;
import com.pulumi.awsnative.customerprofiles.inputs.IntegrationTaskPropertiesMapArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationTaskArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationTaskArgs Empty = new IntegrationTaskArgs();

    @Import(name="connectorOperator")
    private @Nullable Output<IntegrationConnectorOperatorArgs> connectorOperator;

    public Optional<Output<IntegrationConnectorOperatorArgs>> connectorOperator() {
        return Optional.ofNullable(this.connectorOperator);
    }

    @Import(name="destinationField")
    private @Nullable Output<String> destinationField;

    public Optional<Output<String>> destinationField() {
        return Optional.ofNullable(this.destinationField);
    }

    @Import(name="sourceFields", required=true)
    private Output<List<String>> sourceFields;

    public Output<List<String>> sourceFields() {
        return this.sourceFields;
    }

    @Import(name="taskProperties")
    private @Nullable Output<List<IntegrationTaskPropertiesMapArgs>> taskProperties;

    public Optional<Output<List<IntegrationTaskPropertiesMapArgs>>> taskProperties() {
        return Optional.ofNullable(this.taskProperties);
    }

    @Import(name="taskType", required=true)
    private Output<IntegrationTaskType> taskType;

    public Output<IntegrationTaskType> taskType() {
        return this.taskType;
    }

    private IntegrationTaskArgs() {}

    private IntegrationTaskArgs(IntegrationTaskArgs $) {
        this.connectorOperator = $.connectorOperator;
        this.destinationField = $.destinationField;
        this.sourceFields = $.sourceFields;
        this.taskProperties = $.taskProperties;
        this.taskType = $.taskType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationTaskArgs $;

        public Builder() {
            $ = new IntegrationTaskArgs();
        }

        public Builder(IntegrationTaskArgs defaults) {
            $ = new IntegrationTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder connectorOperator(@Nullable Output<IntegrationConnectorOperatorArgs> connectorOperator) {
            $.connectorOperator = connectorOperator;
            return this;
        }

        public Builder connectorOperator(IntegrationConnectorOperatorArgs connectorOperator) {
            return connectorOperator(Output.of(connectorOperator));
        }

        public Builder destinationField(@Nullable Output<String> destinationField) {
            $.destinationField = destinationField;
            return this;
        }

        public Builder destinationField(String destinationField) {
            return destinationField(Output.of(destinationField));
        }

        public Builder sourceFields(Output<List<String>> sourceFields) {
            $.sourceFields = sourceFields;
            return this;
        }

        public Builder sourceFields(List<String> sourceFields) {
            return sourceFields(Output.of(sourceFields));
        }

        public Builder sourceFields(String... sourceFields) {
            return sourceFields(List.of(sourceFields));
        }

        public Builder taskProperties(@Nullable Output<List<IntegrationTaskPropertiesMapArgs>> taskProperties) {
            $.taskProperties = taskProperties;
            return this;
        }

        public Builder taskProperties(List<IntegrationTaskPropertiesMapArgs> taskProperties) {
            return taskProperties(Output.of(taskProperties));
        }

        public Builder taskProperties(IntegrationTaskPropertiesMapArgs... taskProperties) {
            return taskProperties(List.of(taskProperties));
        }

        public Builder taskType(Output<IntegrationTaskType> taskType) {
            $.taskType = taskType;
            return this;
        }

        public Builder taskType(IntegrationTaskType taskType) {
            return taskType(Output.of(taskType));
        }

        public IntegrationTaskArgs build() {
            $.sourceFields = Objects.requireNonNull($.sourceFields, "expected parameter 'sourceFields' to be non-null");
            $.taskType = Objects.requireNonNull($.taskType, "expected parameter 'taskType' to be non-null");
            return $;
        }
    }

}
