// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpnGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnGatewayArgs Empty = new VpnGatewayArgs();

    /**
     * The Autonomous System Number (ASN) for the Amazon side of the gateway. If you don't specify an ASN, the virtual private gateway is created with the default ASN.
     * 
     */
    @Import(name="amazonSideAsn")
      private final @Nullable Output<String> amazonSideAsn;

    public Output<String> amazonSideAsn() {
        return this.amazonSideAsn == null ? Codegen.empty() : this.amazonSideAsn;
    }

    /**
     * The Availability Zone for the virtual private gateway.
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> availabilityZone() {
        return this.availabilityZone == null ? Codegen.empty() : this.availabilityZone;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The VPC ID to create in.
     * 
     */
    @Import(name="vpcId")
      private final @Nullable Output<String> vpcId;

    public Output<String> vpcId() {
        return this.vpcId == null ? Codegen.empty() : this.vpcId;
    }

    public VpnGatewayArgs(
        @Nullable Output<String> amazonSideAsn,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vpcId) {
        this.amazonSideAsn = amazonSideAsn;
        this.availabilityZone = availabilityZone;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    private VpnGatewayArgs() {
        this.amazonSideAsn = Codegen.empty();
        this.availabilityZone = Codegen.empty();
        this.tags = Codegen.empty();
        this.vpcId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> amazonSideAsn;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder amazonSideAsn(@Nullable Output<String> amazonSideAsn) {
            this.amazonSideAsn = amazonSideAsn;
            return this;
        }
        public Builder amazonSideAsn(@Nullable String amazonSideAsn) {
            this.amazonSideAsn = Codegen.ofNullable(amazonSideAsn);
            return this;
        }
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Codegen.ofNullable(availabilityZone);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vpcId(@Nullable Output<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = Codegen.ofNullable(vpcId);
            return this;
        }        public VpnGatewayArgs build() {
            return new VpnGatewayArgs(amazonSideAsn, availabilityZone, tags, vpcId);
        }
    }
}
