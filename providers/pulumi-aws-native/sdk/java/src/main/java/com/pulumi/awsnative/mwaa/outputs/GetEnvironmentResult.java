// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mwaa.outputs;

import com.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import com.pulumi.awsnative.mwaa.outputs.EnvironmentLoggingConfiguration;
import com.pulumi.awsnative.mwaa.outputs.EnvironmentNetworkConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentResult {
    /**
     * @return Key/value pairs representing Airflow configuration variables.
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
    private final @Nullable Object airflowConfigurationOptions;
    private final @Nullable String airflowVersion;
    private final @Nullable String arn;
    private final @Nullable String dagS3Path;
    private final @Nullable String environmentClass;
    private final @Nullable String executionRoleArn;
    private final @Nullable EnvironmentLoggingConfiguration loggingConfiguration;
    private final @Nullable Integer maxWorkers;
    private final @Nullable Integer minWorkers;
    private final @Nullable EnvironmentNetworkConfiguration networkConfiguration;
    private final @Nullable String pluginsS3ObjectVersion;
    private final @Nullable String pluginsS3Path;
    private final @Nullable String requirementsS3ObjectVersion;
    private final @Nullable String requirementsS3Path;
    private final @Nullable Integer schedulers;
    private final @Nullable String sourceBucketArn;
    /**
     * @return A map of tags for the environment.
     * 
     */
    private final @Nullable Object tags;
    private final @Nullable EnvironmentWebserverAccessMode webserverAccessMode;
    private final @Nullable String webserverUrl;
    private final @Nullable String weeklyMaintenanceWindowStart;

    @CustomType.Constructor
    private GetEnvironmentResult(
        @CustomType.Parameter("airflowConfigurationOptions") @Nullable Object airflowConfigurationOptions,
        @CustomType.Parameter("airflowVersion") @Nullable String airflowVersion,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("dagS3Path") @Nullable String dagS3Path,
        @CustomType.Parameter("environmentClass") @Nullable String environmentClass,
        @CustomType.Parameter("executionRoleArn") @Nullable String executionRoleArn,
        @CustomType.Parameter("loggingConfiguration") @Nullable EnvironmentLoggingConfiguration loggingConfiguration,
        @CustomType.Parameter("maxWorkers") @Nullable Integer maxWorkers,
        @CustomType.Parameter("minWorkers") @Nullable Integer minWorkers,
        @CustomType.Parameter("networkConfiguration") @Nullable EnvironmentNetworkConfiguration networkConfiguration,
        @CustomType.Parameter("pluginsS3ObjectVersion") @Nullable String pluginsS3ObjectVersion,
        @CustomType.Parameter("pluginsS3Path") @Nullable String pluginsS3Path,
        @CustomType.Parameter("requirementsS3ObjectVersion") @Nullable String requirementsS3ObjectVersion,
        @CustomType.Parameter("requirementsS3Path") @Nullable String requirementsS3Path,
        @CustomType.Parameter("schedulers") @Nullable Integer schedulers,
        @CustomType.Parameter("sourceBucketArn") @Nullable String sourceBucketArn,
        @CustomType.Parameter("tags") @Nullable Object tags,
        @CustomType.Parameter("webserverAccessMode") @Nullable EnvironmentWebserverAccessMode webserverAccessMode,
        @CustomType.Parameter("webserverUrl") @Nullable String webserverUrl,
        @CustomType.Parameter("weeklyMaintenanceWindowStart") @Nullable String weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.arn = arn;
        this.dagS3Path = dagS3Path;
        this.environmentClass = environmentClass;
        this.executionRoleArn = executionRoleArn;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.networkConfiguration = networkConfiguration;
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.schedulers = schedulers;
        this.sourceBucketArn = sourceBucketArn;
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.webserverUrl = webserverUrl;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * @return Key/value pairs representing Airflow configuration variables.
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
    public Optional<Object> airflowConfigurationOptions() {
        return Optional.ofNullable(this.airflowConfigurationOptions);
    }
    public Optional<String> airflowVersion() {
        return Optional.ofNullable(this.airflowVersion);
    }
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> dagS3Path() {
        return Optional.ofNullable(this.dagS3Path);
    }
    public Optional<String> environmentClass() {
        return Optional.ofNullable(this.environmentClass);
    }
    public Optional<String> executionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }
    public Optional<EnvironmentLoggingConfiguration> loggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }
    public Optional<Integer> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }
    public Optional<Integer> minWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }
    public Optional<EnvironmentNetworkConfiguration> networkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    public Optional<String> pluginsS3ObjectVersion() {
        return Optional.ofNullable(this.pluginsS3ObjectVersion);
    }
    public Optional<String> pluginsS3Path() {
        return Optional.ofNullable(this.pluginsS3Path);
    }
    public Optional<String> requirementsS3ObjectVersion() {
        return Optional.ofNullable(this.requirementsS3ObjectVersion);
    }
    public Optional<String> requirementsS3Path() {
        return Optional.ofNullable(this.requirementsS3Path);
    }
    public Optional<Integer> schedulers() {
        return Optional.ofNullable(this.schedulers);
    }
    public Optional<String> sourceBucketArn() {
        return Optional.ofNullable(this.sourceBucketArn);
    }
    /**
     * @return A map of tags for the environment.
     * 
     */
    public Optional<Object> tags() {
        return Optional.ofNullable(this.tags);
    }
    public Optional<EnvironmentWebserverAccessMode> webserverAccessMode() {
        return Optional.ofNullable(this.webserverAccessMode);
    }
    public Optional<String> webserverUrl() {
        return Optional.ofNullable(this.webserverUrl);
    }
    public Optional<String> weeklyMaintenanceWindowStart() {
        return Optional.ofNullable(this.weeklyMaintenanceWindowStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object airflowConfigurationOptions;
        private @Nullable String airflowVersion;
        private @Nullable String arn;
        private @Nullable String dagS3Path;
        private @Nullable String environmentClass;
        private @Nullable String executionRoleArn;
        private @Nullable EnvironmentLoggingConfiguration loggingConfiguration;
        private @Nullable Integer maxWorkers;
        private @Nullable Integer minWorkers;
        private @Nullable EnvironmentNetworkConfiguration networkConfiguration;
        private @Nullable String pluginsS3ObjectVersion;
        private @Nullable String pluginsS3Path;
        private @Nullable String requirementsS3ObjectVersion;
        private @Nullable String requirementsS3Path;
        private @Nullable Integer schedulers;
        private @Nullable String sourceBucketArn;
        private @Nullable Object tags;
        private @Nullable EnvironmentWebserverAccessMode webserverAccessMode;
        private @Nullable String webserverUrl;
        private @Nullable String weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.arn = defaults.arn;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.schedulers = defaults.schedulers;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.webserverUrl = defaults.webserverUrl;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder airflowConfigurationOptions(@Nullable Object airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }
        public Builder airflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder dagS3Path(@Nullable String dagS3Path) {
            this.dagS3Path = dagS3Path;
            return this;
        }
        public Builder environmentClass(@Nullable String environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }
        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public Builder loggingConfiguration(@Nullable EnvironmentLoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        public Builder minWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }
        public Builder networkConfiguration(@Nullable EnvironmentNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public Builder pluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }
        public Builder pluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }
        public Builder requirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }
        public Builder requirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }
        public Builder schedulers(@Nullable Integer schedulers) {
            this.schedulers = schedulers;
            return this;
        }
        public Builder sourceBucketArn(@Nullable String sourceBucketArn) {
            this.sourceBucketArn = sourceBucketArn;
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }
        public Builder webserverAccessMode(@Nullable EnvironmentWebserverAccessMode webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }
        public Builder webserverUrl(@Nullable String webserverUrl) {
            this.webserverUrl = webserverUrl;
            return this;
        }
        public Builder weeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(airflowConfigurationOptions, airflowVersion, arn, dagS3Path, environmentClass, executionRoleArn, loggingConfiguration, maxWorkers, minWorkers, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, schedulers, sourceBucketArn, tags, webserverAccessMode, webserverUrl, weeklyMaintenanceWindowStart);
        }
    }
}
