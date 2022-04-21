// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupCustomResponseBodyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupCustomResponseBodyArgs Empty = new RuleGroupCustomResponseBodyArgs();

    /**
     * The payload of the custom response.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * The type of content in the payload that you are defining in the `content` argument. Valid values are `TEXT_PLAIN`, `TEXT_HTML`, or `APPLICATION_JSON`.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * A unique key identifying the custom response body. This is referenced by the `custom_response_body_key` argument in the Custom Response block.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    private RuleGroupCustomResponseBodyArgs() {}

    private RuleGroupCustomResponseBodyArgs(RuleGroupCustomResponseBodyArgs $) {
        this.content = $.content;
        this.contentType = $.contentType;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupCustomResponseBodyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupCustomResponseBodyArgs $;

        public Builder() {
            $ = new RuleGroupCustomResponseBodyArgs();
        }

        public Builder(RuleGroupCustomResponseBodyArgs defaults) {
            $ = new RuleGroupCustomResponseBodyArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder contentType(Output<String> contentType) {
            $.contentType = contentType;
            return this;
        }

        public Builder contentType(String contentType) {
            return contentType(Output.of(contentType));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public RuleGroupCustomResponseBodyArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
