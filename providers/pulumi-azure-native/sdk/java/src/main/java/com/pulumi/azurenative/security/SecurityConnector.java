// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.security.SecurityConnectorArgs;
import com.pulumi.azurenative.security.outputs.CspmMonitorAwsOfferingResponse;
import com.pulumi.azurenative.security.outputs.DefenderForContainersAwsOfferingResponse;
import com.pulumi.azurenative.security.outputs.DefenderForServersAwsOfferingResponse;
import com.pulumi.azurenative.security.outputs.InformationProtectionAwsOfferingResponse;
import com.pulumi.azurenative.security.outputs.SecurityConnectorPropertiesResponseOrganizationalData;
import com.pulumi.azurenative.security.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The security connector resource.
 * API Version: 2021-07-01-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:security:SecurityConnector exampleSecurityConnectorName /subscriptions/a5caac9c-5c04-49af-b3d0-e204f40345d5/resourceGroups/exampleResourceGroup/providers/Microsoft.Security/securityConnectors/exampleSecurityConnectorName 
 * ```
 * 
 */
@ResourceType(type="azure-native:security:SecurityConnector")
public class SecurityConnector extends com.pulumi.resources.CustomResource {
    /**
     * The multi cloud resource&#39;s cloud name.
     * 
     */
    @Export(name="cloudName", type=String.class, parameters={})
    private Output</* @Nullable */ String> cloudName;

    /**
     * @return The multi cloud resource&#39;s cloud name.
     * 
     */
    public Output<Optional<String>> cloudName() {
        return Codegen.optional(this.cloudName);
    }
    /**
     * Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output</* @Nullable */ String> etag;

    /**
     * @return Entity tag is used for comparing two or more entities from the same requested resource.
     * 
     */
    public Output<Optional<String>> etag() {
        return Codegen.optional(this.etag);
    }
    /**
     * The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    @Export(name="hierarchyIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> hierarchyIdentifier;

    /**
     * @return The multi cloud resource identifier (account id in case of AWS connector).
     * 
     */
    public Output<Optional<String>> hierarchyIdentifier() {
        return Codegen.optional(this.hierarchyIdentifier);
    }
    /**
     * Kind of the resource
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind of the resource
     * 
     */
    public Output<Optional<String>> kind() {
        return Codegen.optional(this.kind);
    }
    /**
     * Location where the resource is stored
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location where the resource is stored
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
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
     * A collection of offerings for the security connector.
     * 
     */
    @Export(name="offerings", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> offerings;

    /**
     * @return A collection of offerings for the security connector.
     * 
     */
    public Output<Optional<List<Object>>> offerings() {
        return Codegen.optional(this.offerings);
    }
    /**
     * The multi cloud account&#39;s organizational data
     * 
     */
    @Export(name="organizationalData", type=SecurityConnectorPropertiesResponseOrganizationalData.class, parameters={})
    private Output</* @Nullable */ SecurityConnectorPropertiesResponseOrganizationalData> organizationalData;

    /**
     * @return The multi cloud account&#39;s organizational data
     * 
     */
    public Output<Optional<SecurityConnectorPropertiesResponseOrganizationalData>> organizationalData() {
        return Codegen.optional(this.organizationalData);
    }
    /**
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * A list of key value pairs that describe the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A list of key value pairs that describe the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
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
    public SecurityConnector(String name) {
        this(name, SecurityConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityConnector(String name, SecurityConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityConnector(String name, SecurityConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:SecurityConnector", name, args == null ? SecurityConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityConnector(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:security:SecurityConnector", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:security/v20210701preview:SecurityConnector").build()),
                Output.of(Alias.builder().type("azure-native:security/v20211201preview:SecurityConnector").build())
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
    public static SecurityConnector get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityConnector(name, id, options);
    }
}
