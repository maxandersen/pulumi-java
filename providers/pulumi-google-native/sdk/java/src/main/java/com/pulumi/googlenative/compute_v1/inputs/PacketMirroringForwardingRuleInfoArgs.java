// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PacketMirroringForwardingRuleInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final PacketMirroringForwardingRuleInfoArgs Empty = new PacketMirroringForwardingRuleInfoArgs();

    /**
     * Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    private PacketMirroringForwardingRuleInfoArgs() {}

    private PacketMirroringForwardingRuleInfoArgs(PacketMirroringForwardingRuleInfoArgs $) {
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PacketMirroringForwardingRuleInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PacketMirroringForwardingRuleInfoArgs $;

        public Builder() {
            $ = new PacketMirroringForwardingRuleInfoArgs();
        }

        public Builder(PacketMirroringForwardingRuleInfoArgs defaults) {
            $ = new PacketMirroringForwardingRuleInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public PacketMirroringForwardingRuleInfoArgs build() {
            return $;
        }
    }

}
