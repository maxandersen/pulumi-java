// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudsearch_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceArgs;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceCrowdingConfigArgs;
import com.pulumi.googlenative.cloudsearch_v1.inputs.SourceScoringConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configurations for a source while processing a Search or Suggest request.
 * 
 */
public final class SourceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SourceConfigArgs Empty = new SourceConfigArgs();

    /**
     * The crowding configuration for the source.
     * 
     */
    @Import(name="crowdingConfig")
    private @Nullable Output<SourceCrowdingConfigArgs> crowdingConfig;

    public Optional<Output<SourceCrowdingConfigArgs>> crowdingConfig() {
        return Optional.ofNullable(this.crowdingConfig);
    }

    /**
     * The scoring configuration for the source.
     * 
     */
    @Import(name="scoringConfig")
    private @Nullable Output<SourceScoringConfigArgs> scoringConfig;

    public Optional<Output<SourceScoringConfigArgs>> scoringConfig() {
        return Optional.ofNullable(this.scoringConfig);
    }

    /**
     * The source for which this configuration is to be used.
     * 
     */
    @Import(name="source")
    private @Nullable Output<SourceArgs> source;

    public Optional<Output<SourceArgs>> source() {
        return Optional.ofNullable(this.source);
    }

    private SourceConfigArgs() {}

    private SourceConfigArgs(SourceConfigArgs $) {
        this.crowdingConfig = $.crowdingConfig;
        this.scoringConfig = $.scoringConfig;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SourceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SourceConfigArgs $;

        public Builder() {
            $ = new SourceConfigArgs();
        }

        public Builder(SourceConfigArgs defaults) {
            $ = new SourceConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder crowdingConfig(@Nullable Output<SourceCrowdingConfigArgs> crowdingConfig) {
            $.crowdingConfig = crowdingConfig;
            return this;
        }

        public Builder crowdingConfig(SourceCrowdingConfigArgs crowdingConfig) {
            return crowdingConfig(Output.of(crowdingConfig));
        }

        public Builder scoringConfig(@Nullable Output<SourceScoringConfigArgs> scoringConfig) {
            $.scoringConfig = scoringConfig;
            return this;
        }

        public Builder scoringConfig(SourceScoringConfigArgs scoringConfig) {
            return scoringConfig(Output.of(scoringConfig));
        }

        public Builder source(@Nullable Output<SourceArgs> source) {
            $.source = source;
            return this;
        }

        public Builder source(SourceArgs source) {
            return source(Output.of(source));
        }

        public SourceConfigArgs build() {
            return $;
        }
    }

}
