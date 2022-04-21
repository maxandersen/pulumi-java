// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleFirehoseAction extends com.pulumi.resources.InvokeArgs {

    public static final TopicRuleFirehoseAction Empty = new TopicRuleFirehoseAction();

    @Import(name="batchMode")
    private @Nullable Boolean batchMode;

    public Optional<Boolean> batchMode() {
        return Optional.ofNullable(this.batchMode);
    }

    @Import(name="deliveryStreamName", required=true)
    private String deliveryStreamName;

    public String deliveryStreamName() {
        return this.deliveryStreamName;
    }

    @Import(name="roleArn", required=true)
    private String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    @Import(name="separator")
    private @Nullable String separator;

    public Optional<String> separator() {
        return Optional.ofNullable(this.separator);
    }

    private TopicRuleFirehoseAction() {}

    private TopicRuleFirehoseAction(TopicRuleFirehoseAction $) {
        this.batchMode = $.batchMode;
        this.deliveryStreamName = $.deliveryStreamName;
        this.roleArn = $.roleArn;
        this.separator = $.separator;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleFirehoseAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleFirehoseAction $;

        public Builder() {
            $ = new TopicRuleFirehoseAction();
        }

        public Builder(TopicRuleFirehoseAction defaults) {
            $ = new TopicRuleFirehoseAction(Objects.requireNonNull(defaults));
        }

        public Builder batchMode(@Nullable Boolean batchMode) {
            $.batchMode = batchMode;
            return this;
        }

        public Builder deliveryStreamName(String deliveryStreamName) {
            $.deliveryStreamName = deliveryStreamName;
            return this;
        }

        public Builder roleArn(String roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder separator(@Nullable String separator) {
            $.separator = separator;
            return this;
        }

        public TopicRuleFirehoseAction build() {
            $.deliveryStreamName = Objects.requireNonNull($.deliveryStreamName, "expected parameter 'deliveryStreamName' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
