// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.aws.apigateway.inputs.AccountThrottleSettingsGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountState extends com.pulumi.resources.ResourceArgs {

    public static final AccountState Empty = new AccountState();

    /**
     * The ARN of an IAM role for CloudWatch (to allow logging &amp; monitoring). See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console). Logging &amp; monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
     * 
     */
    @Import(name="cloudwatchRoleArn")
      private final @Nullable Output<String> cloudwatchRoleArn;

    public Output<String> cloudwatchRoleArn() {
        return this.cloudwatchRoleArn == null ? Codegen.empty() : this.cloudwatchRoleArn;
    }

    /**
     * Account-Level throttle settings. See exported fields below.
     * 
     */
    @Import(name="throttleSettings")
      private final @Nullable Output<AccountThrottleSettingsGetArgs> throttleSettings;

    public Output<AccountThrottleSettingsGetArgs> throttleSettings() {
        return this.throttleSettings == null ? Codegen.empty() : this.throttleSettings;
    }

    public AccountState(
        @Nullable Output<String> cloudwatchRoleArn,
        @Nullable Output<AccountThrottleSettingsGetArgs> throttleSettings) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
        this.throttleSettings = throttleSettings;
    }

    private AccountState() {
        this.cloudwatchRoleArn = Codegen.empty();
        this.throttleSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cloudwatchRoleArn;
        private @Nullable Output<AccountThrottleSettingsGetArgs> throttleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudwatchRoleArn = defaults.cloudwatchRoleArn;
    	      this.throttleSettings = defaults.throttleSettings;
        }

        public Builder cloudwatchRoleArn(@Nullable Output<String> cloudwatchRoleArn) {
            this.cloudwatchRoleArn = cloudwatchRoleArn;
            return this;
        }
        public Builder cloudwatchRoleArn(@Nullable String cloudwatchRoleArn) {
            this.cloudwatchRoleArn = Codegen.ofNullable(cloudwatchRoleArn);
            return this;
        }
        public Builder throttleSettings(@Nullable Output<AccountThrottleSettingsGetArgs> throttleSettings) {
            this.throttleSettings = throttleSettings;
            return this;
        }
        public Builder throttleSettings(@Nullable AccountThrottleSettingsGetArgs throttleSettings) {
            this.throttleSettings = Codegen.ofNullable(throttleSettings);
            return this;
        }        public AccountState build() {
            return new AccountState(cloudwatchRoleArn, throttleSettings);
        }
    }
}
