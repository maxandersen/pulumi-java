// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.glue.inputs.JobCommandArgs;
import com.pulumi.aws.glue.inputs.JobExecutionPropertyArgs;
import com.pulumi.aws.glue.inputs.JobNotificationPropertyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * The command of the job. Defined below.
     * 
     */
    @Import(name="command", required=true)
    private Output<JobCommandArgs> command;

    public Output<JobCommandArgs> command() {
        return this.command;
    }

    /**
     * The list of connections used for this job.
     * 
     */
    @Import(name="connections")
    private @Nullable Output<List<String>> connections;

    public Optional<Output<List<String>>> connections() {
        return Optional.ofNullable(this.connections);
    }

    /**
     * The map of default arguments for this job. You can specify arguments here that your own job-execution script consumes, as well as arguments that AWS Glue itself consumes. For information about how to specify and consume your own Job arguments, see the [Calling AWS Glue APIs in Python](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) topic in the developer guide. For information about the key-value pairs that AWS Glue consumes to set up your job, see the [Special Parameters Used by AWS Glue](http://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-glue-arguments.html) topic in the developer guide.
     * 
     */
    @Import(name="defaultArguments")
    private @Nullable Output<Map<String,String>> defaultArguments;

    public Optional<Output<Map<String,String>>> defaultArguments() {
        return Optional.ofNullable(this.defaultArguments);
    }

    /**
     * Description of the job.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Execution property of the job. Defined below.
     * 
     */
    @Import(name="executionProperty")
    private @Nullable Output<JobExecutionPropertyArgs> executionProperty;

    public Optional<Output<JobExecutionPropertyArgs>> executionProperty() {
        return Optional.ofNullable(this.executionProperty);
    }

    /**
     * The version of glue to use, for example &#34;1.0&#34;. For information about available versions, see the [AWS Glue Release Notes](https://docs.aws.amazon.com/glue/latest/dg/release-notes.html).
     * 
     */
    @Import(name="glueVersion")
    private @Nullable Output<String> glueVersion;

    public Optional<Output<String>> glueVersion() {
        return Optional.ofNullable(this.glueVersion);
    }

    /**
     * The maximum number of AWS Glue data processing units (DPUs) that can be allocated when this job runs. `Required` when `pythonshell` is set, accept either `0.0625` or `1.0`. Use `number_of_workers` and `worker_type` arguments instead with `glue_version` `2.0` and above.
     * 
     */
    @Import(name="maxCapacity")
    private @Nullable Output<Double> maxCapacity;

    public Optional<Output<Double>> maxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }

    /**
     * The maximum number of times to retry this job if it fails.
     * 
     */
    @Import(name="maxRetries")
    private @Nullable Output<Integer> maxRetries;

    public Optional<Output<Integer>> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    /**
     * The name you assign to this job. It must be unique in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Non-overridable arguments for this job, specified as name-value pairs.
     * 
     */
    @Import(name="nonOverridableArguments")
    private @Nullable Output<Map<String,String>> nonOverridableArguments;

    public Optional<Output<Map<String,String>>> nonOverridableArguments() {
        return Optional.ofNullable(this.nonOverridableArguments);
    }

    /**
     * Notification property of the job. Defined below.
     * 
     */
    @Import(name="notificationProperty")
    private @Nullable Output<JobNotificationPropertyArgs> notificationProperty;

    public Optional<Output<JobNotificationPropertyArgs>> notificationProperty() {
        return Optional.ofNullable(this.notificationProperty);
    }

    /**
     * The number of workers of a defined workerType that are allocated when a job runs.
     * 
     */
    @Import(name="numberOfWorkers")
    private @Nullable Output<Integer> numberOfWorkers;

    public Optional<Output<Integer>> numberOfWorkers() {
        return Optional.ofNullable(this.numberOfWorkers);
    }

    /**
     * The ARN of the IAM role associated with this job.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Security Configuration to be associated with the job.
     * 
     */
    @Import(name="securityConfiguration")
    private @Nullable Output<String> securityConfiguration;

    public Optional<Output<String>> securityConfiguration() {
        return Optional.ofNullable(this.securityConfiguration);
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The job timeout in minutes. The default is 2880 minutes (48 hours).
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * The type of predefined worker that is allocated when a job runs. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    @Import(name="workerType")
    private @Nullable Output<String> workerType;

    public Optional<Output<String>> workerType() {
        return Optional.ofNullable(this.workerType);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.command = $.command;
        this.connections = $.connections;
        this.defaultArguments = $.defaultArguments;
        this.description = $.description;
        this.executionProperty = $.executionProperty;
        this.glueVersion = $.glueVersion;
        this.maxCapacity = $.maxCapacity;
        this.maxRetries = $.maxRetries;
        this.name = $.name;
        this.nonOverridableArguments = $.nonOverridableArguments;
        this.notificationProperty = $.notificationProperty;
        this.numberOfWorkers = $.numberOfWorkers;
        this.roleArn = $.roleArn;
        this.securityConfiguration = $.securityConfiguration;
        this.tags = $.tags;
        this.timeout = $.timeout;
        this.workerType = $.workerType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        public Builder command(Output<JobCommandArgs> command) {
            $.command = command;
            return this;
        }

        public Builder command(JobCommandArgs command) {
            return command(Output.of(command));
        }

        public Builder connections(@Nullable Output<List<String>> connections) {
            $.connections = connections;
            return this;
        }

        public Builder connections(List<String> connections) {
            return connections(Output.of(connections));
        }

        public Builder connections(String... connections) {
            return connections(List.of(connections));
        }

        public Builder defaultArguments(@Nullable Output<Map<String,String>> defaultArguments) {
            $.defaultArguments = defaultArguments;
            return this;
        }

        public Builder defaultArguments(Map<String,String> defaultArguments) {
            return defaultArguments(Output.of(defaultArguments));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder executionProperty(@Nullable Output<JobExecutionPropertyArgs> executionProperty) {
            $.executionProperty = executionProperty;
            return this;
        }

        public Builder executionProperty(JobExecutionPropertyArgs executionProperty) {
            return executionProperty(Output.of(executionProperty));
        }

        public Builder glueVersion(@Nullable Output<String> glueVersion) {
            $.glueVersion = glueVersion;
            return this;
        }

        public Builder glueVersion(String glueVersion) {
            return glueVersion(Output.of(glueVersion));
        }

        public Builder maxCapacity(@Nullable Output<Double> maxCapacity) {
            $.maxCapacity = maxCapacity;
            return this;
        }

        public Builder maxCapacity(Double maxCapacity) {
            return maxCapacity(Output.of(maxCapacity));
        }

        public Builder maxRetries(@Nullable Output<Integer> maxRetries) {
            $.maxRetries = maxRetries;
            return this;
        }

        public Builder maxRetries(Integer maxRetries) {
            return maxRetries(Output.of(maxRetries));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder nonOverridableArguments(@Nullable Output<Map<String,String>> nonOverridableArguments) {
            $.nonOverridableArguments = nonOverridableArguments;
            return this;
        }

        public Builder nonOverridableArguments(Map<String,String> nonOverridableArguments) {
            return nonOverridableArguments(Output.of(nonOverridableArguments));
        }

        public Builder notificationProperty(@Nullable Output<JobNotificationPropertyArgs> notificationProperty) {
            $.notificationProperty = notificationProperty;
            return this;
        }

        public Builder notificationProperty(JobNotificationPropertyArgs notificationProperty) {
            return notificationProperty(Output.of(notificationProperty));
        }

        public Builder numberOfWorkers(@Nullable Output<Integer> numberOfWorkers) {
            $.numberOfWorkers = numberOfWorkers;
            return this;
        }

        public Builder numberOfWorkers(Integer numberOfWorkers) {
            return numberOfWorkers(Output.of(numberOfWorkers));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder securityConfiguration(@Nullable Output<String> securityConfiguration) {
            $.securityConfiguration = securityConfiguration;
            return this;
        }

        public Builder securityConfiguration(String securityConfiguration) {
            return securityConfiguration(Output.of(securityConfiguration));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        public Builder workerType(@Nullable Output<String> workerType) {
            $.workerType = workerType;
            return this;
        }

        public Builder workerType(String workerType) {
            return workerType(Output.of(workerType));
        }

        public JobArgs build() {
            $.command = Objects.requireNonNull($.command, "expected parameter 'command' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
