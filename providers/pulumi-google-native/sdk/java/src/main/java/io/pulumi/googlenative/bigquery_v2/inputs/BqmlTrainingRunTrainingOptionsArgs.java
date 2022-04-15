// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * [Output-only, Beta] Training options used by this training run. These options are mutable for subsequent training runs. Default values are explicitly stored for options not specified in the input query of the first training run. For subsequent training runs, any option not explicitly specified in the input query will be copied from the previous training run.
 * 
 */
public final class BqmlTrainingRunTrainingOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final BqmlTrainingRunTrainingOptionsArgs Empty = new BqmlTrainingRunTrainingOptionsArgs();

    @Import(name="earlyStop")
      private final @Nullable Output<Boolean> earlyStop;

    public Output<Boolean> earlyStop() {
        return this.earlyStop == null ? Codegen.empty() : this.earlyStop;
    }

    @Import(name="l1Reg")
      private final @Nullable Output<Double> l1Reg;

    public Output<Double> l1Reg() {
        return this.l1Reg == null ? Codegen.empty() : this.l1Reg;
    }

    @Import(name="l2Reg")
      private final @Nullable Output<Double> l2Reg;

    public Output<Double> l2Reg() {
        return this.l2Reg == null ? Codegen.empty() : this.l2Reg;
    }

    @Import(name="learnRate")
      private final @Nullable Output<Double> learnRate;

    public Output<Double> learnRate() {
        return this.learnRate == null ? Codegen.empty() : this.learnRate;
    }

    @Import(name="learnRateStrategy")
      private final @Nullable Output<String> learnRateStrategy;

    public Output<String> learnRateStrategy() {
        return this.learnRateStrategy == null ? Codegen.empty() : this.learnRateStrategy;
    }

    @Import(name="lineSearchInitLearnRate")
      private final @Nullable Output<Double> lineSearchInitLearnRate;

    public Output<Double> lineSearchInitLearnRate() {
        return this.lineSearchInitLearnRate == null ? Codegen.empty() : this.lineSearchInitLearnRate;
    }

    @Import(name="maxIteration")
      private final @Nullable Output<String> maxIteration;

    public Output<String> maxIteration() {
        return this.maxIteration == null ? Codegen.empty() : this.maxIteration;
    }

    @Import(name="minRelProgress")
      private final @Nullable Output<Double> minRelProgress;

    public Output<Double> minRelProgress() {
        return this.minRelProgress == null ? Codegen.empty() : this.minRelProgress;
    }

    @Import(name="warmStart")
      private final @Nullable Output<Boolean> warmStart;

    public Output<Boolean> warmStart() {
        return this.warmStart == null ? Codegen.empty() : this.warmStart;
    }

    public BqmlTrainingRunTrainingOptionsArgs(
        @Nullable Output<Boolean> earlyStop,
        @Nullable Output<Double> l1Reg,
        @Nullable Output<Double> l2Reg,
        @Nullable Output<Double> learnRate,
        @Nullable Output<String> learnRateStrategy,
        @Nullable Output<Double> lineSearchInitLearnRate,
        @Nullable Output<String> maxIteration,
        @Nullable Output<Double> minRelProgress,
        @Nullable Output<Boolean> warmStart) {
        this.earlyStop = earlyStop;
        this.l1Reg = l1Reg;
        this.l2Reg = l2Reg;
        this.learnRate = learnRate;
        this.learnRateStrategy = learnRateStrategy;
        this.lineSearchInitLearnRate = lineSearchInitLearnRate;
        this.maxIteration = maxIteration;
        this.minRelProgress = minRelProgress;
        this.warmStart = warmStart;
    }

    private BqmlTrainingRunTrainingOptionsArgs() {
        this.earlyStop = Codegen.empty();
        this.l1Reg = Codegen.empty();
        this.l2Reg = Codegen.empty();
        this.learnRate = Codegen.empty();
        this.learnRateStrategy = Codegen.empty();
        this.lineSearchInitLearnRate = Codegen.empty();
        this.maxIteration = Codegen.empty();
        this.minRelProgress = Codegen.empty();
        this.warmStart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BqmlTrainingRunTrainingOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> earlyStop;
        private @Nullable Output<Double> l1Reg;
        private @Nullable Output<Double> l2Reg;
        private @Nullable Output<Double> learnRate;
        private @Nullable Output<String> learnRateStrategy;
        private @Nullable Output<Double> lineSearchInitLearnRate;
        private @Nullable Output<String> maxIteration;
        private @Nullable Output<Double> minRelProgress;
        private @Nullable Output<Boolean> warmStart;

        public Builder() {
    	      // Empty
        }

        public Builder(BqmlTrainingRunTrainingOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.earlyStop = defaults.earlyStop;
    	      this.l1Reg = defaults.l1Reg;
    	      this.l2Reg = defaults.l2Reg;
    	      this.learnRate = defaults.learnRate;
    	      this.learnRateStrategy = defaults.learnRateStrategy;
    	      this.lineSearchInitLearnRate = defaults.lineSearchInitLearnRate;
    	      this.maxIteration = defaults.maxIteration;
    	      this.minRelProgress = defaults.minRelProgress;
    	      this.warmStart = defaults.warmStart;
        }

        public Builder earlyStop(@Nullable Output<Boolean> earlyStop) {
            this.earlyStop = earlyStop;
            return this;
        }
        public Builder earlyStop(@Nullable Boolean earlyStop) {
            this.earlyStop = Codegen.ofNullable(earlyStop);
            return this;
        }
        public Builder l1Reg(@Nullable Output<Double> l1Reg) {
            this.l1Reg = l1Reg;
            return this;
        }
        public Builder l1Reg(@Nullable Double l1Reg) {
            this.l1Reg = Codegen.ofNullable(l1Reg);
            return this;
        }
        public Builder l2Reg(@Nullable Output<Double> l2Reg) {
            this.l2Reg = l2Reg;
            return this;
        }
        public Builder l2Reg(@Nullable Double l2Reg) {
            this.l2Reg = Codegen.ofNullable(l2Reg);
            return this;
        }
        public Builder learnRate(@Nullable Output<Double> learnRate) {
            this.learnRate = learnRate;
            return this;
        }
        public Builder learnRate(@Nullable Double learnRate) {
            this.learnRate = Codegen.ofNullable(learnRate);
            return this;
        }
        public Builder learnRateStrategy(@Nullable Output<String> learnRateStrategy) {
            this.learnRateStrategy = learnRateStrategy;
            return this;
        }
        public Builder learnRateStrategy(@Nullable String learnRateStrategy) {
            this.learnRateStrategy = Codegen.ofNullable(learnRateStrategy);
            return this;
        }
        public Builder lineSearchInitLearnRate(@Nullable Output<Double> lineSearchInitLearnRate) {
            this.lineSearchInitLearnRate = lineSearchInitLearnRate;
            return this;
        }
        public Builder lineSearchInitLearnRate(@Nullable Double lineSearchInitLearnRate) {
            this.lineSearchInitLearnRate = Codegen.ofNullable(lineSearchInitLearnRate);
            return this;
        }
        public Builder maxIteration(@Nullable Output<String> maxIteration) {
            this.maxIteration = maxIteration;
            return this;
        }
        public Builder maxIteration(@Nullable String maxIteration) {
            this.maxIteration = Codegen.ofNullable(maxIteration);
            return this;
        }
        public Builder minRelProgress(@Nullable Output<Double> minRelProgress) {
            this.minRelProgress = minRelProgress;
            return this;
        }
        public Builder minRelProgress(@Nullable Double minRelProgress) {
            this.minRelProgress = Codegen.ofNullable(minRelProgress);
            return this;
        }
        public Builder warmStart(@Nullable Output<Boolean> warmStart) {
            this.warmStart = warmStart;
            return this;
        }
        public Builder warmStart(@Nullable Boolean warmStart) {
            this.warmStart = Codegen.ofNullable(warmStart);
            return this;
        }        public BqmlTrainingRunTrainingOptionsArgs build() {
            return new BqmlTrainingRunTrainingOptionsArgs(earlyStop, l1Reg, l2Reg, learnRate, learnRateStrategy, lineSearchInitLearnRate, maxIteration, minRelProgress, warmStart);
        }
    }
}
