// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager_v3;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudresourcemanager_v3.FolderArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a folder in the resource hierarchy. Returns an `Operation` which can be used to track the progress of the folder creation workflow. Upon success, the `Operation.response` field will be populated with the created Folder. In order to succeed, the addition of this new folder must not violate the folder naming, height, or fanout constraints. + The folder&#39;s `display_name` must be distinct from all other folders that share its parent. + The addition of the folder must not cause the active folder hierarchy to exceed a height of 10. Note, the full active + deleted folder hierarchy is allowed to reach a height of 20; this provides additional headroom when moving folders that contain deleted folders. + The addition of the folder must not cause the total number of folders under its parent to exceed 300. If the operation fails due to a folder constraint violation, some errors may be returned by the `CreateFolder` request, with status code `FAILED_PRECONDITION` and an error description. Other folder constraint violations will be communicated in the `Operation`, with the specific `PreconditionFailure` returned in the details list in the `Operation.error` field. The caller must have `resourcemanager.folders.create` permission on the identified parent.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudresourcemanager/v3:Folder")
public class Folder extends com.pulumi.resources.CustomResource {
    /**
     * Timestamp when the folder was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Timestamp when the folder was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Timestamp when the folder was requested to be deleted.
     * 
     */
    @Export(name="deleteTime", type=String.class, parameters={})
    private Output<String> deleteTime;

    /**
     * @return Timestamp when the folder was requested to be deleted.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * The folder&#39;s display name. A folder&#39;s display name must be unique amongst its siblings. For example, no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The folder&#39;s display name. A folder&#39;s display name must be unique amongst its siblings. For example, no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters. This is captured by the regular expression: `[\p{L}\p{N}]([\p{L}\p{N}_- ]{0,28}[\p{L}\p{N}])?`.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A checksum computed by the server based on the current value of the folder resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A checksum computed by the server based on the current value of the folder resource. This may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The resource name of the folder. Its format is `folders/{folder_id}`, for example: &#34;folders/1234&#34;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of the folder. Its format is `folders/{folder_id}`, for example: &#34;folders/1234&#34;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The folder&#39;s parent&#39;s resource name. Updates to the folder&#39;s parent must be performed using MoveFolder.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output<String> parent;

    /**
     * @return The folder&#39;s parent&#39;s resource name. Updates to the folder&#39;s parent must be performed using MoveFolder.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * The lifecycle state of the folder. Updates to the state must be performed using DeleteFolder and UndeleteFolder.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The lifecycle state of the folder. Updates to the state must be performed using DeleteFolder and UndeleteFolder.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Timestamp when the folder was last modified.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Timestamp when the folder was last modified.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Folder(String name) {
        this(name, FolderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Folder(String name, FolderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Folder(String name, FolderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:Folder", name, args == null ? FolderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Folder(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudresourcemanager/v3:Folder", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Folder get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Folder(name, id, options);
    }
}
