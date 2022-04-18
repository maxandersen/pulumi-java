// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagValueArgs Empty = new TagValueArgs();

    /**
     * Optional. User-assigned description of the TagValue. Must not exceed 256 characters. Read-write.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Entity tag which users can pass to prevent race conditions. This field is always set in server responses. See UpdateTagValueRequest for details.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Immutable. Resource name for TagValue in the format `tagValues/456`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Immutable. The resource name of the new TagValue's parent TagKey. Must be of the form `tagKeys/{tag_key_id}`.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * Immutable. User-assigned short name for TagValue. The short name should be unique for TagValues within the same parent TagKey. The short name must be 63 characters or less, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="shortName", required=true)
      private final Output<String> shortName;

    public Output<String> shortName() {
        return this.shortName;
    }

    @Import(name="validateOnly")
      private final @Nullable Output<String> validateOnly;

    public Output<String> validateOnly() {
        return this.validateOnly == null ? Codegen.empty() : this.validateOnly;
    }

    public TagValueArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        @Nullable Output<String> name,
        @Nullable Output<String> parent,
        Output<String> shortName,
        @Nullable Output<String> validateOnly) {
        this.description = description;
        this.etag = etag;
        this.name = name;
        this.parent = parent;
        this.shortName = Objects.requireNonNull(shortName, "expected parameter 'shortName' to be non-null");
        this.validateOnly = validateOnly;
    }

    private TagValueArgs() {
        this.description = Codegen.empty();
        this.etag = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.shortName = Codegen.empty();
        this.validateOnly = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> name;
        private @Nullable Output<String> parent;
        private Output<String> shortName;
        private @Nullable Output<String> validateOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(TagValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
    	      this.validateOnly = defaults.validateOnly;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder shortName(Output<String> shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Output.of(Objects.requireNonNull(shortName));
            return this;
        }
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public Builder validateOnly(@Nullable String validateOnly) {
            this.validateOnly = Codegen.ofNullable(validateOnly);
            return this;
        }        public TagValueArgs build() {
            return new TagValueArgs(description, etag, name, parent, shortName, validateOnly);
        }
    }
}
