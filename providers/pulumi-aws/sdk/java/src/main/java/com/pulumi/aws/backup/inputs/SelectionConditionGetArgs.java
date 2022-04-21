// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup.inputs;

import com.pulumi.aws.backup.inputs.SelectionConditionStringEqualGetArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringLikeGetArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringNotEqualGetArgs;
import com.pulumi.aws.backup.inputs.SelectionConditionStringNotLikeGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SelectionConditionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SelectionConditionGetArgs Empty = new SelectionConditionGetArgs();

    @Import(name="stringEquals")
    private @Nullable Output<List<SelectionConditionStringEqualGetArgs>> stringEquals;

    public Optional<Output<List<SelectionConditionStringEqualGetArgs>>> stringEquals() {
        return Optional.ofNullable(this.stringEquals);
    }

    @Import(name="stringLikes")
    private @Nullable Output<List<SelectionConditionStringLikeGetArgs>> stringLikes;

    public Optional<Output<List<SelectionConditionStringLikeGetArgs>>> stringLikes() {
        return Optional.ofNullable(this.stringLikes);
    }

    @Import(name="stringNotEquals")
    private @Nullable Output<List<SelectionConditionStringNotEqualGetArgs>> stringNotEquals;

    public Optional<Output<List<SelectionConditionStringNotEqualGetArgs>>> stringNotEquals() {
        return Optional.ofNullable(this.stringNotEquals);
    }

    @Import(name="stringNotLikes")
    private @Nullable Output<List<SelectionConditionStringNotLikeGetArgs>> stringNotLikes;

    public Optional<Output<List<SelectionConditionStringNotLikeGetArgs>>> stringNotLikes() {
        return Optional.ofNullable(this.stringNotLikes);
    }

    private SelectionConditionGetArgs() {}

    private SelectionConditionGetArgs(SelectionConditionGetArgs $) {
        this.stringEquals = $.stringEquals;
        this.stringLikes = $.stringLikes;
        this.stringNotEquals = $.stringNotEquals;
        this.stringNotLikes = $.stringNotLikes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SelectionConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SelectionConditionGetArgs $;

        public Builder() {
            $ = new SelectionConditionGetArgs();
        }

        public Builder(SelectionConditionGetArgs defaults) {
            $ = new SelectionConditionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder stringEquals(@Nullable Output<List<SelectionConditionStringEqualGetArgs>> stringEquals) {
            $.stringEquals = stringEquals;
            return this;
        }

        public Builder stringEquals(List<SelectionConditionStringEqualGetArgs> stringEquals) {
            return stringEquals(Output.of(stringEquals));
        }

        public Builder stringEquals(SelectionConditionStringEqualGetArgs... stringEquals) {
            return stringEquals(List.of(stringEquals));
        }

        public Builder stringLikes(@Nullable Output<List<SelectionConditionStringLikeGetArgs>> stringLikes) {
            $.stringLikes = stringLikes;
            return this;
        }

        public Builder stringLikes(List<SelectionConditionStringLikeGetArgs> stringLikes) {
            return stringLikes(Output.of(stringLikes));
        }

        public Builder stringLikes(SelectionConditionStringLikeGetArgs... stringLikes) {
            return stringLikes(List.of(stringLikes));
        }

        public Builder stringNotEquals(@Nullable Output<List<SelectionConditionStringNotEqualGetArgs>> stringNotEquals) {
            $.stringNotEquals = stringNotEquals;
            return this;
        }

        public Builder stringNotEquals(List<SelectionConditionStringNotEqualGetArgs> stringNotEquals) {
            return stringNotEquals(Output.of(stringNotEquals));
        }

        public Builder stringNotEquals(SelectionConditionStringNotEqualGetArgs... stringNotEquals) {
            return stringNotEquals(List.of(stringNotEquals));
        }

        public Builder stringNotLikes(@Nullable Output<List<SelectionConditionStringNotLikeGetArgs>> stringNotLikes) {
            $.stringNotLikes = stringNotLikes;
            return this;
        }

        public Builder stringNotLikes(List<SelectionConditionStringNotLikeGetArgs> stringNotLikes) {
            return stringNotLikes(Output.of(stringNotLikes));
        }

        public Builder stringNotLikes(SelectionConditionStringNotLikeGetArgs... stringNotLikes) {
            return stringNotLikes(List.of(stringNotLikes));
        }

        public SelectionConditionGetArgs build() {
            return $;
        }
    }

}
