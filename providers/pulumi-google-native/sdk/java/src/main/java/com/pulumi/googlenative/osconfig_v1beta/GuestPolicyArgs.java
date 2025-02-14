// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.AssignmentArgs;
import com.pulumi.googlenative.osconfig_v1beta.inputs.PackageArgs;
import com.pulumi.googlenative.osconfig_v1beta.inputs.PackageRepositoryArgs;
import com.pulumi.googlenative.osconfig_v1beta.inputs.SoftwareRecipeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPolicyArgs Empty = new GuestPolicyArgs();

    /**
     * Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    @Import(name="assignment", required=true)
    private Output<AssignmentArgs> assignment;

    /**
     * @return Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
     * 
     */
    public Output<AssignmentArgs> assignment() {
        return this.assignment;
    }

    /**
     * Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the guest policy. Length of the description is limited to 1024 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    @Import(name="guestPolicyId", required=true)
    private Output<String> guestPolicyId;

    /**
     * @return Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
     * 
     */
    public Output<String> guestPolicyId() {
        return this.guestPolicyId;
    }

    /**
     * Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    @Import(name="packageRepositories")
    private @Nullable Output<List<PackageRepositoryArgs>> packageRepositories;

    /**
     * @return A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
     * 
     */
    public Optional<Output<List<PackageRepositoryArgs>>> packageRepositories() {
        return Optional.ofNullable(this.packageRepositories);
    }

    /**
     * The software packages to be managed by this policy.
     * 
     */
    @Import(name="packages")
    private @Nullable Output<List<PackageArgs>> packages;

    /**
     * @return The software packages to be managed by this policy.
     * 
     */
    public Optional<Output<List<PackageArgs>>> packages() {
        return Optional.ofNullable(this.packages);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * A list of Recipes to install on the VM instance.
     * 
     */
    @Import(name="recipes")
    private @Nullable Output<List<SoftwareRecipeArgs>> recipes;

    /**
     * @return A list of Recipes to install on the VM instance.
     * 
     */
    public Optional<Output<List<SoftwareRecipeArgs>>> recipes() {
        return Optional.ofNullable(this.recipes);
    }

    private GuestPolicyArgs() {}

    private GuestPolicyArgs(GuestPolicyArgs $) {
        this.assignment = $.assignment;
        this.description = $.description;
        this.etag = $.etag;
        this.guestPolicyId = $.guestPolicyId;
        this.name = $.name;
        this.packageRepositories = $.packageRepositories;
        this.packages = $.packages;
        this.project = $.project;
        this.recipes = $.recipes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPolicyArgs $;

        public Builder() {
            $ = new GuestPolicyArgs();
        }

        public Builder(GuestPolicyArgs defaults) {
            $ = new GuestPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignment Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
         * 
         * @return builder
         * 
         */
        public Builder assignment(Output<AssignmentArgs> assignment) {
            $.assignment = assignment;
            return this;
        }

        /**
         * @param assignment Specifies the VM instances that are assigned to this policy. This allows you to target sets or groups of VM instances by different parameters such as labels, names, OS, or zones. If left empty, all VM instances underneath this policy are targeted. At the same level in the resource hierarchy (that is within a project), the service prevents the creation of multiple policies that conflict with each other. For more information, see how the service [handles assignment conflicts](/compute/docs/os-config-management/create-guest-policy#handle-conflicts).
         * 
         * @return builder
         * 
         */
        public Builder assignment(AssignmentArgs assignment) {
            return assignment(Output.of(assignment));
        }

        /**
         * @param description Description of the guest policy. Length of the description is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the guest policy. Length of the description is limited to 1024 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param etag The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag The etag for this guest policy. If this is provided on update, it must match the server&#39;s etag.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param guestPolicyId Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
         * 
         * @return builder
         * 
         */
        public Builder guestPolicyId(Output<String> guestPolicyId) {
            $.guestPolicyId = guestPolicyId;
            return this;
        }

        /**
         * @param guestPolicyId Required. The logical name of the guest policy in the project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the project.
         * 
         * @return builder
         * 
         */
        public Builder guestPolicyId(String guestPolicyId) {
            return guestPolicyId(Output.of(guestPolicyId));
        }

        /**
         * @param name Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Unique name of the resource in this project using one of the following forms: `projects/{project_number}/guestPolicies/{guest_policy_id}`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param packageRepositories A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
         * 
         * @return builder
         * 
         */
        public Builder packageRepositories(@Nullable Output<List<PackageRepositoryArgs>> packageRepositories) {
            $.packageRepositories = packageRepositories;
            return this;
        }

        /**
         * @param packageRepositories A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
         * 
         * @return builder
         * 
         */
        public Builder packageRepositories(List<PackageRepositoryArgs> packageRepositories) {
            return packageRepositories(Output.of(packageRepositories));
        }

        /**
         * @param packageRepositories A list of package repositories to configure on the VM instance. This is done before any other configs are applied so they can use these repos. Package repositories are only configured if the corresponding package manager(s) are available.
         * 
         * @return builder
         * 
         */
        public Builder packageRepositories(PackageRepositoryArgs... packageRepositories) {
            return packageRepositories(List.of(packageRepositories));
        }

        /**
         * @param packages The software packages to be managed by this policy.
         * 
         * @return builder
         * 
         */
        public Builder packages(@Nullable Output<List<PackageArgs>> packages) {
            $.packages = packages;
            return this;
        }

        /**
         * @param packages The software packages to be managed by this policy.
         * 
         * @return builder
         * 
         */
        public Builder packages(List<PackageArgs> packages) {
            return packages(Output.of(packages));
        }

        /**
         * @param packages The software packages to be managed by this policy.
         * 
         * @return builder
         * 
         */
        public Builder packages(PackageArgs... packages) {
            return packages(List.of(packages));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param recipes A list of Recipes to install on the VM instance.
         * 
         * @return builder
         * 
         */
        public Builder recipes(@Nullable Output<List<SoftwareRecipeArgs>> recipes) {
            $.recipes = recipes;
            return this;
        }

        /**
         * @param recipes A list of Recipes to install on the VM instance.
         * 
         * @return builder
         * 
         */
        public Builder recipes(List<SoftwareRecipeArgs> recipes) {
            return recipes(Output.of(recipes));
        }

        /**
         * @param recipes A list of Recipes to install on the VM instance.
         * 
         * @return builder
         * 
         */
        public Builder recipes(SoftwareRecipeArgs... recipes) {
            return recipes(List.of(recipes));
        }

        public GuestPolicyArgs build() {
            $.assignment = Objects.requireNonNull($.assignment, "expected parameter 'assignment' to be non-null");
            $.guestPolicyId = Objects.requireNonNull($.guestPolicyId, "expected parameter 'guestPolicyId' to be non-null");
            return $;
        }
    }

}
