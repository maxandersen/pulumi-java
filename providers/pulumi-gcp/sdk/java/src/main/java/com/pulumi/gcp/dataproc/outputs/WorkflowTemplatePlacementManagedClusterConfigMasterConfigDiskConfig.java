// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig {
    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
     */
    private final @Nullable Integer bootDiskSizeGb;
    /**
     * Optional. Type of the boot disk (default is &#34;pd-standard&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
     */
    private final @Nullable String bootDiskType;
    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
     */
    private final @Nullable Integer numLocalSsds;

    @CustomType.Constructor
    private WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig(
        @CustomType.Parameter("bootDiskSizeGb") @Nullable Integer bootDiskSizeGb,
        @CustomType.Parameter("bootDiskType") @Nullable String bootDiskType,
        @CustomType.Parameter("numLocalSsds") @Nullable Integer numLocalSsds) {
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.numLocalSsds = numLocalSsds;
    }

    /**
     * Optional. Size in GB of the boot disk (default is 500GB).
     * 
    */
    public Optional<Integer> bootDiskSizeGb() {
        return Optional.ofNullable(this.bootDiskSizeGb);
    }
    /**
     * Optional. Type of the boot disk (default is &#34;pd-standard&#34;). Valid values: &#34;pd-ssd&#34; (Persistent Disk Solid State Drive) or &#34;pd-standard&#34; (Persistent Disk Hard Disk Drive).
     * 
    */
    public Optional<String> bootDiskType() {
        return Optional.ofNullable(this.bootDiskType);
    }
    /**
     * Optional. Number of attached SSDs, from 0 to 4 (default is 0). If SSDs are not attached, the boot disk is used to store runtime logs and (https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data. If one or more SSDs are attached, this runtime bulk data is spread across them, and the boot disk contains only basic config and installed binaries.
     * 
    */
    public Optional<Integer> numLocalSsds() {
        return Optional.ofNullable(this.numLocalSsds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bootDiskSizeGb;
        private @Nullable String bootDiskType;
        private @Nullable Integer numLocalSsds;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.numLocalSsds = defaults.numLocalSsds;
        }

        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder numLocalSsds(@Nullable Integer numLocalSsds) {
            this.numLocalSsds = numLocalSsds;
            return this;
        }        public WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig build() {
            return new WorkflowTemplatePlacementManagedClusterConfigMasterConfigDiskConfig(bootDiskSizeGb, bootDiskType, numLocalSsds);
        }
    }
}
