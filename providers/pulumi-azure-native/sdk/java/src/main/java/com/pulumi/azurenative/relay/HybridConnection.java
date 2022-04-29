// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.relay;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.relay.HybridConnectionArgs;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Description of hybrid connection resource.
 * API Version: 2017-04-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:relay:HybridConnection example-Relay-Hybrid-01 /subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/resourcegroup/providers/Microsoft.Relay/namespaces/example-RelayNamespace-01/HybridConnections/example-Relay-Hybrid-01 
 * ```
 * 
 */
@ResourceType(type="azure-native:relay:HybridConnection")
public class HybridConnection extends CustomResource {
    /**
     * The time the hybrid connection was created.
     * 
     */
    @Export(name="createdAt", type=String.class, parameters={})
    private Output<String> createdAt;

    /**
     * @return The time the hybrid connection was created.
     * 
     */
    public Output<String> createdAt() {
        return this.createdAt;
    }
    /**
     * The number of listeners for this hybrid connection. Note that min : 1 and max:25 are supported.
     * 
     */
    @Export(name="listenerCount", type=Integer.class, parameters={})
    private Output<Integer> listenerCount;

    /**
     * @return The number of listeners for this hybrid connection. Note that min : 1 and max:25 are supported.
     * 
     */
    public Output<Integer> listenerCount() {
        return this.listenerCount;
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
     * Returns true if client authorization is needed for this hybrid connection; otherwise, false.
     * 
     */
    @Export(name="requiresClientAuthorization", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> requiresClientAuthorization;

    /**
     * @return Returns true if client authorization is needed for this hybrid connection; otherwise, false.
     * 
     */
    public Output<Optional<Boolean>> requiresClientAuthorization() {
        return Codegen.optional(this.requiresClientAuthorization);
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
     * The time the namespace was updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The time the namespace was updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }
    /**
     * The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    @Export(name="userMetadata", type=String.class, parameters={})
    private Output</* @Nullable */ String> userMetadata;

    /**
     * @return The usermetadata is a placeholder to store user-defined string data for the hybrid connection endpoint. For example, it can be used to store descriptive data, such as a list of teams and their contact information. Also, user-defined configuration settings can be stored.
     * 
     */
    public Output<Optional<String>> userMetadata() {
        return Codegen.optional(this.userMetadata);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HybridConnection(String name) {
        this(name, HybridConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HybridConnection(String name, HybridConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HybridConnection(String name, HybridConnectionArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:relay:HybridConnection", name, args == null ? HybridConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HybridConnection(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:relay:HybridConnection", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:relay/v20160701:HybridConnection").build()),
                Output.of(Alias.builder().type("azure-native:relay/v20170401:HybridConnection").build())
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
    public static HybridConnection get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new HybridConnection(name, id, options);
    }
}
