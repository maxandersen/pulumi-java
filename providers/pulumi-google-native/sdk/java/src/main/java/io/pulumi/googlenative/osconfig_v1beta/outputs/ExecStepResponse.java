// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.osconfig_v1beta.outputs.ExecStepConfigResponse;
import java.util.Objects;

@OutputCustomType
public final class ExecStepResponse {
    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    private final ExecStepConfigResponse linuxExecStepConfig;
    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    private final ExecStepConfigResponse windowsExecStepConfig;

    @OutputCustomType.Constructor
    private ExecStepResponse(
        @OutputCustomType.Parameter("linuxExecStepConfig") ExecStepConfigResponse linuxExecStepConfig,
        @OutputCustomType.Parameter("windowsExecStepConfig") ExecStepConfigResponse windowsExecStepConfig) {
        this.linuxExecStepConfig = linuxExecStepConfig;
        this.windowsExecStepConfig = windowsExecStepConfig;
    }

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
    */
    public ExecStepConfigResponse getLinuxExecStepConfig() {
        return this.linuxExecStepConfig;
    }
    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
    */
    public ExecStepConfigResponse getWindowsExecStepConfig() {
        return this.windowsExecStepConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecStepConfigResponse linuxExecStepConfig;
        private ExecStepConfigResponse windowsExecStepConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxExecStepConfig = defaults.linuxExecStepConfig;
    	      this.windowsExecStepConfig = defaults.windowsExecStepConfig;
        }

        public Builder setLinuxExecStepConfig(ExecStepConfigResponse linuxExecStepConfig) {
            this.linuxExecStepConfig = Objects.requireNonNull(linuxExecStepConfig);
            return this;
        }

        public Builder setWindowsExecStepConfig(ExecStepConfigResponse windowsExecStepConfig) {
            this.windowsExecStepConfig = Objects.requireNonNull(windowsExecStepConfig);
            return this;
        }
        public ExecStepResponse build() {
            return new ExecStepResponse(linuxExecStepConfig, windowsExecStepConfig);
        }
    }
}
