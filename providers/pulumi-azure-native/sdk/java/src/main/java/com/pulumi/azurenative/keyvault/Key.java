// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.keyvault.KeyArgs;
import com.pulumi.azurenative.keyvault.outputs.KeyAttributesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The key resource.
 * API Version: 2019-09-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:keyvault:Key sample-key-name /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/sample-group/providers/Microsoft.KeyVault/vaults/sample-vault-name/keys/sample-key-name 
 * ```
 * 
 */
@ResourceType(type="azure-native:keyvault:Key")
public class Key extends CustomResource {
    /**
     * The attributes of the key.
     * 
     */
    @Export(name="attributes", type=KeyAttributesResponse.class, parameters={})
    private Output</* @Nullable */ KeyAttributesResponse> attributes;

    /**
     * @return The attributes of the key.
     * 
     */
    public Output<Optional<KeyAttributesResponse>> attributes() {
        return Codegen.optional(this.attributes);
    }
    /**
     * The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    @Export(name="curveName", type=String.class, parameters={})
    private Output</* @Nullable */ String> curveName;

    /**
     * @return The elliptic curve name. For valid values, see JsonWebKeyCurveName.
     * 
     */
    public Output<Optional<String>> curveName() {
        return Codegen.optional(this.curveName);
    }
    @Export(name="keyOps", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> keyOps;

    public Output<Optional<List<String>>> keyOps() {
        return Codegen.optional(this.keyOps);
    }
    /**
     * The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    @Export(name="keySize", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> keySize;

    /**
     * @return The key size in bits. For example: 2048, 3072, or 4096 for RSA.
     * 
     */
    public Output<Optional<Integer>> keySize() {
        return Codegen.optional(this.keySize);
    }
    /**
     * The URI to retrieve the current version of the key.
     * 
     */
    @Export(name="keyUri", type=String.class, parameters={})
    private Output<String> keyUri;

    /**
     * @return The URI to retrieve the current version of the key.
     * 
     */
    public Output<String> keyUri() {
        return this.keyUri;
    }
    /**
     * The URI to retrieve the specific version of the key.
     * 
     */
    @Export(name="keyUriWithVersion", type=String.class, parameters={})
    private Output<String> keyUriWithVersion;

    /**
     * @return The URI to retrieve the specific version of the key.
     * 
     */
    public Output<String> keyUriWithVersion() {
        return this.keyUriWithVersion;
    }
    /**
     * The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    @Export(name="kty", type=String.class, parameters={})
    private Output</* @Nullable */ String> kty;

    /**
     * @return The type of the key. For valid values, see JsonWebKeyType.
     * 
     */
    public Output<Optional<String>> kty() {
        return Codegen.optional(this.kty);
    }
    /**
     * Azure location of the key vault resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Azure location of the key vault resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Name of the key vault resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the key vault resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tags assigned to the key vault resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tags;

    /**
     * @return Tags assigned to the key vault resource.
     * 
     */
    public Output<Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * Resource type of the key vault resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type of the key vault resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, KeyArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:keyvault:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:keyvault:Key", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:keyvault/v20190901:Key").build()),
                Output.of(Alias.builder().type("azure-native:keyvault/v20200401preview:Key").build()),
                Output.of(Alias.builder().type("azure-native:keyvault/v20210401preview:Key").build()),
                Output.of(Alias.builder().type("azure-native:keyvault/v20210601preview:Key").build()),
                Output.of(Alias.builder().type("azure-native:keyvault/v20211001:Key").build()),
                Output.of(Alias.builder().type("azure-native:keyvault/v20211101preview:Key").build())
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
    public static Key get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Key(name, id, options);
    }
}
