// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.security.ConnectorArgs;
import com.pulumi.azurenative.security.outputs.AwAssumeRoleAuthenticationDetailsPropertiesResponse;
import com.pulumi.azurenative.security.outputs.AwsCredsAuthenticationDetailsPropertiesResponse;
import com.pulumi.azurenative.security.outputs.GcpCredentialsDetailsPropertiesResponse;
import com.pulumi.azurenative.security.outputs.HybridComputeSettingsPropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The connector setting
 * API Version: 2020-01-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:Connector gcp_dev /subscriptions/20ff7fc3-e762-44dd-bd96-b71116dcdc23/providers/Microsoft.Security/connectors/gcp_dev 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:Connector")
public class Connector extends com.pulumi.resources.CustomResource {
    /**
     * Settings for authentication management, these settings are relevant only for the cloud connector.
     * 
     */
    @Export(name="authenticationDetails", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> authenticationDetails;

    /**
     * @return Settings for authentication management, these settings are relevant only for the cloud connector.
     * 
     */
    public Output</* @Nullable */ Object> authenticationDetails() {
        return this.authenticationDetails;
    }
    /**
     * Settings for hybrid compute management. These settings are relevant only for Arc autoProvision (Hybrid Compute).
     * 
     */
    @Export(name="hybridComputeSettings", type=HybridComputeSettingsPropertiesResponse.class, parameters={})
    private Output</* @Nullable */ HybridComputeSettingsPropertiesResponse> hybridComputeSettings;

    /**
     * @return Settings for hybrid compute management. These settings are relevant only for Arc autoProvision (Hybrid Compute).
     * 
     */
    public Output</* @Nullable */ HybridComputeSettingsPropertiesResponse> hybridComputeSettings() {
        return this.hybridComputeSettings;
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connector(String name) {
        this(name, ConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connector(String name, @Nullable ConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connector(String name, @Nullable ConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Connector", name, args == null ? ConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connector(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:Connector", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20200101preview:Connector").build())
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
    public static Connector get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connector(name, id, options);
    }
}
