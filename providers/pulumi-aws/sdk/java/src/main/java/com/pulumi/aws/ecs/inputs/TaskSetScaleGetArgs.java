// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetScaleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskSetScaleGetArgs Empty = new TaskSetScaleGetArgs();

    /**
     * The unit of measure for the scale value. Default: `PERCENT`.
     * 
     */
    @Import(name="unit")
      private final @Nullable Output<String> unit;

    public Output<String> unit() {
        return this.unit == null ? Codegen.empty() : this.unit;
    }

    /**
     * The value, specified as a percent total of a service&#39;s `desiredCount`, to scale the task set. Defaults to `0` if not specified. Accepted values are numbers between 0.0 and 100.0.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Double> value;

    public Output<Double> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public TaskSetScaleGetArgs(
        @Nullable Output<String> unit,
        @Nullable Output<Double> value) {
        this.unit = unit;
        this.value = value;
    }

    private TaskSetScaleGetArgs() {
        this.unit = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScaleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> unit;
        private @Nullable Output<Double> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScaleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(@Nullable Output<String> unit) {
            this.unit = unit;
            return this;
        }
        public Builder unit(@Nullable String unit) {
            this.unit = Codegen.ofNullable(unit);
            return this;
        }
        public Builder value(@Nullable Output<Double> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public TaskSetScaleGetArgs build() {
            return new TaskSetScaleGetArgs(unit, value);
        }
    }
}
