// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.stepfunctions.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StateMachineCloudWatchLogsLogGroup extends com.pulumi.resources.InvokeArgs {

    public static final StateMachineCloudWatchLogsLogGroup Empty = new StateMachineCloudWatchLogsLogGroup();

    @Import(name="logGroupArn")
    private @Nullable String logGroupArn;

    public Optional<String> logGroupArn() {
        return Optional.ofNullable(this.logGroupArn);
    }

    private StateMachineCloudWatchLogsLogGroup() {}

    private StateMachineCloudWatchLogsLogGroup(StateMachineCloudWatchLogsLogGroup $) {
        this.logGroupArn = $.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StateMachineCloudWatchLogsLogGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StateMachineCloudWatchLogsLogGroup $;

        public Builder() {
            $ = new StateMachineCloudWatchLogsLogGroup();
        }

        public Builder(StateMachineCloudWatchLogsLogGroup defaults) {
            $ = new StateMachineCloudWatchLogsLogGroup(Objects.requireNonNull(defaults));
        }

        public Builder logGroupArn(@Nullable String logGroupArn) {
            $.logGroupArn = logGroupArn;
            return this;
        }

        public StateMachineCloudWatchLogsLogGroup build() {
            return $;
        }
    }

}
