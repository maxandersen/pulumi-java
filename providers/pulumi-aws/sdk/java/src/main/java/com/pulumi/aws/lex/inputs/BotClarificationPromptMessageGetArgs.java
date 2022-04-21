// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotClarificationPromptMessageGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotClarificationPromptMessageGetArgs Empty = new BotClarificationPromptMessageGetArgs();

    /**
     * The text of the message.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * The content type of the message string.
     * 
     */
    @Import(name="contentType", required=true)
    private Output<String> contentType;

    public Output<String> contentType() {
        return this.contentType;
    }

    /**
     * Identifies the message group that the message belongs to. When a group
     * is assigned to a message, Amazon Lex returns one message from each group in the response.
     * 
     */
    @Import(name="groupNumber")
    private @Nullable Output<Integer> groupNumber;

    public Optional<Output<Integer>> groupNumber() {
        return Optional.ofNullable(this.groupNumber);
    }

    private BotClarificationPromptMessageGetArgs() {}

    private BotClarificationPromptMessageGetArgs(BotClarificationPromptMessageGetArgs $) {
        this.content = $.content;
        this.contentType = $.contentType;
        this.groupNumber = $.groupNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotClarificationPromptMessageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotClarificationPromptMessageGetArgs $;

        public Builder() {
            $ = new BotClarificationPromptMessageGetArgs();
        }

        public Builder(BotClarificationPromptMessageGetArgs defaults) {
            $ = new BotClarificationPromptMessageGetArgs(Objects.requireNonNull(defaults));
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

        public Builder groupNumber(@Nullable Output<Integer> groupNumber) {
            $.groupNumber = groupNumber;
            return this;
        }

        public Builder groupNumber(Integer groupNumber) {
            return groupNumber(Output.of(groupNumber));
        }

        public BotClarificationPromptMessageGetArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            $.contentType = Objects.requireNonNull($.contentType, "expected parameter 'contentType' to be non-null");
            return $;
        }
    }

}
