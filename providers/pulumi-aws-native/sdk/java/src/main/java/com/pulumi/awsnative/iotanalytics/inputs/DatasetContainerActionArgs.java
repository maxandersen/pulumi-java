// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.awsnative.iotanalytics.inputs.DatasetResourceConfigurationArgs;
import com.pulumi.awsnative.iotanalytics.inputs.DatasetVariableArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetContainerActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetContainerActionArgs Empty = new DatasetContainerActionArgs();

    @Import(name="executionRoleArn", required=true)
    private Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn;
    }

    @Import(name="image", required=true)
    private Output<String> image;

    public Output<String> image() {
        return this.image;
    }

    @Import(name="resourceConfiguration", required=true)
    private Output<DatasetResourceConfigurationArgs> resourceConfiguration;

    public Output<DatasetResourceConfigurationArgs> resourceConfiguration() {
        return this.resourceConfiguration;
    }

    @Import(name="variables")
    private @Nullable Output<List<DatasetVariableArgs>> variables;

    public Optional<Output<List<DatasetVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private DatasetContainerActionArgs() {}

    private DatasetContainerActionArgs(DatasetContainerActionArgs $) {
        this.executionRoleArn = $.executionRoleArn;
        this.image = $.image;
        this.resourceConfiguration = $.resourceConfiguration;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetContainerActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetContainerActionArgs $;

        public Builder() {
            $ = new DatasetContainerActionArgs();
        }

        public Builder(DatasetContainerActionArgs defaults) {
            $ = new DatasetContainerActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder executionRoleArn(Output<String> executionRoleArn) {
            $.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(String executionRoleArn) {
            return executionRoleArn(Output.of(executionRoleArn));
        }

        public Builder image(Output<String> image) {
            $.image = image;
            return this;
        }

        public Builder image(String image) {
            return image(Output.of(image));
        }

        public Builder resourceConfiguration(Output<DatasetResourceConfigurationArgs> resourceConfiguration) {
            $.resourceConfiguration = resourceConfiguration;
            return this;
        }

        public Builder resourceConfiguration(DatasetResourceConfigurationArgs resourceConfiguration) {
            return resourceConfiguration(Output.of(resourceConfiguration));
        }

        public Builder variables(@Nullable Output<List<DatasetVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(List<DatasetVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        public Builder variables(DatasetVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public DatasetContainerActionArgs build() {
            $.executionRoleArn = Objects.requireNonNull($.executionRoleArn, "expected parameter 'executionRoleArn' to be non-null");
            $.image = Objects.requireNonNull($.image, "expected parameter 'image' to be non-null");
            $.resourceConfiguration = Objects.requireNonNull($.resourceConfiguration, "expected parameter 'resourceConfiguration' to be non-null");
            return $;
        }
    }

}
