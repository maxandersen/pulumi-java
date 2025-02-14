// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.azurenative.labservices.enums.ManagedLabVmSize;
import com.pulumi.azurenative.labservices.inputs.ReferenceVmArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents resource specific settings
 * 
 */
public final class ResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceSettingsArgs Empty = new ResourceSettingsArgs();

    /**
     * The resource id of the gallery image used for creating the virtual machine
     * 
     */
    @Import(name="galleryImageResourceId")
    private @Nullable Output<String> galleryImageResourceId;

    /**
     * @return The resource id of the gallery image used for creating the virtual machine
     * 
     */
    public Optional<Output<String>> galleryImageResourceId() {
        return Optional.ofNullable(this.galleryImageResourceId);
    }

    /**
     * Details specific to Reference Vm
     * 
     */
    @Import(name="referenceVm", required=true)
    private Output<ReferenceVmArgs> referenceVm;

    /**
     * @return Details specific to Reference Vm
     * 
     */
    public Output<ReferenceVmArgs> referenceVm() {
        return this.referenceVm;
    }

    /**
     * The size of the virtual machine
     * 
     */
    @Import(name="size")
    private @Nullable Output<Either<String,ManagedLabVmSize>> size;

    /**
     * @return The size of the virtual machine
     * 
     */
    public Optional<Output<Either<String,ManagedLabVmSize>>> size() {
        return Optional.ofNullable(this.size);
    }

    private ResourceSettingsArgs() {}

    private ResourceSettingsArgs(ResourceSettingsArgs $) {
        this.galleryImageResourceId = $.galleryImageResourceId;
        this.referenceVm = $.referenceVm;
        this.size = $.size;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceSettingsArgs $;

        public Builder() {
            $ = new ResourceSettingsArgs();
        }

        public Builder(ResourceSettingsArgs defaults) {
            $ = new ResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param galleryImageResourceId The resource id of the gallery image used for creating the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder galleryImageResourceId(@Nullable Output<String> galleryImageResourceId) {
            $.galleryImageResourceId = galleryImageResourceId;
            return this;
        }

        /**
         * @param galleryImageResourceId The resource id of the gallery image used for creating the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder galleryImageResourceId(String galleryImageResourceId) {
            return galleryImageResourceId(Output.of(galleryImageResourceId));
        }

        /**
         * @param referenceVm Details specific to Reference Vm
         * 
         * @return builder
         * 
         */
        public Builder referenceVm(Output<ReferenceVmArgs> referenceVm) {
            $.referenceVm = referenceVm;
            return this;
        }

        /**
         * @param referenceVm Details specific to Reference Vm
         * 
         * @return builder
         * 
         */
        public Builder referenceVm(ReferenceVmArgs referenceVm) {
            return referenceVm(Output.of(referenceVm));
        }

        /**
         * @param size The size of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder size(@Nullable Output<Either<String,ManagedLabVmSize>> size) {
            $.size = size;
            return this;
        }

        /**
         * @param size The size of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder size(Either<String,ManagedLabVmSize> size) {
            return size(Output.of(size));
        }

        /**
         * @param size The size of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder size(String size) {
            return size(Either.ofLeft(size));
        }

        /**
         * @param size The size of the virtual machine
         * 
         * @return builder
         * 
         */
        public Builder size(ManagedLabVmSize size) {
            return size(Either.ofRight(size));
        }

        public ResourceSettingsArgs build() {
            $.referenceVm = Objects.requireNonNull($.referenceVm, "expected parameter 'referenceVm' to be non-null");
            return $;
        }
    }

}
