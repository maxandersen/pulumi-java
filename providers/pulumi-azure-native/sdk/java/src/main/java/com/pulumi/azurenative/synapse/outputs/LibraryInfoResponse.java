// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LibraryInfoResponse {
    /**
     * Storage blob container name.
     * 
     */
    private final @Nullable String containerName;
    /**
     * Creator Id of the library/package.
     * 
     */
    private final String creatorId;
    /**
     * Name of the library.
     * 
     */
    private final @Nullable String name;
    /**
     * Storage blob path of library.
     * 
     */
    private final @Nullable String path;
    /**
     * Provisioning status of the library/package.
     * 
     */
    private final String provisioningStatus;
    /**
     * Type of the library.
     * 
     */
    private final @Nullable String type;
    /**
     * The last update time of the library.
     * 
     */
    private final String uploadedTimestamp;

    @CustomType.Constructor
    private LibraryInfoResponse(
        @CustomType.Parameter("containerName") @Nullable String containerName,
        @CustomType.Parameter("creatorId") String creatorId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("provisioningStatus") String provisioningStatus,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("uploadedTimestamp") String uploadedTimestamp) {
        this.containerName = containerName;
        this.creatorId = creatorId;
        this.name = name;
        this.path = path;
        this.provisioningStatus = provisioningStatus;
        this.type = type;
        this.uploadedTimestamp = uploadedTimestamp;
    }

    /**
     * Storage blob container name.
     * 
    */
    public Optional<String> containerName() {
        return Optional.ofNullable(this.containerName);
    }
    /**
     * Creator Id of the library/package.
     * 
    */
    public String creatorId() {
        return this.creatorId;
    }
    /**
     * Name of the library.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Storage blob path of library.
     * 
    */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * Provisioning status of the library/package.
     * 
    */
    public String provisioningStatus() {
        return this.provisioningStatus;
    }
    /**
     * Type of the library.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The last update time of the library.
     * 
    */
    public String uploadedTimestamp() {
        return this.uploadedTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private String creatorId;
        private @Nullable String name;
        private @Nullable String path;
        private String provisioningStatus;
        private @Nullable String type;
        private String uploadedTimestamp;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.creatorId = defaults.creatorId;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.provisioningStatus = defaults.provisioningStatus;
    	      this.type = defaults.type;
    	      this.uploadedTimestamp = defaults.uploadedTimestamp;
        }

        public Builder containerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder creatorId(String creatorId) {
            this.creatorId = Objects.requireNonNull(creatorId);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder provisioningStatus(String provisioningStatus) {
            this.provisioningStatus = Objects.requireNonNull(provisioningStatus);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder uploadedTimestamp(String uploadedTimestamp) {
            this.uploadedTimestamp = Objects.requireNonNull(uploadedTimestamp);
            return this;
        }        public LibraryInfoResponse build() {
            return new LibraryInfoResponse(containerName, creatorId, name, path, provisioningStatus, type, uploadedTimestamp);
        }
    }
}
