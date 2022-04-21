// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the dedicated host unutilized capacity in terms of a specific VM size.
 * 
 */
public final class DedicatedHostAllocatableVMResponse extends com.pulumi.resources.InvokeArgs {

    public static final DedicatedHostAllocatableVMResponse Empty = new DedicatedHostAllocatableVMResponse();

    /**
     * Maximum number of VMs of size vmSize that can fit in the dedicated host&#39;s remaining capacity.
     * 
     */
    @Import(name="count")
    private @Nullable Double count;

    public Optional<Double> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * VM size in terms of which the unutilized capacity is represented.
     * 
     */
    @Import(name="vmSize")
    private @Nullable String vmSize;

    public Optional<String> vmSize() {
        return Optional.ofNullable(this.vmSize);
    }

    private DedicatedHostAllocatableVMResponse() {}

    private DedicatedHostAllocatableVMResponse(DedicatedHostAllocatableVMResponse $) {
        this.count = $.count;
        this.vmSize = $.vmSize;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DedicatedHostAllocatableVMResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DedicatedHostAllocatableVMResponse $;

        public Builder() {
            $ = new DedicatedHostAllocatableVMResponse();
        }

        public Builder(DedicatedHostAllocatableVMResponse defaults) {
            $ = new DedicatedHostAllocatableVMResponse(Objects.requireNonNull(defaults));
        }

        public Builder count(@Nullable Double count) {
            $.count = count;
            return this;
        }

        public Builder vmSize(@Nullable String vmSize) {
            $.vmSize = vmSize;
            return this;
        }

        public DedicatedHostAllocatableVMResponse build() {
            return $;
        }
    }

}
