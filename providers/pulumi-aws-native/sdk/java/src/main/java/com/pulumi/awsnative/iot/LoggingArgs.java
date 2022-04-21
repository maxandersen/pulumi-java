// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.enums.LoggingDefaultLogLevel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingArgs Empty = new LoggingArgs();

    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @Import(name="accountId", required=true)
    private Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @Import(name="defaultLogLevel", required=true)
    private Output<LoggingDefaultLogLevel> defaultLogLevel;

    public Output<LoggingDefaultLogLevel> defaultLogLevel() {
        return this.defaultLogLevel;
    }

    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private LoggingArgs() {}

    private LoggingArgs(LoggingArgs $) {
        this.accountId = $.accountId;
        this.defaultLogLevel = $.defaultLogLevel;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingArgs $;

        public Builder() {
            $ = new LoggingArgs();
        }

        public Builder(LoggingArgs defaults) {
            $ = new LoggingArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountId(Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        public Builder defaultLogLevel(Output<LoggingDefaultLogLevel> defaultLogLevel) {
            $.defaultLogLevel = defaultLogLevel;
            return this;
        }

        public Builder defaultLogLevel(LoggingDefaultLogLevel defaultLogLevel) {
            return defaultLogLevel(Output.of(defaultLogLevel));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public LoggingArgs build() {
            $.accountId = Objects.requireNonNull($.accountId, "expected parameter 'accountId' to be non-null");
            $.defaultLogLevel = Objects.requireNonNull($.defaultLogLevel, "expected parameter 'defaultLogLevel' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
