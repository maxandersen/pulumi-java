// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.scvmm;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.scvmm.VmmServerArgs;
import com.pulumi.azurenative.scvmm.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.scvmm.outputs.SystemDataResponse;
import com.pulumi.azurenative.scvmm.outputs.VMMServerPropertiesResponseCredentials;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The VmmServers resource definition.
 * API Version: 2020-06-05-preview.
 * 
 * ## Example Usage
 * ### CreateVMMServer
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var vmmServer = new VmmServer(&#34;vmmServer&#34;, VmmServerArgs.builder()        
 *             .credentials(Map.ofEntries(
 *                 Map.entry(&#34;password&#34;, &#34;password&#34;),
 *                 Map.entry(&#34;username&#34;, &#34;testuser&#34;)
 *             ))
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;/subscriptions/a5015e1c-867f-4533-8541-85cd470d0cfb/resourceGroups/demoRG/providers/Microsoft.Arc/customLocations/contoso&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;customLocation&#34;)
 *             ))
 *             .fqdn(&#34;VMM.contoso.com&#34;)
 *             .location(&#34;East US&#34;)
 *             .port(1234)
 *             .resourceGroupName(&#34;testrg&#34;)
 *             .vmmServerName(&#34;ContosoVMMServer&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:scvmm:VmmServer ContosoVMMServer /subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.SCVMM/VMMServers/ContosoVMMServer 
 * ```
 * 
 */
@ResourceType(type="azure-native:scvmm:VmmServer")
public class VmmServer extends com.pulumi.resources.CustomResource {
    /**
     * Gets or sets the connection status to the vmmServer.
     * 
     */
    @Export(name="connectionStatus", type=String.class, parameters={})
    private Output<String> connectionStatus;

    /**
     * @return Gets or sets the connection status to the vmmServer.
     * 
     */
    public Output<String> connectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Credentials to connect to VMMServer.
     * 
     */
    @Export(name="credentials", type=VMMServerPropertiesResponseCredentials.class, parameters={})
    private Output</* @Nullable */ VMMServerPropertiesResponseCredentials> credentials;

    /**
     * @return Credentials to connect to VMMServer.
     * 
     */
    public Output<Optional<VMMServerPropertiesResponseCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    /**
     * Gets or sets any error message if connection to vmmServer is having any issue.
     * 
     */
    @Export(name="errorMessage", type=String.class, parameters={})
    private Output<String> errorMessage;

    /**
     * @return Gets or sets any error message if connection to vmmServer is having any issue.
     * 
     */
    public Output<String> errorMessage() {
        return this.errorMessage;
    }
    /**
     * The extended location.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output<ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location.
     * 
     */
    public Output<ExtendedLocationResponse> extendedLocation() {
        return this.extendedLocation;
    }
    /**
     * Fqdn is the hostname/ip of the vmmServer.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return Fqdn is the hostname/ip of the vmmServer.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * Gets or sets the location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Gets or sets the location.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource Name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource Name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Port is the port on which the vmmServer is listening.
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return Port is the port on which the vmmServer is listening.
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * Gets or sets the provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Gets or sets the provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The system data.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system data.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource Type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource Type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Unique ID of vmmServer.
     * 
     */
    @Export(name="uuid", type=String.class, parameters={})
    private Output<String> uuid;

    /**
     * @return Unique ID of vmmServer.
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }
    /**
     * Version is the version of the vmmSever.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return Version is the version of the vmmSever.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VmmServer(String name) {
        this(name, VmmServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VmmServer(String name, VmmServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VmmServer(String name, VmmServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:VmmServer", name, args == null ? VmmServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VmmServer(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:scvmm:VmmServer", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:scvmm/v20200605preview:VmmServer").build())
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
    public static VmmServer get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VmmServer(name, id, options);
    }
}
