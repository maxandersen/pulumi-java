// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupArgs Empty = new GroupArgs();

    /**
     * A user-assigned name for this group, used only for display
     * purposes.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The filter used to determine which monitored resources
     * belong to this group.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }

    /**
     * If true, the members of this group are considered to be a
     * cluster. The system can perform additional analysis on
     * groups that are clusters.
     * 
     */
    @Import(name="isCluster")
    private @Nullable Output<Boolean> isCluster;

    public Optional<Output<Boolean>> isCluster() {
        return Optional.ofNullable(this.isCluster);
    }

    /**
     * The name of the group&#39;s parent, if it has one. The format is
     * &#34;projects/{project_id_or_number}/groups/{group_id}&#34;. For
     * groups with no parent, parentName is the empty string, &#34;&#34;.
     * 
     */
    @Import(name="parentName")
    private @Nullable Output<String> parentName;

    public Optional<Output<String>> parentName() {
        return Optional.ofNullable(this.parentName);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GroupArgs() {}

    private GroupArgs(GroupArgs $) {
        this.displayName = $.displayName;
        this.filter = $.filter;
        this.isCluster = $.isCluster;
        this.parentName = $.parentName;
        this.project = $.project;
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

        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder isCluster(@Nullable Output<Boolean> isCluster) {
            $.isCluster = isCluster;
            return this;
        }

        public Builder isCluster(Boolean isCluster) {
            return isCluster(Output.of(isCluster));
        }

        public Builder parentName(@Nullable Output<String> parentName) {
            $.parentName = parentName;
            return this;
        }

        public Builder parentName(String parentName) {
            return parentName(Output.of(parentName));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GroupArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            return $;
        }
    }

}
