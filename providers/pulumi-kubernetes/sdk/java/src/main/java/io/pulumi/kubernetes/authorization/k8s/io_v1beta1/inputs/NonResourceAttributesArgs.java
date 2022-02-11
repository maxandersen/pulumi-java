// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authorization.k8s.io_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NonResourceAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonResourceAttributesArgs Empty = new NonResourceAttributesArgs();

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="verb")
    private final @Nullable Input<String> verb;

    public Input<String> getVerb() {
        return this.verb == null ? Input.empty() : this.verb;
    }

    public NonResourceAttributesArgs(
        @Nullable Input<String> path,
        @Nullable Input<String> verb) {
        this.path = path;
        this.verb = verb;
    }

    private NonResourceAttributesArgs() {
        this.path = Input.empty();
        this.verb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourceAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> path;
        private @Nullable Input<String> verb;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourceAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
    	      this.verb = defaults.verb;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setVerb(@Nullable Input<String> verb) {
            this.verb = verb;
            return this;
        }

        public Builder setVerb(@Nullable String verb) {
            this.verb = Input.ofNullable(verb);
            return this;
        }

        public NonResourceAttributesArgs build() {
            return new NonResourceAttributesArgs(path, verb);
        }
    }
}
