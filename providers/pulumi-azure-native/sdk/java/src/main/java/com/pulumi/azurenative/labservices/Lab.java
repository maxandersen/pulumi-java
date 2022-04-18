// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.labservices.LabArgs;
import com.pulumi.azurenative.labservices.outputs.LatestOperationResultResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Represents a lab.
 * API Version: 2018-10-15.
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:labservices:Lab myresource1 /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.LabServices/labaccounts/{labAccountName}/labs/{labName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:labservices:Lab")
public class Lab extends com.pulumi.resources.CustomResource {
    /**
     * Object id of the user that created the lab.
     * 
     */
    @Export(name="createdByObjectId", type=String.class, parameters={})
    private Output<String> createdByObjectId;

    /**
     * @return Object id of the user that created the lab.
     * 
     */
    public Output<String> createdByObjectId() {
        return this.createdByObjectId;
    }
    /**
     * Lab creator name
     * 
     */
    @Export(name="createdByUserPrincipalName", type=String.class, parameters={})
    private Output<String> createdByUserPrincipalName;

    /**
     * @return Lab creator name
     * 
     */
    public Output<String> createdByUserPrincipalName() {
        return this.createdByUserPrincipalName;
    }
    /**
     * Creation date for the lab
     * 
     */
    @Export(name="createdDate", type=String.class, parameters={})
    private Output<String> createdDate;

    /**
     * @return Creation date for the lab
     * 
     */
    public Output<String> createdDate() {
        return this.createdDate;
    }
    /**
     * Invitation code that users can use to join a lab.
     * 
     */
    @Export(name="invitationCode", type=String.class, parameters={})
    private Output<String> invitationCode;

    /**
     * @return Invitation code that users can use to join a lab.
     * 
     */
    public Output<String> invitationCode() {
        return this.invitationCode;
    }
    /**
     * The details of the latest operation. ex: status, error
     * 
     */
    @Export(name="latestOperationResult", type=LatestOperationResultResponse.class, parameters={})
    private Output<LatestOperationResultResponse> latestOperationResult;

    /**
     * @return The details of the latest operation. ex: status, error
     * 
     */
    public Output<LatestOperationResultResponse> latestOperationResult() {
        return this.latestOperationResult;
    }
    /**
     * The location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * Maximum number of users allowed in the lab.
     * 
     */
    @Export(name="maxUsersInLab", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxUsersInLab;

    /**
     * @return Maximum number of users allowed in the lab.
     * 
     */
    public Output</* @Nullable */ Integer> maxUsersInLab() {
        return this.maxUsersInLab;
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The provisioning status of the resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output</* @Nullable */ String> provisioningState;

    /**
     * @return The provisioning status of the resource.
     * 
     */
    public Output</* @Nullable */ String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return The tags of the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The unique immutable identifier of a resource (Guid).
     * 
     */
    @Export(name="uniqueIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> uniqueIdentifier;

    /**
     * @return The unique immutable identifier of a resource (Guid).
     * 
     */
    public Output</* @Nullable */ String> uniqueIdentifier() {
        return this.uniqueIdentifier;
    }
    /**
     * Maximum duration a user can use an environment for in the lab.
     * 
     */
    @Export(name="usageQuota", type=String.class, parameters={})
    private Output</* @Nullable */ String> usageQuota;

    /**
     * @return Maximum duration a user can use an environment for in the lab.
     * 
     */
    public Output</* @Nullable */ String> usageQuota() {
        return this.usageQuota;
    }
    /**
     * Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    @Export(name="userAccessMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAccessMode;

    /**
     * @return Lab user access mode (open to all vs. restricted to those listed on the lab).
     * 
     */
    public Output</* @Nullable */ String> userAccessMode() {
        return this.userAccessMode;
    }
    /**
     * Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
     */
    @Export(name="userQuota", type=Integer.class, parameters={})
    private Output<Integer> userQuota;

    /**
     * @return Maximum value MaxUsersInLab can be set to, as specified by the service
     * 
     */
    public Output<Integer> userQuota() {
        return this.userQuota;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Lab(String name) {
        this(name, LabArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Lab(String name, LabArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Lab(String name, LabArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Lab", name, args == null ? LabArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Lab(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:labservices:Lab", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:labservices/v20181015:Lab").build())
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
    public static Lab get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Lab(name, id, options);
    }
}
