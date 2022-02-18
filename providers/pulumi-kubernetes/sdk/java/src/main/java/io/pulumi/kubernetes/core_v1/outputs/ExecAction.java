// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecAction {
    /**
     * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    private final @Nullable List<String> command;

    @OutputCustomType.Constructor({"command"})
    private ExecAction(@Nullable List<String> command) {
        this.command = command;
    }

    /**
     * Command is the command line to execute inside the container, the working directory for the command  is root ('/') in the container's filesystem. The command is simply exec'd, it is not run inside a shell, so traditional shell instructions ('|', etc) won't work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public ExecAction build() {
            return new ExecAction(command);
        }
    }
}
