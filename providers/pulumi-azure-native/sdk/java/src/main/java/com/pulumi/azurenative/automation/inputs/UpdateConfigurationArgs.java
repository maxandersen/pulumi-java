// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.azurenative.automation.enums.OperatingSystemType;
import com.pulumi.azurenative.automation.inputs.LinuxPropertiesArgs;
import com.pulumi.azurenative.automation.inputs.TargetPropertiesArgs;
import com.pulumi.azurenative.automation.inputs.WindowsPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Update specific properties of the software update configuration.
 * 
 */
public final class UpdateConfigurationArgs extends ResourceArgs {

    public static final UpdateConfigurationArgs Empty = new UpdateConfigurationArgs();

    /**
     * List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
     */
    @Import(name="azureVirtualMachines")
    private @Nullable Output<List<String>> azureVirtualMachines;

    /**
     * @return List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
     */
    public Optional<Output<List<String>>> azureVirtualMachines() {
        return Optional.ofNullable(this.azureVirtualMachines);
    }

    /**
     * Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
     */
    @Import(name="duration")
    private @Nullable Output<String> duration;

    /**
     * @return Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
     */
    public Optional<Output<String>> duration() {
        return Optional.ofNullable(this.duration);
    }

    /**
     * Linux specific update configuration.
     * 
     */
    @Import(name="linux")
    private @Nullable Output<LinuxPropertiesArgs> linux;

    /**
     * @return Linux specific update configuration.
     * 
     */
    public Optional<Output<LinuxPropertiesArgs>> linux() {
        return Optional.ofNullable(this.linux);
    }

    /**
     * List of names of non-azure machines targeted by the software update configuration.
     * 
     */
    @Import(name="nonAzureComputerNames")
    private @Nullable Output<List<String>> nonAzureComputerNames;

    /**
     * @return List of names of non-azure machines targeted by the software update configuration.
     * 
     */
    public Optional<Output<List<String>>> nonAzureComputerNames() {
        return Optional.ofNullable(this.nonAzureComputerNames);
    }

    /**
     * operating system of target machines
     * 
     */
    @Import(name="operatingSystem", required=true)
    private Output<OperatingSystemType> operatingSystem;

    /**
     * @return operating system of target machines
     * 
     */
    public Output<OperatingSystemType> operatingSystem() {
        return this.operatingSystem;
    }

    /**
     * Group targets for the software update configuration.
     * 
     */
    @Import(name="targets")
    private @Nullable Output<TargetPropertiesArgs> targets;

    /**
     * @return Group targets for the software update configuration.
     * 
     */
    public Optional<Output<TargetPropertiesArgs>> targets() {
        return Optional.ofNullable(this.targets);
    }

    /**
     * Windows specific update configuration.
     * 
     */
    @Import(name="windows")
    private @Nullable Output<WindowsPropertiesArgs> windows;

    /**
     * @return Windows specific update configuration.
     * 
     */
    public Optional<Output<WindowsPropertiesArgs>> windows() {
        return Optional.ofNullable(this.windows);
    }

    private UpdateConfigurationArgs() {}

    private UpdateConfigurationArgs(UpdateConfigurationArgs $) {
        this.azureVirtualMachines = $.azureVirtualMachines;
        this.duration = $.duration;
        this.linux = $.linux;
        this.nonAzureComputerNames = $.nonAzureComputerNames;
        this.operatingSystem = $.operatingSystem;
        this.targets = $.targets;
        this.windows = $.windows;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UpdateConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UpdateConfigurationArgs $;

        public Builder() {
            $ = new UpdateConfigurationArgs();
        }

        public Builder(UpdateConfigurationArgs defaults) {
            $ = new UpdateConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureVirtualMachines List of azure resource Ids for azure virtual machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureVirtualMachines(@Nullable Output<List<String>> azureVirtualMachines) {
            $.azureVirtualMachines = azureVirtualMachines;
            return this;
        }

        /**
         * @param azureVirtualMachines List of azure resource Ids for azure virtual machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureVirtualMachines(List<String> azureVirtualMachines) {
            return azureVirtualMachines(Output.of(azureVirtualMachines));
        }

        /**
         * @param azureVirtualMachines List of azure resource Ids for azure virtual machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder azureVirtualMachines(String... azureVirtualMachines) {
            return azureVirtualMachines(List.of(azureVirtualMachines));
        }

        /**
         * @param duration Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
         * 
         * @return builder
         * 
         */
        public Builder duration(@Nullable Output<String> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
         * 
         * @return builder
         * 
         */
        public Builder duration(String duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param linux Linux specific update configuration.
         * 
         * @return builder
         * 
         */
        public Builder linux(@Nullable Output<LinuxPropertiesArgs> linux) {
            $.linux = linux;
            return this;
        }

        /**
         * @param linux Linux specific update configuration.
         * 
         * @return builder
         * 
         */
        public Builder linux(LinuxPropertiesArgs linux) {
            return linux(Output.of(linux));
        }

        /**
         * @param nonAzureComputerNames List of names of non-azure machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureComputerNames(@Nullable Output<List<String>> nonAzureComputerNames) {
            $.nonAzureComputerNames = nonAzureComputerNames;
            return this;
        }

        /**
         * @param nonAzureComputerNames List of names of non-azure machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureComputerNames(List<String> nonAzureComputerNames) {
            return nonAzureComputerNames(Output.of(nonAzureComputerNames));
        }

        /**
         * @param nonAzureComputerNames List of names of non-azure machines targeted by the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder nonAzureComputerNames(String... nonAzureComputerNames) {
            return nonAzureComputerNames(List.of(nonAzureComputerNames));
        }

        /**
         * @param operatingSystem operating system of target machines
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(Output<OperatingSystemType> operatingSystem) {
            $.operatingSystem = operatingSystem;
            return this;
        }

        /**
         * @param operatingSystem operating system of target machines
         * 
         * @return builder
         * 
         */
        public Builder operatingSystem(OperatingSystemType operatingSystem) {
            return operatingSystem(Output.of(operatingSystem));
        }

        /**
         * @param targets Group targets for the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder targets(@Nullable Output<TargetPropertiesArgs> targets) {
            $.targets = targets;
            return this;
        }

        /**
         * @param targets Group targets for the software update configuration.
         * 
         * @return builder
         * 
         */
        public Builder targets(TargetPropertiesArgs targets) {
            return targets(Output.of(targets));
        }

        /**
         * @param windows Windows specific update configuration.
         * 
         * @return builder
         * 
         */
        public Builder windows(@Nullable Output<WindowsPropertiesArgs> windows) {
            $.windows = windows;
            return this;
        }

        /**
         * @param windows Windows specific update configuration.
         * 
         * @return builder
         * 
         */
        public Builder windows(WindowsPropertiesArgs windows) {
            return windows(Output.of(windows));
        }

        public UpdateConfigurationArgs build() {
            $.operatingSystem = Objects.requireNonNull($.operatingSystem, "expected parameter 'operatingSystem' to be non-null");
            return $;
        }
    }

}
