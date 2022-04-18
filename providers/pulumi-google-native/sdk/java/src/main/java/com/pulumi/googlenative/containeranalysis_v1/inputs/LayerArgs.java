// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Layer holds metadata specific to a layer of a Docker image.
 * 
 */
public final class LayerArgs extends com.pulumi.resources.ResourceArgs {

    public static final LayerArgs Empty = new LayerArgs();

    /**
     * The recovered arguments to the Dockerfile directive.
     * 
     */
    @Import(name="arguments")
      private final @Nullable Output<String> arguments;

    public Output<String> arguments() {
        return this.arguments == null ? Codegen.empty() : this.arguments;
    }

    /**
     * The recovered Dockerfile directive used to construct this layer. See https://docs.docker.com/engine/reference/builder/ for more information.
     * 
     */
    @Import(name="directive", required=true)
      private final Output<String> directive;

    public Output<String> directive() {
        return this.directive;
    }

    public LayerArgs(
        @Nullable Output<String> arguments,
        Output<String> directive) {
        this.arguments = arguments;
        this.directive = Objects.requireNonNull(directive, "expected parameter 'directive' to be non-null");
    }

    private LayerArgs() {
        this.arguments = Codegen.empty();
        this.directive = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LayerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arguments;
        private Output<String> directive;

        public Builder() {
    	      // Empty
        }

        public Builder(LayerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arguments = defaults.arguments;
    	      this.directive = defaults.directive;
        }

        public Builder arguments(@Nullable Output<String> arguments) {
            this.arguments = arguments;
            return this;
        }
        public Builder arguments(@Nullable String arguments) {
            this.arguments = Codegen.ofNullable(arguments);
            return this;
        }
        public Builder directive(Output<String> directive) {
            this.directive = Objects.requireNonNull(directive);
            return this;
        }
        public Builder directive(String directive) {
            this.directive = Output.of(Objects.requireNonNull(directive));
            return this;
        }        public LayerArgs build() {
            return new LayerArgs(arguments, directive);
        }
    }
}
