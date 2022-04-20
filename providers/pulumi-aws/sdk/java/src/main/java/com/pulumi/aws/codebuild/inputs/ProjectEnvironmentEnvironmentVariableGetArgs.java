// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectEnvironmentEnvironmentVariableGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectEnvironmentEnvironmentVariableGetArgs Empty = new ProjectEnvironmentEnvironmentVariableGetArgs();

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Environment variable&#39;s value.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    public ProjectEnvironmentEnvironmentVariableGetArgs(
        Output<String> name,
        @Nullable Output<String> type,
        Output<String> value) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = type;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ProjectEnvironmentEnvironmentVariableGetArgs() {
        this.name = Codegen.empty();
        this.type = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectEnvironmentEnvironmentVariableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<String> type;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectEnvironmentEnvironmentVariableGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public ProjectEnvironmentEnvironmentVariableGetArgs build() {
            return new ProjectEnvironmentEnvironmentVariableGetArgs(name, type, value);
        }
    }
}
