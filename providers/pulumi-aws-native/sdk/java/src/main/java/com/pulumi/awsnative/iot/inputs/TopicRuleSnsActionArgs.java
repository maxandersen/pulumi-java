// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleSnsActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleSnsActionArgs Empty = new TopicRuleSnsActionArgs();

    @Import(name="messageFormat")
    private @Nullable Output<String> messageFormat;

    public Optional<Output<String>> messageFormat() {
        return Optional.ofNullable(this.messageFormat);
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    @Import(name="targetArn", required=true)
    private Output<String> targetArn;

    public Output<String> targetArn() {
        return this.targetArn;
    }

    private TopicRuleSnsActionArgs() {}

    private TopicRuleSnsActionArgs(TopicRuleSnsActionArgs $) {
        this.messageFormat = $.messageFormat;
        this.roleArn = $.roleArn;
        this.targetArn = $.targetArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleSnsActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleSnsActionArgs $;

        public Builder() {
            $ = new TopicRuleSnsActionArgs();
        }

        public Builder(TopicRuleSnsActionArgs defaults) {
            $ = new TopicRuleSnsActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            $.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(String messageFormat) {
            return messageFormat(Output.of(messageFormat));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder targetArn(Output<String> targetArn) {
            $.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(String targetArn) {
            return targetArn(Output.of(targetArn));
        }

        public TopicRuleSnsActionArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.targetArn = Objects.requireNonNull($.targetArn, "expected parameter 'targetArn' to be non-null");
            return $;
        }
    }

}
