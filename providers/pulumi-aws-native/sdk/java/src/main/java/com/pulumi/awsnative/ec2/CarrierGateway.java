// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.ec2.CarrierGatewayArgs;
import com.pulumi.awsnative.ec2.outputs.CarrierGatewayTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 */
@ResourceType(type="aws-native:ec2:CarrierGateway")
public class CarrierGateway extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the carrier gateway.
     * 
     */
    @Export(name="carrierGatewayId", type=String.class, parameters={})
    private Output<String> carrierGatewayId;

    /**
     * @return The ID of the carrier gateway.
     * 
     */
    public Output<String> carrierGatewayId() {
        return this.carrierGatewayId;
    }
    /**
     * The ID of the owner.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return The ID of the owner.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The state of the carrier gateway.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the carrier gateway.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The tags for the carrier gateway.
     * 
     */
    @Export(name="tags", type=List.class, parameters={CarrierGatewayTag.class})
    private Output</* @Nullable */ List<CarrierGatewayTag>> tags;

    /**
     * @return The tags for the carrier gateway.
     * 
     */
    public Output</* @Nullable */ List<CarrierGatewayTag>> tags() {
        return this.tags;
    }
    /**
     * The ID of the VPC.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CarrierGateway(String name) {
        this(name, CarrierGatewayArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CarrierGateway(String name, CarrierGatewayArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CarrierGateway", name, args == null ? CarrierGatewayArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CarrierGateway(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:CarrierGateway", name, null, makeResourceOptions(options, id));
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
    public static CarrierGateway get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CarrierGateway(name, id, options);
    }
}
