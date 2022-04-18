// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleCloudwatchAlarmAction extends com.pulumi.resources.InvokeArgs {

    public static final TopicRuleCloudwatchAlarmAction Empty = new TopicRuleCloudwatchAlarmAction();

    @Import(name="alarmName", required=true)
      private final String alarmName;

    public String alarmName() {
        return this.alarmName;
    }

    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="stateReason", required=true)
      private final String stateReason;

    public String stateReason() {
        return this.stateReason;
    }

    @Import(name="stateValue", required=true)
      private final String stateValue;

    public String stateValue() {
        return this.stateValue;
    }

    public TopicRuleCloudwatchAlarmAction(
        String alarmName,
        String roleArn,
        String stateReason,
        String stateValue) {
        this.alarmName = Objects.requireNonNull(alarmName, "expected parameter 'alarmName' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateReason = Objects.requireNonNull(stateReason, "expected parameter 'stateReason' to be non-null");
        this.stateValue = Objects.requireNonNull(stateValue, "expected parameter 'stateValue' to be non-null");
    }

    private TopicRuleCloudwatchAlarmAction() {
        this.alarmName = null;
        this.roleArn = null;
        this.stateReason = null;
        this.stateValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleCloudwatchAlarmAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String alarmName;
        private String roleArn;
        private String stateReason;
        private String stateValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleCloudwatchAlarmAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alarmName = defaults.alarmName;
    	      this.roleArn = defaults.roleArn;
    	      this.stateReason = defaults.stateReason;
    	      this.stateValue = defaults.stateValue;
        }

        public Builder alarmName(String alarmName) {
            this.alarmName = Objects.requireNonNull(alarmName);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder stateReason(String stateReason) {
            this.stateReason = Objects.requireNonNull(stateReason);
            return this;
        }
        public Builder stateValue(String stateValue) {
            this.stateValue = Objects.requireNonNull(stateValue);
            return this;
        }        public TopicRuleCloudwatchAlarmAction build() {
            return new TopicRuleCloudwatchAlarmAction(alarmName, roleArn, stateReason, stateValue);
        }
    }
}
