// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dataproc_v1beta2.enums.InstanceGroupConfigPreemptibility;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.AcceleratorConfigArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.DiskConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The config settings for Compute Engine resources in an instance group, such as a master or worker group.
 * 
 */
public final class InstanceGroupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceGroupConfigArgs Empty = new InstanceGroupConfigArgs();

    /**
     * Optional. The Compute Engine accelerator configuration for these instances.
     * 
     */
    @Import(name="accelerators")
      private final @Nullable Output<List<AcceleratorConfigArgs>> accelerators;

    public Output<List<AcceleratorConfigArgs>> accelerators() {
        return this.accelerators == null ? Codegen.empty() : this.accelerators;
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
      private final @Nullable Output<DiskConfigArgs> diskConfig;

    public Output<DiskConfigArgs> diskConfig() {
        return this.diskConfig == null ? Codegen.empty() : this.diskConfig;
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    @Import(name="imageUri")
      private final @Nullable Output<String> imageUri;

    public Output<String> imageUri() {
        return this.imageUri == null ? Codegen.empty() : this.imageUri;
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    @Import(name="machineTypeUri")
      private final @Nullable Output<String> machineTypeUri;

    public Output<String> machineTypeUri() {
        return this.machineTypeUri == null ? Codegen.empty() : this.machineTypeUri;
    }

    /**
     * Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
      private final @Nullable Output<String> minCpuPlatform;

    public Output<String> minCpuPlatform() {
        return this.minCpuPlatform == null ? Codegen.empty() : this.minCpuPlatform;
    }

    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
      private final @Nullable Output<Integer> numInstances;

    public Output<Integer> numInstances() {
        return this.numInstances == null ? Codegen.empty() : this.numInstances;
    }

    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    @Import(name="preemptibility")
      private final @Nullable Output<InstanceGroupConfigPreemptibility> preemptibility;

    public Output<InstanceGroupConfigPreemptibility> preemptibility() {
        return this.preemptibility == null ? Codegen.empty() : this.preemptibility;
    }

    public InstanceGroupConfigArgs(
        @Nullable Output<List<AcceleratorConfigArgs>> accelerators,
        @Nullable Output<DiskConfigArgs> diskConfig,
        @Nullable Output<String> imageUri,
        @Nullable Output<String> machineTypeUri,
        @Nullable Output<String> minCpuPlatform,
        @Nullable Output<Integer> numInstances,
        @Nullable Output<InstanceGroupConfigPreemptibility> preemptibility) {
        this.accelerators = accelerators;
        this.diskConfig = diskConfig;
        this.imageUri = imageUri;
        this.machineTypeUri = machineTypeUri;
        this.minCpuPlatform = minCpuPlatform;
        this.numInstances = numInstances;
        this.preemptibility = preemptibility;
    }

    private InstanceGroupConfigArgs() {
        this.accelerators = Codegen.empty();
        this.diskConfig = Codegen.empty();
        this.imageUri = Codegen.empty();
        this.machineTypeUri = Codegen.empty();
        this.minCpuPlatform = Codegen.empty();
        this.numInstances = Codegen.empty();
        this.preemptibility = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AcceleratorConfigArgs>> accelerators;
        private @Nullable Output<DiskConfigArgs> diskConfig;
        private @Nullable Output<String> imageUri;
        private @Nullable Output<String> machineTypeUri;
        private @Nullable Output<String> minCpuPlatform;
        private @Nullable Output<Integer> numInstances;
        private @Nullable Output<InstanceGroupConfigPreemptibility> preemptibility;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.diskConfig = defaults.diskConfig;
    	      this.imageUri = defaults.imageUri;
    	      this.machineTypeUri = defaults.machineTypeUri;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.numInstances = defaults.numInstances;
    	      this.preemptibility = defaults.preemptibility;
        }

        public Builder accelerators(@Nullable Output<List<AcceleratorConfigArgs>> accelerators) {
            this.accelerators = accelerators;
            return this;
        }
        public Builder accelerators(@Nullable List<AcceleratorConfigArgs> accelerators) {
            this.accelerators = Codegen.ofNullable(accelerators);
            return this;
        }
        public Builder accelerators(AcceleratorConfigArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }
        public Builder diskConfig(@Nullable Output<DiskConfigArgs> diskConfig) {
            this.diskConfig = diskConfig;
            return this;
        }
        public Builder diskConfig(@Nullable DiskConfigArgs diskConfig) {
            this.diskConfig = Codegen.ofNullable(diskConfig);
            return this;
        }
        public Builder imageUri(@Nullable Output<String> imageUri) {
            this.imageUri = imageUri;
            return this;
        }
        public Builder imageUri(@Nullable String imageUri) {
            this.imageUri = Codegen.ofNullable(imageUri);
            return this;
        }
        public Builder machineTypeUri(@Nullable Output<String> machineTypeUri) {
            this.machineTypeUri = machineTypeUri;
            return this;
        }
        public Builder machineTypeUri(@Nullable String machineTypeUri) {
            this.machineTypeUri = Codegen.ofNullable(machineTypeUri);
            return this;
        }
        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }
        public Builder minCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Codegen.ofNullable(minCpuPlatform);
            return this;
        }
        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            this.numInstances = numInstances;
            return this;
        }
        public Builder numInstances(@Nullable Integer numInstances) {
            this.numInstances = Codegen.ofNullable(numInstances);
            return this;
        }
        public Builder preemptibility(@Nullable Output<InstanceGroupConfigPreemptibility> preemptibility) {
            this.preemptibility = preemptibility;
            return this;
        }
        public Builder preemptibility(@Nullable InstanceGroupConfigPreemptibility preemptibility) {
            this.preemptibility = Codegen.ofNullable(preemptibility);
            return this;
        }        public InstanceGroupConfigArgs build() {
            return new InstanceGroupConfigArgs(accelerators, diskConfig, imageUri, machineTypeUri, minCpuPlatform, numInstances, preemptibility);
        }
    }
}
