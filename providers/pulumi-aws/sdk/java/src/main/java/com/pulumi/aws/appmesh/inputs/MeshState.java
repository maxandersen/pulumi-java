// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.aws.appmesh.inputs.MeshSpecGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MeshState extends com.pulumi.resources.ResourceArgs {

    public static final MeshState Empty = new MeshState();

    /**
     * The ARN of the service mesh.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The creation date of the service mesh.
     * 
     */
    @Import(name="createdDate")
      private final @Nullable Output<String> createdDate;

    public Output<String> createdDate() {
        return this.createdDate == null ? Codegen.empty() : this.createdDate;
    }

    /**
     * The last update date of the service mesh.
     * 
     */
    @Import(name="lastUpdatedDate")
      private final @Nullable Output<String> lastUpdatedDate;

    public Output<String> lastUpdatedDate() {
        return this.lastUpdatedDate == null ? Codegen.empty() : this.lastUpdatedDate;
    }

    /**
     * The AWS account ID of the service mesh&#39;s owner.
     * 
     */
    @Import(name="meshOwner")
      private final @Nullable Output<String> meshOwner;

    public Output<String> meshOwner() {
        return this.meshOwner == null ? Codegen.empty() : this.meshOwner;
    }

    /**
     * The name to use for the service mesh. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The resource owner&#39;s AWS account ID.
     * 
     */
    @Import(name="resourceOwner")
      private final @Nullable Output<String> resourceOwner;

    public Output<String> resourceOwner() {
        return this.resourceOwner == null ? Codegen.empty() : this.resourceOwner;
    }

    /**
     * The service mesh specification to apply.
     * 
     */
    @Import(name="spec")
      private final @Nullable Output<MeshSpecGetArgs> spec;

    public Output<MeshSpecGetArgs> spec() {
        return this.spec == null ? Codegen.empty() : this.spec;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public MeshState(
        @Nullable Output<String> arn,
        @Nullable Output<String> createdDate,
        @Nullable Output<String> lastUpdatedDate,
        @Nullable Output<String> meshOwner,
        @Nullable Output<String> name,
        @Nullable Output<String> resourceOwner,
        @Nullable Output<MeshSpecGetArgs> spec,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.createdDate = createdDate;
        this.lastUpdatedDate = lastUpdatedDate;
        this.meshOwner = meshOwner;
        this.name = name;
        this.resourceOwner = resourceOwner;
        this.spec = spec;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private MeshState() {
        this.arn = Codegen.empty();
        this.createdDate = Codegen.empty();
        this.lastUpdatedDate = Codegen.empty();
        this.meshOwner = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceOwner = Codegen.empty();
        this.spec = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> createdDate;
        private @Nullable Output<String> lastUpdatedDate;
        private @Nullable Output<String> meshOwner;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resourceOwner;
        private @Nullable Output<MeshSpecGetArgs> spec;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdDate = defaults.createdDate;
    	      this.lastUpdatedDate = defaults.lastUpdatedDate;
    	      this.meshOwner = defaults.meshOwner;
    	      this.name = defaults.name;
    	      this.resourceOwner = defaults.resourceOwner;
    	      this.spec = defaults.spec;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder createdDate(@Nullable Output<String> createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Builder createdDate(@Nullable String createdDate) {
            this.createdDate = Codegen.ofNullable(createdDate);
            return this;
        }
        public Builder lastUpdatedDate(@Nullable Output<String> lastUpdatedDate) {
            this.lastUpdatedDate = lastUpdatedDate;
            return this;
        }
        public Builder lastUpdatedDate(@Nullable String lastUpdatedDate) {
            this.lastUpdatedDate = Codegen.ofNullable(lastUpdatedDate);
            return this;
        }
        public Builder meshOwner(@Nullable Output<String> meshOwner) {
            this.meshOwner = meshOwner;
            return this;
        }
        public Builder meshOwner(@Nullable String meshOwner) {
            this.meshOwner = Codegen.ofNullable(meshOwner);
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
        public Builder resourceOwner(@Nullable Output<String> resourceOwner) {
            this.resourceOwner = resourceOwner;
            return this;
        }
        public Builder resourceOwner(@Nullable String resourceOwner) {
            this.resourceOwner = Codegen.ofNullable(resourceOwner);
            return this;
        }
        public Builder spec(@Nullable Output<MeshSpecGetArgs> spec) {
            this.spec = spec;
            return this;
        }
        public Builder spec(@Nullable MeshSpecGetArgs spec) {
            this.spec = Codegen.ofNullable(spec);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public MeshState build() {
            return new MeshState(arn, createdDate, lastUpdatedDate, meshOwner, name, resourceOwner, spec, tags, tagsAll);
        }
    }
}
