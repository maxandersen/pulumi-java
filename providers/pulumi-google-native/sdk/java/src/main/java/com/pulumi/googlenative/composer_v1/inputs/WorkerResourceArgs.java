// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.composer_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for resources used by Airflow workers.
 * 
 */
public final class WorkerResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkerResourceArgs Empty = new WorkerResourceArgs();

    /**
     * Optional. CPU request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> cpu() {
        return this.cpu == null ? Codegen.empty() : this.cpu;
    }

    /**
     * Optional. Maximum number of workers for autoscaling.
     * 
     */
    @Import(name="maxCount")
      private final @Nullable Output<Integer> maxCount;

    public Output<Integer> maxCount() {
        return this.maxCount == null ? Codegen.empty() : this.maxCount;
    }

    /**
     * Optional. Memory (GB) request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> memoryGb() {
        return this.memoryGb == null ? Codegen.empty() : this.memoryGb;
    }

    /**
     * Optional. Minimum number of workers for autoscaling.
     * 
     */
    @Import(name="minCount")
      private final @Nullable Output<Integer> minCount;

    public Output<Integer> minCount() {
        return this.minCount == null ? Codegen.empty() : this.minCount;
    }

    /**
     * Optional. Storage (GB) request and limit for a single Airflow worker replica.
     * 
     */
    @Import(name="storageGb")
      private final @Nullable Output<Double> storageGb;

    public Output<Double> storageGb() {
        return this.storageGb == null ? Codegen.empty() : this.storageGb;
    }

    public WorkerResourceArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Integer> maxCount,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<Integer> minCount,
        @Nullable Output<Double> storageGb) {
        this.cpu = cpu;
        this.maxCount = maxCount;
        this.memoryGb = memoryGb;
        this.minCount = minCount;
        this.storageGb = storageGb;
    }

    private WorkerResourceArgs() {
        this.cpu = Codegen.empty();
        this.maxCount = Codegen.empty();
        this.memoryGb = Codegen.empty();
        this.minCount = Codegen.empty();
        this.storageGb = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Integer> maxCount;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<Integer> minCount;
        private @Nullable Output<Double> storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.maxCount = defaults.maxCount;
    	      this.memoryGb = defaults.memoryGb;
    	      this.minCount = defaults.minCount;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Codegen.ofNullable(cpu);
            return this;
        }
        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = Codegen.ofNullable(maxCount);
            return this;
        }
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Codegen.ofNullable(memoryGb);
            return this;
        }
        public Builder minCount(@Nullable Output<Integer> minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = Codegen.ofNullable(minCount);
            return this;
        }
        public Builder storageGb(@Nullable Output<Double> storageGb) {
            this.storageGb = storageGb;
            return this;
        }
        public Builder storageGb(@Nullable Double storageGb) {
            this.storageGb = Codegen.ofNullable(storageGb);
            return this;
        }        public WorkerResourceArgs build() {
            return new WorkerResourceArgs(cpu, maxCount, memoryGb, minCount, storageGb);
        }
    }
}
