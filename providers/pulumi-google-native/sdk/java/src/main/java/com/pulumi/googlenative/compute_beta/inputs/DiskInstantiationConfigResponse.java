// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A specification of the desired way to instantiate a disk in the instance template when its created from a source instance.
 * 
 */
public final class DiskInstantiationConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskInstantiationConfigResponse Empty = new DiskInstantiationConfigResponse();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete", required=true)
      private final Boolean autoDelete;

    public Boolean autoDelete() {
        return this.autoDelete;
    }

    /**
     * The custom source image to be used to restore this disk when instantiating this instance template.
     * 
     */
    @Import(name="customImage", required=true)
      private final String customImage;

    public String customImage() {
        return this.customImage;
    }

    /**
     * Specifies the device name of the disk to which the configurations apply to.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String deviceName() {
        return this.deviceName;
    }

    /**
     * Specifies whether to include the disk and what image to use. Possible values are: - source-image: to use the same image that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - source-image-family: to use the same image family that was used to create the source instance&#39;s corresponding disk. Applicable to the boot disk and additional read-write disks. - custom-image: to use a user-provided image url for disk creation. Applicable to the boot disk and additional read-write disks. - attach-read-only: to attach a read-only disk. Applicable to read-only disks. - do-not-include: to exclude a disk from the template. Applicable to additional read-write disks, local SSDs, and read-only disks.
     * 
     */
    @Import(name="instantiateFrom", required=true)
      private final String instantiateFrom;

    public String instantiateFrom() {
        return this.instantiateFrom;
    }

    public DiskInstantiationConfigResponse(
        Boolean autoDelete,
        String customImage,
        String deviceName,
        String instantiateFrom) {
        this.autoDelete = Objects.requireNonNull(autoDelete, "expected parameter 'autoDelete' to be non-null");
        this.customImage = Objects.requireNonNull(customImage, "expected parameter 'customImage' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.instantiateFrom = Objects.requireNonNull(instantiateFrom, "expected parameter 'instantiateFrom' to be non-null");
    }

    private DiskInstantiationConfigResponse() {
        this.autoDelete = null;
        this.customImage = null;
        this.deviceName = null;
        this.instantiateFrom = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskInstantiationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private String customImage;
        private String deviceName;
        private String instantiateFrom;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskInstantiationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.customImage = defaults.customImage;
    	      this.deviceName = defaults.deviceName;
    	      this.instantiateFrom = defaults.instantiateFrom;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder customImage(String customImage) {
            this.customImage = Objects.requireNonNull(customImage);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder instantiateFrom(String instantiateFrom) {
            this.instantiateFrom = Objects.requireNonNull(instantiateFrom);
            return this;
        }        public DiskInstantiationConfigResponse build() {
            return new DiskInstantiationConfigResponse(autoDelete, customImage, deviceName, instantiateFrom);
        }
    }
}
