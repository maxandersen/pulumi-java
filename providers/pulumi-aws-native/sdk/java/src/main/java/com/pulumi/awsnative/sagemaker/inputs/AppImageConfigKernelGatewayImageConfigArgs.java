// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.awsnative.sagemaker.inputs.AppImageConfigFileSystemConfigArgs;
import com.pulumi.awsnative.sagemaker.inputs.AppImageConfigKernelSpecArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for the file system and kernels in a SageMaker image running as a KernelGateway app.
 * 
 */
public final class AppImageConfigKernelGatewayImageConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppImageConfigKernelGatewayImageConfigArgs Empty = new AppImageConfigKernelGatewayImageConfigArgs();

    /**
     * The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    @Import(name="fileSystemConfig")
    private @Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig;

    /**
     * @return The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
     * 
     */
    public Optional<Output<AppImageConfigFileSystemConfigArgs>> fileSystemConfig() {
        return Optional.ofNullable(this.fileSystemConfig);
    }

    /**
     * The specification of the Jupyter kernels in the image.
     * 
     */
    @Import(name="kernelSpecs", required=true)
    private Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs;

    /**
     * @return The specification of the Jupyter kernels in the image.
     * 
     */
    public Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs() {
        return this.kernelSpecs;
    }

    private AppImageConfigKernelGatewayImageConfigArgs() {}

    private AppImageConfigKernelGatewayImageConfigArgs(AppImageConfigKernelGatewayImageConfigArgs $) {
        this.fileSystemConfig = $.fileSystemConfig;
        this.kernelSpecs = $.kernelSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppImageConfigKernelGatewayImageConfigArgs $;

        public Builder() {
            $ = new AppImageConfigKernelGatewayImageConfigArgs();
        }

        public Builder(AppImageConfigKernelGatewayImageConfigArgs defaults) {
            $ = new AppImageConfigKernelGatewayImageConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fileSystemConfig The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemConfig(@Nullable Output<AppImageConfigFileSystemConfigArgs> fileSystemConfig) {
            $.fileSystemConfig = fileSystemConfig;
            return this;
        }

        /**
         * @param fileSystemConfig The Amazon Elastic File System (EFS) storage configuration for a SageMaker image.
         * 
         * @return builder
         * 
         */
        public Builder fileSystemConfig(AppImageConfigFileSystemConfigArgs fileSystemConfig) {
            return fileSystemConfig(Output.of(fileSystemConfig));
        }

        /**
         * @param kernelSpecs The specification of the Jupyter kernels in the image.
         * 
         * @return builder
         * 
         */
        public Builder kernelSpecs(Output<List<AppImageConfigKernelSpecArgs>> kernelSpecs) {
            $.kernelSpecs = kernelSpecs;
            return this;
        }

        /**
         * @param kernelSpecs The specification of the Jupyter kernels in the image.
         * 
         * @return builder
         * 
         */
        public Builder kernelSpecs(List<AppImageConfigKernelSpecArgs> kernelSpecs) {
            return kernelSpecs(Output.of(kernelSpecs));
        }

        /**
         * @param kernelSpecs The specification of the Jupyter kernels in the image.
         * 
         * @return builder
         * 
         */
        public Builder kernelSpecs(AppImageConfigKernelSpecArgs... kernelSpecs) {
            return kernelSpecs(List.of(kernelSpecs));
        }

        public AppImageConfigKernelGatewayImageConfigArgs build() {
            $.kernelSpecs = Objects.requireNonNull($.kernelSpecs, "expected parameter 'kernelSpecs' to be non-null");
            return $;
        }
    }

}
