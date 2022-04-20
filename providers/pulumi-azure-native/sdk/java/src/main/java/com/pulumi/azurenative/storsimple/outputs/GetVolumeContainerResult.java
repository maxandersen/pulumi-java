// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.outputs;

import com.pulumi.azurenative.storsimple.outputs.AsymmetricEncryptedSecretResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeContainerResult {
    /**
     * The bandwidth-rate set on the volume container.
     * 
     */
    private final @Nullable Integer bandWidthRateInMbps;
    /**
     * The ID of the bandwidth setting associated with the volume container.
     * 
     */
    private final @Nullable String bandwidthSettingId;
    /**
     * The key used to encrypt data in the volume container. It is required when property &#39;EncryptionStatus&#39; is &#34;Enabled&#34;.
     * 
     */
    private final @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
    /**
     * The flag to denote whether encryption is enabled or not.
     * 
     */
    private final String encryptionStatus;
    /**
     * The path ID that uniquely identifies the object.
     * 
     */
    private final String id;
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
     */
    private final @Nullable String kind;
    /**
     * The name of the object.
     * 
     */
    private final String name;
    /**
     * The owner ship status of the volume container. Only when the status is &#34;NotOwned&#34;, the delete operation on the volume container is permitted.
     * 
     */
    private final String ownerShipStatus;
    /**
     * The path ID of storage account associated with the volume container.
     * 
     */
    private final String storageAccountCredentialId;
    /**
     * The total cloud storage for the volume container.
     * 
     */
    private final Double totalCloudStorageUsageInBytes;
    /**
     * The hierarchical type of the object.
     * 
     */
    private final String type;
    /**
     * The number of volumes in the volume Container.
     * 
     */
    private final Integer volumeCount;

    @CustomType.Constructor
    private GetVolumeContainerResult(
        @CustomType.Parameter("bandWidthRateInMbps") @Nullable Integer bandWidthRateInMbps,
        @CustomType.Parameter("bandwidthSettingId") @Nullable String bandwidthSettingId,
        @CustomType.Parameter("encryptionKey") @Nullable AsymmetricEncryptedSecretResponse encryptionKey,
        @CustomType.Parameter("encryptionStatus") String encryptionStatus,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ownerShipStatus") String ownerShipStatus,
        @CustomType.Parameter("storageAccountCredentialId") String storageAccountCredentialId,
        @CustomType.Parameter("totalCloudStorageUsageInBytes") Double totalCloudStorageUsageInBytes,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("volumeCount") Integer volumeCount) {
        this.bandWidthRateInMbps = bandWidthRateInMbps;
        this.bandwidthSettingId = bandwidthSettingId;
        this.encryptionKey = encryptionKey;
        this.encryptionStatus = encryptionStatus;
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.ownerShipStatus = ownerShipStatus;
        this.storageAccountCredentialId = storageAccountCredentialId;
        this.totalCloudStorageUsageInBytes = totalCloudStorageUsageInBytes;
        this.type = type;
        this.volumeCount = volumeCount;
    }

    /**
     * The bandwidth-rate set on the volume container.
     * 
    */
    public Optional<Integer> bandWidthRateInMbps() {
        return Optional.ofNullable(this.bandWidthRateInMbps);
    }
    /**
     * The ID of the bandwidth setting associated with the volume container.
     * 
    */
    public Optional<String> bandwidthSettingId() {
        return Optional.ofNullable(this.bandwidthSettingId);
    }
    /**
     * The key used to encrypt data in the volume container. It is required when property &#39;EncryptionStatus&#39; is &#34;Enabled&#34;.
     * 
    */
    public Optional<AsymmetricEncryptedSecretResponse> encryptionKey() {
        return Optional.ofNullable(this.encryptionKey);
    }
    /**
     * The flag to denote whether encryption is enabled or not.
     * 
    */
    public String encryptionStatus() {
        return this.encryptionStatus;
    }
    /**
     * The path ID that uniquely identifies the object.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The Kind of the object. Currently only Series8000 is supported
     * 
    */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * The name of the object.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The owner ship status of the volume container. Only when the status is &#34;NotOwned&#34;, the delete operation on the volume container is permitted.
     * 
    */
    public String ownerShipStatus() {
        return this.ownerShipStatus;
    }
    /**
     * The path ID of storage account associated with the volume container.
     * 
    */
    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }
    /**
     * The total cloud storage for the volume container.
     * 
    */
    public Double totalCloudStorageUsageInBytes() {
        return this.totalCloudStorageUsageInBytes;
    }
    /**
     * The hierarchical type of the object.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The number of volumes in the volume Container.
     * 
    */
    public Integer volumeCount() {
        return this.volumeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandWidthRateInMbps;
        private @Nullable String bandwidthSettingId;
        private @Nullable AsymmetricEncryptedSecretResponse encryptionKey;
        private String encryptionStatus;
        private String id;
        private @Nullable String kind;
        private String name;
        private String ownerShipStatus;
        private String storageAccountCredentialId;
        private Double totalCloudStorageUsageInBytes;
        private String type;
        private Integer volumeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandWidthRateInMbps = defaults.bandWidthRateInMbps;
    	      this.bandwidthSettingId = defaults.bandwidthSettingId;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.encryptionStatus = defaults.encryptionStatus;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.ownerShipStatus = defaults.ownerShipStatus;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
    	      this.totalCloudStorageUsageInBytes = defaults.totalCloudStorageUsageInBytes;
    	      this.type = defaults.type;
    	      this.volumeCount = defaults.volumeCount;
        }

        public Builder bandWidthRateInMbps(@Nullable Integer bandWidthRateInMbps) {
            this.bandWidthRateInMbps = bandWidthRateInMbps;
            return this;
        }
        public Builder bandwidthSettingId(@Nullable String bandwidthSettingId) {
            this.bandwidthSettingId = bandwidthSettingId;
            return this;
        }
        public Builder encryptionKey(@Nullable AsymmetricEncryptedSecretResponse encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionStatus(String encryptionStatus) {
            this.encryptionStatus = Objects.requireNonNull(encryptionStatus);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ownerShipStatus(String ownerShipStatus) {
            this.ownerShipStatus = Objects.requireNonNull(ownerShipStatus);
            return this;
        }
        public Builder storageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }
        public Builder totalCloudStorageUsageInBytes(Double totalCloudStorageUsageInBytes) {
            this.totalCloudStorageUsageInBytes = Objects.requireNonNull(totalCloudStorageUsageInBytes);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder volumeCount(Integer volumeCount) {
            this.volumeCount = Objects.requireNonNull(volumeCount);
            return this;
        }        public GetVolumeContainerResult build() {
            return new GetVolumeContainerResult(bandWidthRateInMbps, bandwidthSettingId, encryptionKey, encryptionStatus, id, kind, name, ownerShipStatus, storageAccountCredentialId, totalCloudStorageUsageInBytes, type, volumeCount);
        }
    }
}
