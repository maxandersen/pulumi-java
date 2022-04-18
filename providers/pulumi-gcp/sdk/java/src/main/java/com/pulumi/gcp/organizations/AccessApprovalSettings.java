// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState;
import com.pulumi.gcp.organizations.outputs.AccessApprovalSettingsEnrolledService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
 * 
 * To get more information about OrganizationSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/organizations)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * OrganizationSettings can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default organizations/{{organization_id}}/accessApprovalSettings
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default {{organization_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/accessApprovalSettings:AccessApprovalSettings")
public class AccessApprovalSettings extends com.pulumi.resources.CustomResource {
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @Export(name="enrolledAncestor", type=Boolean.class, parameters={})
    private Output<Boolean> enrolledAncestor;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> enrolledAncestor() {
        return this.enrolledAncestor;
    }
    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Export(name="enrolledServices", type=List.class, parameters={AccessApprovalSettingsEnrolledService.class})
    private Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices() {
        return this.enrolledServices;
    }
    /**
     * The resource name of the settings. Format is "organizations/{organization_id}/accessApprovalSettings"
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the settings. Format is "organizations/{organization_id}/accessApprovalSettings"
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Export(name="notificationEmails", type=List.class, parameters={String.class})
    private Output<List<String>> notificationEmails;

    /**
     * @return A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return ID of the organization of the access approval settings.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessApprovalSettings(String name) {
        this(name, AccessApprovalSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, args == null ? AccessApprovalSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessApprovalSettings(String name, Output<String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AccessApprovalSettings get(String name, Output<String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessApprovalSettings(name, id, state, options);
    }
}
