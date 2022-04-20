// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect.outputs;

import com.pulumi.awsnative.mediaconnect.enums.FlowSourceProtocol;
import com.pulumi.awsnative.mediaconnect.outputs.FlowEncryption;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSource {
    /**
     * The type of decryption that is used on the content ingested from this source.
     * 
     */
    private final @Nullable FlowEncryption decryption;
    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
     */
    private final @Nullable String description;
    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
     * 
     */
    private final @Nullable String entitlementArn;
    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
     */
    private final @Nullable String ingestIp;
    /**
     * The port that the flow will be listening on for incoming content.
     * 
     */
    private final @Nullable Integer ingestPort;
    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
     */
    private final @Nullable Integer maxBitrate;
    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
     */
    private final @Nullable Integer maxLatency;
    /**
     * The minimum latency in milliseconds.
     * 
     */
    private final @Nullable Integer minLatency;
    /**
     * The name of the source.
     * 
     */
    private final @Nullable String name;
    /**
     * The protocol that is used by the source or output.
     * 
     */
    private final @Nullable FlowSourceProtocol protocol;
    /**
     * The ARN of the source.
     * 
     */
    private final @Nullable String sourceArn;
    /**
     * The port that the flow will be listening on for incoming content.(ReadOnly)
     * 
     */
    private final @Nullable String sourceIngestPort;
    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
     */
    private final @Nullable String streamId;
    /**
     * The name of the VPC Interface this Source is configured with.
     * 
     */
    private final @Nullable String vpcInterfaceName;
    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
     */
    private final @Nullable String whitelistCidr;

    @CustomType.Constructor
    private FlowSource(
        @CustomType.Parameter("decryption") @Nullable FlowEncryption decryption,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("entitlementArn") @Nullable String entitlementArn,
        @CustomType.Parameter("ingestIp") @Nullable String ingestIp,
        @CustomType.Parameter("ingestPort") @Nullable Integer ingestPort,
        @CustomType.Parameter("maxBitrate") @Nullable Integer maxBitrate,
        @CustomType.Parameter("maxLatency") @Nullable Integer maxLatency,
        @CustomType.Parameter("minLatency") @Nullable Integer minLatency,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("protocol") @Nullable FlowSourceProtocol protocol,
        @CustomType.Parameter("sourceArn") @Nullable String sourceArn,
        @CustomType.Parameter("sourceIngestPort") @Nullable String sourceIngestPort,
        @CustomType.Parameter("streamId") @Nullable String streamId,
        @CustomType.Parameter("vpcInterfaceName") @Nullable String vpcInterfaceName,
        @CustomType.Parameter("whitelistCidr") @Nullable String whitelistCidr) {
        this.decryption = decryption;
        this.description = description;
        this.entitlementArn = entitlementArn;
        this.ingestIp = ingestIp;
        this.ingestPort = ingestPort;
        this.maxBitrate = maxBitrate;
        this.maxLatency = maxLatency;
        this.minLatency = minLatency;
        this.name = name;
        this.protocol = protocol;
        this.sourceArn = sourceArn;
        this.sourceIngestPort = sourceIngestPort;
        this.streamId = streamId;
        this.vpcInterfaceName = vpcInterfaceName;
        this.whitelistCidr = whitelistCidr;
    }

    /**
     * The type of decryption that is used on the content ingested from this source.
     * 
    */
    public Optional<FlowEncryption> decryption() {
        return Optional.ofNullable(this.decryption);
    }
    /**
     * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator&#39;s flow.
     * 
    */
    public Optional<String> entitlementArn() {
        return Optional.ofNullable(this.entitlementArn);
    }
    /**
     * The IP address that the flow will be listening on for incoming content.
     * 
    */
    public Optional<String> ingestIp() {
        return Optional.ofNullable(this.ingestIp);
    }
    /**
     * The port that the flow will be listening on for incoming content.
     * 
    */
    public Optional<Integer> ingestPort() {
        return Optional.ofNullable(this.ingestPort);
    }
    /**
     * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
     * 
    */
    public Optional<Integer> maxBitrate() {
        return Optional.ofNullable(this.maxBitrate);
    }
    /**
     * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
     * 
    */
    public Optional<Integer> maxLatency() {
        return Optional.ofNullable(this.maxLatency);
    }
    /**
     * The minimum latency in milliseconds.
     * 
    */
    public Optional<Integer> minLatency() {
        return Optional.ofNullable(this.minLatency);
    }
    /**
     * The name of the source.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The protocol that is used by the source or output.
     * 
    */
    public Optional<FlowSourceProtocol> protocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * The ARN of the source.
     * 
    */
    public Optional<String> sourceArn() {
        return Optional.ofNullable(this.sourceArn);
    }
    /**
     * The port that the flow will be listening on for incoming content.(ReadOnly)
     * 
    */
    public Optional<String> sourceIngestPort() {
        return Optional.ofNullable(this.sourceIngestPort);
    }
    /**
     * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
     * 
    */
    public Optional<String> streamId() {
        return Optional.ofNullable(this.streamId);
    }
    /**
     * The name of the VPC Interface this Source is configured with.
     * 
    */
    public Optional<String> vpcInterfaceName() {
        return Optional.ofNullable(this.vpcInterfaceName);
    }
    /**
     * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
     * 
    */
    public Optional<String> whitelistCidr() {
        return Optional.ofNullable(this.whitelistCidr);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FlowEncryption decryption;
        private @Nullable String description;
        private @Nullable String entitlementArn;
        private @Nullable String ingestIp;
        private @Nullable Integer ingestPort;
        private @Nullable Integer maxBitrate;
        private @Nullable Integer maxLatency;
        private @Nullable Integer minLatency;
        private @Nullable String name;
        private @Nullable FlowSourceProtocol protocol;
        private @Nullable String sourceArn;
        private @Nullable String sourceIngestPort;
        private @Nullable String streamId;
        private @Nullable String vpcInterfaceName;
        private @Nullable String whitelistCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.description = defaults.description;
    	      this.entitlementArn = defaults.entitlementArn;
    	      this.ingestIp = defaults.ingestIp;
    	      this.ingestPort = defaults.ingestPort;
    	      this.maxBitrate = defaults.maxBitrate;
    	      this.maxLatency = defaults.maxLatency;
    	      this.minLatency = defaults.minLatency;
    	      this.name = defaults.name;
    	      this.protocol = defaults.protocol;
    	      this.sourceArn = defaults.sourceArn;
    	      this.sourceIngestPort = defaults.sourceIngestPort;
    	      this.streamId = defaults.streamId;
    	      this.vpcInterfaceName = defaults.vpcInterfaceName;
    	      this.whitelistCidr = defaults.whitelistCidr;
        }

        public Builder decryption(@Nullable FlowEncryption decryption) {
            this.decryption = decryption;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder entitlementArn(@Nullable String entitlementArn) {
            this.entitlementArn = entitlementArn;
            return this;
        }
        public Builder ingestIp(@Nullable String ingestIp) {
            this.ingestIp = ingestIp;
            return this;
        }
        public Builder ingestPort(@Nullable Integer ingestPort) {
            this.ingestPort = ingestPort;
            return this;
        }
        public Builder maxBitrate(@Nullable Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Builder maxLatency(@Nullable Integer maxLatency) {
            this.maxLatency = maxLatency;
            return this;
        }
        public Builder minLatency(@Nullable Integer minLatency) {
            this.minLatency = minLatency;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder protocol(@Nullable FlowSourceProtocol protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public Builder sourceIngestPort(@Nullable String sourceIngestPort) {
            this.sourceIngestPort = sourceIngestPort;
            return this;
        }
        public Builder streamId(@Nullable String streamId) {
            this.streamId = streamId;
            return this;
        }
        public Builder vpcInterfaceName(@Nullable String vpcInterfaceName) {
            this.vpcInterfaceName = vpcInterfaceName;
            return this;
        }
        public Builder whitelistCidr(@Nullable String whitelistCidr) {
            this.whitelistCidr = whitelistCidr;
            return this;
        }        public FlowSource build() {
            return new FlowSource(decryption, description, entitlementArn, ingestIp, ingestPort, maxBitrate, maxLatency, minLatency, name, protocol, sourceArn, sourceIngestPort, streamId, vpcInterfaceName, whitelistCidr);
        }
    }
}
