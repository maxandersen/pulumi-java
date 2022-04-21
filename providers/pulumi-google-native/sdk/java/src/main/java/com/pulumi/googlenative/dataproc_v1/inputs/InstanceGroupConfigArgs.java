// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.enums.InstanceGroupConfigPreemptibility;
import com.pulumi.googlenative.dataproc_v1.inputs.AcceleratorConfigArgs;
import com.pulumi.googlenative.dataproc_v1.inputs.DiskConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
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
    private @Nullable Output<List<AcceleratorConfigArgs>> accelerators;

    public Optional<Output<List<AcceleratorConfigArgs>>> accelerators() {
        return Optional.ofNullable(this.accelerators);
    }

    /**
     * Optional. Disk option config settings.
     * 
     */
    @Import(name="diskConfig")
    private @Nullable Output<DiskConfigArgs> diskConfig;

    public Optional<Output<DiskConfigArgs>> diskConfig() {
        return Optional.ofNullable(this.diskConfig);
    }

    /**
     * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an image or image family.Image examples: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id] projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use the most recent image from the family: https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system default.
     * 
     */
    @Import(name="imageUri")
    private @Nullable Output<String> imageUri;

    public Optional<Output<String>> imageUri() {
        return Optional.ofNullable(this.imageUri);
    }

    /**
     * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the machine type resource, for example, n1-standard-2.
     * 
     */
    @Import(name="machineTypeUri")
    private @Nullable Output<String> machineTypeUri;

    public Optional<Output<String>> machineTypeUri() {
        return Optional.ofNullable(this.machineTypeUri);
    }

    /**
     * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -&gt; Minimum CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
     * 
     */
    @Import(name="minCpuPlatform")
    private @Nullable Output<String> minCpuPlatform;

    public Optional<Output<String>> minCpuPlatform() {
        return Optional.ofNullable(this.minCpuPlatform);
    }

    /**
     * Optional. The number of VM instances in the instance group. For HA cluster master_config groups, must be set to 3. For standard cluster master_config groups, must be set to 1.
     * 
     */
    @Import(name="numInstances")
    private @Nullable Output<Integer> numInstances;

    public Optional<Output<Integer>> numInstances() {
        return Optional.ofNullable(this.numInstances);
    }

    /**
     * Optional. Specifies the preemptibility of the instance group.The default value for master and worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for secondary instances is PREEMPTIBLE.
     * 
     */
    @Import(name="preemptibility")
    private @Nullable Output<InstanceGroupConfigPreemptibility> preemptibility;

    public Optional<Output<InstanceGroupConfigPreemptibility>> preemptibility() {
        return Optional.ofNullable(this.preemptibility);
    }

    private InstanceGroupConfigArgs() {}

    private InstanceGroupConfigArgs(InstanceGroupConfigArgs $) {
        this.accelerators = $.accelerators;
        this.diskConfig = $.diskConfig;
        this.imageUri = $.imageUri;
        this.machineTypeUri = $.machineTypeUri;
        this.minCpuPlatform = $.minCpuPlatform;
        this.numInstances = $.numInstances;
        this.preemptibility = $.preemptibility;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceGroupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceGroupConfigArgs $;

        public Builder() {
            $ = new InstanceGroupConfigArgs();
        }

        public Builder(InstanceGroupConfigArgs defaults) {
            $ = new InstanceGroupConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder accelerators(@Nullable Output<List<AcceleratorConfigArgs>> accelerators) {
            $.accelerators = accelerators;
            return this;
        }

        public Builder accelerators(List<AcceleratorConfigArgs> accelerators) {
            return accelerators(Output.of(accelerators));
        }

        public Builder accelerators(AcceleratorConfigArgs... accelerators) {
            return accelerators(List.of(accelerators));
        }

        public Builder diskConfig(@Nullable Output<DiskConfigArgs> diskConfig) {
            $.diskConfig = diskConfig;
            return this;
        }

        public Builder diskConfig(DiskConfigArgs diskConfig) {
            return diskConfig(Output.of(diskConfig));
        }

        public Builder imageUri(@Nullable Output<String> imageUri) {
            $.imageUri = imageUri;
            return this;
        }

        public Builder imageUri(String imageUri) {
            return imageUri(Output.of(imageUri));
        }

        public Builder machineTypeUri(@Nullable Output<String> machineTypeUri) {
            $.machineTypeUri = machineTypeUri;
            return this;
        }

        public Builder machineTypeUri(String machineTypeUri) {
            return machineTypeUri(Output.of(machineTypeUri));
        }

        public Builder minCpuPlatform(@Nullable Output<String> minCpuPlatform) {
            $.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder minCpuPlatform(String minCpuPlatform) {
            return minCpuPlatform(Output.of(minCpuPlatform));
        }

        public Builder numInstances(@Nullable Output<Integer> numInstances) {
            $.numInstances = numInstances;
            return this;
        }

        public Builder numInstances(Integer numInstances) {
            return numInstances(Output.of(numInstances));
        }

        public Builder preemptibility(@Nullable Output<InstanceGroupConfigPreemptibility> preemptibility) {
            $.preemptibility = preemptibility;
            return this;
        }

        public Builder preemptibility(InstanceGroupConfigPreemptibility preemptibility) {
            return preemptibility(Output.of(preemptibility));
        }

        public InstanceGroupConfigArgs build() {
            return $;
        }
    }

}
