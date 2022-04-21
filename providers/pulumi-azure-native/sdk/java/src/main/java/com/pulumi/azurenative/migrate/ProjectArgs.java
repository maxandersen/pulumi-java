// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.ProjectPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectArgs Empty = new ProjectArgs();

    /**
     * For optimistic concurrency control.
     * 
     */
    @Import(name="eTag")
    private @Nullable Output<String> eTag;

    public Optional<Output<String>> eTag() {
        return Optional.ofNullable(this.eTag);
    }

    /**
     * Azure location in which project is created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName")
    private @Nullable Output<String> projectName;

    public Optional<Output<String>> projectName() {
        return Optional.ofNullable(this.projectName);
    }

    /**
     * Properties of the project.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<ProjectPropertiesArgs> properties;

    public Optional<Output<ProjectPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * Name of the Azure Resource Group that project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Tags provided by Azure Tagging service.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Object> tags;

    public Optional<Output<Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ProjectArgs() {}

    private ProjectArgs(ProjectArgs $) {
        this.eTag = $.eTag;
        this.location = $.location;
        this.projectName = $.projectName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectArgs $;

        public Builder() {
            $ = new ProjectArgs();
        }

        public Builder(ProjectArgs defaults) {
            $ = new ProjectArgs(Objects.requireNonNull(defaults));
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder projectName(@Nullable Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public Builder properties(@Nullable Output<ProjectPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(ProjectPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder tags(@Nullable Output<Object> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Object tags) {
            return tags(Output.of(tags));
        }

        public ProjectArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
