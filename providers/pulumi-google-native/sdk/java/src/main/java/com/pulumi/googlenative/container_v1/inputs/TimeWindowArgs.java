// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container_v1.inputs.MaintenanceExclusionOptionsArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents an arbitrary window of time.
 * 
 */
public final class TimeWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final TimeWindowArgs Empty = new TimeWindowArgs();

    /**
     * The time that the window ends. The end time should take place after the start time.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * MaintenanceExclusionOptions provides maintenance exclusion related options.
     * 
     */
    @Import(name="maintenanceExclusionOptions")
    private @Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions;

    public Optional<Output<MaintenanceExclusionOptionsArgs>> maintenanceExclusionOptions() {
        return Optional.ofNullable(this.maintenanceExclusionOptions);
    }

    /**
     * The time that the window first starts.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    private TimeWindowArgs() {}

    private TimeWindowArgs(TimeWindowArgs $) {
        this.endTime = $.endTime;
        this.maintenanceExclusionOptions = $.maintenanceExclusionOptions;
        this.startTime = $.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TimeWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TimeWindowArgs $;

        public Builder() {
            $ = new TimeWindowArgs();
        }

        public Builder(TimeWindowArgs defaults) {
            $ = new TimeWindowArgs(Objects.requireNonNull(defaults));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder maintenanceExclusionOptions(@Nullable Output<MaintenanceExclusionOptionsArgs> maintenanceExclusionOptions) {
            $.maintenanceExclusionOptions = maintenanceExclusionOptions;
            return this;
        }

        public Builder maintenanceExclusionOptions(MaintenanceExclusionOptionsArgs maintenanceExclusionOptions) {
            return maintenanceExclusionOptions(Output.of(maintenanceExclusionOptions));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public TimeWindowArgs build() {
            return $;
        }
    }

}
