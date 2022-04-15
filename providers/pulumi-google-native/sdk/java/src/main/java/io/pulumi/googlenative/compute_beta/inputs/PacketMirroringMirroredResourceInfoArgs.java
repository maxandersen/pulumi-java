// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_beta.inputs.PacketMirroringMirroredResourceInfoInstanceInfoArgs;
import io.pulumi.googlenative.compute_beta.inputs.PacketMirroringMirroredResourceInfoSubnetInfoArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourceInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourceInfoArgs Empty = new PacketMirroringMirroredResourceInfoArgs();

    /**
     * A set of virtual machine instances that are being mirrored. They must live in zones contained in the same region as this packetMirroring. Note that this config will apply only to those network interfaces of the Instances that belong to the network specified in this packetMirroring. You may specify a maximum of 50 Instances.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<PacketMirroringMirroredResourceInfoInstanceInfoArgs>> instances;

    public Output<List<PacketMirroringMirroredResourceInfoInstanceInfoArgs>> instances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * A set of subnetworks for which traffic from/to all VM instances will be mirrored. They must live in the same region as this packetMirroring. You may specify a maximum of 5 subnetworks.
     * 
     */
    @Import(name="subnetworks")
      private final @Nullable Output<List<PacketMirroringMirroredResourceInfoSubnetInfoArgs>> subnetworks;

    public Output<List<PacketMirroringMirroredResourceInfoSubnetInfoArgs>> subnetworks() {
        return this.subnetworks == null ? Codegen.empty() : this.subnetworks;
    }

    /**
     * A set of mirrored tags. Traffic from/to all VM instances that have one or more of these tags will be mirrored.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public PacketMirroringMirroredResourceInfoArgs(
        @Nullable Output<List<PacketMirroringMirroredResourceInfoInstanceInfoArgs>> instances,
        @Nullable Output<List<PacketMirroringMirroredResourceInfoSubnetInfoArgs>> subnetworks,
        @Nullable Output<List<String>> tags) {
        this.instances = instances;
        this.subnetworks = subnetworks;
        this.tags = tags;
    }

    private PacketMirroringMirroredResourceInfoArgs() {
        this.instances = Codegen.empty();
        this.subnetworks = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourceInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PacketMirroringMirroredResourceInfoInstanceInfoArgs>> instances;
        private @Nullable Output<List<PacketMirroringMirroredResourceInfoSubnetInfoArgs>> subnetworks;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourceInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        public Builder instances(@Nullable Output<List<PacketMirroringMirroredResourceInfoInstanceInfoArgs>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<PacketMirroringMirroredResourceInfoInstanceInfoArgs> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(PacketMirroringMirroredResourceInfoInstanceInfoArgs... instances) {
            return instances(List.of(instances));
        }
        public Builder subnetworks(@Nullable Output<List<PacketMirroringMirroredResourceInfoSubnetInfoArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }
        public Builder subnetworks(@Nullable List<PacketMirroringMirroredResourceInfoSubnetInfoArgs> subnetworks) {
            this.subnetworks = Codegen.ofNullable(subnetworks);
            return this;
        }
        public Builder subnetworks(PacketMirroringMirroredResourceInfoSubnetInfoArgs... subnetworks) {
            return subnetworks(List.of(subnetworks));
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }        public PacketMirroringMirroredResourceInfoArgs build() {
            return new PacketMirroringMirroredResourceInfoArgs(instances, subnetworks, tags);
        }
    }
}
