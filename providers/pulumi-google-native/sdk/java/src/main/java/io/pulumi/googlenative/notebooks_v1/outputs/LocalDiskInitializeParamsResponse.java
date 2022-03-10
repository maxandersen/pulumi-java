// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class LocalDiskInitializeParamsResponse {
    /**
     * Optional. Provide this property when creating the disk.
     * 
     */
    private final String description;
    /**
     * Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
     */
    private final String diskName;
    /**
     * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
     */
    private final String diskSizeGb;
    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    private final String diskType;
    /**
     * Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    private final Map<String,String> labels;

    @OutputCustomType.Constructor
    private LocalDiskInitializeParamsResponse(
        @OutputCustomType.Parameter("description") String description,
        @OutputCustomType.Parameter("diskName") String diskName,
        @OutputCustomType.Parameter("diskSizeGb") String diskSizeGb,
        @OutputCustomType.Parameter("diskType") String diskType,
        @OutputCustomType.Parameter("labels") Map<String,String> labels) {
        this.description = description;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.labels = labels;
    }

    /**
     * Optional. Provide this property when creating the disk.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
    */
    public String getDiskName() {
        return this.diskName;
    }
    /**
     * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
    */
    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
    */
    public String getDiskType() {
        return this.diskType;
    }
    /**
     * Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskInitializeParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String diskName;
        private String diskSizeGb;
        private String diskType;
        private Map<String,String> labels;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskInitializeParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.labels = defaults.labels;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDiskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }

        public Builder setDiskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setDiskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public LocalDiskInitializeParamsResponse build() {
            return new LocalDiskInitializeParamsResponse(description, diskName, diskSizeGb, diskType, labels);
        }
    }
}
