// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionRepublishArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionRepublishArgs Empty = new TopicRuleErrorActionRepublishArgs();

    /**
     * The Quality of Service (QoS) level to use when republishing messages. Valid values are 0 or 1. The default value is 0.
     * 
     */
    @Import(name="qos")
    private @Nullable Output<Integer> qos;

    public Optional<Output<Integer>> qos() {
        return Optional.ofNullable(this.qos);
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

    /**
     * The name of the MQTT topic the message should be republished to.
     * 
     */
    @Import(name="topic", required=true)
    private Output<String> topic;

    public Output<String> topic() {
        return this.topic;
    }

    private TopicRuleErrorActionRepublishArgs() {}

    private TopicRuleErrorActionRepublishArgs(TopicRuleErrorActionRepublishArgs $) {
        this.qos = $.qos;
        this.roleArn = $.roleArn;
        this.topic = $.topic;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleErrorActionRepublishArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleErrorActionRepublishArgs $;

        public Builder() {
            $ = new TopicRuleErrorActionRepublishArgs();
        }

        public Builder(TopicRuleErrorActionRepublishArgs defaults) {
            $ = new TopicRuleErrorActionRepublishArgs(Objects.requireNonNull(defaults));
        }

        public Builder qos(@Nullable Output<Integer> qos) {
            $.qos = qos;
            return this;
        }

        public Builder qos(Integer qos) {
            return qos(Output.of(qos));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public Builder topic(Output<String> topic) {
            $.topic = topic;
            return this;
        }

        public Builder topic(String topic) {
            return topic(Output.of(topic));
        }

        public TopicRuleErrorActionRepublishArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.topic = Objects.requireNonNull($.topic, "expected parameter 'topic' to be non-null");
            return $;
        }
    }

}
