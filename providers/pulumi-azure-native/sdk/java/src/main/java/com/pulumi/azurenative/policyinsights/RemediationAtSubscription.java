// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.policyinsights.RemediationAtSubscriptionArgs;
import com.pulumi.azurenative.policyinsights.outputs.RemediationDeploymentSummaryResponse;
import com.pulumi.azurenative.policyinsights.outputs.RemediationFiltersResponse;
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
 * The remediation definition.
 * API Version: 2019-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:policyinsights:RemediationAtSubscription storageRemediation /subscriptions/35ee058e-5fa0-414c-8145-3ebb8d09b6e2/providers/microsoft.policyinsights/remediations/storageRemediation 
 * ```
 * 
 */
@ResourceType(type="azure-native:policyinsights:RemediationAtSubscription")
public class RemediationAtSubscription extends CustomResource {
    /**
     * The time at which the remediation was created.
     * 
     */
    @Export(name="createdOn", type=String.class, parameters={})
    private Output<String> createdOn;

    /**
     * @return The time at which the remediation was created.
     * 
     */
    public Output<String> createdOn() {
        return this.createdOn;
    }
    /**
     * The deployment status summary for all deployments created by the remediation.
     * 
     */
    @Export(name="deploymentStatus", type=RemediationDeploymentSummaryResponse.class, parameters={})
    private Output<RemediationDeploymentSummaryResponse> deploymentStatus;

    /**
     * @return The deployment status summary for all deployments created by the remediation.
     * 
     */
    public Output<RemediationDeploymentSummaryResponse> deploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * The filters that will be applied to determine which resources to remediate.
     * 
     */
    @Export(name="filters", type=RemediationFiltersResponse.class, parameters={})
    private Output</* @Nullable */ RemediationFiltersResponse> filters;

    /**
     * @return The filters that will be applied to determine which resources to remediate.
     * 
     */
    public Output<Optional<RemediationFiltersResponse>> filters() {
        return Codegen.optional(this.filters);
    }
    /**
     * The time at which the remediation was last updated.
     * 
     */
    @Export(name="lastUpdatedOn", type=String.class, parameters={})
    private Output<String> lastUpdatedOn;

    /**
     * @return The time at which the remediation was last updated.
     * 
     */
    public Output<String> lastUpdatedOn() {
        return this.lastUpdatedOn;
    }
    /**
     * The name of the remediation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the remediation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The resource ID of the policy assignment that should be remediated.
     * 
     */
    @Export(name="policyAssignmentId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyAssignmentId;

    /**
     * @return The resource ID of the policy assignment that should be remediated.
     * 
     */
    public Output<Optional<String>> policyAssignmentId() {
        return Codegen.optional(this.policyAssignmentId);
    }
    /**
     * The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    @Export(name="policyDefinitionReferenceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyDefinitionReferenceId;

    /**
     * @return The policy definition reference ID of the individual definition that should be remediated. Required when the policy assignment being remediated assigns a policy set definition.
     * 
     */
    public Output<Optional<String>> policyDefinitionReferenceId() {
        return Codegen.optional(this.policyDefinitionReferenceId);
    }
    /**
     * The status of the remediation.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The status of the remediation.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    @Export(name="resourceDiscoveryMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceDiscoveryMode;

    /**
     * @return The way resources to remediate are discovered. Defaults to ExistingNonCompliant if not specified.
     * 
     */
    public Output<Optional<String>> resourceDiscoveryMode() {
        return Codegen.optional(this.resourceDiscoveryMode);
    }
    /**
     * The type of the remediation.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the remediation.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RemediationAtSubscription(String name) {
        this(name, RemediationAtSubscriptionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RemediationAtSubscription(String name, @Nullable RemediationAtSubscriptionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RemediationAtSubscription(String name, @Nullable RemediationAtSubscriptionArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtSubscription", name, args == null ? RemediationAtSubscriptionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RemediationAtSubscription(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:policyinsights:RemediationAtSubscription", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:policyinsights/v20180701preview:RemediationAtSubscription").build()),
                Output.of(Alias.builder().type("azure-native:policyinsights/v20190701:RemediationAtSubscription").build()),
                Output.of(Alias.builder().type("azure-native:policyinsights/v20211001:RemediationAtSubscription").build())
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
    public static RemediationAtSubscription get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new RemediationAtSubscription(name, id, options);
    }
}
