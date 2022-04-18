// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestackhci;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.azurestackhci.ClusterArgs;
import com.pulumi.azurenative.azurestackhci.outputs.ClusterReportedPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Cluster details.
 * API Version: 2020-10-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:azurestackhci:Cluster myCluster /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/test-rg/providers/Microsoft.AzureStackHCI/clusters/myCluster 
 * ```
 * 
 */
@ResourceType(type="azure-native:azurestackhci:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * App id of cluster AAD identity.
     * 
     */
    @Export(name="aadClientId", type=String.class, parameters={})
    private Output<String> aadClientId;

    /**
     * @return App id of cluster AAD identity.
     * 
     */
    public Output<String> aadClientId() {
        return this.aadClientId;
    }
    /**
     * Tenant id of cluster AAD identity.
     * 
     */
    @Export(name="aadTenantId", type=String.class, parameters={})
    private Output<String> aadTenantId;

    /**
     * @return Tenant id of cluster AAD identity.
     * 
     */
    public Output<String> aadTenantId() {
        return this.aadTenantId;
    }
    /**
     * Type of billing applied to the resource.
     * 
     */
    @Export(name="billingModel", type=String.class, parameters={})
    private Output<String> billingModel;

    /**
     * @return Type of billing applied to the resource.
     * 
     */
    public Output<String> billingModel() {
        return this.billingModel;
    }
    /**
     * Unique, immutable resource id.
     * 
     */
    @Export(name="cloudId", type=String.class, parameters={})
    private Output<String> cloudId;

    /**
     * @return Unique, immutable resource id.
     * 
     */
    public Output<String> cloudId() {
        return this.cloudId;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdAt;

    /**
     * @return The timestamp of resource creation (UTC).
     * 
     */
    public Output</* @Nullable */ String> createdAt() {
        return this.createdAt;
    }
    /**
     * The identity that created the resource.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdBy;

    /**
     * @return The identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> createdBy() {
        return this.createdBy;
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    @Export(name="createdByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> createdByType;

    /**
     * @return The type of identity that created the resource.
     * 
     */
    public Output</* @Nullable */ String> createdByType() {
        return this.createdByType;
    }
    /**
     * Most recent billing meter timestamp.
     * 
     */
    @Export(name="lastBillingTimestamp", type=String.class, parameters={})
    private Output<String> lastBillingTimestamp;

    /**
     * @return Most recent billing meter timestamp.
     * 
     */
    public Output<String> lastBillingTimestamp() {
        return this.lastBillingTimestamp;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    @Export(name="lastModifiedAt", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedAt;

    /**
     * @return The timestamp of resource last modification (UTC)
     * 
     */
    public Output</* @Nullable */ String> lastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedBy", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedBy;

    /**
     * @return The identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> lastModifiedBy() {
        return this.lastModifiedBy;
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    @Export(name="lastModifiedByType", type=String.class, parameters={})
    private Output</* @Nullable */ String> lastModifiedByType;

    /**
     * @return The type of identity that last modified the resource.
     * 
     */
    public Output</* @Nullable */ String> lastModifiedByType() {
        return this.lastModifiedByType;
    }
    /**
     * Most recent cluster sync timestamp.
     * 
     */
    @Export(name="lastSyncTimestamp", type=String.class, parameters={})
    private Output<String> lastSyncTimestamp;

    /**
     * @return Most recent cluster sync timestamp.
     * 
     */
    public Output<String> lastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return The geo-location where the resource lives
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * First cluster sync timestamp.
     * 
     */
    @Export(name="registrationTimestamp", type=String.class, parameters={})
    private Output<String> registrationTimestamp;

    /**
     * @return First cluster sync timestamp.
     * 
     */
    public Output<String> registrationTimestamp() {
        return this.registrationTimestamp;
    }
    /**
     * Properties reported by cluster agent.
     * 
     */
    @Export(name="reportedProperties", type=ClusterReportedPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ ClusterReportedPropertiesResponse> reportedProperties;

    /**
     * @return Properties reported by cluster agent.
     * 
     */
    public Output</* @Nullable */ ClusterReportedPropertiesResponse> reportedProperties() {
        return this.reportedProperties;
    }
    /**
     * Status of the cluster agent.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of the cluster agent.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Number of days remaining in the trial period.
     * 
     */
    @Export(name="trialDaysRemaining", type=Double.class, parameters={})
    private Output<Double> trialDaysRemaining;

    /**
     * @return Number of days remaining in the trial period.
     * 
     */
    public Output<Double> trialDaysRemaining() {
        return this.trialDaysRemaining;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestackhci:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:azurestackhci:Cluster", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:azurestackhci/v20200301preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:azurestackhci/v20201001:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:azurestackhci/v20210101preview:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:azurestackhci/v20210901:Cluster").build()),
                Output.of(Alias.builder().type("azure-native:azurestackhci/v20220101:Cluster").build())
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
    public static Cluster get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, options);
    }
}
