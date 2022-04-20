// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.folder.AccessApprovalSettingsArgs;
import com.pulumi.gcp.folder.inputs.AccessApprovalSettingsState;
import com.pulumi.gcp.folder.outputs.AccessApprovalSettingsEnrolledService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
 * 
 * To get more information about FolderSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/folders)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * FolderSettings can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:folder/accessApprovalSettings:AccessApprovalSettings default folders/{{folder_id}}/accessApprovalSettings
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:folder/accessApprovalSettings:AccessApprovalSettings default {{folder_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:folder/accessApprovalSettings:AccessApprovalSettings")
public class AccessApprovalSettings extends com.pulumi.resources.CustomResource {
    /**
     * If the field is true, that indicates that at least one service is enrolled for Access Approval in one or more ancestors
     * of the Folder.
     * 
     */
    @Export(name="enrolledAncestor", type=Boolean.class, parameters={})
    private Output<Boolean> enrolledAncestor;

    /**
     * @return If the field is true, that indicates that at least one service is enrolled for Access Approval in one or more ancestors
     * of the Folder.
     * 
     */
    public Output<Boolean> enrolledAncestor() {
        return this.enrolledAncestor;
    }
    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Export(name="enrolledServices", type=List.class, parameters={AccessApprovalSettingsEnrolledService.class})
    private Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can only be done on an all or nothing basis.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices() {
        return this.enrolledServices;
    }
    /**
     * ID of the folder of the access approval settings.
     * 
     */
    @Export(name="folderId", type=String.class, parameters={})
    private Output<String> folderId;

    /**
     * @return ID of the folder of the access approval settings.
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * The resource name of the settings. Format is &#34;folders/{folder_id}/accessApprovalSettings&#34;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the settings. Format is &#34;folders/{folder_id}/accessApprovalSettings&#34;
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
        super("gcp:folder/accessApprovalSettings:AccessApprovalSettings", name, args == null ? AccessApprovalSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessApprovalSettings(String name, Output<String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:folder/accessApprovalSettings:AccessApprovalSettings", name, state, makeResourceOptions(options, id));
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
