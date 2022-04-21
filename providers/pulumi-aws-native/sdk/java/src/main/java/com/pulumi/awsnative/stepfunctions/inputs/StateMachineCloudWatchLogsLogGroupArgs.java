// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.stepfunctions.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StateMachineCloudWatchLogsLogGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final StateMachineCloudWatchLogsLogGroupArgs Empty = new StateMachineCloudWatchLogsLogGroupArgs();

    @Import(name="logGroupArn")
    private @Nullable Output<String> logGroupArn;

    public Optional<Output<String>> logGroupArn() {
        return Optional.ofNullable(this.logGroupArn);
    }

    private StateMachineCloudWatchLogsLogGroupArgs() {}

    private StateMachineCloudWatchLogsLogGroupArgs(StateMachineCloudWatchLogsLogGroupArgs $) {
        this.logGroupArn = $.logGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StateMachineCloudWatchLogsLogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StateMachineCloudWatchLogsLogGroupArgs $;

        public Builder() {
            $ = new StateMachineCloudWatchLogsLogGroupArgs();
        }

        public Builder(StateMachineCloudWatchLogsLogGroupArgs defaults) {
            $ = new StateMachineCloudWatchLogsLogGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder logGroupArn(@Nullable Output<String> logGroupArn) {
            $.logGroupArn = logGroupArn;
            return this;
        }

        public Builder logGroupArn(String logGroupArn) {
            return logGroupArn(Output.of(logGroupArn));
        }

        public StateMachineCloudWatchLogsLogGroupArgs build() {
            return $;
        }
    }

}
