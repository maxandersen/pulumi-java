// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RouteArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * Indicates whether to drop traffic that matches this route (default to `false`).
     * 
     */
    @Import(name="blackhole")
    private @Nullable Output<Boolean> blackhole;

    public Optional<Output<Boolean>> blackhole() {
        return Optional.ofNullable(this.blackhole);
    }

    /**
     * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
     * 
     */
    @Import(name="destinationCidrBlock", required=true)
    private Output<String> destinationCidrBlock;

    public Output<String> destinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
     * 
     */
    @Import(name="transitGatewayAttachmentId")
    private @Nullable Output<String> transitGatewayAttachmentId;

    public Optional<Output<String>> transitGatewayAttachmentId() {
        return Optional.ofNullable(this.transitGatewayAttachmentId);
    }

    /**
     * Identifier of EC2 Transit Gateway Route Table.
     * 
     */
    @Import(name="transitGatewayRouteTableId", required=true)
    private Output<String> transitGatewayRouteTableId;

    public Output<String> transitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    private RouteArgs() {}

    private RouteArgs(RouteArgs $) {
        this.blackhole = $.blackhole;
        this.destinationCidrBlock = $.destinationCidrBlock;
        this.transitGatewayAttachmentId = $.transitGatewayAttachmentId;
        this.transitGatewayRouteTableId = $.transitGatewayRouteTableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteArgs $;

        public Builder() {
            $ = new RouteArgs();
        }

        public Builder(RouteArgs defaults) {
            $ = new RouteArgs(Objects.requireNonNull(defaults));
        }

        public Builder blackhole(@Nullable Output<Boolean> blackhole) {
            $.blackhole = blackhole;
            return this;
        }

        public Builder blackhole(Boolean blackhole) {
            return blackhole(Output.of(blackhole));
        }

        public Builder destinationCidrBlock(Output<String> destinationCidrBlock) {
            $.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        public Builder destinationCidrBlock(String destinationCidrBlock) {
            return destinationCidrBlock(Output.of(destinationCidrBlock));
        }

        public Builder transitGatewayAttachmentId(@Nullable Output<String> transitGatewayAttachmentId) {
            $.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            return transitGatewayAttachmentId(Output.of(transitGatewayAttachmentId));
        }

        public Builder transitGatewayRouteTableId(Output<String> transitGatewayRouteTableId) {
            $.transitGatewayRouteTableId = transitGatewayRouteTableId;
            return this;
        }

        public Builder transitGatewayRouteTableId(String transitGatewayRouteTableId) {
            return transitGatewayRouteTableId(Output.of(transitGatewayRouteTableId));
        }

        public RouteArgs build() {
            $.destinationCidrBlock = Objects.requireNonNull($.destinationCidrBlock, "expected parameter 'destinationCidrBlock' to be non-null");
            $.transitGatewayRouteTableId = Objects.requireNonNull($.transitGatewayRouteTableId, "expected parameter 'transitGatewayRouteTableId' to be non-null");
            return $;
        }
    }

}
