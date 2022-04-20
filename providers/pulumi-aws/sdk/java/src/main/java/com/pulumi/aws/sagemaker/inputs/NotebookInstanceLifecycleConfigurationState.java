// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotebookInstanceLifecycleConfigurationState extends com.pulumi.resources.ResourceArgs {

    public static final NotebookInstanceLifecycleConfigurationState Empty = new NotebookInstanceLifecycleConfigurationState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this lifecycle configuration.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name of the lifecycle configuration (must be unique). If omitted, this provider will assign a random, unique name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A shell script (base64-encoded) that runs only once when the SageMaker Notebook Instance is created.
     * 
     */
    @Import(name="onCreate")
      private final @Nullable Output<String> onCreate;

    public Output<String> onCreate() {
        return this.onCreate == null ? Codegen.empty() : this.onCreate;
    }

    /**
     * A shell script (base64-encoded) that runs every time the SageMaker Notebook Instance is started including the time it&#39;s created.
     * 
     */
    @Import(name="onStart")
      private final @Nullable Output<String> onStart;

    public Output<String> onStart() {
        return this.onStart == null ? Codegen.empty() : this.onStart;
    }

    public NotebookInstanceLifecycleConfigurationState(
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<String> onCreate,
        @Nullable Output<String> onStart) {
        this.arn = arn;
        this.name = name;
        this.onCreate = onCreate;
        this.onStart = onStart;
    }

    private NotebookInstanceLifecycleConfigurationState() {
        this.arn = Codegen.empty();
        this.name = Codegen.empty();
        this.onCreate = Codegen.empty();
        this.onStart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookInstanceLifecycleConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<String> onCreate;
        private @Nullable Output<String> onStart;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookInstanceLifecycleConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.onCreate = defaults.onCreate;
    	      this.onStart = defaults.onStart;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
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
        public Builder onCreate(@Nullable Output<String> onCreate) {
            this.onCreate = onCreate;
            return this;
        }
        public Builder onCreate(@Nullable String onCreate) {
            this.onCreate = Codegen.ofNullable(onCreate);
            return this;
        }
        public Builder onStart(@Nullable Output<String> onStart) {
            this.onStart = onStart;
            return this;
        }
        public Builder onStart(@Nullable String onStart) {
            this.onStart = Codegen.ofNullable(onStart);
            return this;
        }        public NotebookInstanceLifecycleConfigurationState build() {
            return new NotebookInstanceLifecycleConfigurationState(arn, name, onCreate, onStart);
        }
    }
}
