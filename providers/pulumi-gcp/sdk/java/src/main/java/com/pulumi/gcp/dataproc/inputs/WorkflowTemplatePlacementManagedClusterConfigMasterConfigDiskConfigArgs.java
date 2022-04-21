// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs();

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    @Import(name="bootDiskSizeGb")
    private @Nullable Output<Integer> bootDiskSizeGb;

    public Optional<Output<Integer>> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }

    /**
     * Optional. Type of the boot disk (default is &#34;pd-standard&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    @Import(name="bootDiskType")
    private @Nullable Output<String> bootDiskType;

    public Optional<Output<String>> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }

    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    @Import(name="numLocalSsds")
    private @Nullable Output<Integer> numLocalSsds;

    public Optional<Output<Integer>> numLocalSsds() {
        return Optional.ofNullable(this.numLocalSsds);
    }

    private WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs $) {
        this.bootDiskSizeGb = $.bootDiskSizeGb;
        this.bootDiskType = $.bootDiskType;
        this.numLocalSsds = $.numLocalSsds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            $.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }

        public Builder bootDiskSizeGb(Integer bootDiskSizeGb) {
            return bootDiskSizeGb(Output.of(bootDiskSizeGb));
        }

        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            $.bootDiskType = bootDiskType;
            return this;
        }

        public Builder bootDiskType(String bootDiskType) {
            return bootDiskType(Output.of(bootDiskType));
        }

        public Builder numLocalSsds(@Nullable Output<Integer> numLocalSsds) {
            $.numLocalSsds = numLocalSsds;
            return this;
        }

        public Builder numLocalSsds(Integer numLocalSsds) {
            return numLocalSsds(Output.of(numLocalSsds));
        }

        public WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfigArgs build() {
            return $;
        }
    }

}
