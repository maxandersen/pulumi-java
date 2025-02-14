// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.TransitGatewayPeeringAttachmentArgs;
import com.pulumi.awsnative.ec2.outputs.TransitGatewayPeeringAttachmentPeeringAttachmentStatus;
import com.pulumi.awsnative.ec2.outputs.TransitGatewayPeeringAttachmentTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The AWS::EC2::TransitGatewayPeeringAttachment type
 * 
 */
@ResourceType(type="aws-native:ec2:TransitGatewayPeeringAttachment")
public class TransitGatewayPeeringAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The time the transit gateway peering attachment was created.
     * 
     */
    @Export(name="creationTime", type=String.class, parameters={})
    private Output<String> creationTime;

    /**
     * @return The time the transit gateway peering attachment was created.
     * 
     */
    public Output<String> creationTime() {
        return this.creationTime;
    }
    /**
     * The ID of the peer account
     * 
     */
    @Export(name="peerAccountId", type=String.class, parameters={})
    private Output<String> peerAccountId;

    /**
     * @return The ID of the peer account
     * 
     */
    public Output<String> peerAccountId() {
        return this.peerAccountId;
    }
    /**
     * Peer Region
     * 
     */
    @Export(name="peerRegion", type=String.class, parameters={})
    private Output<String> peerRegion;

    /**
     * @return Peer Region
     * 
     */
    public Output<String> peerRegion() {
        return this.peerRegion;
    }
    /**
     * The ID of the peer transit gateway.
     * 
     */
    @Export(name="peerTransitGatewayId", type=String.class, parameters={})
    private Output<String> peerTransitGatewayId;

    /**
     * @return The ID of the peer transit gateway.
     * 
     */
    public Output<String> peerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }
    /**
     * The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The status of the transit gateway peering attachment.
     * 
     */
    @Export(name="status", type=TransitGatewayPeeringAttachmentPeeringAttachmentStatus.class, parameters={})
    private Output<TransitGatewayPeeringAttachmentPeeringAttachmentStatus> status;

    /**
     * @return The status of the transit gateway peering attachment.
     * 
     */
    public Output<TransitGatewayPeeringAttachmentPeeringAttachmentStatus> status() {
        return this.status;
    }
    /**
     * The tags for the transit gateway peering attachment.
     * 
     */
    @Export(name="tags", type=List.class, parameters={TransitGatewayPeeringAttachmentTag.class})
    private Output</* @Nullable */ List<TransitGatewayPeeringAttachmentTag>> tags;

    /**
     * @return The tags for the transit gateway peering attachment.
     * 
     */
    public Output<Optional<List<TransitGatewayPeeringAttachmentTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The ID of the transit gateway peering attachment.
     * 
     */
    @Export(name="transitGatewayAttachmentId", type=String.class, parameters={})
    private Output<String> transitGatewayAttachmentId;

    /**
     * @return The ID of the transit gateway peering attachment.
     * 
     */
    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }
    /**
     * The ID of the transit gateway.
     * 
     */
    @Export(name="transitGatewayId", type=String.class, parameters={})
    private Output<String> transitGatewayId;

    /**
     * @return The ID of the transit gateway.
     * 
     */
    public Output<String> transitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TransitGatewayPeeringAttachment(String name) {
        this(name, TransitGatewayPeeringAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TransitGatewayPeeringAttachment(String name, TransitGatewayPeeringAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TransitGatewayPeeringAttachment(String name, TransitGatewayPeeringAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayPeeringAttachment", name, args == null ? TransitGatewayPeeringAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TransitGatewayPeeringAttachment(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:TransitGatewayPeeringAttachment", name, null, makeResourceOptions(options, id));
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
    public static TransitGatewayPeeringAttachment get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TransitGatewayPeeringAttachment(name, id, options);
    }
}
