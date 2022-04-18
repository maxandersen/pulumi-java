// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.inputs;

import com.pulumi.awsnative.connect.enums.HoursOfOperationConfigDay;
import com.pulumi.awsnative.connect.inputs.HoursOfOperationTimeSliceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Contains information about the hours of operation.
 * 
 */
public final class HoursOfOperationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final HoursOfOperationConfigArgs Empty = new HoursOfOperationConfigArgs();

    /**
     * The day that the hours of operation applies to.
     * 
     */
    @Import(name="day", required=true)
      private final Output<HoursOfOperationConfigDay> day;

    public Output<HoursOfOperationConfigDay> day() {
        return this.day;
    }

    /**
     * The end time that your contact center closes.
     * 
     */
    @Import(name="endTime", required=true)
      private final Output<HoursOfOperationTimeSliceArgs> endTime;

    public Output<HoursOfOperationTimeSliceArgs> endTime() {
        return this.endTime;
    }

    /**
     * The start time that your contact center opens.
     * 
     */
    @Import(name="startTime", required=true)
      private final Output<HoursOfOperationTimeSliceArgs> startTime;

    public Output<HoursOfOperationTimeSliceArgs> startTime() {
        return this.startTime;
    }

    public HoursOfOperationConfigArgs(
        Output<HoursOfOperationConfigDay> day,
        Output<HoursOfOperationTimeSliceArgs> endTime,
        Output<HoursOfOperationTimeSliceArgs> startTime) {
        this.day = Objects.requireNonNull(day, "expected parameter 'day' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private HoursOfOperationConfigArgs() {
        this.day = Codegen.empty();
        this.endTime = Codegen.empty();
        this.startTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HoursOfOperationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<HoursOfOperationConfigDay> day;
        private Output<HoursOfOperationTimeSliceArgs> endTime;
        private Output<HoursOfOperationTimeSliceArgs> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(HoursOfOperationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.endTime = defaults.endTime;
    	      this.startTime = defaults.startTime;
        }

        public Builder day(Output<HoursOfOperationConfigDay> day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        public Builder day(HoursOfOperationConfigDay day) {
            this.day = Output.of(Objects.requireNonNull(day));
            return this;
        }
        public Builder endTime(Output<HoursOfOperationTimeSliceArgs> endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder endTime(HoursOfOperationTimeSliceArgs endTime) {
            this.endTime = Output.of(Objects.requireNonNull(endTime));
            return this;
        }
        public Builder startTime(Output<HoursOfOperationTimeSliceArgs> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(HoursOfOperationTimeSliceArgs startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public HoursOfOperationConfigArgs build() {
            return new HoursOfOperationConfigArgs(day, endTime, startTime);
        }
    }
}
