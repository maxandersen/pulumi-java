// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mssql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachineAutoPatchingArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualMachineAutoPatchingArgs Empty = new VirtualMachineAutoPatchingArgs();

    /**
     * The day of week to apply the patch on.
     * 
     */
    @Import(name="dayOfWeek", required=true)
    private Output<String> dayOfWeek;

    /**
     * @return The day of week to apply the patch on.
     * 
     */
    public Output<String> dayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * The size of the Maintenance Window in minutes.
     * 
     */
    @Import(name="maintenanceWindowDurationInMinutes", required=true)
    private Output<Integer> maintenanceWindowDurationInMinutes;

    /**
     * @return The size of the Maintenance Window in minutes.
     * 
     */
    public Output<Integer> maintenanceWindowDurationInMinutes() {
        return this.maintenanceWindowDurationInMinutes;
    }

    /**
     * The Hour, in the Virtual Machine Time-Zone when the patching maintenance window should begin.
     * 
     */
    @Import(name="maintenanceWindowStartingHour", required=true)
    private Output<Integer> maintenanceWindowStartingHour;

    /**
     * @return The Hour, in the Virtual Machine Time-Zone when the patching maintenance window should begin.
     * 
     */
    public Output<Integer> maintenanceWindowStartingHour() {
        return this.maintenanceWindowStartingHour;
    }

    private VirtualMachineAutoPatchingArgs() {}

    private VirtualMachineAutoPatchingArgs(VirtualMachineAutoPatchingArgs $) {
        this.dayOfWeek = $.dayOfWeek;
        this.maintenanceWindowDurationInMinutes = $.maintenanceWindowDurationInMinutes;
        this.maintenanceWindowStartingHour = $.maintenanceWindowStartingHour;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineAutoPatchingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineAutoPatchingArgs $;

        public Builder() {
            $ = new VirtualMachineAutoPatchingArgs();
        }

        public Builder(VirtualMachineAutoPatchingArgs defaults) {
            $ = new VirtualMachineAutoPatchingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dayOfWeek The day of week to apply the patch on.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(Output<String> dayOfWeek) {
            $.dayOfWeek = dayOfWeek;
            return this;
        }

        /**
         * @param dayOfWeek The day of week to apply the patch on.
         * 
         * @return builder
         * 
         */
        public Builder dayOfWeek(String dayOfWeek) {
            return dayOfWeek(Output.of(dayOfWeek));
        }

        /**
         * @param maintenanceWindowDurationInMinutes The size of the Maintenance Window in minutes.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDurationInMinutes(Output<Integer> maintenanceWindowDurationInMinutes) {
            $.maintenanceWindowDurationInMinutes = maintenanceWindowDurationInMinutes;
            return this;
        }

        /**
         * @param maintenanceWindowDurationInMinutes The size of the Maintenance Window in minutes.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowDurationInMinutes(Integer maintenanceWindowDurationInMinutes) {
            return maintenanceWindowDurationInMinutes(Output.of(maintenanceWindowDurationInMinutes));
        }

        /**
         * @param maintenanceWindowStartingHour The Hour, in the Virtual Machine Time-Zone when the patching maintenance window should begin.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartingHour(Output<Integer> maintenanceWindowStartingHour) {
            $.maintenanceWindowStartingHour = maintenanceWindowStartingHour;
            return this;
        }

        /**
         * @param maintenanceWindowStartingHour The Hour, in the Virtual Machine Time-Zone when the patching maintenance window should begin.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartingHour(Integer maintenanceWindowStartingHour) {
            return maintenanceWindowStartingHour(Output.of(maintenanceWindowStartingHour));
        }

        public VirtualMachineAutoPatchingArgs build() {
            $.dayOfWeek = Objects.requireNonNull($.dayOfWeek, "expected parameter 'dayOfWeek' to be non-null");
            $.maintenanceWindowDurationInMinutes = Objects.requireNonNull($.maintenanceWindowDurationInMinutes, "expected parameter 'maintenanceWindowDurationInMinutes' to be non-null");
            $.maintenanceWindowStartingHour = Objects.requireNonNull($.maintenanceWindowStartingHour, "expected parameter 'maintenanceWindowStartingHour' to be non-null");
            return $;
        }
    }

}
