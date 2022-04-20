// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.authorization;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.authorization.ManagementLockByScopeArgs;
import com.pulumi.azurenative.authorization.outputs.ManagementLockOwnerResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The lock information.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:ManagementLockByScope testlock /subscriptions/subscriptionId/resourceGroups/resourcegroupname/providers/Microsoft.Authorization/locks/testlock 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:ManagementLockByScope")
public class ManagementLockByScope extends com.pulumi.resources.CustomResource {
    /**
     * The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can&#39;t modify or delete it.
     * 
     */
    @Export(name="level", type=String.class, parameters={})
    private Output<String> level;

    /**
     * @return The level of the lock. Possible values are: NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users are able to read and modify the resources, but not delete. ReadOnly means authorized users can only read from a resource, but they can&#39;t modify or delete it.
     * 
     */
    public Output<String> level() {
        return this.level;
    }
    /**
     * The name of the lock.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the lock.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Notes about the lock. Maximum of 512 characters.
     * 
     */
    @Export(name="notes", type=String.class, parameters={})
    private Output</* @Nullable */ String> notes;

    /**
     * @return Notes about the lock. Maximum of 512 characters.
     * 
     */
    public Output</* @Nullable */ String> notes() {
        return this.notes;
    }
    /**
     * The owners of the lock.
     * 
     */
    @Export(name="owners", type=List.class, parameters={ManagementLockOwnerResponse.class})
    private Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners;

    /**
     * @return The owners of the lock.
     * 
     */
    public Output</* @Nullable */ List<ManagementLockOwnerResponse>> owners() {
        return this.owners;
    }
    /**
     * The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type of the lock - Microsoft.Authorization/locks.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ManagementLockByScope(String name) {
        this(name, ManagementLockByScopeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ManagementLockByScope(String name, ManagementLockByScopeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ManagementLockByScope(String name, ManagementLockByScopeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, args == null ? ManagementLockByScopeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ManagementLockByScope(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:ManagementLockByScope", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20160901:ManagementLockByScope").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20170401:ManagementLockByScope").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200501:ManagementLockByScope").build())
            ))
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
    public static ManagementLockByScope get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ManagementLockByScope(name, id, options);
    }
}
