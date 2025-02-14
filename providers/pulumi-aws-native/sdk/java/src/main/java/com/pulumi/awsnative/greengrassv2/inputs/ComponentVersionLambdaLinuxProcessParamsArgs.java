// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.greengrassv2.inputs;

import com.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaLinuxProcessParamsIsolationMode;
import com.pulumi.awsnative.greengrassv2.inputs.ComponentVersionLambdaContainerParamsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ComponentVersionLambdaLinuxProcessParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ComponentVersionLambdaLinuxProcessParamsArgs Empty = new ComponentVersionLambdaLinuxProcessParamsArgs();

    @Import(name="containerParams")
    private @Nullable Output<ComponentVersionLambdaContainerParamsArgs> containerParams;

    public Optional<Output<ComponentVersionLambdaContainerParamsArgs>> containerParams() {
        return Optional.ofNullable(this.containerParams);
    }

    @Import(name="isolationMode")
    private @Nullable Output<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode;

    public Optional<Output<ComponentVersionLambdaLinuxProcessParamsIsolationMode>> isolationMode() {
        return Optional.ofNullable(this.isolationMode);
    }

    private ComponentVersionLambdaLinuxProcessParamsArgs() {}

    private ComponentVersionLambdaLinuxProcessParamsArgs(ComponentVersionLambdaLinuxProcessParamsArgs $) {
        this.containerParams = $.containerParams;
        this.isolationMode = $.isolationMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ComponentVersionLambdaLinuxProcessParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ComponentVersionLambdaLinuxProcessParamsArgs $;

        public Builder() {
            $ = new ComponentVersionLambdaLinuxProcessParamsArgs();
        }

        public Builder(ComponentVersionLambdaLinuxProcessParamsArgs defaults) {
            $ = new ComponentVersionLambdaLinuxProcessParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerParams(@Nullable Output<ComponentVersionLambdaContainerParamsArgs> containerParams) {
            $.containerParams = containerParams;
            return this;
        }

        public Builder containerParams(ComponentVersionLambdaContainerParamsArgs containerParams) {
            return containerParams(Output.of(containerParams));
        }

        public Builder isolationMode(@Nullable Output<ComponentVersionLambdaLinuxProcessParamsIsolationMode> isolationMode) {
            $.isolationMode = isolationMode;
            return this;
        }

        public Builder isolationMode(ComponentVersionLambdaLinuxProcessParamsIsolationMode isolationMode) {
            return isolationMode(Output.of(isolationMode));
        }

        public ComponentVersionLambdaLinuxProcessParamsArgs build() {
            return $;
        }
    }

}
