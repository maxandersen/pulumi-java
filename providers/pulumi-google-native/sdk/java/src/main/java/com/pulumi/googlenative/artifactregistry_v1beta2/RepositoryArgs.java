// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.artifactregistry_v1beta2.enums.RepositoryFormat;
import com.pulumi.googlenative.artifactregistry_v1beta2.inputs.MavenRepositoryConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * The time when the repository was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * The user-provided description of the repository.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The format of packages that are stored in the repository.
     * 
     */
    @Import(name="format")
      private final @Nullable Output<RepositoryFormat> format;

    public Output<RepositoryFormat> format() {
        return this.format == null ? Codegen.empty() : this.format;
    }

    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s used to encrypt the contents of the Repository. Has the form: `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`. This value may not be changed after the Repository has been created.
     * 
     */
    @Import(name="kmsKeyName")
      private final @Nullable Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName == null ? Codegen.empty() : this.kmsKeyName;
    }

    /**
     * Labels with user-defined metadata. This field may contain up to 64 entries. Label keys and values may be no longer than 63 characters. Label keys must begin with a lowercase letter and may only contain lowercase letters, numeric characters, underscores, and dashes.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Maven repository config contains repository level configuration for the repositories of maven type.
     * 
     */
    @Import(name="mavenConfig")
      private final @Nullable Output<MavenRepositoryConfigArgs> mavenConfig;

    public Output<MavenRepositoryConfigArgs> mavenConfig() {
        return this.mavenConfig == null ? Codegen.empty() : this.mavenConfig;
    }

    /**
     * The name of the repository, for example: "projects/p1/locations/us-central1/repositories/repo1".
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="repositoryId")
      private final @Nullable Output<String> repositoryId;

    public Output<String> repositoryId() {
        return this.repositoryId == null ? Codegen.empty() : this.repositoryId;
    }

    /**
     * The time when the repository was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> updateTime() {
        return this.updateTime == null ? Codegen.empty() : this.updateTime;
    }

    public RepositoryArgs(
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<RepositoryFormat> format,
        @Nullable Output<String> kmsKeyName,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<MavenRepositoryConfigArgs> mavenConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> repositoryId,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.description = description;
        this.format = format;
        this.kmsKeyName = kmsKeyName;
        this.labels = labels;
        this.location = location;
        this.mavenConfig = mavenConfig;
        this.name = name;
        this.project = project;
        this.repositoryId = repositoryId;
        this.updateTime = updateTime;
    }

    private RepositoryArgs() {
        this.createTime = Codegen.empty();
        this.description = Codegen.empty();
        this.format = Codegen.empty();
        this.kmsKeyName = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.mavenConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.repositoryId = Codegen.empty();
        this.updateTime = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<RepositoryFormat> format;
        private @Nullable Output<String> kmsKeyName;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<MavenRepositoryConfigArgs> mavenConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> repositoryId;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.format = defaults.format;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.mavenConfig = defaults.mavenConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.repositoryId = defaults.repositoryId;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder format(@Nullable Output<RepositoryFormat> format) {
            this.format = format;
            return this;
        }
        public Builder format(@Nullable RepositoryFormat format) {
            this.format = Codegen.ofNullable(format);
            return this;
        }
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = Codegen.ofNullable(kmsKeyName);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mavenConfig(@Nullable Output<MavenRepositoryConfigArgs> mavenConfig) {
            this.mavenConfig = mavenConfig;
            return this;
        }
        public Builder mavenConfig(@Nullable MavenRepositoryConfigArgs mavenConfig) {
            this.mavenConfig = Codegen.ofNullable(mavenConfig);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder repositoryId(@Nullable Output<String> repositoryId) {
            this.repositoryId = repositoryId;
            return this;
        }
        public Builder repositoryId(@Nullable String repositoryId) {
            this.repositoryId = Codegen.ofNullable(repositoryId);
            return this;
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Codegen.ofNullable(updateTime);
            return this;
        }        public RepositoryArgs build() {
            return new RepositoryArgs(createTime, description, format, kmsKeyName, labels, location, mavenConfig, name, project, repositoryId, updateTime);
        }
    }
}
