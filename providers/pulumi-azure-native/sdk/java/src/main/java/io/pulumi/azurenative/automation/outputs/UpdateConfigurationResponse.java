// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.azurenative.automation.outputs.LinuxPropertiesResponse;
import io.pulumi.azurenative.automation.outputs.TargetPropertiesResponse;
import io.pulumi.azurenative.automation.outputs.WindowsPropertiesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UpdateConfigurationResponse {
    /**
     * List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
     */
    private final @Nullable List<String> azureVirtualMachines;
    /**
     * Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
     */
    private final @Nullable String duration;
    /**
     * Linux specific update configuration.
     * 
     */
    private final @Nullable LinuxPropertiesResponse linux;
    /**
     * List of names of non-azure machines targeted by the software update configuration.
     * 
     */
    private final @Nullable List<String> nonAzureComputerNames;
    /**
     * operating system of target machines
     * 
     */
    private final String operatingSystem;
    /**
     * Group targets for the software update configuration.
     * 
     */
    private final @Nullable TargetPropertiesResponse targets;
    /**
     * Windows specific update configuration.
     * 
     */
    private final @Nullable WindowsPropertiesResponse windows;

    @CustomType.Constructor
    private UpdateConfigurationResponse(
        @CustomType.Parameter("azureVirtualMachines") @Nullable List<String> azureVirtualMachines,
        @CustomType.Parameter("duration") @Nullable String duration,
        @CustomType.Parameter("linux") @Nullable LinuxPropertiesResponse linux,
        @CustomType.Parameter("nonAzureComputerNames") @Nullable List<String> nonAzureComputerNames,
        @CustomType.Parameter("operatingSystem") String operatingSystem,
        @CustomType.Parameter("targets") @Nullable TargetPropertiesResponse targets,
        @CustomType.Parameter("windows") @Nullable WindowsPropertiesResponse windows) {
        this.azureVirtualMachines = azureVirtualMachines;
        this.duration = duration;
        this.linux = linux;
        this.nonAzureComputerNames = nonAzureComputerNames;
        this.operatingSystem = operatingSystem;
        this.targets = targets;
        this.windows = windows;
    }

    /**
     * List of azure resource Ids for azure virtual machines targeted by the software update configuration.
     * 
    */
    public List<String> azureVirtualMachines() {
        return this.azureVirtualMachines == null ? List.of() : this.azureVirtualMachines;
    }
    /**
     * Maximum time allowed for the software update configuration run. Duration needs to be specified using the format PT[n]H[n]M[n]S as per ISO8601
     * 
    */
    public Optional<String> duration() {
        return Optional.ofNullable(this.duration);
    }
    /**
     * Linux specific update configuration.
     * 
    */
    public Optional<LinuxPropertiesResponse> linux() {
        return Optional.ofNullable(this.linux);
    }
    /**
     * List of names of non-azure machines targeted by the software update configuration.
     * 
    */
    public List<String> nonAzureComputerNames() {
        return this.nonAzureComputerNames == null ? List.of() : this.nonAzureComputerNames;
    }
    /**
     * operating system of target machines
     * 
    */
    public String operatingSystem() {
        return this.operatingSystem;
    }
    /**
     * Group targets for the software update configuration.
     * 
    */
    public Optional<TargetPropertiesResponse> targets() {
        return Optional.ofNullable(this.targets);
    }
    /**
     * Windows specific update configuration.
     * 
    */
    public Optional<WindowsPropertiesResponse> windows() {
        return Optional.ofNullable(this.windows);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> azureVirtualMachines;
        private @Nullable String duration;
        private @Nullable LinuxPropertiesResponse linux;
        private @Nullable List<String> nonAzureComputerNames;
        private String operatingSystem;
        private @Nullable TargetPropertiesResponse targets;
        private @Nullable WindowsPropertiesResponse windows;

        public Builder() {
    	      // Empty
        }

        public Builder(UpdateConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureVirtualMachines = defaults.azureVirtualMachines;
    	      this.duration = defaults.duration;
    	      this.linux = defaults.linux;
    	      this.nonAzureComputerNames = defaults.nonAzureComputerNames;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.targets = defaults.targets;
    	      this.windows = defaults.windows;
        }

        public Builder azureVirtualMachines(@Nullable List<String> azureVirtualMachines) {
            this.azureVirtualMachines = azureVirtualMachines;
            return this;
        }
        public Builder azureVirtualMachines(String... azureVirtualMachines) {
            return azureVirtualMachines(List.of(azureVirtualMachines));
        }
        public Builder duration(@Nullable String duration) {
            this.duration = duration;
            return this;
        }
        public Builder linux(@Nullable LinuxPropertiesResponse linux) {
            this.linux = linux;
            return this;
        }
        public Builder nonAzureComputerNames(@Nullable List<String> nonAzureComputerNames) {
            this.nonAzureComputerNames = nonAzureComputerNames;
            return this;
        }
        public Builder nonAzureComputerNames(String... nonAzureComputerNames) {
            return nonAzureComputerNames(List.of(nonAzureComputerNames));
        }
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }
        public Builder targets(@Nullable TargetPropertiesResponse targets) {
            this.targets = targets;
            return this;
        }
        public Builder windows(@Nullable WindowsPropertiesResponse windows) {
            this.windows = windows;
            return this;
        }        public UpdateConfigurationResponse build() {
            return new UpdateConfigurationResponse(azureVirtualMachines, duration, linux, nonAzureComputerNames, operatingSystem, targets, windows);
        }
    }
}
