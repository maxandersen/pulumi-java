// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleKinesisAction extends com.pulumi.resources.InvokeArgs {

    public static final TopicRuleKinesisAction Empty = new TopicRuleKinesisAction();

    @Import(name="partitionKey")
    private @Nullable String partitionKey;

    public Optional<String> partitionKey() {
        return Optional.ofNullable(this.partitionKey);
    }

    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="streamName", required=true)
    private String streamName;

    public String streamName() {
        return this.streamName;
    }

    private TopicRuleKinesisAction() {}

    private TopicRuleKinesisAction(TopicRuleKinesisAction $) {
        this.partitionKey = $.partitionKey;
        this.roleArn = $.roleArn;
        this.streamName = $.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleKinesisAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleKinesisAction $;

        public Builder() {
            $ = new TopicRuleKinesisAction();
        }

        public Builder(TopicRuleKinesisAction defaults) {
            $ = new TopicRuleKinesisAction(Objects.requireNonNull(defaults));
        }

        public Builder partitionKey(@Nullable String partitionKey) {
            $.partitionKey = partitionKey;
            return this;
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder streamName(String streamName) {
            $.streamName = streamName;
            return this;
        }

        public TopicRuleKinesisAction build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.streamName = Objects.requireNonNull($.streamName, "expected parameter 'streamName' to be non-null");
            return $;
        }
    }

}
