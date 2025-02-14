// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.notebooks_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.notebooks_v1.enums.RuntimeAcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the types of hardware accelerators that can be used. Definition of the types of hardware accelerators that can be used. See [Compute Engine AcceleratorTypes](https://cloud.google.com/compute/docs/reference/beta/acceleratorTypes). Examples: * `nvidia-tesla-k80` * `nvidia-tesla-p100` * `nvidia-tesla-v100` * `nvidia-tesla-p4` * `nvidia-tesla-t4` * `nvidia-tesla-a100`
 * 
 */
public final class RuntimeAcceleratorConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeAcceleratorConfigArgs Empty = new RuntimeAcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount")
    private @Nullable Output<String> coreCount;

    /**
     * @return Count of cores of this accelerator.
     * 
     */
    public Optional<Output<String>> coreCount() {
        return Optional.ofNullable(this.coreCount);
    }

    /**
     * Accelerator model.
     * 
     */
    @Import(name="type")
    private @Nullable Output<RuntimeAcceleratorConfigType> type;

    /**
     * @return Accelerator model.
     * 
     */
    public Optional<Output<RuntimeAcceleratorConfigType>> type() {
        return Optional.ofNullable(this.type);
    }

    private RuntimeAcceleratorConfigArgs() {}

    private RuntimeAcceleratorConfigArgs(RuntimeAcceleratorConfigArgs $) {
        this.coreCount = $.coreCount;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeAcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeAcceleratorConfigArgs $;

        public Builder() {
            $ = new RuntimeAcceleratorConfigArgs();
        }

        public Builder(RuntimeAcceleratorConfigArgs defaults) {
            $ = new RuntimeAcceleratorConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param coreCount Count of cores of this accelerator.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(@Nullable Output<String> coreCount) {
            $.coreCount = coreCount;
            return this;
        }

        /**
         * @param coreCount Count of cores of this accelerator.
         * 
         * @return builder
         * 
         */
        public Builder coreCount(String coreCount) {
            return coreCount(Output.of(coreCount));
        }

        /**
         * @param type Accelerator model.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<RuntimeAcceleratorConfigType> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Accelerator model.
         * 
         * @return builder
         * 
         */
        public Builder type(RuntimeAcceleratorConfigType type) {
            return type(Output.of(type));
        }

        public RuntimeAcceleratorConfigArgs build() {
            return $;
        }
    }

}
