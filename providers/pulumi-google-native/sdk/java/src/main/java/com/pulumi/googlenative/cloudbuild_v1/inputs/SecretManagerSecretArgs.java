// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Pairs a secret environment variable with a SecretVersion in Secret Manager.
 * 
 */
public final class SecretManagerSecretArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecretManagerSecretArgs Empty = new SecretManagerSecretArgs();

    /**
     * Environment variable name to associate with the secret. Secret environment variables must be unique across all of a build&#39;s secrets, and must be used by at least one build step.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<String> env;

    public Output<String> env() {
        return this.env == null ? Codegen.empty() : this.env;
    }

    /**
     * Resource name of the SecretVersion. In format: projects/*{@literal /}secrets/*{@literal /}versions/*
     * 
     */
    @Import(name="versionName")
      private final @Nullable Output<String> versionName;

    public Output<String> versionName() {
        return this.versionName == null ? Codegen.empty() : this.versionName;
    }

    public SecretManagerSecretArgs(
        @Nullable Output<String> env,
        @Nullable Output<String> versionName) {
        this.env = env;
        this.versionName = versionName;
    }

    private SecretManagerSecretArgs() {
        this.env = Codegen.empty();
        this.versionName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretManagerSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> env;
        private @Nullable Output<String> versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretManagerSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.env = defaults.env;
    	      this.versionName = defaults.versionName;
        }

        public Builder env(@Nullable Output<String> env) {
            this.env = env;
            return this;
        }
        public Builder env(@Nullable String env) {
            this.env = Codegen.ofNullable(env);
            return this;
        }
        public Builder versionName(@Nullable Output<String> versionName) {
            this.versionName = versionName;
            return this;
        }
        public Builder versionName(@Nullable String versionName) {
            this.versionName = Codegen.ofNullable(versionName);
            return this;
        }        public SecretManagerSecretArgs build() {
            return new SecretManagerSecretArgs(env, versionName);
        }
    }
}
