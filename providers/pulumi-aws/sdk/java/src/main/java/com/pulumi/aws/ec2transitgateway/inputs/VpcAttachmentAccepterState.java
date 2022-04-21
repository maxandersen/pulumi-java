// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcAttachmentAccepterState extends com.pulumi.resources.ResourceArgs {

    public static final VpcAttachmentAccepterState Empty = new VpcAttachmentAccepterState();

    /**
     * Whether Appliance Mode support is enabled. Valid values: `disable`, `enable`.
     * 
     */
    @Import(name="applianceModeSupport")
    private @Nullable Output<String> applianceModeSupport;

    public Optional<Output<String>> applianceModeSupport() {
        return Optional.ofNullable(this.applianceModeSupport);
    }

    /**
     * Whether DNS support is enabled. Valid values: `disable`, `enable`.
     * 
     */
    @Import(name="dnsSupport")
    private @Nullable Output<String> dnsSupport;

    public Optional<Output<String>> dnsSupport() {
        return Optional.ofNullable(this.dnsSupport);
    }

    /**
     * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
     * 
     */
    @Import(name="ipv6Support")
    private @Nullable Output<String> ipv6Support;

    public Optional<Output<String>> ipv6Support() {
        return Optional.ofNullable(this.ipv6Support);
    }

    /**
     * Identifiers of EC2 Subnets.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * Key-value tags for the EC2 Transit Gateway VPC Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The ID of the EC2 Transit Gateway Attachment to manage.
     * 
     */
    @Import(name="transitGatewayAttachmentId")
    private @Nullable Output<String> transitGatewayAttachmentId;

    public Optional<Output<String>> transitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }

    /**
     * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTableAssociation")
    private @Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation;

    public Optional<Output<Boolean>> transitGatewayDefaultRouteTableAssociation() {
        return Optional.ofNullable(this.transitGatewayDefaultRouteTableAssociation);
    }

    /**
     * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
     * 
     */
    @Import(name="transitGatewayDefaultRouteTablePropagation")
    private @Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation;

    public Optional<Output<Boolean>> transitGatewayDefaultRouteTablePropagation() {
        return Optional.ofNullable(this.transitGatewayDefaultRouteTablePropagation);
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
    private @Nullable Output<String> transitGatewayId;

    public Optional<Output<String>> transitGatewayId() {
        return Optional.ofNullable(this.transitGatewayId);
    }

    /**
     * Identifier of EC2 VPC.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    /**
     * Identifier of the AWS account that owns the EC2 VPC.
     * 
     */
    @Import(name="vpcOwnerId")
    private @Nullable Output<String> vpcOwnerId;

    public Optional<Output<String>> vpcOwnerId() {
        return Optional.ofNullable(this.vpcOwnerId);
    }

    private VpcAttachmentAccepterState() {}

    private VpcAttachmentAccepterState(VpcAttachmentAccepterState $) {
        this.applianceModeSupport = $.applianceModeSupport;
        this.dnsSupport = $.dnsSupport;
        this.ipv6Support = $.ipv6Support;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.transitGatewayAttachmentId = $.transitGatewayAttachmentId;
        this.transitGatewayDefaultRouteTableAssociation = $.transitGatewayDefaultRouteTableAssociation;
        this.transitGatewayDefaultRouteTablePropagation = $.transitGatewayDefaultRouteTablePropagation;
        this.transitGatewayId = $.transitGatewayId;
        this.vpcId = $.vpcId;
        this.vpcOwnerId = $.vpcOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcAttachmentAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcAttachmentAccepterState $;

        public Builder() {
            $ = new VpcAttachmentAccepterState();
        }

        public Builder(VpcAttachmentAccepterState defaults) {
            $ = new VpcAttachmentAccepterState(Objects.requireNonNull(defaults));
        }

        public Builder applianceModeSupport(@Nullable Output<String> applianceModeSupport) {
            $.applianceModeSupport = applianceModeSupport;
            return this;
        }

        public Builder applianceModeSupport(String applianceModeSupport) {
            return applianceModeSupport(Output.of(applianceModeSupport));
        }

        public Builder dnsSupport(@Nullable Output<String> dnsSupport) {
            $.dnsSupport = dnsSupport;
            return this;
        }

        public Builder dnsSupport(String dnsSupport) {
            return dnsSupport(Output.of(dnsSupport));
        }

        public Builder ipv6Support(@Nullable Output<String> ipv6Support) {
            $.ipv6Support = ipv6Support;
            return this;
        }

        public Builder ipv6Support(String ipv6Support) {
            return ipv6Support(Output.of(ipv6Support));
        }

        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder transitGatewayAttachmentId(@Nullable Output<String> transitGatewayAttachmentId) {
            $.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            return transitGatewayAttachmentId(Output.of(transitGatewayAttachmentId));
        }

        public Builder transitGatewayDefaultRouteTableAssociation(@Nullable Output<Boolean> transitGatewayDefaultRouteTableAssociation) {
            $.transitGatewayDefaultRouteTableAssociation = transitGatewayDefaultRouteTableAssociation;
            return this;
        }

        public Builder transitGatewayDefaultRouteTableAssociation(Boolean transitGatewayDefaultRouteTableAssociation) {
            return transitGatewayDefaultRouteTableAssociation(Output.of(transitGatewayDefaultRouteTableAssociation));
        }

        public Builder transitGatewayDefaultRouteTablePropagation(@Nullable Output<Boolean> transitGatewayDefaultRouteTablePropagation) {
            $.transitGatewayDefaultRouteTablePropagation = transitGatewayDefaultRouteTablePropagation;
            return this;
        }

        public Builder transitGatewayDefaultRouteTablePropagation(Boolean transitGatewayDefaultRouteTablePropagation) {
            return transitGatewayDefaultRouteTablePropagation(Output.of(transitGatewayDefaultRouteTablePropagation));
        }

        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            $.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder transitGatewayId(String transitGatewayId) {
            return transitGatewayId(Output.of(transitGatewayId));
        }

        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public Builder vpcOwnerId(@Nullable Output<String> vpcOwnerId) {
            $.vpcOwnerId = vpcOwnerId;
            return this;
        }

        public Builder vpcOwnerId(String vpcOwnerId) {
            return vpcOwnerId(Output.of(vpcOwnerId));
        }

        public VpcAttachmentAccepterState build() {
            return $;
        }
    }

}
