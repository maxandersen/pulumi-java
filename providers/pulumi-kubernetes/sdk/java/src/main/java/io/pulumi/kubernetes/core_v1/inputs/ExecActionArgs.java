// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ExecActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecActionArgs Empty = new ExecActionArgs();

    @InputImport(name="command")
    private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    public ExecActionArgs(@Nullable Input<List<String>> command) {
        this.command = command;
    }

    private ExecActionArgs() {
        this.command = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder setCommand(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public ExecActionArgs build() {
            return new ExecActionArgs(command);
        }
    }
}
