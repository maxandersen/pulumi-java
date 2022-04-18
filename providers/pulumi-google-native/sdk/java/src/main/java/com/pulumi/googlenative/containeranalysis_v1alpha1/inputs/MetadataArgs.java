// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.containeranalysis_v1alpha1.inputs.CompletenessArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Other properties of the build.
 * 
 */
public final class MetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final MetadataArgs Empty = new MetadataArgs();

    /**
     * The timestamp of when the build completed.
     * 
     */
    @Import(name="buildFinishedOn")
      private final @Nullable Output<String> buildFinishedOn;

    public Output<String> buildFinishedOn() {
        return this.buildFinishedOn == null ? Codegen.empty() : this.buildFinishedOn;
    }

    /**
     * Identifies the particular build invocation, which can be useful for finding associated logs or other ad-hoc analysis. The value SHOULD be globally unique, per in-toto Provenance spec.
     * 
     */
    @Import(name="buildInvocationId")
      private final @Nullable Output<String> buildInvocationId;

    public Output<String> buildInvocationId() {
        return this.buildInvocationId == null ? Codegen.empty() : this.buildInvocationId;
    }

    /**
     * The timestamp of when the build started.
     * 
     */
    @Import(name="buildStartedOn")
      private final @Nullable Output<String> buildStartedOn;

    public Output<String> buildStartedOn() {
        return this.buildStartedOn == null ? Codegen.empty() : this.buildStartedOn;
    }

    /**
     * Indicates that the builder claims certain fields in this message to be complete.
     * 
     */
    @Import(name="completeness")
      private final @Nullable Output<CompletenessArgs> completeness;

    public Output<CompletenessArgs> completeness() {
        return this.completeness == null ? Codegen.empty() : this.completeness;
    }

    /**
     * If true, the builder claims that running the recipe on materials will produce bit-for-bit identical output.
     * 
     */
    @Import(name="reproducible")
      private final @Nullable Output<Boolean> reproducible;

    public Output<Boolean> reproducible() {
        return this.reproducible == null ? Codegen.empty() : this.reproducible;
    }

    public MetadataArgs(
        @Nullable Output<String> buildFinishedOn,
        @Nullable Output<String> buildInvocationId,
        @Nullable Output<String> buildStartedOn,
        @Nullable Output<CompletenessArgs> completeness,
        @Nullable Output<Boolean> reproducible) {
        this.buildFinishedOn = buildFinishedOn;
        this.buildInvocationId = buildInvocationId;
        this.buildStartedOn = buildStartedOn;
        this.completeness = completeness;
        this.reproducible = reproducible;
    }

    private MetadataArgs() {
        this.buildFinishedOn = Codegen.empty();
        this.buildInvocationId = Codegen.empty();
        this.buildStartedOn = Codegen.empty();
        this.completeness = Codegen.empty();
        this.reproducible = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> buildFinishedOn;
        private @Nullable Output<String> buildInvocationId;
        private @Nullable Output<String> buildStartedOn;
        private @Nullable Output<CompletenessArgs> completeness;
        private @Nullable Output<Boolean> reproducible;

        public Builder() {
    	      // Empty
        }

        public Builder(MetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildFinishedOn = defaults.buildFinishedOn;
    	      this.buildInvocationId = defaults.buildInvocationId;
    	      this.buildStartedOn = defaults.buildStartedOn;
    	      this.completeness = defaults.completeness;
    	      this.reproducible = defaults.reproducible;
        }

        public Builder buildFinishedOn(@Nullable Output<String> buildFinishedOn) {
            this.buildFinishedOn = buildFinishedOn;
            return this;
        }
        public Builder buildFinishedOn(@Nullable String buildFinishedOn) {
            this.buildFinishedOn = Codegen.ofNullable(buildFinishedOn);
            return this;
        }
        public Builder buildInvocationId(@Nullable Output<String> buildInvocationId) {
            this.buildInvocationId = buildInvocationId;
            return this;
        }
        public Builder buildInvocationId(@Nullable String buildInvocationId) {
            this.buildInvocationId = Codegen.ofNullable(buildInvocationId);
            return this;
        }
        public Builder buildStartedOn(@Nullable Output<String> buildStartedOn) {
            this.buildStartedOn = buildStartedOn;
            return this;
        }
        public Builder buildStartedOn(@Nullable String buildStartedOn) {
            this.buildStartedOn = Codegen.ofNullable(buildStartedOn);
            return this;
        }
        public Builder completeness(@Nullable Output<CompletenessArgs> completeness) {
            this.completeness = completeness;
            return this;
        }
        public Builder completeness(@Nullable CompletenessArgs completeness) {
            this.completeness = Codegen.ofNullable(completeness);
            return this;
        }
        public Builder reproducible(@Nullable Output<Boolean> reproducible) {
            this.reproducible = reproducible;
            return this;
        }
        public Builder reproducible(@Nullable Boolean reproducible) {
            this.reproducible = Codegen.ofNullable(reproducible);
            return this;
        }        public MetadataArgs build() {
            return new MetadataArgs(buildFinishedOn, buildInvocationId, buildStartedOn, completeness, reproducible);
        }
    }
}
