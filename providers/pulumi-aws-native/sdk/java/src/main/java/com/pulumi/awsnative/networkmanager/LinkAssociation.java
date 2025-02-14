// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.networkmanager;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.networkmanager.LinkAssociationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The AWS::NetworkManager::LinkAssociation type associates a link to a device. The device and link must be in the same global network and the same site.
 * 
 */
@ResourceType(type="aws-native:networkmanager:LinkAssociation")
public class LinkAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the device
     * 
     */
    @Export(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the device
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ID of the link
     * 
     */
    @Export(name="linkId", type=String.class, parameters={})
    private Output<String> linkId;

    /**
     * @return The ID of the link
     * 
     */
    public Output<String> linkId() {
        return this.linkId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LinkAssociation(String name) {
        this(name, LinkAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LinkAssociation(String name, LinkAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LinkAssociation(String name, LinkAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:LinkAssociation", name, args == null ? LinkAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LinkAssociation(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:networkmanager:LinkAssociation", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static LinkAssociation get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LinkAssociation(name, id, options);
    }
}
