// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.orbital.ContactProfileArgs;
import com.pulumi.azurenative.orbital.outputs.ContactProfileLinkResponse;
import com.pulumi.azurenative.orbital.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Customer creates a Contact Profile Resource, which will contain all of the configurations required for scheduling a contact.
 * API Version: 2021-04-04-preview.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:orbital:ContactProfile contactProfile1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Orbital/contactProfiles/contactProfile1 
 * ```
 * 
 */
@ResourceType(type="azure-native:orbital:ContactProfile")
public class ContactProfile extends CustomResource {
    /**
     * Auto track configuration.
     * 
     */
    @Export(name="autoTrackingConfiguration", type=String.class, parameters={})
    private Output</* @Nullable */ String> autoTrackingConfiguration;

    /**
     * @return Auto track configuration.
     * 
     */
    public Output<Optional<String>> autoTrackingConfiguration() {
        return Codegen.optional(this.autoTrackingConfiguration);
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
     * The URI of the Event Hub used for telemetry
     * 
     */
    @Export(name="eventHubUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> eventHubUri;

    /**
     * @return The URI of the Event Hub used for telemetry
     * 
     */
    public Output<Optional<String>> eventHubUri() {
        return Codegen.optional(this.eventHubUri);
    }
    /**
     * Links of the Contact Profile
     * 
     */
    @Export(name="links", type=List.class, parameters={ContactProfileLinkResponse.class})
    private Output<List<ContactProfileLinkResponse>> links;

    /**
     * @return Links of the Contact Profile
     * 
     */
    public Output<List<ContactProfileLinkResponse>> links() {
        return this.links;
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
     * Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    @Export(name="minimumElevationDegrees", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> minimumElevationDegrees;

    /**
     * @return Minimum viable elevation for the contact in decimal degrees.
     * 
     */
    public Output<Optional<Double>> minimumElevationDegrees() {
        return Codegen.optional(this.minimumElevationDegrees);
    }
    /**
     * Minimum viable contact duration in ISO 8601 format.
     * 
     */
    @Export(name="minimumViableContactDuration", type=String.class, parameters={})
    private Output</* @Nullable */ String> minimumViableContactDuration;

    /**
     * @return Minimum viable contact duration in ISO 8601 format.
     * 
     */
    public Output<Optional<String>> minimumViableContactDuration() {
        return Codegen.optional(this.minimumViableContactDuration);
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
    public ContactProfile(String name) {
        this(name, ContactProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactProfile(String name, ContactProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactProfile(String name, ContactProfileArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:orbital:ContactProfile", name, args == null ? ContactProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactProfile(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:orbital:ContactProfile", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:orbital/v20210404preview:ContactProfile").build())
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
    public static ContactProfile get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new ContactProfile(name, id, options);
    }
}
