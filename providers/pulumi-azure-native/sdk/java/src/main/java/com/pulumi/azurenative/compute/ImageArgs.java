// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.enums.HyperVGenerationTypes;
import com.pulumi.azurenative.compute.inputs.ExtendedLocationArgs;
import com.pulumi.azurenative.compute.inputs.ImageStorageProfileArgs;
import com.pulumi.azurenative.compute.inputs.SubResourceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImageArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * The extended location of the Image.
     * 
     */
    @Import(name="extendedLocation")
    private @Nullable Output<ExtendedLocationArgs> extendedLocation;

    /**
     * @return The extended location of the Image.
     * 
     */
    public Optional<Output<ExtendedLocationArgs>> extendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }

    /**
     * Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    @Import(name="hyperVGeneration")
    private @Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration;

    /**
     * @return Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    public Optional<Output<Either<String,HyperVGenerationTypes>>> hyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="imageName")
    private @Nullable Output<String> imageName;

    /**
     * @return The name of the image.
     * 
     */
    public Optional<Output<String>> imageName() {
        return Optional.ofNullable(this.imageName);
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The source virtual machine from which Image is created.
     * 
     */
    @Import(name="sourceVirtualMachine")
    private @Nullable Output<SubResourceArgs> sourceVirtualMachine;

    /**
     * @return The source virtual machine from which Image is created.
     * 
     */
    public Optional<Output<SubResourceArgs>> sourceVirtualMachine() {
        return Optional.ofNullable(this.sourceVirtualMachine);
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
    private @Nullable Output<ImageStorageProfileArgs> storageProfile;

    /**
     * @return Specifies the storage settings for the virtual machine disks.
     * 
     */
    public Optional<Output<ImageStorageProfileArgs>> storageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ImageArgs() {}

    private ImageArgs(ImageArgs $) {
        this.extendedLocation = $.extendedLocation;
        this.hyperVGeneration = $.hyperVGeneration;
        this.imageName = $.imageName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceVirtualMachine = $.sourceVirtualMachine;
        this.storageProfile = $.storageProfile;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImageArgs $;

        public Builder() {
            $ = new ImageArgs();
        }

        public Builder(ImageArgs defaults) {
            $ = new ImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param extendedLocation The extended location of the Image.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            $.extendedLocation = extendedLocation;
            return this;
        }

        /**
         * @param extendedLocation The extended location of the Image.
         * 
         * @return builder
         * 
         */
        public Builder extendedLocation(ExtendedLocationArgs extendedLocation) {
            return extendedLocation(Output.of(extendedLocation));
        }

        /**
         * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(@Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration) {
            $.hyperVGeneration = hyperVGeneration;
            return this;
        }

        /**
         * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(Either<String,HyperVGenerationTypes> hyperVGeneration) {
            return hyperVGeneration(Output.of(hyperVGeneration));
        }

        /**
         * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(String hyperVGeneration) {
            return hyperVGeneration(Either.ofLeft(hyperVGeneration));
        }

        /**
         * @param hyperVGeneration Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
         * 
         * @return builder
         * 
         */
        public Builder hyperVGeneration(HyperVGenerationTypes hyperVGeneration) {
            return hyperVGeneration(Either.ofRight(hyperVGeneration));
        }

        /**
         * @param imageName The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(@Nullable Output<String> imageName) {
            $.imageName = imageName;
            return this;
        }

        /**
         * @param imageName The name of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageName(String imageName) {
            return imageName(Output.of(imageName));
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sourceVirtualMachine The source virtual machine from which Image is created.
         * 
         * @return builder
         * 
         */
        public Builder sourceVirtualMachine(@Nullable Output<SubResourceArgs> sourceVirtualMachine) {
            $.sourceVirtualMachine = sourceVirtualMachine;
            return this;
        }

        /**
         * @param sourceVirtualMachine The source virtual machine from which Image is created.
         * 
         * @return builder
         * 
         */
        public Builder sourceVirtualMachine(SubResourceArgs sourceVirtualMachine) {
            return sourceVirtualMachine(Output.of(sourceVirtualMachine));
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(@Nullable Output<ImageStorageProfileArgs> storageProfile) {
            $.storageProfile = storageProfile;
            return this;
        }

        /**
         * @param storageProfile Specifies the storage settings for the virtual machine disks.
         * 
         * @return builder
         * 
         */
        public Builder storageProfile(ImageStorageProfileArgs storageProfile) {
            return storageProfile(Output.of(storageProfile));
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public ImageArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
