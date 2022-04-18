// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot;

import com.pulumi.awsnative.iot.enums.LoggingDefaultLogLevel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class LoggingArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingArgs Empty = new LoggingArgs();

    /**
     * Your 12-digit account ID (used as the primary identifier for the CloudFormation resource).
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> accountId() {
        return this.accountId;
    }

    /**
     * The log level to use. Valid values are: ERROR, WARN, INFO, DEBUG, or DISABLED.
     * 
     */
    @Import(name="defaultLogLevel", required=true)
      private final Output<LoggingDefaultLogLevel> defaultLogLevel;

    public Output<LoggingDefaultLogLevel> defaultLogLevel() {
        return this.defaultLogLevel;
    }

    /**
     * The ARN of the role that allows IoT to write to Cloudwatch logs.
     * 
     */
    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    public LoggingArgs(
        Output<String> accountId,
        Output<LoggingDefaultLogLevel> defaultLogLevel,
        Output<String> roleArn) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.defaultLogLevel = Objects.requireNonNull(defaultLogLevel, "expected parameter 'defaultLogLevel' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
    }

    private LoggingArgs() {
        this.accountId = Codegen.empty();
        this.defaultLogLevel = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private Output<LoggingDefaultLogLevel> defaultLogLevel;
        private Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.defaultLogLevel = defaults.defaultLogLevel;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder defaultLogLevel(Output<LoggingDefaultLogLevel> defaultLogLevel) {
            this.defaultLogLevel = Objects.requireNonNull(defaultLogLevel);
            return this;
        }
        public Builder defaultLogLevel(LoggingDefaultLogLevel defaultLogLevel) {
            this.defaultLogLevel = Output.of(Objects.requireNonNull(defaultLogLevel));
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }        public LoggingArgs build() {
            return new LoggingArgs(accountId, defaultLogLevel, roleArn);
        }
    }
}
