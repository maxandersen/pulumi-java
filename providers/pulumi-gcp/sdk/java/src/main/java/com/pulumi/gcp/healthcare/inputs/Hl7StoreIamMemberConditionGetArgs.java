// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class Hl7StoreIamMemberConditionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final Hl7StoreIamMemberConditionGetArgs Empty = new Hl7StoreIamMemberConditionGetArgs();

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="expression", required=true)
    private Output<String> expression;

    public Output<String> expression() {
        return this.expression;
    }

    @Import(name="title", required=true)
    private Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    private Hl7StoreIamMemberConditionGetArgs() {}

    private Hl7StoreIamMemberConditionGetArgs(Hl7StoreIamMemberConditionGetArgs $) {
        this.description = $.description;
        this.expression = $.expression;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(Hl7StoreIamMemberConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Hl7StoreIamMemberConditionGetArgs $;

        public Builder() {
            $ = new Hl7StoreIamMemberConditionGetArgs();
        }

        public Builder(Hl7StoreIamMemberConditionGetArgs defaults) {
            $ = new Hl7StoreIamMemberConditionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder expression(Output<String> expression) {
            $.expression = expression;
            return this;
        }

        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public Builder title(Output<String> title) {
            $.title = title;
            return this;
        }

        public Builder title(String title) {
            return title(Output.of(title));
        }

        public Hl7StoreIamMemberConditionGetArgs build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            $.title = Objects.requireNonNull($.title, "expected parameter 'title' to be non-null");
            return $;
        }
    }

}
