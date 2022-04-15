// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetObjectAccessControlArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetObjectAccessControlArgs Empty = new GetObjectAccessControlArgs();

    @Import(name="bucket", required=true)
      private final String bucket;

    public String bucket() {
        return this.bucket;
    }

    @Import(name="entity", required=true)
      private final String entity;

    public String entity() {
        return this.entity;
    }

    @Import(name="generation")
      private final @Nullable String generation;

    public Optional<String> generation() {
        return this.generation == null ? Optional.empty() : Optional.ofNullable(this.generation);
    }

    @Import(name="object", required=true)
      private final String object;

    public String object() {
        return this.object;
    }

    @Import(name="provisionalUserProject")
      private final @Nullable String provisionalUserProject;

    public Optional<String> provisionalUserProject() {
        return this.provisionalUserProject == null ? Optional.empty() : Optional.ofNullable(this.provisionalUserProject);
    }

    @Import(name="userProject")
      private final @Nullable String userProject;

    public Optional<String> userProject() {
        return this.userProject == null ? Optional.empty() : Optional.ofNullable(this.userProject);
    }

    public GetObjectAccessControlArgs(
        String bucket,
        String entity,
        @Nullable String generation,
        String object,
        @Nullable String provisionalUserProject,
        @Nullable String userProject) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.generation = generation;
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
        this.provisionalUserProject = provisionalUserProject;
        this.userProject = userProject;
    }

    private GetObjectAccessControlArgs() {
        this.bucket = null;
        this.entity = null;
        this.generation = null;
        this.object = null;
        this.provisionalUserProject = null;
        this.userProject = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String entity;
        private @Nullable String generation;
        private String object;
        private @Nullable String provisionalUserProject;
        private @Nullable String userProject;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.entity = defaults.entity;
    	      this.generation = defaults.generation;
    	      this.object = defaults.object;
    	      this.provisionalUserProject = defaults.provisionalUserProject;
    	      this.userProject = defaults.userProject;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder entity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }
        public Builder generation(@Nullable String generation) {
            this.generation = generation;
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder provisionalUserProject(@Nullable String provisionalUserProject) {
            this.provisionalUserProject = provisionalUserProject;
            return this;
        }
        public Builder userProject(@Nullable String userProject) {
            this.userProject = userProject;
            return this;
        }        public GetObjectAccessControlArgs build() {
            return new GetObjectAccessControlArgs(bucket, entity, generation, object, provisionalUserProject, userProject);
        }
    }
}
