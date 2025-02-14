// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.baremetalsolution_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSnapshotResult {
    /**
     * @return The creation time of the storage volume snapshot.
     * 
     */
    private final String createTime;
    /**
     * @return The description of the storage volume snapshot.
     * 
     */
    private final String description;
    /**
     * @return The name of the storage volume snapshot.
     * 
     */
    private final String name;
    /**
     * @return The size of the storage volume snapshot, in bytes.
     * 
     */
    private final String sizeBytes;
    /**
     * @return The storage volume this snapshot belongs to.
     * 
     */
    private final String storageVolume;

    @CustomType.Constructor
    private GetSnapshotResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sizeBytes") String sizeBytes,
        @CustomType.Parameter("storageVolume") String storageVolume) {
        this.createTime = createTime;
        this.description = description;
        this.name = name;
        this.sizeBytes = sizeBytes;
        this.storageVolume = storageVolume;
    }

    /**
     * @return The creation time of the storage volume snapshot.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description of the storage volume snapshot.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The name of the storage volume snapshot.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The size of the storage volume snapshot, in bytes.
     * 
     */
    public String sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * @return The storage volume this snapshot belongs to.
     * 
     */
    public String storageVolume() {
        return this.storageVolume;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSnapshotResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String description;
        private String name;
        private String sizeBytes;
        private String storageVolume;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSnapshotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.sizeBytes = defaults.sizeBytes;
    	      this.storageVolume = defaults.storageVolume;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sizeBytes(String sizeBytes) {
            this.sizeBytes = Objects.requireNonNull(sizeBytes);
            return this;
        }
        public Builder storageVolume(String storageVolume) {
            this.storageVolume = Objects.requireNonNull(storageVolume);
            return this;
        }        public GetSnapshotResult build() {
            return new GetSnapshotResult(createTime, description, name, sizeBytes, storageVolume);
        }
    }
}
