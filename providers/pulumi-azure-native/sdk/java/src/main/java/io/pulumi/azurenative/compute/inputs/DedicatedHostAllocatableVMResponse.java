// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the dedicated host unutilized capacity in terms of a specific VM size.
 * 
 */
public final class DedicatedHostAllocatableVMResponse extends io.pulumi.resources.InvokeArgs {

    public static final DedicatedHostAllocatableVMResponse Empty = new DedicatedHostAllocatableVMResponse();

    /**
     * Maximum number of VMs of size vmSize that can fit in the dedicated host's remaining capacity.
     * 
     */
    @Import(name="count")
      private final @Nullable Double count;

    public Optional<Double> count() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * VM size in terms of which the unutilized capacity is represented.
     * 
     */
    @Import(name="vmSize")
      private final @Nullable String vmSize;

    public Optional<String> vmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    public DedicatedHostAllocatableVMResponse(
        @Nullable Double count,
        @Nullable String vmSize) {
        this.count = count;
        this.vmSize = vmSize;
    }

    private DedicatedHostAllocatableVMResponse() {
        this.count = null;
        this.vmSize = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DedicatedHostAllocatableVMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double count;
        private @Nullable String vmSize;

        public Builder() {
    	      // Empty
        }

        public Builder(DedicatedHostAllocatableVMResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.vmSize = defaults.vmSize;
        }

        public Builder count(@Nullable Double count) {
            this.count = count;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }        public DedicatedHostAllocatableVMResponse build() {
            return new DedicatedHostAllocatableVMResponse(count, vmSize);
        }
    }
}
