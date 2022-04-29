// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.virtualmachineimages;

import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateFileCustomizerArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateIdentityArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateManagedImageDistributorArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateManagedImageSourceArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplatePlatformImageSourceArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplatePowerShellCustomizerArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateRestartCustomizerArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateSharedImageDistributorArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateSharedImageVersionSourceArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateShellCustomizerArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateVhdDistributorArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateVmProfileArgs;
import com.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateWindowsUpdateCustomizerArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualMachineImageTemplateArgs extends ResourceArgs {

    public static final VirtualMachineImageTemplateArgs Empty = new VirtualMachineImageTemplateArgs();

    /**
     * Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
     * 
     */
    @Import(name="buildTimeoutInMinutes")
    private @Nullable Output<Integer> buildTimeoutInMinutes;

    /**
     * @return Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
     * 
     */
    public Optional<Output<Integer>> buildTimeoutInMinutes() {
        return Optional.ofNullable(this.buildTimeoutInMinutes);
    }

    /**
     * Specifies the properties used to describe the customization steps of the image, like Image source etc
     * 
     */
    @Import(name="customize")
    private @Nullable Output<List<Object>> customize;

    /**
     * @return Specifies the properties used to describe the customization steps of the image, like Image source etc
     * 
     */
    public Optional<Output<List<Object>>> customize() {
        return Optional.ofNullable(this.customize);
    }

    /**
     * The distribution targets where the image output needs to go to.
     * 
     */
    @Import(name="distribute", required=true)
    private Output<List<Object>> distribute;

    /**
     * @return The distribution targets where the image output needs to go to.
     * 
     */
    public Output<List<Object>> distribute() {
        return this.distribute;
    }

    /**
     * The identity of the image template, if configured.
     * 
     */
    @Import(name="identity", required=true)
    private Output<ImageTemplateIdentityArgs> identity;

    /**
     * @return The identity of the image template, if configured.
     * 
     */
    public Output<ImageTemplateIdentityArgs> identity() {
        return this.identity;
    }

    /**
     * The name of the image Template
     * 
     */
    @Import(name="imageTemplateName")
    private @Nullable Output<String> imageTemplateName;

    /**
     * @return The name of the image Template
     * 
     */
    public Optional<Output<String>> imageTemplateName() {
        return Optional.ofNullable(this.imageTemplateName);
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
     * Specifies the properties used to describe the source image.
     * 
     */
    @Import(name="source", required=true)
    private Output<Object> source;

    /**
     * @return Specifies the properties used to describe the source image.
     * 
     */
    public Output<Object> source() {
        return this.source;
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

    /**
     * Describes how virtual machine is set up to build images
     * 
     */
    @Import(name="vmProfile")
    private @Nullable Output<ImageTemplateVmProfileArgs> vmProfile;

    /**
     * @return Describes how virtual machine is set up to build images
     * 
     */
    public Optional<Output<ImageTemplateVmProfileArgs>> vmProfile() {
        return Optional.ofNullable(this.vmProfile);
    }

    private VirtualMachineImageTemplateArgs() {}

    private VirtualMachineImageTemplateArgs(VirtualMachineImageTemplateArgs $) {
        this.buildTimeoutInMinutes = $.buildTimeoutInMinutes;
        this.customize = $.customize;
        this.distribute = $.distribute;
        this.identity = $.identity;
        this.imageTemplateName = $.imageTemplateName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.source = $.source;
        this.tags = $.tags;
        this.vmProfile = $.vmProfile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualMachineImageTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualMachineImageTemplateArgs $;

        public Builder() {
            $ = new VirtualMachineImageTemplateArgs();
        }

        public Builder(VirtualMachineImageTemplateArgs defaults) {
            $ = new VirtualMachineImageTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildTimeoutInMinutes Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
         * 
         * @return builder
         * 
         */
        public Builder buildTimeoutInMinutes(@Nullable Output<Integer> buildTimeoutInMinutes) {
            $.buildTimeoutInMinutes = buildTimeoutInMinutes;
            return this;
        }

        /**
         * @param buildTimeoutInMinutes Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
         * 
         * @return builder
         * 
         */
        public Builder buildTimeoutInMinutes(Integer buildTimeoutInMinutes) {
            return buildTimeoutInMinutes(Output.of(buildTimeoutInMinutes));
        }

        /**
         * @param customize Specifies the properties used to describe the customization steps of the image, like Image source etc
         * 
         * @return builder
         * 
         */
        public Builder customize(@Nullable Output<List<Object>> customize) {
            $.customize = customize;
            return this;
        }

        /**
         * @param customize Specifies the properties used to describe the customization steps of the image, like Image source etc
         * 
         * @return builder
         * 
         */
        public Builder customize(List<Object> customize) {
            return customize(Output.of(customize));
        }

        /**
         * @param customize Specifies the properties used to describe the customization steps of the image, like Image source etc
         * 
         * @return builder
         * 
         */
        public Builder customize(Object... customize) {
            return customize(List.of(customize));
        }

        /**
         * @param distribute The distribution targets where the image output needs to go to.
         * 
         * @return builder
         * 
         */
        public Builder distribute(Output<List<Object>> distribute) {
            $.distribute = distribute;
            return this;
        }

        /**
         * @param distribute The distribution targets where the image output needs to go to.
         * 
         * @return builder
         * 
         */
        public Builder distribute(List<Object> distribute) {
            return distribute(Output.of(distribute));
        }

        /**
         * @param distribute The distribution targets where the image output needs to go to.
         * 
         * @return builder
         * 
         */
        public Builder distribute(Object... distribute) {
            return distribute(List.of(distribute));
        }

        /**
         * @param identity The identity of the image template, if configured.
         * 
         * @return builder
         * 
         */
        public Builder identity(Output<ImageTemplateIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity The identity of the image template, if configured.
         * 
         * @return builder
         * 
         */
        public Builder identity(ImageTemplateIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param imageTemplateName The name of the image Template
         * 
         * @return builder
         * 
         */
        public Builder imageTemplateName(@Nullable Output<String> imageTemplateName) {
            $.imageTemplateName = imageTemplateName;
            return this;
        }

        /**
         * @param imageTemplateName The name of the image Template
         * 
         * @return builder
         * 
         */
        public Builder imageTemplateName(String imageTemplateName) {
            return imageTemplateName(Output.of(imageTemplateName));
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
         * @param source Specifies the properties used to describe the source image.
         * 
         * @return builder
         * 
         */
        public Builder source(Output<Object> source) {
            $.source = source;
            return this;
        }

        /**
         * @param source Specifies the properties used to describe the source image.
         * 
         * @return builder
         * 
         */
        public Builder source(Object source) {
            return source(Output.of(source));
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

        /**
         * @param vmProfile Describes how virtual machine is set up to build images
         * 
         * @return builder
         * 
         */
        public Builder vmProfile(@Nullable Output<ImageTemplateVmProfileArgs> vmProfile) {
            $.vmProfile = vmProfile;
            return this;
        }

        /**
         * @param vmProfile Describes how virtual machine is set up to build images
         * 
         * @return builder
         * 
         */
        public Builder vmProfile(ImageTemplateVmProfileArgs vmProfile) {
            return vmProfile(Output.of(vmProfile));
        }

        public VirtualMachineImageTemplateArgs build() {
            $.buildTimeoutInMinutes = Codegen.integerProp("buildTimeoutInMinutes").output().arg($.buildTimeoutInMinutes).def(0).getNullable();
            $.distribute = Objects.requireNonNull($.distribute, "expected parameter 'distribute' to be non-null");
            $.identity = Objects.requireNonNull($.identity, "expected parameter 'identity' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.source = Objects.requireNonNull($.source, "expected parameter 'source' to be non-null");
            return $;
        }
    }

}
