// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ComputeEnvironmentComputeResourcesEc2Configuration {
    /**
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
     * 
     */
    private final @Nullable String imageIdOverride;
    /**
     * The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn&#39;t specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
     * 
     */
    private final @Nullable String imageType;

    @CustomType.Constructor
    private ComputeEnvironmentComputeResourcesEc2Configuration(
        @CustomType.Parameter("imageIdOverride") @Nullable String imageIdOverride,
        @CustomType.Parameter("imageType") @Nullable String imageType) {
        this.imageIdOverride = imageIdOverride;
        this.imageType = imageType;
    }

    /**
     * The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the `image_id` argument in the `compute_resources` block.
     * 
    */
    public Optional<String> imageIdOverride() {
        return Optional.ofNullable(this.imageIdOverride);
    }
    /**
     * The image type to match with the instance type to select an AMI. If the `image_id_override` parameter isn&#39;t specified, then a recent [Amazon ECS-optimized Amazon Linux 2 AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (`ECS_AL2`) is used.
     * 
    */
    public Optional<String> imageType() {
        return Optional.ofNullable(this.imageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeEnvironmentComputeResourcesEc2Configuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageIdOverride;
        private @Nullable String imageType;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeEnvironmentComputeResourcesEc2Configuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageIdOverride = defaults.imageIdOverride;
    	      this.imageType = defaults.imageType;
        }

        public Builder imageIdOverride(@Nullable String imageIdOverride) {
            this.imageIdOverride = imageIdOverride;
            return this;
        }
        public Builder imageType(@Nullable String imageType) {
            this.imageType = imageType;
            return this;
        }        public ComputeEnvironmentComputeResourcesEc2Configuration build() {
            return new ComputeEnvironmentComputeResourcesEc2Configuration(imageIdOverride, imageType);
        }
    }
}
