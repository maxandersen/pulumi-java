// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.orbital.SpacecraftArgs;
import com.pulumi.azurenative.orbital.outputs.SpacecraftLinkResponse;
import com.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Customer creates a spacecraft resource to schedule a contact.
 * API Version: 2021-04-04-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:orbital:Spacecraft AQUA /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Orbital/spacecrafts/AQUA 
 * ```
 * 
 */
@ResourceType(type="azure-native:orbital:Spacecraft")
public class Spacecraft extends com.pulumi.resources.CustomResource {
    /**
     * Authorization status of spacecraft.
     * 
     */
    @Export(name="authorizationStatus", type=String.class, parameters={})
    private Output<String> authorizationStatus;

    /**
     * @return Authorization status of spacecraft.
     * 
     */
    public Output<String> authorizationStatus() {
        return this.authorizationStatus;
    }
    /**
     * Details of the authorization status.
     * 
     */
    @Export(name="authorizationStatusExtended", type=String.class, parameters={})
    private Output<String> authorizationStatusExtended;

    /**
     * @return Details of the authorization status.
     * 
     */
    public Output<String> authorizationStatusExtended() {
        return this.authorizationStatusExtended;
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Links of the Spacecraft
     * 
     */
    @Export(name="links", type=List.class, parameters={SpacecraftLinkResponse.class})
    private Output</* @Nullable */ List<SpacecraftLinkResponse>> links;

    /**
     * @return Links of the Spacecraft
     * 
     */
    public Output<Optional<List<SpacecraftLinkResponse>>> links() {
        return Codegen.optional(this.links);
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
     * NORAD ID of the spacecraft.
     * 
     */
    @Export(name="noradId", type=String.class, parameters={})
    private Output<String> noradId;

    /**
     * @return NORAD ID of the spacecraft.
     * 
     */
    public Output<String> noradId() {
        return this.noradId;
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
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Title line of Two Line Element (TLE).
     * 
     */
    @Export(name="titleLine", type=String.class, parameters={})
    private Output</* @Nullable */ String> titleLine;

    /**
     * @return Title line of Two Line Element (TLE).
     * 
     */
    public Output<Optional<String>> titleLine() {
        return Codegen.optional(this.titleLine);
    }
    /**
     * Line 1 of Two Line Element (TLE).
     * 
     */
    @Export(name="tleLine1", type=String.class, parameters={})
    private Output</* @Nullable */ String> tleLine1;

    /**
     * @return Line 1 of Two Line Element (TLE).
     * 
     */
    public Output<Optional<String>> tleLine1() {
        return Codegen.optional(this.tleLine1);
    }
    /**
     * Line 2 of Two Line Element (TLE).
     * 
     */
    @Export(name="tleLine2", type=String.class, parameters={})
    private Output</* @Nullable */ String> tleLine2;

    /**
     * @return Line 2 of Two Line Element (TLE).
     * 
     */
    public Output<Optional<String>> tleLine2() {
        return Codegen.optional(this.tleLine2);
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Spacecraft(String name) {
        this(name, SpacecraftArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Spacecraft(String name, SpacecraftArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Spacecraft(String name, SpacecraftArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Spacecraft", name, args == null ? SpacecraftArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Spacecraft(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:orbital:Spacecraft", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:orbital/v20210404preview:Spacecraft").build())
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
    public static Spacecraft get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Spacecraft(name, id, options);
    }
}
