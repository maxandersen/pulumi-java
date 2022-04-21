// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codecommit;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApprovalRuleTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApprovalRuleTemplateArgs Empty = new ApprovalRuleTemplateArgs();

    /**
     * The content of the approval rule template. Maximum of 3000 characters.
     * 
     */
    @Import(name="content", required=true)
    private Output<String> content;

    public Output<String> content() {
        return this.content;
    }

    /**
     * The description of the approval rule template. Maximum of 1000 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The name for the approval rule template. Maximum of 100 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApprovalRuleTemplateArgs() {}

    private ApprovalRuleTemplateArgs(ApprovalRuleTemplateArgs $) {
        this.content = $.content;
        this.description = $.description;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApprovalRuleTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApprovalRuleTemplateArgs $;

        public Builder() {
            $ = new ApprovalRuleTemplateArgs();
        }

        public Builder(ApprovalRuleTemplateArgs defaults) {
            $ = new ApprovalRuleTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder content(Output<String> content) {
            $.content = content;
            return this;
        }

        public Builder content(String content) {
            return content(Output.of(content));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApprovalRuleTemplateArgs build() {
            $.content = Objects.requireNonNull($.content, "expected parameter 'content' to be non-null");
            return $;
        }
    }

}
