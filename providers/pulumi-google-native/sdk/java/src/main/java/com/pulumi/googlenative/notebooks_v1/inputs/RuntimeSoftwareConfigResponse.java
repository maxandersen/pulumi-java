// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.inputs.ContainerImageResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the selection and configuration of software inside the runtime. The properties to set on runtime. Properties keys are specified in `key:value` format, for example: * `idle_shutdown: true` * `idle_shutdown_timeout: 180` * `enable_health_monitoring: true`
 * 
 */
public final class RuntimeSoftwareConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final RuntimeSoftwareConfigResponse Empty = new RuntimeSoftwareConfigResponse();

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we&#39;ll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath", required=true)
      private final String customGpuDriverPath;

    public String customGpuDriverPath() {
        return this.customGpuDriverPath;
    }

    /**
     * Verifies core internal services are running. Default: True
     * 
     */
    @Import(name="enableHealthMonitoring", required=true)
      private final Boolean enableHealthMonitoring;

    public Boolean enableHealthMonitoring() {
        return this.enableHealthMonitoring;
    }

    /**
     * Runtime will automatically shutdown after idle_shutdown_time. Default: True
     * 
     */
    @Import(name="idleShutdown", required=true)
      private final Boolean idleShutdown;

    public Boolean idleShutdown() {
        return this.idleShutdown;
    }

    /**
     * Time in minutes to wait before shutting down runtime. Default: 180 minutes
     * 
     */
    @Import(name="idleShutdownTimeout", required=true)
      private final Integer idleShutdownTimeout;

    public Integer idleShutdownTimeout() {
        return this.idleShutdownTimeout;
    }

    /**
     * Install Nvidia Driver automatically.
     * 
     */
    @Import(name="installGpuDriver", required=true)
      private final Boolean installGpuDriver;

    public Boolean installGpuDriver() {
        return this.installGpuDriver;
    }

    /**
     * Optional. Use a list of container images to use as Kernels in the notebook instance.
     * 
     */
    @Import(name="kernels", required=true)
      private final List<ContainerImageResponse> kernels;

    public List<ContainerImageResponse> kernels() {
        return this.kernels;
    }

    /**
     * Cron expression in UTC timezone, used to schedule instance auto upgrade. Please follow the [cron format](https://en.wikipedia.org/wiki/Cron).
     * 
     */
    @Import(name="notebookUpgradeSchedule", required=true)
      private final String notebookUpgradeSchedule;

    public String notebookUpgradeSchedule() {
        return this.notebookUpgradeSchedule;
    }

    /**
     * Path to a Bash script that automatically runs after a notebook instance fully boots up. The path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
     * 
     */
    @Import(name="postStartupScript", required=true)
      private final String postStartupScript;

    public String postStartupScript() {
        return this.postStartupScript;
    }

    public RuntimeSoftwareConfigResponse(
        String customGpuDriverPath,
        Boolean enableHealthMonitoring,
        Boolean idleShutdown,
        Integer idleShutdownTimeout,
        Boolean installGpuDriver,
        List<ContainerImageResponse> kernels,
        String notebookUpgradeSchedule,
        String postStartupScript) {
        this.customGpuDriverPath = Objects.requireNonNull(customGpuDriverPath, "expected parameter 'customGpuDriverPath' to be non-null");
        this.enableHealthMonitoring = Objects.requireNonNull(enableHealthMonitoring, "expected parameter 'enableHealthMonitoring' to be non-null");
        this.idleShutdown = Objects.requireNonNull(idleShutdown, "expected parameter 'idleShutdown' to be non-null");
        this.idleShutdownTimeout = Objects.requireNonNull(idleShutdownTimeout, "expected parameter 'idleShutdownTimeout' to be non-null");
        this.installGpuDriver = Objects.requireNonNull(installGpuDriver, "expected parameter 'installGpuDriver' to be non-null");
        this.kernels = Objects.requireNonNull(kernels, "expected parameter 'kernels' to be non-null");
        this.notebookUpgradeSchedule = Objects.requireNonNull(notebookUpgradeSchedule, "expected parameter 'notebookUpgradeSchedule' to be non-null");
        this.postStartupScript = Objects.requireNonNull(postStartupScript, "expected parameter 'postStartupScript' to be non-null");
    }

    private RuntimeSoftwareConfigResponse() {
        this.customGpuDriverPath = null;
        this.enableHealthMonitoring = null;
        this.idleShutdown = null;
        this.idleShutdownTimeout = null;
        this.installGpuDriver = null;
        this.kernels = List.of();
        this.notebookUpgradeSchedule = null;
        this.postStartupScript = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeSoftwareConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customGpuDriverPath;
        private Boolean enableHealthMonitoring;
        private Boolean idleShutdown;
        private Integer idleShutdownTimeout;
        private Boolean installGpuDriver;
        private List<ContainerImageResponse> kernels;
        private String notebookUpgradeSchedule;
        private String postStartupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeSoftwareConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.enableHealthMonitoring = defaults.enableHealthMonitoring;
    	      this.idleShutdown = defaults.idleShutdown;
    	      this.idleShutdownTimeout = defaults.idleShutdownTimeout;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.kernels = defaults.kernels;
    	      this.notebookUpgradeSchedule = defaults.notebookUpgradeSchedule;
    	      this.postStartupScript = defaults.postStartupScript;
        }

        public Builder customGpuDriverPath(String customGpuDriverPath) {
            this.customGpuDriverPath = Objects.requireNonNull(customGpuDriverPath);
            return this;
        }
        public Builder enableHealthMonitoring(Boolean enableHealthMonitoring) {
            this.enableHealthMonitoring = Objects.requireNonNull(enableHealthMonitoring);
            return this;
        }
        public Builder idleShutdown(Boolean idleShutdown) {
            this.idleShutdown = Objects.requireNonNull(idleShutdown);
            return this;
        }
        public Builder idleShutdownTimeout(Integer idleShutdownTimeout) {
            this.idleShutdownTimeout = Objects.requireNonNull(idleShutdownTimeout);
            return this;
        }
        public Builder installGpuDriver(Boolean installGpuDriver) {
            this.installGpuDriver = Objects.requireNonNull(installGpuDriver);
            return this;
        }
        public Builder kernels(List<ContainerImageResponse> kernels) {
            this.kernels = Objects.requireNonNull(kernels);
            return this;
        }
        public Builder kernels(ContainerImageResponse... kernels) {
            return kernels(List.of(kernels));
        }
        public Builder notebookUpgradeSchedule(String notebookUpgradeSchedule) {
            this.notebookUpgradeSchedule = Objects.requireNonNull(notebookUpgradeSchedule);
            return this;
        }
        public Builder postStartupScript(String postStartupScript) {
            this.postStartupScript = Objects.requireNonNull(postStartupScript);
            return this;
        }        public RuntimeSoftwareConfigResponse build() {
            return new RuntimeSoftwareConfigResponse(customGpuDriverPath, enableHealthMonitoring, idleShutdown, idleShutdownTimeout, installGpuDriver, kernels, notebookUpgradeSchedule, postStartupScript);
        }
    }
}
