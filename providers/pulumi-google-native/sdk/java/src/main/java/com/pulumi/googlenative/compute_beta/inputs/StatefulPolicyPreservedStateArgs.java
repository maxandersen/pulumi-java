// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of preserved resources.
 * 
 */
public final class StatefulPolicyPreservedStateArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatefulPolicyPreservedStateArgs Empty = new StatefulPolicyPreservedStateArgs();

    /**
     * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
     * 
     */
    @Import(name="disks")
    private @Nullable Output<Map<String,String>> disks;

    public Optional<Output<Map<String,String>>> disks() {
        return Optional.ofNullable(this.disks);
    }

    /**
     * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @Import(name="externalIPs")
    private @Nullable Output<Map<String,String>> externalIPs;

    public Optional<Output<Map<String,String>>> externalIPs() {
        return Optional.ofNullable(this.externalIPs);
    }

    /**
     * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
     * 
     */
    @Import(name="internalIPs")
    private @Nullable Output<Map<String,String>> internalIPs;

    public Optional<Output<Map<String,String>>> internalIPs() {
        return Optional.ofNullable(this.internalIPs);
    }

    private StatefulPolicyPreservedStateArgs() {}

    private StatefulPolicyPreservedStateArgs(StatefulPolicyPreservedStateArgs $) {
        this.disks = $.disks;
        this.externalIPs = $.externalIPs;
        this.internalIPs = $.internalIPs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatefulPolicyPreservedStateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatefulPolicyPreservedStateArgs $;

        public Builder() {
            $ = new StatefulPolicyPreservedStateArgs();
        }

        public Builder(StatefulPolicyPreservedStateArgs defaults) {
            $ = new StatefulPolicyPreservedStateArgs(Objects.requireNonNull(defaults));
        }

        public Builder disks(@Nullable Output<Map<String,String>> disks) {
            $.disks = disks;
            return this;
        }

        public Builder disks(Map<String,String> disks) {
            return disks(Output.of(disks));
        }

        public Builder externalIPs(@Nullable Output<Map<String,String>> externalIPs) {
            $.externalIPs = externalIPs;
            return this;
        }

        public Builder externalIPs(Map<String,String> externalIPs) {
            return externalIPs(Output.of(externalIPs));
        }

        public Builder internalIPs(@Nullable Output<Map<String,String>> internalIPs) {
            $.internalIPs = internalIPs;
            return this;
        }

        public Builder internalIPs(Map<String,String> internalIPs) {
            return internalIPs(Output.of(internalIPs));
        }

        public StatefulPolicyPreservedStateArgs build() {
            return $;
        }
    }

}
