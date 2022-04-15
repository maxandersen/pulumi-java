// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.authorization.PolicyAssignmentArgs;
import io.pulumi.azurenative.authorization.outputs.IdentityResponse;
import io.pulumi.azurenative.authorization.outputs.NonComplianceMessageResponse;
import io.pulumi.azurenative.authorization.outputs.ParameterValuesValueResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * The policy assignment.
 * API Version: 2020-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:authorization:PolicyAssignment EnforceNaming /subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyAssignments/EnforceNaming 
 * ```
 * 
 */
@ResourceType(type="azure-native:authorization:PolicyAssignment")
public class PolicyAssignment extends io.pulumi.resources.CustomResource {
    /**
     * This message will be part of response in case of policy violation.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return This message will be part of response in case of policy violation.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The display name of the policy assignment.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The display name of the policy assignment.
     * 
     */
    public Output</* @Nullable */ String> displayName() {
        return this.displayName;
    }
    /**
     * The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
     * 
     */
    @Export(name="enforcementMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> enforcementMode;

    /**
     * @return The policy assignment enforcement mode. Possible values are Default and DoNotEnforce.
     * 
     */
    public Output</* @Nullable */ String> enforcementMode() {
        return this.enforcementMode;
    }
    /**
     * The managed identity associated with the policy assignment.
     * 
     */
    @Export(name="identity", type=IdentityResponse.class, parameters={})
    private Output</* @Nullable */ IdentityResponse> identity;

    /**
     * @return The managed identity associated with the policy assignment.
     * 
     */
    public Output</* @Nullable */ IdentityResponse> identity() {
        return this.identity;
    }
    /**
     * The location of the policy assignment. Only required when utilizing managed identity.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return The location of the policy assignment. Only required when utilizing managed identity.
     * 
     */
    public Output</* @Nullable */ String> location() {
        return this.location;
    }
    /**
     * The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    @Export(name="metadata", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> metadata;

    /**
     * @return The policy assignment metadata. Metadata is an open ended object and is typically a collection of key value pairs.
     * 
     */
    public Output</* @Nullable */ Object> metadata() {
        return this.metadata;
    }
    /**
     * The name of the policy assignment.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the policy assignment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The messages that describe why a resource is non-compliant with the policy.
     * 
     */
    @Export(name="nonComplianceMessages", type=List.class, parameters={NonComplianceMessageResponse.class})
    private Output</* @Nullable */ List<NonComplianceMessageResponse>> nonComplianceMessages;

    /**
     * @return The messages that describe why a resource is non-compliant with the policy.
     * 
     */
    public Output</* @Nullable */ List<NonComplianceMessageResponse>> nonComplianceMessages() {
        return this.nonComplianceMessages;
    }
    /**
     * The policy's excluded scopes.
     * 
     */
    @Export(name="notScopes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> notScopes;

    /**
     * @return The policy's excluded scopes.
     * 
     */
    public Output</* @Nullable */ List<String>> notScopes() {
        return this.notScopes;
    }
    /**
     * The parameter values for the assigned policy rule. The keys are the parameter names.
     * 
     */
    @Export(name="parameters", type=Map.class, parameters={String.class, ParameterValuesValueResponse.class})
    private Output</* @Nullable */ Map<String,ParameterValuesValueResponse>> parameters;

    /**
     * @return The parameter values for the assigned policy rule. The keys are the parameter names.
     * 
     */
    public Output</* @Nullable */ Map<String,ParameterValuesValueResponse>> parameters() {
        return this.parameters;
    }
    /**
     * The ID of the policy definition or policy set definition being assigned.
     * 
     */
    @Export(name="policyDefinitionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionId;

    /**
     * @return The ID of the policy definition or policy set definition being assigned.
     * 
     */
    public Output</* @Nullable */ String> policyDefinitionId() {
        return this.policyDefinitionId;
    }
    /**
     * The scope for the policy assignment.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return The scope for the policy assignment.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * The type of the policy assignment.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the policy assignment.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyAssignment(String name) {
        this(name, PolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyAssignment(String name, PolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyAssignment(String name, PolicyAssignmentArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyAssignment", name, args == null ? PolicyAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyAssignment(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:authorization:PolicyAssignment", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:authorization/v20151001preview:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20160401:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20161201:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20170601preview:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180301:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20180501:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190101:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190601:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20190901:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200301:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20200901:PolicyAssignment").build()),
                Output.of(Alias.builder().type("azure-native:authorization/v20210601:PolicyAssignment").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PolicyAssignment get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAssignment(name, id, options);
    }
}
