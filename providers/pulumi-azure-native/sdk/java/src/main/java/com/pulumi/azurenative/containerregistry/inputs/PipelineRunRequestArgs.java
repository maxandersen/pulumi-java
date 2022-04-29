// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.inputs.PipelineRunSourcePropertiesArgs;
import com.pulumi.azurenative.containerregistry.inputs.PipelineRunTargetPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The request properties provided for a pipeline run.
 * 
 */
public final class PipelineRunRequestArgs extends ResourceArgs {

    public static final PipelineRunRequestArgs Empty = new PipelineRunRequestArgs();

    /**
     * List of source artifacts to be transferred by the pipeline.
     * Specify an image by repository (&#39;hello-world&#39;). This will use the &#39;latest&#39; tag.
     * Specify an image by tag (&#39;hello-world:latest&#39;).
     * Specify an image by sha256-based manifest digest (&#39;hello-world@sha256:abc123&#39;).
     * 
     */
    @Import(name="artifacts")
    private @Nullable Output<List<String>> artifacts;

    /**
     * @return List of source artifacts to be transferred by the pipeline.
     * Specify an image by repository (&#39;hello-world&#39;). This will use the &#39;latest&#39; tag.
     * Specify an image by tag (&#39;hello-world:latest&#39;).
     * Specify an image by sha256-based manifest digest (&#39;hello-world@sha256:abc123&#39;).
     * 
     */
    public Optional<Output<List<String>>> artifacts() {
        return Optional.ofNullable(this.artifacts);
    }

    /**
     * The digest of the tar used to transfer the artifacts.
     * 
     */
    @Import(name="catalogDigest")
    private @Nullable Output<String> catalogDigest;

    /**
     * @return The digest of the tar used to transfer the artifacts.
     * 
     */
    public Optional<Output<String>> catalogDigest() {
        return Optional.ofNullable(this.catalogDigest);
    }

    /**
     * The resource ID of the pipeline to run.
     * 
     */
    @Import(name="pipelineResourceId")
    private @Nullable Output<String> pipelineResourceId;

    /**
     * @return The resource ID of the pipeline to run.
     * 
     */
    public Optional<Output<String>> pipelineResourceId() {
        return Optional.ofNullable(this.pipelineResourceId);
    }

    /**
     * The source properties of the pipeline run.
     * 
     */
    @Import(name="source")
    private @Nullable Output<PipelineRunSourcePropertiesArgs> source;

    /**
     * @return The source properties of the pipeline run.
     * 
     */
    public Optional<Output<PipelineRunSourcePropertiesArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    /**
     * The target properties of the pipeline run.
     * 
     */
    @Import(name="target")
    private @Nullable Output<PipelineRunTargetPropertiesArgs> target;

    /**
     * @return The target properties of the pipeline run.
     * 
     */
    public Optional<Output<PipelineRunTargetPropertiesArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private PipelineRunRequestArgs() {}

    private PipelineRunRequestArgs(PipelineRunRequestArgs $) {
        this.artifacts = $.artifacts;
        this.catalogDigest = $.catalogDigest;
        this.pipelineResourceId = $.pipelineResourceId;
        this.source = $.source;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineRunRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineRunRequestArgs $;

        public Builder() {
            $ = new PipelineRunRequestArgs();
        }

        public Builder(PipelineRunRequestArgs defaults) {
            $ = new PipelineRunRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifacts List of source artifacts to be transferred by the pipeline.
         * Specify an image by repository (&#39;hello-world&#39;). This will use the &#39;latest&#39; tag.
         * Specify an image by tag (&#39;hello-world:latest&#39;).
         * Specify an image by sha256-based manifest digest (&#39;hello-world@sha256:abc123&#39;).
         * 
         * @return builder
         * 
         */
        public Builder artifacts(@Nullable Output<List<String>> artifacts) {
            $.artifacts = artifacts;
            return this;
        }

        /**
         * @param artifacts List of source artifacts to be transferred by the pipeline.
         * Specify an image by repository (&#39;hello-world&#39;). This will use the &#39;latest&#39; tag.
         * Specify an image by tag (&#39;hello-world:latest&#39;).
         * Specify an image by sha256-based manifest digest (&#39;hello-world@sha256:abc123&#39;).
         * 
         * @return builder
         * 
         */
        public Builder artifacts(List<String> artifacts) {
            return artifacts(Output.of(artifacts));
        }

        /**
         * @param artifacts List of source artifacts to be transferred by the pipeline.
         * Specify an image by repository (&#39;hello-world&#39;). This will use the &#39;latest&#39; tag.
         * Specify an image by tag (&#39;hello-world:latest&#39;).
         * Specify an image by sha256-based manifest digest (&#39;hello-world@sha256:abc123&#39;).
         * 
         * @return builder
         * 
         */
        public Builder artifacts(String... artifacts) {
            return artifacts(List.of(artifacts));
        }

        /**
         * @param catalogDigest The digest of the tar used to transfer the artifacts.
         * 
         * @return builder
         * 
         */
        public Builder catalogDigest(@Nullable Output<String> catalogDigest) {
            $.catalogDigest = catalogDigest;
            return this;
        }

        /**
         * @param catalogDigest The digest of the tar used to transfer the artifacts.
         * 
         * @return builder
         * 
         */
        public Builder catalogDigest(String catalogDigest) {
            return catalogDigest(Output.of(catalogDigest));
        }

        /**
         * @param pipelineResourceId The resource ID of the pipeline to run.
         * 
         * @return builder
         * 
         */
        public Builder pipelineResourceId(@Nullable Output<String> pipelineResourceId) {
            $.pipelineResourceId = pipelineResourceId;
            return this;
        }

        /**
         * @param pipelineResourceId The resource ID of the pipeline to run.
         * 
         * @return builder
         * 
         */
        public Builder pipelineResourceId(String pipelineResourceId) {
            return pipelineResourceId(Output.of(pipelineResourceId));
        }

        /**
         * @param source The source properties of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder source(@Nullable Output<PipelineRunSourcePropertiesArgs> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source The source properties of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder source(PipelineRunSourcePropertiesArgs source) {
            return source(Output.of(source));
        }

        /**
         * @param target The target properties of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<PipelineRunTargetPropertiesArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target The target properties of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder target(PipelineRunTargetPropertiesArgs target) {
            return target(Output.of(target));
        }

        public PipelineRunRequestArgs build() {
            return $;
        }
    }

}
