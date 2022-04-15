// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details about files that caused a compliance check to fail.
 * 
 */
public final class NonCompliantFileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonCompliantFileArgs Empty = new NonCompliantFileArgs();

    /**
     * Command to display the non-compliant files.
     * 
     */
    @Import(name="displayCommand")
      private final @Nullable Output<String> displayCommand;

    public Output<String> displayCommand() {
        return this.displayCommand == null ? Codegen.empty() : this.displayCommand;
    }

    /**
     * display_command is a single command that can be used to display a list of non compliant files. When there is no such command, we can also iterate a list of non compliant file using 'path'. Empty if `display_command` is set.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> path() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * Explains why a file is non compliant for a CIS check.
     * 
     */
    @Import(name="reason")
      private final @Nullable Output<String> reason;

    public Output<String> reason() {
        return this.reason == null ? Codegen.empty() : this.reason;
    }

    public NonCompliantFileArgs(
        @Nullable Output<String> displayCommand,
        @Nullable Output<String> path,
        @Nullable Output<String> reason) {
        this.displayCommand = displayCommand;
        this.path = path;
        this.reason = reason;
    }

    private NonCompliantFileArgs() {
        this.displayCommand = Codegen.empty();
        this.path = Codegen.empty();
        this.reason = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonCompliantFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayCommand;
        private @Nullable Output<String> path;
        private @Nullable Output<String> reason;

        public Builder() {
    	      // Empty
        }

        public Builder(NonCompliantFileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayCommand = defaults.displayCommand;
    	      this.path = defaults.path;
    	      this.reason = defaults.reason;
        }

        public Builder displayCommand(@Nullable Output<String> displayCommand) {
            this.displayCommand = displayCommand;
            return this;
        }
        public Builder displayCommand(@Nullable String displayCommand) {
            this.displayCommand = Codegen.ofNullable(displayCommand);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder reason(@Nullable Output<String> reason) {
            this.reason = reason;
            return this;
        }
        public Builder reason(@Nullable String reason) {
            this.reason = Codegen.ofNullable(reason);
            return this;
        }        public NonCompliantFileArgs build() {
            return new NonCompliantFileArgs(displayCommand, path, reason);
        }
    }
}
