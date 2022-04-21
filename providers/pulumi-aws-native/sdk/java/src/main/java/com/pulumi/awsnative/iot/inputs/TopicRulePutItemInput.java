// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TopicRulePutItemInput extends com.pulumi.resources.InvokeArgs {

    public static final TopicRulePutItemInput Empty = new TopicRulePutItemInput();

    @Import(name="tableName", required=true)
    private String tableName;

    public String tableName() {
        return this.tableName;
    }

    private TopicRulePutItemInput() {}

    private TopicRulePutItemInput(TopicRulePutItemInput $) {
        this.tableName = $.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRulePutItemInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRulePutItemInput $;

        public Builder() {
            $ = new TopicRulePutItemInput();
        }

        public Builder(TopicRulePutItemInput defaults) {
            $ = new TopicRulePutItemInput(Objects.requireNonNull(defaults));
        }

        public Builder tableName(String tableName) {
            $.tableName = tableName;
            return this;
        }

        public TopicRulePutItemInput build() {
            $.tableName = Objects.requireNonNull($.tableName, "expected parameter 'tableName' to be non-null");
            return $;
        }
    }

}
