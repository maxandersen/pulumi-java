// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TopicRuleStepFunctionsAction {
    private final @Nullable String executionNamePrefix;
    private final String roleArn;
    private final String stateMachineName;

    @CustomType.Constructor
    private TopicRuleStepFunctionsAction(
        @CustomType.Parameter("executionNamePrefix") @Nullable String executionNamePrefix,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("stateMachineName") String stateMachineName) {
        this.executionNamePrefix = executionNamePrefix;
        this.roleArn = roleArn;
        this.stateMachineName = stateMachineName;
    }

    public Optional<String> executionNamePrefix() {
        return Optional.ofNullable(this.executionNamePrefix);
    }
    public String roleArn() {
        return this.roleArn;
    }
    public String stateMachineName() {
        return this.stateMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleStepFunctionsAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String executionNamePrefix;
        private String roleArn;
        private String stateMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleStepFunctionsAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionNamePrefix = defaults.executionNamePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineName = defaults.stateMachineName;
        }

        public Builder executionNamePrefix(@Nullable String executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder stateMachineName(String stateMachineName) {
            this.stateMachineName = Objects.requireNonNull(stateMachineName);
            return this;
        }        public TopicRuleStepFunctionsAction build() {
            return new TopicRuleStepFunctionsAction(executionNamePrefix, roleArn, stateMachineName);
        }
    }
}
