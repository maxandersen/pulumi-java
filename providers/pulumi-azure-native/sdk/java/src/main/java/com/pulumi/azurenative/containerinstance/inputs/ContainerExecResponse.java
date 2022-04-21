// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The container execution command, for liveness or readiness probe
 * 
 */
public final class ContainerExecResponse extends com.pulumi.resources.InvokeArgs {

    public static final ContainerExecResponse Empty = new ContainerExecResponse();

    /**
     * The commands to execute within the container.
     * 
     */
    @Import(name="command")
    private @Nullable List<String> command;

    public Optional<List<String>> command() {
        return Optional.ofNullable(this.command);
    }

    private ContainerExecResponse() {}

    private ContainerExecResponse(ContainerExecResponse $) {
        this.command = $.command;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerExecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerExecResponse $;

        public Builder() {
            $ = new ContainerExecResponse();
        }

        public Builder(ContainerExecResponse defaults) {
            $ = new ContainerExecResponse(Objects.requireNonNull(defaults));
        }

        public Builder command(@Nullable List<String> command) {
            $.command = command;
            return this;
        }

        public Builder command(String... command) {
            return command(List.of(command));
        }

        public ContainerExecResponse build() {
            return $;
        }
    }

}
