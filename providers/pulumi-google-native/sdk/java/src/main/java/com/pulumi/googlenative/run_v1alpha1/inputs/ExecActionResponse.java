// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Not supported by Cloud Run ExecAction describes a &#34;run in container&#34; action.
 * 
 */
public final class ExecActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final ExecActionResponse Empty = new ExecActionResponse();

    /**
     * (Optional) Command is the command line to execute inside the container, the working directory for the command is root (&#39;/&#39;) in the container&#39;s filesystem. The command is simply exec&#39;d, it is not run inside a shell, so traditional shell instructions (&#39;|&#39;, etc) won&#39;t work. To use a shell, you need to explicitly call out to that shell. Exit status of 0 is treated as live/healthy and non-zero is unhealthy.
     * 
     */
    @Import(name="command", required=true)
      private final List<String> command;

    public List<String> command() {
        return this.command;
    }

    public ExecActionResponse(List<String> command) {
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
    }

    private ExecActionResponse() {
        this.command = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> command;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
        }

        public Builder command(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }        public ExecActionResponse build() {
            return new ExecActionResponse(command);
        }
    }
}
