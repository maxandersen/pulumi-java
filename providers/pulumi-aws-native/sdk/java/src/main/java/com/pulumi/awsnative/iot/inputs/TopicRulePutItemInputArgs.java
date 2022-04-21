// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRulePutItemInputArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRulePutItemInputArgs Empty = new TopicRulePutItemInputArgs();

    @Import(name="tableName", required=true)
    private Output<String> tableName;

    public Output<String> tableName() {
        return this.tableName;
    }

    private TopicRulePutItemInputArgs() {}

    private TopicRulePutItemInputArgs(TopicRulePutItemInputArgs $) {
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRulePutItemInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRulePutItemInputArgs $;

        public Builder() {
            $ = new TopicRulePutItemInputArgs();
        }

        public Builder(TopicRulePutItemInputArgs defaults) {
            $ = new TopicRulePutItemInputArgs(Objects.requireNonNull(defaults));
        }

        public Builder tableName(Output<String> tableName) {
            $.tableName = tableName;
            return this;
        }

        public Builder tableName(String tableName) {
            return tableName(Output.of(tableName));
        }

        public TopicRulePutItemInputArgs build() {
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
