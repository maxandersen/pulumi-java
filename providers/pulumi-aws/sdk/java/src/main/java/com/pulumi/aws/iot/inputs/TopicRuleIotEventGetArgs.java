// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleIotEventGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleIotEventGetArgs Empty = new TopicRuleIotEventGetArgs();

    /**
     * The name of the AWS IoT Events input.
     * 
     */
    @Import(name="inputName", required=true)
    private Output<String> inputName;

    public Output<String> inputName() {
        return this.inputName;
    }

    /**
     * Use this to ensure that only one input (message) with a given messageId is processed by an AWS IoT Events detector.
     * 
     */
    @Import(name="messageId")
    private @Nullable Output<String> messageId;

    public Optional<Output<String>> messageId() {
        return Optional.ofNullable(this.messageId);
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private TopicRuleIotEventGetArgs() {}

    private TopicRuleIotEventGetArgs(TopicRuleIotEventGetArgs $) {
        this.inputName = $.inputName;
        this.messageId = $.messageId;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleIotEventGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleIotEventGetArgs $;

        public Builder() {
            $ = new TopicRuleIotEventGetArgs();
        }

        public Builder(TopicRuleIotEventGetArgs defaults) {
            $ = new TopicRuleIotEventGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder inputName(Output<String> inputName) {
            $.inputName = inputName;
            return this;
        }

        public Builder inputName(String inputName) {
            return inputName(Output.of(inputName));
        }

        public Builder messageId(@Nullable Output<String> messageId) {
            $.messageId = messageId;
            return this;
        }

        public Builder messageId(String messageId) {
            return messageId(Output.of(messageId));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public TopicRuleIotEventGetArgs build() {
            $.inputName = Objects.requireNonNull($.inputName, "expected parameter 'inputName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
