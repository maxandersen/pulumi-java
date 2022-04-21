// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyTagArgs Empty = new PolicyTagArgs();

    /**
     * Description of this policy tag. It must: contain only unicode characters, tabs,
     * newlines, carriage returns and page breaks; and be at most 2000 bytes long when
     * encoded in UTF-8. If not set, defaults to an empty description.
     * If not set, defaults to an empty description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * User defined name of this policy tag. It must: be unique within the parent
     * taxonomy; contain only unicode letters, numbers, underscores, dashes and spaces;
     * not start or end with spaces; and be at most 200 bytes long when encoded in UTF-8.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Resource name of this policy tag&#39;s parent policy tag.
     * If empty, it means this policy tag is a top level policy tag.
     * If not set, defaults to an empty string.
     * 
     */
    @Import(name="parentPolicyTag")
    private @Nullable Output<String> parentPolicyTag;

    public Optional<Output<String>> parentPolicyTag() {
        return Optional.ofNullable(this.parentPolicyTag);
    }

    /**
     * Taxonomy the policy tag is associated with
     * 
     */
    @Import(name="taxonomy", required=true)
    private Output<String> taxonomy;

    public Output<String> taxonomy() {
        return this.taxonomy;
    }

    private PolicyTagArgs() {}

    private PolicyTagArgs(PolicyTagArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.parentPolicyTag = $.parentPolicyTag;
        this.taxonomy = $.taxonomy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyTagArgs $;

        public Builder() {
            $ = new PolicyTagArgs();
        }

        public Builder(PolicyTagArgs defaults) {
            $ = new PolicyTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder parentPolicyTag(@Nullable Output<String> parentPolicyTag) {
            $.parentPolicyTag = parentPolicyTag;
            return this;
        }

        public Builder parentPolicyTag(String parentPolicyTag) {
            return parentPolicyTag(Output.of(parentPolicyTag));
        }

        public Builder taxonomy(Output<String> taxonomy) {
            $.taxonomy = taxonomy;
            return this;
        }

        public Builder taxonomy(String taxonomy) {
            return taxonomy(Output.of(taxonomy));
        }

        public PolicyTagArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.taxonomy = Objects.requireNonNull($.taxonomy, "expected parameter 'taxonomy' to be non-null");
            return $;
        }
    }

}
