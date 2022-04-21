// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate;

import com.pulumi.azurenative.migrate.inputs.GroupPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

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
     * Unique name of a group within a project.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="projectName", required=true)
    private Output<String> projectName;

    public Output<String> projectName() {
        return this.projectName;
    }

    /**
     * Properties of the group.
     * 
     */
    @Import(name="properties", required=true)
    private Output<GroupPropertiesArgs> properties;

    public Output<GroupPropertiesArgs> properties() {
        return this.properties;
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

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.eTag = $.eTag;
        this.groupName = $.groupName;
        this.projectName = $.projectName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupArgs $;

        public Builder() {
            $ = new GroupArgs();
        }

        public Builder(GroupArgs defaults) {
            $ = new GroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder eTag(@Nullable Output<String> eTag) {
            $.eTag = eTag;
            return this;
        }

        public Builder eTag(String eTag) {
            return eTag(Output.of(eTag));
        }

        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        public Builder projectName(Output<String> projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder projectName(String projectName) {
            return projectName(Output.of(projectName));
        }

        public Builder properties(Output<GroupPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        public Builder properties(GroupPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GroupArgs build() {
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
