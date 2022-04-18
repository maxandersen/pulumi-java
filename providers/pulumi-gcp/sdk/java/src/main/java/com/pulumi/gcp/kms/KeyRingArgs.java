// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyRingArgs extends com.pulumi.resources.ResourceArgs {

    public static final KeyRingArgs Empty = new KeyRingArgs();

    /**
     * The location for the KeyRing.
     * A full list of valid locations can be found by running `gcloud kms locations list`.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The resource name for the KeyRing.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public KeyRingArgs(
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.project = project;
    }

    private KeyRingArgs() {
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyRingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyRingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public KeyRingArgs build() {
            return new KeyRingArgs(location, name, project);
        }
    }
}
