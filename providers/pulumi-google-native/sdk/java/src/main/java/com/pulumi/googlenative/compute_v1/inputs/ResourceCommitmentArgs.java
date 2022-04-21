// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.ResourceCommitmentType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Commitment for a particular resource (a Commitment is composed of one or more of these).
 * 
 */
public final class ResourceCommitmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceCommitmentArgs Empty = new ResourceCommitmentArgs();

    /**
     * Name of the accelerator type resource. Applicable only when the type is ACCELERATOR.
     * 
     */
    @Import(name="acceleratorType")
    private @Nullable Output<String> acceleratorType;

    public Optional<Output<String>> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    /**
     * The amount of the resource purchased (in a type-dependent unit, such as bytes). For vCPUs, this can just be an integer. For memory, this must be provided in MB. Memory must be a multiple of 256 MB, with up to 6.5GB of memory per every vCPU.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<String> amount;

    public Optional<Output<String>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * Type of resource for which this commitment applies. Possible values are VCPU and MEMORY
     * 
     */
    @Import(name="type")
    private @Nullable Output<ResourceCommitmentType> type;

    public Optional<Output<ResourceCommitmentType>> type() {
        return Optional.ofNullable(this.type);
    }

    private ResourceCommitmentArgs() {}

    private ResourceCommitmentArgs(ResourceCommitmentArgs $) {
        this.acceleratorType = $.acceleratorType;
        this.amount = $.amount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceCommitmentArgs $;

        public Builder() {
            $ = new ResourceCommitmentArgs();
        }

        public Builder(ResourceCommitmentArgs defaults) {
            $ = new ResourceCommitmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            $.acceleratorType = acceleratorType;
            return this;
        }

        public Builder acceleratorType(String acceleratorType) {
            return acceleratorType(Output.of(acceleratorType));
        }

        public Builder amount(@Nullable Output<String> amount) {
            $.amount = amount;
            return this;
        }

        public Builder amount(String amount) {
            return amount(Output.of(amount));
        }

        public Builder type(@Nullable Output<ResourceCommitmentType> type) {
            $.type = type;
            return this;
        }

        public Builder type(ResourceCommitmentType type) {
            return type(Output.of(type));
        }

        public ResourceCommitmentArgs build() {
            return $;
        }
    }

}
