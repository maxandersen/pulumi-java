// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentAccepterArgs extends com.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringAttachmentAccepterArgs Empty = new TransitGatewayPeeringAttachmentAccepterArgs();

    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    @Import(name="transitGatewayAttachmentId", required=true)
    private Output<String> transitGatewayAttachmentId;

    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    private TransitGatewayPeeringAttachmentAccepterArgs() {}

    private TransitGatewayPeeringAttachmentAccepterArgs(TransitGatewayPeeringAttachmentAccepterArgs $) {
        this.tags = $.tags;
        this.transitGatewayAttachmentId = $.transitGatewayAttachmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransitGatewayPeeringAttachmentAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransitGatewayPeeringAttachmentAccepterArgs $;

        public Builder() {
            $ = new TransitGatewayPeeringAttachmentAccepterArgs();
        }

        public Builder(TransitGatewayPeeringAttachmentAccepterArgs defaults) {
            $ = new TransitGatewayPeeringAttachmentAccepterArgs(Objects.requireNonNull(defaults));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder transitGatewayAttachmentId(Output<String> transitGatewayAttachmentId) {
            $.transitGatewayAttachmentId = transitGatewayAttachmentId;
            return this;
        }

        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            return transitGatewayAttachmentId(Output.of(transitGatewayAttachmentId));
        }

        public TransitGatewayPeeringAttachmentAccepterArgs build() {
            $.transitGatewayAttachmentId = Objects.requireNonNull($.transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
            return $;
        }
    }

}
