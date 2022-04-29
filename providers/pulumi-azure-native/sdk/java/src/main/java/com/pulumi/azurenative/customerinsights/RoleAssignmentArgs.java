// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.customerinsights;

import com.pulumi.azurenative.customerinsights.enums.RoleTypes;
import com.pulumi.azurenative.customerinsights.inputs.AssignmentPrincipalArgs;
import com.pulumi.azurenative.customerinsights.inputs.ResourceSetDescriptionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAssignmentArgs extends ResourceArgs {

    public static final RoleAssignmentArgs Empty = new RoleAssignmentArgs();

    /**
     * The assignment name
     * 
     */
    @Import(name="assignmentName")
    private @Nullable Output<String> assignmentName;

    /**
     * @return The assignment name
     * 
     */
    public Optional<Output<String>> assignmentName() {
        return Optional.ofNullable(this.assignmentName);
    }

    /**
     * Widget types set for the assignment.
     * 
     */
    @Import(name="conflationPolicies")
    private @Nullable Output<ResourceSetDescriptionArgs> conflationPolicies;

    /**
     * @return Widget types set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> conflationPolicies() {
        return Optional.ofNullable(this.conflationPolicies);
    }

    /**
     * Connectors set for the assignment.
     * 
     */
    @Import(name="connectors")
    private @Nullable Output<ResourceSetDescriptionArgs> connectors;

    /**
     * @return Connectors set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> connectors() {
        return Optional.ofNullable(this.connectors);
    }

    /**
     * Localized description for the metadata.
     * 
     */
    @Import(name="description")
    private @Nullable Output<Map<String,String>> description;

    /**
     * @return Localized description for the metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Localized display names for the metadata.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<Map<String,String>> displayName;

    /**
     * @return Localized display names for the metadata.
     * 
     */
    public Optional<Output<Map<String,String>>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The name of the hub.
     * 
     */
    @Import(name="hubName", required=true)
    private Output<String> hubName;

    /**
     * @return The name of the hub.
     * 
     */
    public Output<String> hubName() {
        return this.hubName;
    }

    /**
     * Interactions set for the assignment.
     * 
     */
    @Import(name="interactions")
    private @Nullable Output<ResourceSetDescriptionArgs> interactions;

    /**
     * @return Interactions set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> interactions() {
        return Optional.ofNullable(this.interactions);
    }

    /**
     * Kpis set for the assignment.
     * 
     */
    @Import(name="kpis")
    private @Nullable Output<ResourceSetDescriptionArgs> kpis;

    /**
     * @return Kpis set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> kpis() {
        return Optional.ofNullable(this.kpis);
    }

    /**
     * Links set for the assignment.
     * 
     */
    @Import(name="links")
    private @Nullable Output<ResourceSetDescriptionArgs> links;

    /**
     * @return Links set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> links() {
        return Optional.ofNullable(this.links);
    }

    /**
     * The principals being assigned to.
     * 
     */
    @Import(name="principals", required=true)
    private Output<List<AssignmentPrincipalArgs>> principals;

    /**
     * @return The principals being assigned to.
     * 
     */
    public Output<List<AssignmentPrincipalArgs>> principals() {
        return this.principals;
    }

    /**
     * Profiles set for the assignment.
     * 
     */
    @Import(name="profiles")
    private @Nullable Output<ResourceSetDescriptionArgs> profiles;

    /**
     * @return Profiles set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> profiles() {
        return Optional.ofNullable(this.profiles);
    }

    /**
     * The Role assignments set for the relationship links.
     * 
     */
    @Import(name="relationshipLinks")
    private @Nullable Output<ResourceSetDescriptionArgs> relationshipLinks;

    /**
     * @return The Role assignments set for the relationship links.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> relationshipLinks() {
        return Optional.ofNullable(this.relationshipLinks);
    }

    /**
     * The Role assignments set for the relationships.
     * 
     */
    @Import(name="relationships")
    private @Nullable Output<ResourceSetDescriptionArgs> relationships;

    /**
     * @return The Role assignments set for the relationships.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> relationships() {
        return Optional.ofNullable(this.relationships);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Type of roles.
     * 
     */
    @Import(name="role", required=true)
    private Output<RoleTypes> role;

    /**
     * @return Type of roles.
     * 
     */
    public Output<RoleTypes> role() {
        return this.role;
    }

    /**
     * The Role assignments set for the assignment.
     * 
     */
    @Import(name="roleAssignments")
    private @Nullable Output<ResourceSetDescriptionArgs> roleAssignments;

    /**
     * @return The Role assignments set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> roleAssignments() {
        return Optional.ofNullable(this.roleAssignments);
    }

    /**
     * Sas Policies set for the assignment.
     * 
     */
    @Import(name="sasPolicies")
    private @Nullable Output<ResourceSetDescriptionArgs> sasPolicies;

    /**
     * @return Sas Policies set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> sasPolicies() {
        return Optional.ofNullable(this.sasPolicies);
    }

    /**
     * The Role assignments set for the assignment.
     * 
     */
    @Import(name="segments")
    private @Nullable Output<ResourceSetDescriptionArgs> segments;

    /**
     * @return The Role assignments set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> segments() {
        return Optional.ofNullable(this.segments);
    }

    /**
     * Views set for the assignment.
     * 
     */
    @Import(name="views")
    private @Nullable Output<ResourceSetDescriptionArgs> views;

    /**
     * @return Views set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> views() {
        return Optional.ofNullable(this.views);
    }

    /**
     * Widget types set for the assignment.
     * 
     */
    @Import(name="widgetTypes")
    private @Nullable Output<ResourceSetDescriptionArgs> widgetTypes;

    /**
     * @return Widget types set for the assignment.
     * 
     */
    public Optional<Output<ResourceSetDescriptionArgs>> widgetTypes() {
        return Optional.ofNullable(this.widgetTypes);
    }

    private RoleAssignmentArgs() {}

    private RoleAssignmentArgs(RoleAssignmentArgs $) {
        this.assignmentName = $.assignmentName;
        this.conflationPolicies = $.conflationPolicies;
        this.connectors = $.connectors;
        this.description = $.description;
        this.displayName = $.displayName;
        this.hubName = $.hubName;
        this.interactions = $.interactions;
        this.kpis = $.kpis;
        this.links = $.links;
        this.principals = $.principals;
        this.profiles = $.profiles;
        this.relationshipLinks = $.relationshipLinks;
        this.relationships = $.relationships;
        this.resourceGroupName = $.resourceGroupName;
        this.role = $.role;
        this.roleAssignments = $.roleAssignments;
        this.sasPolicies = $.sasPolicies;
        this.segments = $.segments;
        this.views = $.views;
        this.widgetTypes = $.widgetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAssignmentArgs $;

        public Builder() {
            $ = new RoleAssignmentArgs();
        }

        public Builder(RoleAssignmentArgs defaults) {
            $ = new RoleAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignmentName The assignment name
         * 
         * @return builder
         * 
         */
        public Builder assignmentName(@Nullable Output<String> assignmentName) {
            $.assignmentName = assignmentName;
            return this;
        }

        /**
         * @param assignmentName The assignment name
         * 
         * @return builder
         * 
         */
        public Builder assignmentName(String assignmentName) {
            return assignmentName(Output.of(assignmentName));
        }

        /**
         * @param conflationPolicies Widget types set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder conflationPolicies(@Nullable Output<ResourceSetDescriptionArgs> conflationPolicies) {
            $.conflationPolicies = conflationPolicies;
            return this;
        }

        /**
         * @param conflationPolicies Widget types set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder conflationPolicies(ResourceSetDescriptionArgs conflationPolicies) {
            return conflationPolicies(Output.of(conflationPolicies));
        }

        /**
         * @param connectors Connectors set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder connectors(@Nullable Output<ResourceSetDescriptionArgs> connectors) {
            $.connectors = connectors;
            return this;
        }

        /**
         * @param connectors Connectors set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder connectors(ResourceSetDescriptionArgs connectors) {
            return connectors(Output.of(connectors));
        }

        /**
         * @param description Localized description for the metadata.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<Map<String,String>> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Localized description for the metadata.
         * 
         * @return builder
         * 
         */
        public Builder description(Map<String,String> description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Localized display names for the metadata.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<Map<String,String>> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Localized display names for the metadata.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Map<String,String> displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(Output<String> hubName) {
            $.hubName = hubName;
            return this;
        }

        /**
         * @param hubName The name of the hub.
         * 
         * @return builder
         * 
         */
        public Builder hubName(String hubName) {
            return hubName(Output.of(hubName));
        }

        /**
         * @param interactions Interactions set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder interactions(@Nullable Output<ResourceSetDescriptionArgs> interactions) {
            $.interactions = interactions;
            return this;
        }

        /**
         * @param interactions Interactions set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder interactions(ResourceSetDescriptionArgs interactions) {
            return interactions(Output.of(interactions));
        }

        /**
         * @param kpis Kpis set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder kpis(@Nullable Output<ResourceSetDescriptionArgs> kpis) {
            $.kpis = kpis;
            return this;
        }

        /**
         * @param kpis Kpis set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder kpis(ResourceSetDescriptionArgs kpis) {
            return kpis(Output.of(kpis));
        }

        /**
         * @param links Links set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder links(@Nullable Output<ResourceSetDescriptionArgs> links) {
            $.links = links;
            return this;
        }

        /**
         * @param links Links set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder links(ResourceSetDescriptionArgs links) {
            return links(Output.of(links));
        }

        /**
         * @param principals The principals being assigned to.
         * 
         * @return builder
         * 
         */
        public Builder principals(Output<List<AssignmentPrincipalArgs>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals The principals being assigned to.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<AssignmentPrincipalArgs> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals The principals being assigned to.
         * 
         * @return builder
         * 
         */
        public Builder principals(AssignmentPrincipalArgs... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param profiles Profiles set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder profiles(@Nullable Output<ResourceSetDescriptionArgs> profiles) {
            $.profiles = profiles;
            return this;
        }

        /**
         * @param profiles Profiles set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder profiles(ResourceSetDescriptionArgs profiles) {
            return profiles(Output.of(profiles));
        }

        /**
         * @param relationshipLinks The Role assignments set for the relationship links.
         * 
         * @return builder
         * 
         */
        public Builder relationshipLinks(@Nullable Output<ResourceSetDescriptionArgs> relationshipLinks) {
            $.relationshipLinks = relationshipLinks;
            return this;
        }

        /**
         * @param relationshipLinks The Role assignments set for the relationship links.
         * 
         * @return builder
         * 
         */
        public Builder relationshipLinks(ResourceSetDescriptionArgs relationshipLinks) {
            return relationshipLinks(Output.of(relationshipLinks));
        }

        /**
         * @param relationships The Role assignments set for the relationships.
         * 
         * @return builder
         * 
         */
        public Builder relationships(@Nullable Output<ResourceSetDescriptionArgs> relationships) {
            $.relationships = relationships;
            return this;
        }

        /**
         * @param relationships The Role assignments set for the relationships.
         * 
         * @return builder
         * 
         */
        public Builder relationships(ResourceSetDescriptionArgs relationships) {
            return relationships(Output.of(relationships));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param role Type of roles.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<RoleTypes> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role Type of roles.
         * 
         * @return builder
         * 
         */
        public Builder role(RoleTypes role) {
            return role(Output.of(role));
        }

        /**
         * @param roleAssignments The Role assignments set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignments(@Nullable Output<ResourceSetDescriptionArgs> roleAssignments) {
            $.roleAssignments = roleAssignments;
            return this;
        }

        /**
         * @param roleAssignments The Role assignments set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder roleAssignments(ResourceSetDescriptionArgs roleAssignments) {
            return roleAssignments(Output.of(roleAssignments));
        }

        /**
         * @param sasPolicies Sas Policies set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder sasPolicies(@Nullable Output<ResourceSetDescriptionArgs> sasPolicies) {
            $.sasPolicies = sasPolicies;
            return this;
        }

        /**
         * @param sasPolicies Sas Policies set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder sasPolicies(ResourceSetDescriptionArgs sasPolicies) {
            return sasPolicies(Output.of(sasPolicies));
        }

        /**
         * @param segments The Role assignments set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder segments(@Nullable Output<ResourceSetDescriptionArgs> segments) {
            $.segments = segments;
            return this;
        }

        /**
         * @param segments The Role assignments set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder segments(ResourceSetDescriptionArgs segments) {
            return segments(Output.of(segments));
        }

        /**
         * @param views Views set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder views(@Nullable Output<ResourceSetDescriptionArgs> views) {
            $.views = views;
            return this;
        }

        /**
         * @param views Views set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder views(ResourceSetDescriptionArgs views) {
            return views(Output.of(views));
        }

        /**
         * @param widgetTypes Widget types set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder widgetTypes(@Nullable Output<ResourceSetDescriptionArgs> widgetTypes) {
            $.widgetTypes = widgetTypes;
            return this;
        }

        /**
         * @param widgetTypes Widget types set for the assignment.
         * 
         * @return builder
         * 
         */
        public Builder widgetTypes(ResourceSetDescriptionArgs widgetTypes) {
            return widgetTypes(Output.of(widgetTypes));
        }

        public RoleAssignmentArgs build() {
            $.hubName = Objects.requireNonNull($.hubName, "expected parameter 'hubName' to be non-null");
            $.principals = Objects.requireNonNull($.principals, "expected parameter 'principals' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            return $;
        }
    }

}
