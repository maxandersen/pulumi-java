// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Virtual Network configuration.
 * 
 */
public final class VirtualNetworkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkConfigArgs Empty = new VirtualNetworkConfigArgs();

    /**
     * Resource id of a pre-existing subnet.
     * 
     */
    @Import(name="subnetId")
      private final @Nullable Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId == null ? Codegen.empty() : this.subnetId;
    }

    public VirtualNetworkConfigArgs(@Nullable Output<String> subnetId) {
        this.subnetId = subnetId;
    }

    private VirtualNetworkConfigArgs() {
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetId = defaults.subnetId;
        }

        public Builder subnetId(@Nullable Output<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }
        public Builder subnetId(@Nullable String subnetId) {
            this.subnetId = Codegen.ofNullable(subnetId);
            return this;
        }        public VirtualNetworkConfigArgs build() {
            return new VirtualNetworkConfigArgs(subnetId);
        }
    }
}
