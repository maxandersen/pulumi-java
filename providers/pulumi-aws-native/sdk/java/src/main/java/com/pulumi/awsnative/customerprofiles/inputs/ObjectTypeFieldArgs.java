// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.customerprofiles.inputs;

import com.pulumi.awsnative.customerprofiles.enums.ObjectTypeFieldContentType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a field in a ProfileObjectType.
 * 
 */
public final class ObjectTypeFieldArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectTypeFieldArgs Empty = new ObjectTypeFieldArgs();

    /**
     * The content type of the field. Used for determining equality when searching.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<ObjectTypeFieldContentType> contentType;

    public Output<ObjectTypeFieldContentType> contentType() {
        return this.contentType == null ? Codegen.empty() : this.contentType;
    }

    /**
     * A field of a ProfileObject. For example: _source.FirstName, where &#34;_source&#34; is a ProfileObjectType of a Zendesk user and &#34;FirstName&#34; is a field in that ObjectType.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * The location of the data in the standard ProfileObject model. For example: _profile.Address.PostalCode.
     * 
     */
    @Import(name="target")
      private final @Nullable Output<String> target;

    public Output<String> target() {
        return this.target == null ? Codegen.empty() : this.target;
    }

    public ObjectTypeFieldArgs(
        @Nullable Output<ObjectTypeFieldContentType> contentType,
        @Nullable Output<String> source,
        @Nullable Output<String> target) {
        this.contentType = contentType;
        this.source = source;
        this.target = target;
    }

    private ObjectTypeFieldArgs() {
        this.contentType = Codegen.empty();
        this.source = Codegen.empty();
        this.target = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectTypeFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ObjectTypeFieldContentType> contentType;
        private @Nullable Output<String> source;
        private @Nullable Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectTypeFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.source = defaults.source;
    	      this.target = defaults.target;
        }

        public Builder contentType(@Nullable Output<ObjectTypeFieldContentType> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable ObjectTypeFieldContentType contentType) {
            this.contentType = Codegen.ofNullable(contentType);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder target(@Nullable Output<String> target) {
            this.target = target;
            return this;
        }
        public Builder target(@Nullable String target) {
            this.target = Codegen.ofNullable(target);
            return this;
        }        public ObjectTypeFieldArgs build() {
            return new ObjectTypeFieldArgs(contentType, source, target);
        }
    }
}
