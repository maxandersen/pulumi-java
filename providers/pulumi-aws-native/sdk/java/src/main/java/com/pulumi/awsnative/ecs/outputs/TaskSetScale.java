// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.awsnative.ecs.enums.TaskSetScaleUnit;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetScale {
    /**
     * The unit of measure for the scale value.
     * 
     */
    private final @Nullable TaskSetScaleUnit unit;
    /**
     * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
     * 
     */
    private final @Nullable Double value;

    @CustomType.Constructor
    private TaskSetScale(
        @CustomType.Parameter("unit") @Nullable TaskSetScaleUnit unit,
        @CustomType.Parameter("value") @Nullable Double value) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * The unit of measure for the scale value.
     * 
    */
    public Optional<TaskSetScaleUnit> unit() {
        return Optional.ofNullable(this.unit);
    }
    /**
     * The value, specified as a percent total of a service's desiredCount, to scale the task set. Accepted values are numbers between 0 and 100.
     * 
    */
    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetScale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskSetScaleUnit unit;
        private @Nullable Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetScale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(@Nullable TaskSetScaleUnit unit) {
            this.unit = unit;
            return this;
        }
        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }        public TaskSetScale build() {
            return new TaskSetScale(unit, value);
        }
    }
}
