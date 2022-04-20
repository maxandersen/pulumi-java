// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LogSubscriptionFilterState extends com.pulumi.resources.ResourceArgs {

    public static final LogSubscriptionFilterState Empty = new LogSubscriptionFilterState();

    /**
     * The ARN of the destination to deliver matching log events to. Kinesis stream or Lambda function ARN.
     * 
     */
    @Import(name="destinationArn")
      private final @Nullable Output<String> destinationArn;

    public Output<String> destinationArn() {
        return this.destinationArn == null ? Codegen.empty() : this.destinationArn;
    }

    /**
     * The method used to distribute log data to the destination. By default log data is grouped by log stream, but the grouping can be set to random for a more even distribution. This property is only applicable when the destination is an Amazon Kinesis stream. Valid values are &#34;Random&#34; and &#34;ByLogStream&#34;.
     * 
     */
    @Import(name="distribution")
      private final @Nullable Output<String> distribution;

    public Output<String> distribution() {
        return this.distribution == null ? Codegen.empty() : this.distribution;
    }

    /**
     * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events.
     * 
     */
    @Import(name="filterPattern")
      private final @Nullable Output<String> filterPattern;

    public Output<String> filterPattern() {
        return this.filterPattern == null ? Codegen.empty() : this.filterPattern;
    }

    /**
     * The name of the log group to associate the subscription filter with
     * 
     */
    @Import(name="logGroup")
      private final @Nullable Output<String> logGroup;

    public Output<String> logGroup() {
        return this.logGroup == null ? Codegen.empty() : this.logGroup;
    }

    /**
     * A name for the subscription filter
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ARN of an IAM role that grants Amazon CloudWatch Logs permissions to deliver ingested log events to the destination. If you use Lambda as a destination, you should skip this argument and use `aws.lambda.Permission` resource for granting access from CloudWatch logs to the destination Lambda function.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    public LogSubscriptionFilterState(
        @Nullable Output<String> destinationArn,
        @Nullable Output<String> distribution,
        @Nullable Output<String> filterPattern,
        @Nullable Output<String> logGroup,
        @Nullable Output<String> name,
        @Nullable Output<String> roleArn) {
        this.destinationArn = destinationArn;
        this.distribution = distribution;
        this.filterPattern = filterPattern;
        this.logGroup = logGroup;
        this.name = name;
        this.roleArn = roleArn;
    }

    private LogSubscriptionFilterState() {
        this.destinationArn = Codegen.empty();
        this.distribution = Codegen.empty();
        this.filterPattern = Codegen.empty();
        this.logGroup = Codegen.empty();
        this.name = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSubscriptionFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> destinationArn;
        private @Nullable Output<String> distribution;
        private @Nullable Output<String> filterPattern;
        private @Nullable Output<String> logGroup;
        private @Nullable Output<String> name;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSubscriptionFilterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.distribution = defaults.distribution;
    	      this.filterPattern = defaults.filterPattern;
    	      this.logGroup = defaults.logGroup;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder destinationArn(@Nullable Output<String> destinationArn) {
            this.destinationArn = destinationArn;
            return this;
        }
        public Builder destinationArn(@Nullable String destinationArn) {
            this.destinationArn = Codegen.ofNullable(destinationArn);
            return this;
        }
        public Builder distribution(@Nullable Output<String> distribution) {
            this.distribution = distribution;
            return this;
        }
        public Builder distribution(@Nullable String distribution) {
            this.distribution = Codegen.ofNullable(distribution);
            return this;
        }
        public Builder filterPattern(@Nullable Output<String> filterPattern) {
            this.filterPattern = filterPattern;
            return this;
        }
        public Builder filterPattern(@Nullable String filterPattern) {
            this.filterPattern = Codegen.ofNullable(filterPattern);
            return this;
        }
        public Builder logGroup(@Nullable Output<String> logGroup) {
            this.logGroup = logGroup;
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
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }        public LogSubscriptionFilterState build() {
            return new LogSubscriptionFilterState(destinationArn, distribution, filterPattern, logGroup, name, roleArn);
        }
    }
}
