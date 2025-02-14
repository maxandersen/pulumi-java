// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerEnvironmentVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerEnvironmentVariableArgs Empty = new ContainerEnvironmentVariableArgs();

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    @Import(name="variable")
    private @Nullable Output<String> variable;

    public Optional<Output<String>> variable() {
        return Optional.ofNullable(this.variable);
    }

    private ContainerEnvironmentVariableArgs() {}

    private ContainerEnvironmentVariableArgs(ContainerEnvironmentVariableArgs $) {
        this.value = $.value;
        this.variable = $.variable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerEnvironmentVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerEnvironmentVariableArgs $;

        public Builder() {
            $ = new ContainerEnvironmentVariableArgs();
        }

        public Builder(ContainerEnvironmentVariableArgs defaults) {
            $ = new ContainerEnvironmentVariableArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public Builder variable(@Nullable Output<String> variable) {
            $.variable = variable;
            return this;
        }

        public Builder variable(String variable) {
            return variable(Output.of(variable));
        }

        public ContainerEnvironmentVariableArgs build() {
            return $;
        }
    }

}
