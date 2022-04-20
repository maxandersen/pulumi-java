// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.DefaultSubnetArgs;
import com.pulumi.aws.ec2.inputs.DefaultSubnetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a [default AWS VPC subnet](http://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/default-vpc.html#default-vpc-basics) in the current region.
 * 
 * The `aws.ec2.DefaultSubnet` behaves differently from normal resources, in that this provider does not _create_ this resource but instead &#34;adopts&#34; it into management.
 * 
 * The `aws.ec2.DefaultSubnet` resource allows you to manage a region&#39;s default VPC subnet but this provider cannot destroy it. Removing this resource from your configuration will remove it from your statefile and the provider management.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Subnets can be imported using the `subnet id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:ec2/defaultSubnet:DefaultSubnet public_subnet subnet-9d4a7b6c
 * ```
 * 
 */
@ResourceType(type="aws:ec2/defaultSubnet:DefaultSubnet")
public class DefaultSubnet extends com.pulumi.resources.CustomResource {
    /**
     * ARN for the subnet.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN for the subnet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    @Export(name="assignIpv6AddressOnCreation", type=Boolean.class, parameters={})
    private Output<Boolean> assignIpv6AddressOnCreation;

    /**
     * @return Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    public Output<Boolean> assignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    /**
     * AZ for the subnet.
     * 
     */
    @Export(name="availabilityZone", type=String.class, parameters={})
    private Output<String> availabilityZone;

    /**
     * @return AZ for the subnet.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    @Export(name="availabilityZoneId", type=String.class, parameters={})
    private Output<String> availabilityZoneId;

    public Output<String> availabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * CIDR block for the subnet.
     * 
     */
    @Export(name="cidrBlock", type=String.class, parameters={})
    private Output<String> cidrBlock;

    /**
     * @return CIDR block for the subnet.
     * 
     */
    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }
    @Export(name="customerOwnedIpv4Pool", type=String.class, parameters={})
    private Output</* @Nullable */ String> customerOwnedIpv4Pool;

    public Output</* @Nullable */ String> customerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    @Export(name="enableDns64", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableDns64;

    public Output</* @Nullable */ Boolean> enableDns64() {
        return this.enableDns64;
    }
    @Export(name="enableResourceNameDnsARecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsARecordOnLaunch;

    public Output</* @Nullable */ Boolean> enableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }
    @Export(name="enableResourceNameDnsAaaaRecordOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Output</* @Nullable */ Boolean> enableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch;
    }
    /**
     * IPv6 CIDR block.
     * 
     */
    @Export(name="ipv6CidrBlock", type=String.class, parameters={})
    private Output<String> ipv6CidrBlock;

    /**
     * @return IPv6 CIDR block.
     * 
     */
    public Output<String> ipv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    @Export(name="ipv6CidrBlockAssociationId", type=String.class, parameters={})
    private Output<String> ipv6CidrBlockAssociationId;

    public Output<String> ipv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId;
    }
    @Export(name="ipv6Native", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> ipv6Native;

    public Output</* @Nullable */ Boolean> ipv6Native() {
        return this.ipv6Native;
    }
    @Export(name="mapCustomerOwnedIpOnLaunch", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> mapCustomerOwnedIpOnLaunch;

    public Output</* @Nullable */ Boolean> mapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }
    /**
     * Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    @Export(name="mapPublicIpOnLaunch", type=Boolean.class, parameters={})
    private Output<Boolean> mapPublicIpOnLaunch;

    /**
     * @return Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    public Output<Boolean> mapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    @Export(name="outpostArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> outpostArn;

    public Output</* @Nullable */ String> outpostArn() {
        return this.outpostArn;
    }
    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns the subnet.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    @Export(name="privateDnsHostnameTypeOnLaunch", type=String.class, parameters={})
    private Output<String> privateDnsHostnameTypeOnLaunch;

    public Output<String> privateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
    }
    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * VPC ID.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return VPC ID.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DefaultSubnet(String name) {
        this(name, DefaultSubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DefaultSubnet(String name, DefaultSubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DefaultSubnet(String name, DefaultSubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSubnet:DefaultSubnet", name, args == null ? DefaultSubnetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DefaultSubnet(String name, Output<String> id, @Nullable DefaultSubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/defaultSubnet:DefaultSubnet", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DefaultSubnet get(String name, Output<String> id, @Nullable DefaultSubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DefaultSubnet(name, id, state, options);
    }
}
