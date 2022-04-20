// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mwaa;

import com.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import com.pulumi.awsnative.mwaa.inputs.EnvironmentLoggingConfigurationArgs;
import com.pulumi.awsnative.mwaa.inputs.EnvironmentNetworkConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     &#34;core.dags_folder&#34;: &#34;{AIRFLOW_HOME}/dags&#34;
     * 
     */
    @Import(name="airflowConfigurationOptions")
      private final @Nullable Output<Object> airflowConfigurationOptions;

    public Output<Object> airflowConfigurationOptions() {
        return this.airflowConfigurationOptions == null ? Codegen.empty() : this.airflowConfigurationOptions;
    }

    @Import(name="airflowVersion")
      private final @Nullable Output<String> airflowVersion;

    public Output<String> airflowVersion() {
        return this.airflowVersion == null ? Codegen.empty() : this.airflowVersion;
    }

    @Import(name="dagS3Path")
      private final @Nullable Output<String> dagS3Path;

    public Output<String> dagS3Path() {
        return this.dagS3Path == null ? Codegen.empty() : this.dagS3Path;
    }

    @Import(name="environmentClass")
      private final @Nullable Output<String> environmentClass;

    public Output<String> environmentClass() {
        return this.environmentClass == null ? Codegen.empty() : this.environmentClass;
    }

    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> executionRoleArn() {
        return this.executionRoleArn == null ? Codegen.empty() : this.executionRoleArn;
    }

    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> kmsKey() {
        return this.kmsKey == null ? Codegen.empty() : this.kmsKey;
    }

    @Import(name="loggingConfiguration")
      private final @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration;

    public Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration() {
        return this.loggingConfiguration == null ? Codegen.empty() : this.loggingConfiguration;
    }

    @Import(name="maxWorkers")
      private final @Nullable Output<Integer> maxWorkers;

    public Output<Integer> maxWorkers() {
        return this.maxWorkers == null ? Codegen.empty() : this.maxWorkers;
    }

    @Import(name="minWorkers")
      private final @Nullable Output<Integer> minWorkers;

    public Output<Integer> minWorkers() {
        return this.minWorkers == null ? Codegen.empty() : this.minWorkers;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="networkConfiguration")
      private final @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration;

    public Output<EnvironmentNetworkConfigurationArgs> networkConfiguration() {
        return this.networkConfiguration == null ? Codegen.empty() : this.networkConfiguration;
    }

    @Import(name="pluginsS3ObjectVersion")
      private final @Nullable Output<String> pluginsS3ObjectVersion;

    public Output<String> pluginsS3ObjectVersion() {
        return this.pluginsS3ObjectVersion == null ? Codegen.empty() : this.pluginsS3ObjectVersion;
    }

    @Import(name="pluginsS3Path")
      private final @Nullable Output<String> pluginsS3Path;

    public Output<String> pluginsS3Path() {
        return this.pluginsS3Path == null ? Codegen.empty() : this.pluginsS3Path;
    }

    @Import(name="requirementsS3ObjectVersion")
      private final @Nullable Output<String> requirementsS3ObjectVersion;

    public Output<String> requirementsS3ObjectVersion() {
        return this.requirementsS3ObjectVersion == null ? Codegen.empty() : this.requirementsS3ObjectVersion;
    }

    @Import(name="requirementsS3Path")
      private final @Nullable Output<String> requirementsS3Path;

    public Output<String> requirementsS3Path() {
        return this.requirementsS3Path == null ? Codegen.empty() : this.requirementsS3Path;
    }

    @Import(name="schedulers")
      private final @Nullable Output<Integer> schedulers;

    public Output<Integer> schedulers() {
        return this.schedulers == null ? Codegen.empty() : this.schedulers;
    }

    @Import(name="sourceBucketArn")
      private final @Nullable Output<String> sourceBucketArn;

    public Output<String> sourceBucketArn() {
        return this.sourceBucketArn == null ? Codegen.empty() : this.sourceBucketArn;
    }

    /**
     * A map of tags for the environment.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Object> tags;

    public Output<Object> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="webserverAccessMode")
      private final @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode;

    public Output<EnvironmentWebserverAccessMode> webserverAccessMode() {
        return this.webserverAccessMode == null ? Codegen.empty() : this.webserverAccessMode;
    }

    @Import(name="weeklyMaintenanceWindowStart")
      private final @Nullable Output<String> weeklyMaintenanceWindowStart;

    public Output<String> weeklyMaintenanceWindowStart() {
        return this.weeklyMaintenanceWindowStart == null ? Codegen.empty() : this.weeklyMaintenanceWindowStart;
    }

    public EnvironmentArgs(
        @Nullable Output<Object> airflowConfigurationOptions,
        @Nullable Output<String> airflowVersion,
        @Nullable Output<String> dagS3Path,
        @Nullable Output<String> environmentClass,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<String> kmsKey,
        @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration,
        @Nullable Output<Integer> maxWorkers,
        @Nullable Output<Integer> minWorkers,
        @Nullable Output<String> name,
        @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration,
        @Nullable Output<String> pluginsS3ObjectVersion,
        @Nullable Output<String> pluginsS3Path,
        @Nullable Output<String> requirementsS3ObjectVersion,
        @Nullable Output<String> requirementsS3Path,
        @Nullable Output<Integer> schedulers,
        @Nullable Output<String> sourceBucketArn,
        @Nullable Output<Object> tags,
        @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode,
        @Nullable Output<String> weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.dagS3Path = dagS3Path;
        this.environmentClass = environmentClass;
        this.executionRoleArn = executionRoleArn;
        this.kmsKey = kmsKey;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.name = name;
        this.networkConfiguration = networkConfiguration;
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.schedulers = schedulers;
        this.sourceBucketArn = sourceBucketArn;
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    private EnvironmentArgs() {
        this.airflowConfigurationOptions = Codegen.empty();
        this.airflowVersion = Codegen.empty();
        this.dagS3Path = Codegen.empty();
        this.environmentClass = Codegen.empty();
        this.executionRoleArn = Codegen.empty();
        this.kmsKey = Codegen.empty();
        this.loggingConfiguration = Codegen.empty();
        this.maxWorkers = Codegen.empty();
        this.minWorkers = Codegen.empty();
        this.name = Codegen.empty();
        this.networkConfiguration = Codegen.empty();
        this.pluginsS3ObjectVersion = Codegen.empty();
        this.pluginsS3Path = Codegen.empty();
        this.requirementsS3ObjectVersion = Codegen.empty();
        this.requirementsS3Path = Codegen.empty();
        this.schedulers = Codegen.empty();
        this.sourceBucketArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.webserverAccessMode = Codegen.empty();
        this.weeklyMaintenanceWindowStart = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> airflowConfigurationOptions;
        private @Nullable Output<String> airflowVersion;
        private @Nullable Output<String> dagS3Path;
        private @Nullable Output<String> environmentClass;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration;
        private @Nullable Output<Integer> maxWorkers;
        private @Nullable Output<Integer> minWorkers;
        private @Nullable Output<String> name;
        private @Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration;
        private @Nullable Output<String> pluginsS3ObjectVersion;
        private @Nullable Output<String> pluginsS3Path;
        private @Nullable Output<String> requirementsS3ObjectVersion;
        private @Nullable Output<String> requirementsS3Path;
        private @Nullable Output<Integer> schedulers;
        private @Nullable Output<String> sourceBucketArn;
        private @Nullable Output<Object> tags;
        private @Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode;
        private @Nullable Output<String> weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.kmsKey = defaults.kmsKey;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.name = defaults.name;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.schedulers = defaults.schedulers;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder airflowConfigurationOptions(@Nullable Output<Object> airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }
        public Builder airflowConfigurationOptions(@Nullable Object airflowConfigurationOptions) {
            this.airflowConfigurationOptions = Codegen.ofNullable(airflowConfigurationOptions);
            return this;
        }
        public Builder airflowVersion(@Nullable Output<String> airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }
        public Builder airflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = Codegen.ofNullable(airflowVersion);
            return this;
        }
        public Builder dagS3Path(@Nullable Output<String> dagS3Path) {
            this.dagS3Path = dagS3Path;
            return this;
        }
        public Builder dagS3Path(@Nullable String dagS3Path) {
            this.dagS3Path = Codegen.ofNullable(dagS3Path);
            return this;
        }
        public Builder environmentClass(@Nullable Output<String> environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }
        public Builder environmentClass(@Nullable String environmentClass) {
            this.environmentClass = Codegen.ofNullable(environmentClass);
            return this;
        }
        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Codegen.ofNullable(executionRoleArn);
            return this;
        }
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Codegen.ofNullable(kmsKey);
            return this;
        }
        public Builder loggingConfiguration(@Nullable Output<EnvironmentLoggingConfigurationArgs> loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder loggingConfiguration(@Nullable EnvironmentLoggingConfigurationArgs loggingConfiguration) {
            this.loggingConfiguration = Codegen.ofNullable(loggingConfiguration);
            return this;
        }
        public Builder maxWorkers(@Nullable Output<Integer> maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = Codegen.ofNullable(maxWorkers);
            return this;
        }
        public Builder minWorkers(@Nullable Output<Integer> minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }
        public Builder minWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = Codegen.ofNullable(minWorkers);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder networkConfiguration(@Nullable Output<EnvironmentNetworkConfigurationArgs> networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder networkConfiguration(@Nullable EnvironmentNetworkConfigurationArgs networkConfiguration) {
            this.networkConfiguration = Codegen.ofNullable(networkConfiguration);
            return this;
        }
        public Builder pluginsS3ObjectVersion(@Nullable Output<String> pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }
        public Builder pluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = Codegen.ofNullable(pluginsS3ObjectVersion);
            return this;
        }
        public Builder pluginsS3Path(@Nullable Output<String> pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }
        public Builder pluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = Codegen.ofNullable(pluginsS3Path);
            return this;
        }
        public Builder requirementsS3ObjectVersion(@Nullable Output<String> requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }
        public Builder requirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = Codegen.ofNullable(requirementsS3ObjectVersion);
            return this;
        }
        public Builder requirementsS3Path(@Nullable Output<String> requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }
        public Builder requirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = Codegen.ofNullable(requirementsS3Path);
            return this;
        }
        public Builder schedulers(@Nullable Output<Integer> schedulers) {
            this.schedulers = schedulers;
            return this;
        }
        public Builder schedulers(@Nullable Integer schedulers) {
            this.schedulers = Codegen.ofNullable(schedulers);
            return this;
        }
        public Builder sourceBucketArn(@Nullable Output<String> sourceBucketArn) {
            this.sourceBucketArn = sourceBucketArn;
            return this;
        }
        public Builder sourceBucketArn(@Nullable String sourceBucketArn) {
            this.sourceBucketArn = Codegen.ofNullable(sourceBucketArn);
            return this;
        }
        public Builder tags(@Nullable Output<Object> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder webserverAccessMode(@Nullable Output<EnvironmentWebserverAccessMode> webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }
        public Builder webserverAccessMode(@Nullable EnvironmentWebserverAccessMode webserverAccessMode) {
            this.webserverAccessMode = Codegen.ofNullable(webserverAccessMode);
            return this;
        }
        public Builder weeklyMaintenanceWindowStart(@Nullable Output<String> weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }
        public Builder weeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = Codegen.ofNullable(weeklyMaintenanceWindowStart);
            return this;
        }        public EnvironmentArgs build() {
            return new EnvironmentArgs(airflowConfigurationOptions, airflowVersion, dagS3Path, environmentClass, executionRoleArn, kmsKey, loggingConfiguration, maxWorkers, minWorkers, name, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, schedulers, sourceBucketArn, tags, webserverAccessMode, weeklyMaintenanceWindowStart);
        }
    }
}
