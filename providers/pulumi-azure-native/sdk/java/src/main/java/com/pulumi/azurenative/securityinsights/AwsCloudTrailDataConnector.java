// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.securityinsights.AwsCloudTrailDataConnectorArgs;
import com.pulumi.azurenative.securityinsights.outputs.AwsCloudTrailDataConnectorDataTypesResponse;
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
 * Represents Amazon Web Services CloudTrail data connector.
 * API Version: 2020-01-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:securityinsights:AwsCloudTrailDataConnector 73e01a99-5cd7-4139-a149-9f2736ff2ab5 /subscriptions/d0cfe6b2-9ac0-4464-9919-dccaee2e48c0/resourceGroups/myRg/providers/Microsoft.OperationalInsights/workspaces/myWorkspace/providers/Microsoft.SecurityInsights/dataConnectors/73e01a99-5cd7-4139-a149-9f2736ff2ab5 
 * ```
 * 
 */
@ResourceType(type="azure-native:securityinsights:AwsCloudTrailDataConnector")
public class AwsCloudTrailDataConnector extends CustomResource {
    /**
     * The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws account.
     * 
     */
    @Export(name="awsRoleArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsRoleArn;

    /**
     * @return The Aws Role Arn (with CloudTrailReadOnly policy) that is used to access the Aws account.
     * 
     */
    public Output<Optional<String>> awsRoleArn() {
        return Codegen.optional(this.awsRoleArn);
    }
    /**
     * The available data types for the connector.
     * 
     */
    @Export(name="dataTypes", type=AwsCloudTrailDataConnectorDataTypesResponse.class, parameters={})
    private Output</* @Nullable */ AwsCloudTrailDataConnectorDataTypesResponse> dataTypes;

    /**
     * @return The available data types for the connector.
     * 
     */
    public Output<Optional<AwsCloudTrailDataConnectorDataTypesResponse>> dataTypes() {
        return Codegen.optional(this.dataTypes);
    }
    /**
     * Etag of the azure resource
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Etag of the azure resource
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * The kind of the data connector
     * Expected value is &#39;AmazonWebServicesCloudTrail&#39;.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of the data connector
     * Expected value is &#39;AmazonWebServicesCloudTrail&#39;.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Azure resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Azure resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Azure resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Azure resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AwsCloudTrailDataConnector(String name) {
        this(name, AwsCloudTrailDataConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AwsCloudTrailDataConnector(String name, AwsCloudTrailDataConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AwsCloudTrailDataConnector(String name, AwsCloudTrailDataConnectorArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:AwsCloudTrailDataConnector", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private AwsCloudTrailDataConnector(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:securityinsights:AwsCloudTrailDataConnector", name, null, makeResourceOptions(options, id));
    }

    private static AwsCloudTrailDataConnectorArgs makeArgs(AwsCloudTrailDataConnectorArgs args) {
        var builder = args == null ? AwsCloudTrailDataConnectorArgs.builder() : AwsCloudTrailDataConnectorArgs.builder(args);
        return builder
            .kind("AmazonWebServicesCloudTrail")
            .build();
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:securityinsights/v20190101preview:AwsCloudTrailDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20200101:AwsCloudTrailDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210301preview:AwsCloudTrailDataConnector").build()),
                Output.of(Alias.builder().type("azure-native:securityinsights/v20210901preview:AwsCloudTrailDataConnector").build())
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
    public static AwsCloudTrailDataConnector get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new AwsCloudTrailDataConnector(name, id, options);
    }
}
