// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends com.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * The GCP project display name
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The number of the google project that firebase is enabled on.
     * 
     */
    @Import(name="projectNumber")
      private final @Nullable Output<String> projectNumber;

    public Output<String> projectNumber() {
        return this.projectNumber == null ? Codegen.empty() : this.projectNumber;
    }

    public ProjectState(
        @Nullable Output<String> displayName,
        @Nullable Output<String> project,
        @Nullable Output<String> projectNumber) {
        this.displayName = displayName;
        this.project = project;
        this.projectNumber = projectNumber;
    }

    private ProjectState() {
        this.displayName = Codegen.empty();
        this.project = Codegen.empty();
        this.projectNumber = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> projectNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
    	      this.projectNumber = defaults.projectNumber;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
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
        public Builder projectNumber(@Nullable Output<String> projectNumber) {
            this.projectNumber = projectNumber;
            return this;
        }
        public Builder projectNumber(@Nullable String projectNumber) {
            this.projectNumber = Codegen.ofNullable(projectNumber);
            return this;
        }        public ProjectState build() {
            return new ProjectState(displayName, project, projectNumber);
        }
    }
}
