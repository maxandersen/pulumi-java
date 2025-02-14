// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_alpha.outputs.DiskResourceStatusAsyncReplicationStatusResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class DiskResourceStatusResponse {
    private final DiskResourceStatusAsyncReplicationStatusResponse asyncPrimaryDisk;
    /**
     * @return Key: disk, value: AsyncReplicationStatus message
     * 
     */
    private final Map<String,String> asyncSecondaryDisks;

    @CustomType.Constructor
    private DiskResourceStatusResponse(
        @CustomType.Parameter("asyncPrimaryDisk") DiskResourceStatusAsyncReplicationStatusResponse asyncPrimaryDisk,
        @CustomType.Parameter("asyncSecondaryDisks") Map<String,String> asyncSecondaryDisks) {
        this.asyncPrimaryDisk = asyncPrimaryDisk;
        this.asyncSecondaryDisks = asyncSecondaryDisks;
    }

    public DiskResourceStatusAsyncReplicationStatusResponse asyncPrimaryDisk() {
        return this.asyncPrimaryDisk;
    }
    /**
     * @return Key: disk, value: AsyncReplicationStatus message
     * 
     */
    public Map<String,String> asyncSecondaryDisks() {
        return this.asyncSecondaryDisks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskResourceStatusAsyncReplicationStatusResponse asyncPrimaryDisk;
        private Map<String,String> asyncSecondaryDisks;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncPrimaryDisk = defaults.asyncPrimaryDisk;
    	      this.asyncSecondaryDisks = defaults.asyncSecondaryDisks;
        }

        public Builder asyncPrimaryDisk(DiskResourceStatusAsyncReplicationStatusResponse asyncPrimaryDisk) {
            this.asyncPrimaryDisk = Objects.requireNonNull(asyncPrimaryDisk);
            return this;
        }
        public Builder asyncSecondaryDisks(Map<String,String> asyncSecondaryDisks) {
            this.asyncSecondaryDisks = Objects.requireNonNull(asyncSecondaryDisks);
            return this;
        }        public DiskResourceStatusResponse build() {
            return new DiskResourceStatusResponse(asyncPrimaryDisk, asyncSecondaryDisks);
        }
    }
}
