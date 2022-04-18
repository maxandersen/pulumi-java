// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.outputs;

import com.pulumi.azurenative.media.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAssetResult {
    /**
     * The alternate ID of the Asset.
     * 
     */
    private final @Nullable String alternateId;
    /**
     * The Asset ID.
     * 
     */
    private final String assetId;
    /**
     * The name of the asset blob container.
     * 
     */
    private final @Nullable String container;
    /**
     * The creation date of the Asset.
     * 
     */
    private final String created;
    /**
     * The Asset description.
     * 
     */
    private final @Nullable String description;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The last modified date of the Asset.
     * 
     */
    private final String lastModified;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The name of the storage account.
     * 
     */
    private final @Nullable String storageAccountName;
    /**
     * The Asset encryption format. One of None or MediaStorageEncryption.
     * 
     */
    private final String storageEncryptionFormat;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetAssetResult(
        @CustomType.Parameter("alternateId") @Nullable String alternateId,
        @CustomType.Parameter("assetId") String assetId,
        @CustomType.Parameter("container") @Nullable String container,
        @CustomType.Parameter("created") String created,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("lastModified") String lastModified,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("storageAccountName") @Nullable String storageAccountName,
        @CustomType.Parameter("storageEncryptionFormat") String storageEncryptionFormat,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.alternateId = alternateId;
        this.assetId = assetId;
        this.container = container;
        this.created = created;
        this.description = description;
        this.id = id;
        this.lastModified = lastModified;
        this.name = name;
        this.storageAccountName = storageAccountName;
        this.storageEncryptionFormat = storageEncryptionFormat;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * The alternate ID of the Asset.
     * 
    */
    public Optional<String> alternateId() {
        return Optional.ofNullable(this.alternateId);
    }
    /**
     * The Asset ID.
     * 
    */
    public String assetId() {
        return this.assetId;
    }
    /**
     * The name of the asset blob container.
     * 
    */
    public Optional<String> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * The creation date of the Asset.
     * 
    */
    public String created() {
        return this.created;
    }
    /**
     * The Asset description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The last modified date of the Asset.
     * 
    */
    public String lastModified() {
        return this.lastModified;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The name of the storage account.
     * 
    */
    public Optional<String> storageAccountName() {
        return Optional.ofNullable(this.storageAccountName);
    }
    /**
     * The Asset encryption format. One of None or MediaStorageEncryption.
     * 
    */
    public String storageEncryptionFormat() {
        return this.storageEncryptionFormat;
    }
    /**
     * The system metadata relating to this resource.
     * 
    */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateId;
        private String assetId;
        private @Nullable String container;
        private String created;
        private @Nullable String description;
        private String id;
        private String lastModified;
        private String name;
        private @Nullable String storageAccountName;
        private String storageEncryptionFormat;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateId = defaults.alternateId;
    	      this.assetId = defaults.assetId;
    	      this.container = defaults.container;
    	      this.created = defaults.created;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.storageEncryptionFormat = defaults.storageEncryptionFormat;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder alternateId(@Nullable String alternateId) {
            this.alternateId = alternateId;
            return this;
        }
        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder container(@Nullable String container) {
            this.container = container;
            return this;
        }
        public Builder created(String created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder storageAccountName(@Nullable String storageAccountName) {
            this.storageAccountName = storageAccountName;
            return this;
        }
        public Builder storageEncryptionFormat(String storageEncryptionFormat) {
            this.storageEncryptionFormat = Objects.requireNonNull(storageEncryptionFormat);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetAssetResult build() {
            return new GetAssetResult(alternateId, assetId, container, created, description, id, lastModified, name, storageAccountName, storageEncryptionFormat, systemData, type);
        }
    }
}
