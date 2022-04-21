// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagTemplateArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagTemplateArgs Empty = new TagTemplateArgs();

    /**
     * Display name for this template. Defaults to an empty string. The name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), and can&#39;t start or end with spaces. The maximum length is 200 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Map of tag template field IDs to the settings for the field. This map is an exhaustive list of the allowed fields. The map must contain at least one field and at most 500 fields. The keys to this map are tag template field IDs. The IDs have the following limitations: * Can contain uppercase and lowercase letters, numbers (0-9) and underscores (_). * Must be at least 1 character and at most 64 characters long. * Must start with a letter or underscore.
     * 
     */
    @Import(name="fields", required=true)
    private Output<Map<String,String>> fields;

    public Output<Map<String,String>> fields() {
        return this.fields;
    }

    /**
     * Indicates whether this is a public tag template. Every user has view access to a *public* tag template by default. This means that: * Every user can use this tag template to tag an entry. * If an entry is tagged using the tag template, the tag is always shown in the response to ``ListTags`` called on the entry. * To get the template using the GetTagTemplate method, you need view access either on the project or the organization the tag template resides in but no other permission is needed. * Operations on the tag template other than viewing (for example, editing IAM policies) follow standard IAM structures. Tags created with a public tag template are referred to as public tags. You can search for a public tag by value with a simple search query instead of using a ``tag:`` predicate. Public tag templates may not appear in search results depending on scope, see: include_public_tag_templates Note: If an [IAM domain restriction](https://cloud.google.com/resource-manager/docs/organization-policy/restricting-domains) is configured in the tag template&#39;s location, the public access will not be enabled but the simple search for tag values will still work.
     * 
     */
    @Import(name="isPubliclyReadable")
    private @Nullable Output<Boolean> isPubliclyReadable;

    public Optional<Output<Boolean>> isPubliclyReadable() {
        return Optional.ofNullable(this.isPubliclyReadable);
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The resource name of the tag template in URL format. Note: The tag template itself and its child resources might not be stored in the location specified in its name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="tagTemplateId", required=true)
    private Output<String> tagTemplateId;

    public Output<String> tagTemplateId() {
        return this.tagTemplateId;
    }

    private TagTemplateArgs() {}

    private TagTemplateArgs(TagTemplateArgs $) {
        this.displayName = $.displayName;
        this.fields = $.fields;
        this.isPubliclyReadable = $.isPubliclyReadable;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.tagTemplateId = $.tagTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTemplateArgs $;

        public Builder() {
            $ = new TagTemplateArgs();
        }

        public Builder(TagTemplateArgs defaults) {
            $ = new TagTemplateArgs(Objects.requireNonNull(defaults));
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder fields(Output<Map<String,String>> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(Map<String,String> fields) {
            return fields(Output.of(fields));
        }

        public Builder isPubliclyReadable(@Nullable Output<Boolean> isPubliclyReadable) {
            $.isPubliclyReadable = isPubliclyReadable;
            return this;
        }

        public Builder isPubliclyReadable(Boolean isPubliclyReadable) {
            return isPubliclyReadable(Output.of(isPubliclyReadable));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder tagTemplateId(Output<String> tagTemplateId) {
            $.tagTemplateId = tagTemplateId;
            return this;
        }

        public Builder tagTemplateId(String tagTemplateId) {
            return tagTemplateId(Output.of(tagTemplateId));
        }

        public TagTemplateArgs build() {
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            $.tagTemplateId = Objects.requireNonNull($.tagTemplateId, "expected parameter 'tagTemplateId' to be non-null");
            return $;
        }
    }

}
