// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildAvailableSecretsArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildOptionsArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSecretArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildSourceArgs;
import com.pulumi.gcp.cloudbuild.inputs.TriggerBuildStepArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildArgs extends com.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArgs Empty = new TriggerBuildArgs();

    /**
     * Artifacts produced by the build that should be uploaded upon successful completion of all build steps.
     * Structure is documented below.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<TriggerBuildArtifactsArgs> artifacts;

    public Output<TriggerBuildArtifactsArgs> artifacts() {
        return this.artifacts == null ? Codegen.empty() : this.artifacts;
    }

    /**
     * Secrets and secret environment variables.
     * Structure is documented below.
     * 
     */
    @Import(name="availableSecrets")
      private final @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets;

    public Output<TriggerBuildAvailableSecretsArgs> availableSecrets() {
        return this.availableSecrets == null ? Codegen.empty() : this.availableSecrets;
    }

    /**
     * A list of images to be pushed upon the successful completion of all build steps.
     * The images will be pushed using the builder service account&#39;s credentials.
     * The digests of the pushed images will be stored in the Build resource&#39;s results field.
     * If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    @Import(name="images")
      private final @Nullable Output<List<String>> images;

    public Output<List<String>> images() {
        return this.images == null ? Codegen.empty() : this.images;
    }

    /**
     * Google Cloud Storage bucket where logs should be written.
     * Logs file names will be of the format ${logsBucket}/log-${build_id}.txt.
     * 
     */
    @Import(name="logsBucket")
      private final @Nullable Output<String> logsBucket;

    public Output<String> logsBucket() {
        return this.logsBucket == null ? Codegen.empty() : this.logsBucket;
    }

    /**
     * Special options for this build.
     * Structure is documented below.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<TriggerBuildOptionsArgs> options;

    public Output<TriggerBuildOptionsArgs> options() {
        return this.options == null ? Codegen.empty() : this.options;
    }

    /**
     * TTL in queue for this build. If provided and the build is enqueued longer than this value,
     * the build will expire and the build status will be EXPIRED.
     * The TTL starts ticking from createTime.
     * A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    @Import(name="queueTtl")
      private final @Nullable Output<String> queueTtl;

    public Output<String> queueTtl() {
        return this.queueTtl == null ? Codegen.empty() : this.queueTtl;
    }

    /**
     * Secrets to decrypt using Cloud Key Management Service.
     * Structure is documented below.
     * 
     */
    @Import(name="secrets")
      private final @Nullable Output<List<TriggerBuildSecretArgs>> secrets;

    public Output<List<TriggerBuildSecretArgs>> secrets() {
        return this.secrets == null ? Codegen.empty() : this.secrets;
    }

    /**
     * The location of the source files to build.
     * One of `storageSource` or `repoSource` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<TriggerBuildSourceArgs> source;

    public Output<TriggerBuildSourceArgs> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * The operations to be performed on the workspace.
     * Structure is documented below.
     * 
     */
    @Import(name="steps", required=true)
      private final Output<List<TriggerBuildStepArgs>> steps;

    public Output<List<TriggerBuildStepArgs>> steps() {
        return this.steps;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> substitutions() {
        return this.substitutions == null ? Codegen.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Time limit for executing this build step. If not defined,
     * the step has no
     * time limit and will be allowed to continue to run until either it
     * completes or the build itself times out.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> timeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    public TriggerBuildArgs(
        @Nullable Output<TriggerBuildArtifactsArgs> artifacts,
        @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets,
        @Nullable Output<List<String>> images,
        @Nullable Output<String> logsBucket,
        @Nullable Output<TriggerBuildOptionsArgs> options,
        @Nullable Output<String> queueTtl,
        @Nullable Output<List<TriggerBuildSecretArgs>> secrets,
        @Nullable Output<TriggerBuildSourceArgs> source,
        Output<List<TriggerBuildStepArgs>> steps,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> timeout) {
        this.artifacts = artifacts;
        this.availableSecrets = availableSecrets;
        this.images = images;
        this.logsBucket = logsBucket;
        this.options = options;
        this.queueTtl = queueTtl;
        this.secrets = secrets;
        this.source = source;
        this.steps = Objects.requireNonNull(steps, "expected parameter 'steps' to be non-null");
        this.substitutions = substitutions;
        this.tags = tags;
        this.timeout = timeout;
    }

    private TriggerBuildArgs() {
        this.artifacts = Codegen.empty();
        this.availableSecrets = Codegen.empty();
        this.images = Codegen.empty();
        this.logsBucket = Codegen.empty();
        this.options = Codegen.empty();
        this.queueTtl = Codegen.empty();
        this.secrets = Codegen.empty();
        this.source = Codegen.empty();
        this.steps = Codegen.empty();
        this.substitutions = Codegen.empty();
        this.tags = Codegen.empty();
        this.timeout = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TriggerBuildArtifactsArgs> artifacts;
        private @Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets;
        private @Nullable Output<List<String>> images;
        private @Nullable Output<String> logsBucket;
        private @Nullable Output<TriggerBuildOptionsArgs> options;
        private @Nullable Output<String> queueTtl;
        private @Nullable Output<List<TriggerBuildSecretArgs>> secrets;
        private @Nullable Output<TriggerBuildSourceArgs> source;
        private Output<List<TriggerBuildStepArgs>> steps;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifacts = defaults.artifacts;
    	      this.availableSecrets = defaults.availableSecrets;
    	      this.images = defaults.images;
    	      this.logsBucket = defaults.logsBucket;
    	      this.options = defaults.options;
    	      this.queueTtl = defaults.queueTtl;
    	      this.secrets = defaults.secrets;
    	      this.source = defaults.source;
    	      this.steps = defaults.steps;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.timeout = defaults.timeout;
        }

        public Builder artifacts(@Nullable Output<TriggerBuildArtifactsArgs> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(@Nullable TriggerBuildArtifactsArgs artifacts) {
            this.artifacts = Codegen.ofNullable(artifacts);
            return this;
        }
        public Builder availableSecrets(@Nullable Output<TriggerBuildAvailableSecretsArgs> availableSecrets) {
            this.availableSecrets = availableSecrets;
            return this;
        }
        public Builder availableSecrets(@Nullable TriggerBuildAvailableSecretsArgs availableSecrets) {
            this.availableSecrets = Codegen.ofNullable(availableSecrets);
            return this;
        }
        public Builder images(@Nullable Output<List<String>> images) {
            this.images = images;
            return this;
        }
        public Builder images(@Nullable List<String> images) {
            this.images = Codegen.ofNullable(images);
            return this;
        }
        public Builder images(String... images) {
            return images(List.of(images));
        }
        public Builder logsBucket(@Nullable Output<String> logsBucket) {
            this.logsBucket = logsBucket;
            return this;
        }
        public Builder logsBucket(@Nullable String logsBucket) {
            this.logsBucket = Codegen.ofNullable(logsBucket);
            return this;
        }
        public Builder options(@Nullable Output<TriggerBuildOptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable TriggerBuildOptionsArgs options) {
            this.options = Codegen.ofNullable(options);
            return this;
        }
        public Builder queueTtl(@Nullable Output<String> queueTtl) {
            this.queueTtl = queueTtl;
            return this;
        }
        public Builder queueTtl(@Nullable String queueTtl) {
            this.queueTtl = Codegen.ofNullable(queueTtl);
            return this;
        }
        public Builder secrets(@Nullable Output<List<TriggerBuildSecretArgs>> secrets) {
            this.secrets = secrets;
            return this;
        }
        public Builder secrets(@Nullable List<TriggerBuildSecretArgs> secrets) {
            this.secrets = Codegen.ofNullable(secrets);
            return this;
        }
        public Builder secrets(TriggerBuildSecretArgs... secrets) {
            return secrets(List.of(secrets));
        }
        public Builder source(@Nullable Output<TriggerBuildSourceArgs> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable TriggerBuildSourceArgs source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder steps(Output<List<TriggerBuildStepArgs>> steps) {
            this.steps = Objects.requireNonNull(steps);
            return this;
        }
        public Builder steps(List<TriggerBuildStepArgs> steps) {
            this.steps = Output.of(Objects.requireNonNull(steps));
            return this;
        }
        public Builder steps(TriggerBuildStepArgs... steps) {
            return steps(List.of(steps));
        }
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Codegen.ofNullable(substitutions);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }        public TriggerBuildArgs build() {
            return new TriggerBuildArgs(artifacts, availableSecrets, images, logsBucket, options, queueTtl, secrets, source, steps, substitutions, tags, timeout);
        }
    }
}
