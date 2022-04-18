// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A container to reference an id for any resource type. A `resource` in Google Cloud Platform is a generic term for something you (a developer) may want to interact with through one of our API's. Some examples are an App Engine app, a Compute Engine instance, a Cloud SQL database, and so on.
 * 
 */
public final class ResourceIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceIdArgs Empty = new ResourceIdArgs();

    /**
     * Required field for the type-specific id. This should correspond to the id used in the type-specific API's.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Required field representing the resource type this id is for. At present, the valid types are "project", "folder", and "organization".
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ResourceIdArgs(
        @Nullable Output<String> id,
        @Nullable Output<String> type) {
        this.id = id;
        this.type = type;
    }

    private ResourceIdArgs() {
        this.id = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> id;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ResourceIdArgs build() {
            return new ResourceIdArgs(id, type);
        }
    }
}
