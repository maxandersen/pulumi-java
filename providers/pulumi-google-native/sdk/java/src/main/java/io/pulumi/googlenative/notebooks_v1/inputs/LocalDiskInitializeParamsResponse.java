// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Input only. Specifies the parameters for a new disk that will be created alongside the new instance. Use initialization parameters to create boot disks or local SSDs attached to the new runtime. This property is mutually exclusive with the source property; you can only define one or the other, but not both.
 * 
 */
public final class LocalDiskInitializeParamsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LocalDiskInitializeParamsResponse Empty = new LocalDiskInitializeParamsResponse();

    /**
     * Optional. Provide this property when creating the disk.
     * 
     */
    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    /**
     * Optional. Specifies the disk name. If not specified, the default is to use the name of the instance. If the disk with the instance name exists already in the given zone/region, a new name will be automatically generated.
     * 
     */
    @Import(name="diskName", required=true)
      private final String diskName;

    public String diskName() {
        return this.diskName;
    }

    /**
     * Optional. Specifies the size of the disk in base-2 GB. If not specified, the disk will be the same size as the image (usually 10GB). If specified, the size must be equal to or larger than 10GB. Default 100 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final String diskSizeGb;

    public String diskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Input only. The type of the boot disk attached to this instance, defaults to standard persistent disk (`PD_STANDARD`).
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String diskType() {
        return this.diskType;
    }

    /**
     * Optional. Labels to apply to this disk. These can be later modified by the disks.setLabels method. This field is only applicable for persistent disks.
     * 
     */
    @Import(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
    }

    public LocalDiskInitializeParamsResponse(
        String description,
        String diskName,
        String diskSizeGb,
        String diskType,
        Map<String,String> labels) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
    }

    private LocalDiskInitializeParamsResponse() {
        this.description = null;
        this.diskName = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.labels = Map.of();
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

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }        public LocalDiskInitializeParamsResponse build() {
            return new LocalDiskInitializeParamsResponse(description, diskName, diskSizeGb, diskType, labels);
        }
    }
}
