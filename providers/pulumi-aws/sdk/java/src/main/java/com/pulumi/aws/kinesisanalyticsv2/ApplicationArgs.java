// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2;

import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs;
import com.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The application&#39;s configuration
     * 
     */
    @Import(name="applicationConfiguration")
    private @Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration;

    public Optional<Output<ApplicationApplicationConfigurationArgs>> applicationConfiguration() {
        return Optional.ofNullable(this.applicationConfiguration);
    }

    /**
     * A CloudWatch log stream to monitor application configuration errors.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
    private @Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Optional<Output<ApplicationCloudwatchLoggingOptionsArgs>> cloudwatchLoggingOptions() {
        return Optional.ofNullable(this.cloudwatchLoggingOptions);
    }

    /**
     * A summary description of the application.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether to force stop an unresponsive Flink-based application.
     * 
     */
    @Import(name="forceStop")
    private @Nullable Output<Boolean> forceStop;

    public Optional<Output<Boolean>> forceStop() {
        return Optional.ofNullable(this.forceStop);
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`.
     * 
     */
    @Import(name="runtimeEnvironment", required=true)
    private Output<String> runtimeEnvironment;

    public Output<String> runtimeEnvironment() {
        return this.runtimeEnvironment;
    }

    /**
     * The ARN of the IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
     * 
     */
    @Import(name="serviceExecutionRole", required=true)
    private Output<String> serviceExecutionRole;

    public Output<String> serviceExecutionRole() {
        return this.serviceExecutionRole;
    }

    /**
     * Whether to start or stop the application.
     * 
     */
    @Import(name="startApplication")
    private @Nullable Output<Boolean> startApplication;

    public Optional<Output<Boolean>> startApplication() {
        return Optional.ofNullable(this.startApplication);
    }

    /**
     * A map of tags to assign to the application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ApplicationArgs() {}

    private ApplicationArgs(ApplicationArgs $) {
        this.applicationConfiguration = $.applicationConfiguration;
        this.cloudwatchLoggingOptions = $.cloudwatchLoggingOptions;
        this.description = $.description;
        this.forceStop = $.forceStop;
        this.name = $.name;
        this.runtimeEnvironment = $.runtimeEnvironment;
        this.serviceExecutionRole = $.serviceExecutionRole;
        this.startApplication = $.startApplication;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationArgs $;

        public Builder() {
            $ = new ApplicationArgs();
        }

        public Builder(ApplicationArgs defaults) {
            $ = new ApplicationArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration) {
            $.applicationConfiguration = applicationConfiguration;
            return this;
        }

        public Builder applicationConfiguration(ApplicationApplicationConfigurationArgs applicationConfiguration) {
            return applicationConfiguration(Output.of(applicationConfiguration));
        }

        public Builder cloudwatchLoggingOptions(@Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            $.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }

        public Builder cloudwatchLoggingOptions(ApplicationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            return cloudwatchLoggingOptions(Output.of(cloudwatchLoggingOptions));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder forceStop(@Nullable Output<Boolean> forceStop) {
            $.forceStop = forceStop;
            return this;
        }

        public Builder forceStop(Boolean forceStop) {
            return forceStop(Output.of(forceStop));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder runtimeEnvironment(Output<String> runtimeEnvironment) {
            $.runtimeEnvironment = runtimeEnvironment;
            return this;
        }

        public Builder runtimeEnvironment(String runtimeEnvironment) {
            return runtimeEnvironment(Output.of(runtimeEnvironment));
        }

        public Builder serviceExecutionRole(Output<String> serviceExecutionRole) {
            $.serviceExecutionRole = serviceExecutionRole;
            return this;
        }

        public Builder serviceExecutionRole(String serviceExecutionRole) {
            return serviceExecutionRole(Output.of(serviceExecutionRole));
        }

        public Builder startApplication(@Nullable Output<Boolean> startApplication) {
            $.startApplication = startApplication;
            return this;
        }

        public Builder startApplication(Boolean startApplication) {
            return startApplication(Output.of(startApplication));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ApplicationArgs build() {
            $.runtimeEnvironment = Objects.requireNonNull($.runtimeEnvironment, "expected parameter 'runtimeEnvironment' to be non-null");
            $.serviceExecutionRole = Objects.requireNonNull($.serviceExecutionRole, "expected parameter 'serviceExecutionRole' to be non-null");
            return $;
        }
    }

}
