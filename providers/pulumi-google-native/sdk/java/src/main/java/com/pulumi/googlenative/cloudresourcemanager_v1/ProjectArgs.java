// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.cloudresourcemanager_v1.enums.ProjectLifecycleState;
import com.pulumi.googlenative.cloudresourcemanager_v1.inputs.ResourceIdArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * Creation time. Read-only.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> createTime() {
        return this.createTime == null ? Codegen.empty() : this.createTime;
    }

    /**
     * The labels associated with this Project. Label keys must be between 1 and 63 characters long and must conform to the following regular expression: a-z{0,62}. Label values must be between 0 and 63 characters long and must conform to the regular expression [a-z0-9_-]{0,63}. A label value can be empty. No more than 256 labels can be associated with a given resource. Clients should store labels in a representation such as JSON that does not depend on specific characters being disallowed. Example: &#34;environment&#34; : &#34;dev&#34; Read-write.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The Project lifecycle state. Read-only.
     * 
     */
    @Import(name="lifecycleState")
      private final @Nullable Output<ProjectLifecycleState> lifecycleState;

    public Output<ProjectLifecycleState> lifecycleState() {
        return this.lifecycleState == null ? Codegen.empty() : this.lifecycleState;
    }

    /**
     * The optional user-assigned display name of the Project. When present it must be between 4 to 30 characters. Allowed characters are: lowercase and uppercase letters, numbers, hyphen, single-quote, double-quote, space, and exclamation point. Example: `My Project` Read-write.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * An optional reference to a parent Resource. Supported parent types include &#34;organization&#34; and &#34;folder&#34;. Once set, the parent cannot be cleared. The `parent` can be set on creation or using the `UpdateProject` method; the end user must have the `resourcemanager.projects.create` permission on the parent.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<ResourceIdArgs> parent;

    public Output<ResourceIdArgs> parent() {
        return this.parent == null ? Codegen.empty() : this.parent;
    }

    /**
     * The unique, user-assigned ID of the Project. It must be 6 to 30 lowercase letters, digits, or hyphens. It must start with a letter. Trailing hyphens are prohibited. Example: `tokyo-rain-123` Read-only after creation.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> projectId() {
        return this.projectId == null ? Codegen.empty() : this.projectId;
    }

    /**
     * The number uniquely identifying the project. Example: `415104041262` Read-only.
     * 
     */
    @Import(name="projectNumber")
      private final @Nullable Output<String> projectNumber;

    public Output<String> projectNumber() {
        return this.projectNumber == null ? Codegen.empty() : this.projectNumber;
    }

    public ProjectArgs(
        @Nullable Output<String> createTime,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<ProjectLifecycleState> lifecycleState,
        @Nullable Output<String> name,
        @Nullable Output<ResourceIdArgs> parent,
        @Nullable Output<String> projectId,
        @Nullable Output<String> projectNumber) {
        this.createTime = createTime;
        this.labels = labels;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.parent = parent;
        this.projectId = projectId;
        this.projectNumber = projectNumber;
    }

    private ProjectArgs() {
        this.createTime = Codegen.empty();
        this.labels = Codegen.empty();
        this.lifecycleState = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.projectId = Codegen.empty();
        this.projectNumber = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<ProjectLifecycleState> lifecycleState;
        private @Nullable Output<String> name;
        private @Nullable Output<ResourceIdArgs> parent;
        private @Nullable Output<String> projectId;
        private @Nullable Output<String> projectNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.projectId = defaults.projectId;
    	      this.projectNumber = defaults.projectNumber;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Codegen.ofNullable(createTime);
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
        public Builder lifecycleState(@Nullable Output<ProjectLifecycleState> lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public Builder lifecycleState(@Nullable ProjectLifecycleState lifecycleState) {
            this.lifecycleState = Codegen.ofNullable(lifecycleState);
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
        public Builder parent(@Nullable Output<ResourceIdArgs> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable ResourceIdArgs parent) {
            this.parent = Codegen.ofNullable(parent);
            return this;
        }
        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = Codegen.ofNullable(projectId);
            return this;
        }
        public Builder projectNumber(@Nullable Output<String> projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }
        public Builder projectNumber(@Nullable String projectNumber) {
            this.projectNumber = Codegen.ofNullable(projectNumber);
            return this;
        }        public ProjectArgs build() {
            return new ProjectArgs(createTime, labels, lifecycleState, name, parent, projectId, projectNumber);
        }
    }
}
