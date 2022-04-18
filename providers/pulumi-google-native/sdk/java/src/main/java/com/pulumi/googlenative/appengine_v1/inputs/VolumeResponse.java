// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Volumes mounted within the app container. Only applicable in the App Engine flexible environment.
 * 
 */
public final class VolumeResponse extends com.pulumi.resources.InvokeArgs {

    public static final VolumeResponse Empty = new VolumeResponse();

    /**
     * Unique name for the volume.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Volume size in gigabytes.
     * 
     */
    @Import(name="sizeGb", required=true)
      private final Double sizeGb;

    public Double sizeGb() {
        return this.sizeGb;
    }

    /**
     * Underlying volume type, e.g. 'tmpfs'.
     * 
     */
    @Import(name="volumeType", required=true)
      private final String volumeType;

    public String volumeType() {
        return this.volumeType;
    }

    public VolumeResponse(
        String name,
        Double sizeGb,
        String volumeType) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.sizeGb = Objects.requireNonNull(sizeGb, "expected parameter 'sizeGb' to be non-null");
        this.volumeType = Objects.requireNonNull(volumeType, "expected parameter 'volumeType' to be non-null");
    }

    private VolumeResponse() {
        this.name = null;
        this.sizeGb = null;
        this.volumeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double sizeGb;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sizeGb = defaults.sizeGb;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sizeGb(Double sizeGb) {
            this.sizeGb = Objects.requireNonNull(sizeGb);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public VolumeResponse build() {
            return new VolumeResponse(name, sizeGb, volumeType);
        }
    }
}
