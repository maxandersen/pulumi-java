// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.tags.inputs.TagKeyIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagKeyIamMemberState extends com.pulumi.resources.ResourceArgs {

    public static final TagKeyIamMemberState Empty = new TagKeyIamMemberState();

    @Import(name="condition")
    private @Nullable Output<TagKeyIamMemberConditionGetArgs> condition;

    public Optional<Output<TagKeyIamMemberConditionGetArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    @Import(name="member")
    private @Nullable Output<String> member;

    public Optional<Output<String>> member() {
        return Optional.ofNullable(this.member);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.tags.TagKeyIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagKey")
    private @Nullable Output<String> tagKey;

    public Optional<Output<String>> tagKey() {
        return Optional.ofNullable(this.tagKey);
    }

    private TagKeyIamMemberState() {}

    private TagKeyIamMemberState(TagKeyIamMemberState $) {
        this.condition = $.condition;
        this.etag = $.etag;
        this.member = $.member;
        this.role = $.role;
        this.tagKey = $.tagKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagKeyIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagKeyIamMemberState $;

        public Builder() {
            $ = new TagKeyIamMemberState();
        }

        public Builder(TagKeyIamMemberState defaults) {
            $ = new TagKeyIamMemberState(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TagKeyIamMemberConditionGetArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TagKeyIamMemberConditionGetArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder member(@Nullable Output<String> member) {
            $.member = member;
            return this;
        }

        public Builder member(String member) {
            return member(Output.of(member));
        }

        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder tagKey(@Nullable Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        public TagKeyIamMemberState build() {
            return $;
        }
    }

}
