// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dns.inputs.ManagedZoneForwardingConfigTargetNameServerArgs;
import java.util.List;
import java.util.Objects;


public final class ManagedZoneForwardingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigArgs Empty = new ManagedZoneForwardingConfigArgs();

    /**
     * List of target name servers to forward to. Cloud DNS will
     * select the best available name server if more than
     * one target is given.
     * Structure is documented below.
     * 
     */
    @Import(name="targetNameServers", required=true)
    private Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers;

    public Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers() {
        return this.targetNameServers;
    }

    private ManagedZoneForwardingConfigArgs() {}

    private ManagedZoneForwardingConfigArgs(ManagedZoneForwardingConfigArgs $) {
        this.targetNameServers = $.targetNameServers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneForwardingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneForwardingConfigArgs $;

        public Builder() {
            $ = new ManagedZoneForwardingConfigArgs();
        }

        public Builder(ManagedZoneForwardingConfigArgs defaults) {
            $ = new ManagedZoneForwardingConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetNameServers(Output<List<ManagedZoneForwardingConfigTargetNameServerArgs>> targetNameServers) {
            $.targetNameServers = targetNameServers;
            return this;
        }

        public Builder targetNameServers(List<ManagedZoneForwardingConfigTargetNameServerArgs> targetNameServers) {
            return targetNameServers(Output.of(targetNameServers));
        }

        public Builder targetNameServers(ManagedZoneForwardingConfigTargetNameServerArgs... targetNameServers) {
            return targetNameServers(List.of(targetNameServers));
        }

        public ManagedZoneForwardingConfigArgs build() {
            $.targetNameServers = Objects.requireNonNull($.targetNameServers, "expected parameter 'targetNameServers' to be non-null");
            return $;
        }
    }

}
