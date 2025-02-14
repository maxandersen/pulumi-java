// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.awsnative.appflow.enums.FlowWriteOperationType;
import com.pulumi.awsnative.appflow.inputs.FlowErrorHandlingConfigArgs;
import com.pulumi.awsnative.appflow.inputs.FlowSuccessResponseHandlingConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FlowSAPODataDestinationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlowSAPODataDestinationPropertiesArgs Empty = new FlowSAPODataDestinationPropertiesArgs();

    @Import(name="errorHandlingConfig")
    private @Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig;

    public Optional<Output<FlowErrorHandlingConfigArgs>> errorHandlingConfig() {
        return Optional.ofNullable(this.errorHandlingConfig);
    }

    /**
     * List of fields used as ID when performing a write operation.
     * 
     */
    @Import(name="idFieldNames")
    private @Nullable Output<List<String>> idFieldNames;

    /**
     * @return List of fields used as ID when performing a write operation.
     * 
     */
    public Optional<Output<List<String>>> idFieldNames() {
        return Optional.ofNullable(this.idFieldNames);
    }

    @Import(name="objectPath", required=true)
    private Output<String> objectPath;

    public Output<String> objectPath() {
        return this.objectPath;
    }

    @Import(name="successResponseHandlingConfig")
    private @Nullable Output<FlowSuccessResponseHandlingConfigArgs> successResponseHandlingConfig;

    public Optional<Output<FlowSuccessResponseHandlingConfigArgs>> successResponseHandlingConfig() {
        return Optional.ofNullable(this.successResponseHandlingConfig);
    }

    @Import(name="writeOperationType")
    private @Nullable Output<FlowWriteOperationType> writeOperationType;

    public Optional<Output<FlowWriteOperationType>> writeOperationType() {
        return Optional.ofNullable(this.writeOperationType);
    }

    private FlowSAPODataDestinationPropertiesArgs() {}

    private FlowSAPODataDestinationPropertiesArgs(FlowSAPODataDestinationPropertiesArgs $) {
        this.errorHandlingConfig = $.errorHandlingConfig;
        this.idFieldNames = $.idFieldNames;
        this.objectPath = $.objectPath;
        this.successResponseHandlingConfig = $.successResponseHandlingConfig;
        this.writeOperationType = $.writeOperationType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlowSAPODataDestinationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlowSAPODataDestinationPropertiesArgs $;

        public Builder() {
            $ = new FlowSAPODataDestinationPropertiesArgs();
        }

        public Builder(FlowSAPODataDestinationPropertiesArgs defaults) {
            $ = new FlowSAPODataDestinationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorHandlingConfig(@Nullable Output<FlowErrorHandlingConfigArgs> errorHandlingConfig) {
            $.errorHandlingConfig = errorHandlingConfig;
            return this;
        }

        public Builder errorHandlingConfig(FlowErrorHandlingConfigArgs errorHandlingConfig) {
            return errorHandlingConfig(Output.of(errorHandlingConfig));
        }

        /**
         * @param idFieldNames List of fields used as ID when performing a write operation.
         * 
         * @return builder
         * 
         */
        public Builder idFieldNames(@Nullable Output<List<String>> idFieldNames) {
            $.idFieldNames = idFieldNames;
            return this;
        }

        /**
         * @param idFieldNames List of fields used as ID when performing a write operation.
         * 
         * @return builder
         * 
         */
        public Builder idFieldNames(List<String> idFieldNames) {
            return idFieldNames(Output.of(idFieldNames));
        }

        /**
         * @param idFieldNames List of fields used as ID when performing a write operation.
         * 
         * @return builder
         * 
         */
        public Builder idFieldNames(String... idFieldNames) {
            return idFieldNames(List.of(idFieldNames));
        }

        public Builder objectPath(Output<String> objectPath) {
            $.objectPath = objectPath;
            return this;
        }

        public Builder objectPath(String objectPath) {
            return objectPath(Output.of(objectPath));
        }

        public Builder successResponseHandlingConfig(@Nullable Output<FlowSuccessResponseHandlingConfigArgs> successResponseHandlingConfig) {
            $.successResponseHandlingConfig = successResponseHandlingConfig;
            return this;
        }

        public Builder successResponseHandlingConfig(FlowSuccessResponseHandlingConfigArgs successResponseHandlingConfig) {
            return successResponseHandlingConfig(Output.of(successResponseHandlingConfig));
        }

        public Builder writeOperationType(@Nullable Output<FlowWriteOperationType> writeOperationType) {
            $.writeOperationType = writeOperationType;
            return this;
        }

        public Builder writeOperationType(FlowWriteOperationType writeOperationType) {
            return writeOperationType(Output.of(writeOperationType));
        }

        public FlowSAPODataDestinationPropertiesArgs build() {
            $.objectPath = Objects.requireNonNull($.objectPath, "expected parameter 'objectPath' to be non-null");
            return $;
        }
    }

}
