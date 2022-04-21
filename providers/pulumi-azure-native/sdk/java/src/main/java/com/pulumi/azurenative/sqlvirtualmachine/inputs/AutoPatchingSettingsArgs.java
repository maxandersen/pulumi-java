// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sqlvirtualmachine.inputs;

import com.pulumi.azurenative.sqlvirtualmachine.enums.DayOfWeek;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set a patching window during which Windows and SQL patches will be applied.
 * 
 */
public final class AutoPatchingSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoPatchingSettingsArgs Empty = new AutoPatchingSettingsArgs();

    /**
     * Day of week to apply the patch on.
     * 
     */
    @Import(name="dayOfWeek")
    private @Nullable Output<DayOfWeek> dayOfWeek;

    public Optional<Output<DayOfWeek>> dayOfWeek() {
        return Optional.ofNullable(this.dayOfWeek);
    }

    /**
     * Enable or disable autopatching on SQL virtual machine.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Duration of patching.
     * 
     */
    @Import(name="maintenanceWindowDuration")
    private @Nullable Output<Integer> maintenanceWindowDuration;

    public Optional<Output<Integer>> maintenanceWindowDuration() {
        return Optional.ofNullable(this.maintenanceWindowDuration);
    }

    /**
     * Hour of the day when patching is initiated. Local VM time.
     * 
     */
    @Import(name="maintenanceWindowStartingHour")
    private @Nullable Output<Integer> maintenanceWindowStartingHour;

    public Optional<Output<Integer>> maintenanceWindowStartingHour() {
        return Optional.ofNullable(this.maintenanceWindowStartingHour);
    }

    private AutoPatchingSettingsArgs() {}

    private AutoPatchingSettingsArgs(AutoPatchingSettingsArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.enable = $.enable;
        this.maintenanceWindowDuration = $.maintenanceWindowDuration;
        this.maintenanceWindowStartingHour = $.maintenanceWindowStartingHour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoPatchingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoPatchingSettingsArgs $;

        public Builder() {
            $ = new AutoPatchingSettingsArgs();
        }

        public Builder(AutoPatchingSettingsArgs defaults) {
            $ = new AutoPatchingSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder dayOfWeek(@Nullable Output<DayOfWeek> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        public Builder maintenanceWindowDuration(@Nullable Output<Integer> maintenanceWindowDuration) {
            $.maintenanceWindowDuration = maintenanceWindowDuration;
            return this;
        }

        public Builder maintenanceWindowDuration(Integer maintenanceWindowDuration) {
            return maintenanceWindowDuration(Output.of(maintenanceWindowDuration));
        }

        public Builder maintenanceWindowStartingHour(@Nullable Output<Integer> maintenanceWindowStartingHour) {
            $.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
            return this;
        }

        public Builder maintenanceWindowStartingHour(Integer maintenanceWindowStartingHour) {
            return maintenanceWindowStartingHour(Output.of(maintenanceWindowStartingHour));
        }

        public AutoPatchingSettingsArgs build() {
            return $;
        }
    }

}
