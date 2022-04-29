// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.billing;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.billing.BillingRoleAssignmentByEnrollmentAccountArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The role assignment
 * API Version: 2019-10-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:billing:BillingRoleAssignmentByEnrollmentAccount 9dfd08c2-62a3-4d47-85bd-1cdba1408402 /providers/Microsoft.Billing/billingAccounts/7898901/enrollmentAccounts/225314/billingRoleAssignments/9dfd08c2-62a3-4d47-85bd-1cdba1408402 
 * ```
 * 
 */
@ResourceType(type="azure-native:billing:BillingRoleAssignmentByEnrollmentAccount")
public class BillingRoleAssignmentByEnrollmentAccount extends CustomResource {
    /**
     * The principal Id of the user who created the role assignment.
     * 
     */
    @Export(name="createdByPrincipalId", type=String.class, parameters={})
    private Output<String> createdByPrincipalId;

    /**
     * @return The principal Id of the user who created the role assignment.
     * 
     */
    public Output<String> createdByPrincipalId() {
        return this.createdByPrincipalId;
    }
    /**
     * The tenant Id of the user who created the role assignment.
     * 
     */
    @Export(name="createdByPrincipalTenantId", type=String.class, parameters={})
    private Output<String> createdByPrincipalTenantId;

    /**
     * @return The tenant Id of the user who created the role assignment.
     * 
     */
    public Output<String> createdByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }
    /**
     * The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="createdByUserEmailAddress", type=String.class, parameters={})
    private Output<String> createdByUserEmailAddress;

    /**
     * @return The email address of the user who created the role assignment. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output<String> createdByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }
    /**
     * The date the role assignment was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The date the role assignment was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The principal id of the user to whom the role was assigned.
     * 
     */
    @Export(name="principalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalId;

    /**
     * @return The principal id of the user to whom the role was assigned.
     * 
     */
    public Output<Optional<String>> principalId() {
        return Codegen.optional(this.principalId);
    }
    /**
     * The principal tenant id of the user to whom the role was assigned.
     * 
     */
    @Export(name="principalTenantId", type=String.class, parameters={})
    private Output</* @Nullable */ String> principalTenantId;

    /**
     * @return The principal tenant id of the user to whom the role was assigned.
     * 
     */
    public Output<Optional<String>> principalTenantId() {
        return Codegen.optional(this.principalTenantId);
    }
    /**
     * The ID of the role definition.
     * 
     */
    @Export(name="roleDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> roleDefinitionId;

    /**
     * @return The ID of the role definition.
     * 
     */
    public Output<Optional<String>> roleDefinitionId() {
        return Codegen.optional(this.roleDefinitionId);
    }
    /**
     * The scope at which the role was assigned.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope at which the role was assigned.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="userAuthenticationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> userAuthenticationType;

    /**
     * @return The authentication type of the user, whether Organization or MSA, of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output<Optional<String>> userAuthenticationType() {
        return Codegen.optional(this.userAuthenticationType);
    }
    /**
     * The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    @Export(name="userEmailAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> userEmailAddress;

    /**
     * @return The email address of the user to whom the role was assigned. This is supported only for billing accounts with agreement type Enterprise Agreement.
     * 
     */
    public Output<Optional<String>> userEmailAddress() {
        return Codegen.optional(this.userEmailAddress);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BillingRoleAssignmentByEnrollmentAccount(String name) {
        this(name, BillingRoleAssignmentByEnrollmentAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BillingRoleAssignmentByEnrollmentAccount(String name, BillingRoleAssignmentByEnrollmentAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BillingRoleAssignmentByEnrollmentAccount(String name, BillingRoleAssignmentByEnrollmentAccountArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByEnrollmentAccount", name, args == null ? BillingRoleAssignmentByEnrollmentAccountArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BillingRoleAssignmentByEnrollmentAccount(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:billing:BillingRoleAssignmentByEnrollmentAccount", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:billing/v20191001preview:BillingRoleAssignmentByEnrollmentAccount").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BillingRoleAssignmentByEnrollmentAccount get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new BillingRoleAssignmentByEnrollmentAccount(name, id, options);
    }
}
