// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.outputs;

import com.pulumi.azurenative.storage.outputs.ImmutabilityPolicyPropertiesResponse;
import com.pulumi.azurenative.storage.outputs.LegalHoldPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBlobContainerResult {
    /**
     * Default the container to use specified encryption scope for all writes.
     * 
     */
    private final @Nullable String defaultEncryptionScope;
    /**
     * Indicates whether the blob container was deleted.
     * 
     */
    private final Boolean deleted;
    /**
     * Blob container deletion time.
     * 
     */
    private final String deletedTime;
    /**
     * Block override of encryption scope from the container default.
     * 
     */
    private final @Nullable Boolean denyEncryptionScopeOverride;
    /**
     * Resource Etag.
     * 
     */
    private final String etag;
    /**
     * The hasImmutabilityPolicy public property is set to true by SRP if ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false by SRP if ImmutabilityPolicy has not been created for this container.
     * 
     */
    private final Boolean hasImmutabilityPolicy;
    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
     */
    private final Boolean hasLegalHold;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The ImmutabilityPolicy property of the container.
     * 
     */
    private final ImmutabilityPolicyPropertiesResponse immutabilityPolicy;
    /**
     * Returns the date and time the container was last modified.
     * 
     */
    private final String lastModifiedTime;
    /**
     * Specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased.
     * 
     */
    private final String leaseDuration;
    /**
     * Lease state of the container.
     * 
     */
    private final String leaseState;
    /**
     * The lease status of the container.
     * 
     */
    private final String leaseStatus;
    /**
     * The LegalHold property of the container.
     * 
     */
    private final LegalHoldPropertiesResponse legalHold;
    /**
     * A name-value pair to associate with the container as metadata.
     * 
     */
    private final @Nullable Map<String,String> metadata;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Specifies whether data in the container may be accessed publicly and the level of access.
     * 
     */
    private final @Nullable String publicAccess;
    /**
     * Remaining retention days for soft deleted blob container.
     * 
     */
    private final Integer remainingRetentionDays;
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;
    /**
     * The version of the deleted blob container.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetBlobContainerResult(
        @CustomType.Parameter("defaultEncryptionScope") @Nullable String defaultEncryptionScope,
        @CustomType.Parameter("deleted") Boolean deleted,
        @CustomType.Parameter("deletedTime") String deletedTime,
        @CustomType.Parameter("denyEncryptionScopeOverride") @Nullable Boolean denyEncryptionScopeOverride,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("hasImmutabilityPolicy") Boolean hasImmutabilityPolicy,
        @CustomType.Parameter("hasLegalHold") Boolean hasLegalHold,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("immutabilityPolicy") ImmutabilityPolicyPropertiesResponse immutabilityPolicy,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("leaseDuration") String leaseDuration,
        @CustomType.Parameter("leaseState") String leaseState,
        @CustomType.Parameter("leaseStatus") String leaseStatus,
        @CustomType.Parameter("legalHold") LegalHoldPropertiesResponse legalHold,
        @CustomType.Parameter("metadata") @Nullable Map<String,String> metadata,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("publicAccess") @Nullable String publicAccess,
        @CustomType.Parameter("remainingRetentionDays") Integer remainingRetentionDays,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") String version) {
        this.defaultEncryptionScope = defaultEncryptionScope;
        this.deleted = deleted;
        this.deletedTime = deletedTime;
        this.denyEncryptionScopeOverride = denyEncryptionScopeOverride;
        this.etag = etag;
        this.hasImmutabilityPolicy = hasImmutabilityPolicy;
        this.hasLegalHold = hasLegalHold;
        this.id = id;
        this.immutabilityPolicy = immutabilityPolicy;
        this.lastModifiedTime = lastModifiedTime;
        this.leaseDuration = leaseDuration;
        this.leaseState = leaseState;
        this.leaseStatus = leaseStatus;
        this.legalHold = legalHold;
        this.metadata = metadata;
        this.name = name;
        this.publicAccess = publicAccess;
        this.remainingRetentionDays = remainingRetentionDays;
        this.type = type;
        this.version = version;
    }

    /**
     * Default the container to use specified encryption scope for all writes.
     * 
    */
    public Optional<String> defaultEncryptionScope() {
        return Optional.ofNullable(this.defaultEncryptionScope);
    }
    /**
     * Indicates whether the blob container was deleted.
     * 
    */
    public Boolean deleted() {
        return this.deleted;
    }
    /**
     * Blob container deletion time.
     * 
    */
    public String deletedTime() {
        return this.deletedTime;
    }
    /**
     * Block override of encryption scope from the container default.
     * 
    */
    public Optional<Boolean> denyEncryptionScopeOverride() {
        return Optional.ofNullable(this.denyEncryptionScopeOverride);
    }
    /**
     * Resource Etag.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The hasImmutabilityPolicy public property is set to true by SRP if ImmutabilityPolicy has been created for this container. The hasImmutabilityPolicy public property is set to false by SRP if ImmutabilityPolicy has not been created for this container.
     * 
    */
    public Boolean hasImmutabilityPolicy() {
        return this.hasImmutabilityPolicy;
    }
    /**
     * The hasLegalHold public property is set to true by SRP if there are at least one existing tag. The hasLegalHold public property is set to false by SRP if all existing legal hold tags are cleared out. There can be a maximum of 1000 blob containers with hasLegalHold=true for a given account.
     * 
    */
    public Boolean hasLegalHold() {
        return this.hasLegalHold;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The ImmutabilityPolicy property of the container.
     * 
    */
    public ImmutabilityPolicyPropertiesResponse immutabilityPolicy() {
        return this.immutabilityPolicy;
    }
    /**
     * Returns the date and time the container was last modified.
     * 
    */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Specifies whether the lease on a container is of infinite or fixed duration, only when the container is leased.
     * 
    */
    public String leaseDuration() {
        return this.leaseDuration;
    }
    /**
     * Lease state of the container.
     * 
    */
    public String leaseState() {
        return this.leaseState;
    }
    /**
     * The lease status of the container.
     * 
    */
    public String leaseStatus() {
        return this.leaseStatus;
    }
    /**
     * The LegalHold property of the container.
     * 
    */
    public LegalHoldPropertiesResponse legalHold() {
        return this.legalHold;
    }
    /**
     * A name-value pair to associate with the container as metadata.
     * 
    */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * The name of the resource
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies whether data in the container may be accessed publicly and the level of access.
     * 
    */
    public Optional<String> publicAccess() {
        return Optional.ofNullable(this.publicAccess);
    }
    /**
     * Remaining retention days for soft deleted blob container.
     * 
    */
    public Integer remainingRetentionDays() {
        return this.remainingRetentionDays;
    }
    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * The version of the deleted blob container.
     * 
    */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBlobContainerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultEncryptionScope;
        private Boolean deleted;
        private String deletedTime;
        private @Nullable Boolean denyEncryptionScopeOverride;
        private String etag;
        private Boolean hasImmutabilityPolicy;
        private Boolean hasLegalHold;
        private String id;
        private ImmutabilityPolicyPropertiesResponse immutabilityPolicy;
        private String lastModifiedTime;
        private String leaseDuration;
        private String leaseState;
        private String leaseStatus;
        private LegalHoldPropertiesResponse legalHold;
        private @Nullable Map<String,String> metadata;
        private String name;
        private @Nullable String publicAccess;
        private Integer remainingRetentionDays;
        private String type;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBlobContainerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultEncryptionScope = defaults.defaultEncryptionScope;
    	      this.deleted = defaults.deleted;
    	      this.deletedTime = defaults.deletedTime;
    	      this.denyEncryptionScopeOverride = defaults.denyEncryptionScopeOverride;
    	      this.etag = defaults.etag;
    	      this.hasImmutabilityPolicy = defaults.hasImmutabilityPolicy;
    	      this.hasLegalHold = defaults.hasLegalHold;
    	      this.id = defaults.id;
    	      this.immutabilityPolicy = defaults.immutabilityPolicy;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.leaseDuration = defaults.leaseDuration;
    	      this.leaseState = defaults.leaseState;
    	      this.leaseStatus = defaults.leaseStatus;
    	      this.legalHold = defaults.legalHold;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.publicAccess = defaults.publicAccess;
    	      this.remainingRetentionDays = defaults.remainingRetentionDays;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder defaultEncryptionScope(@Nullable String defaultEncryptionScope) {
            this.defaultEncryptionScope = defaultEncryptionScope;
            return this;
        }
        public Builder deleted(Boolean deleted) {
            this.deleted = Objects.requireNonNull(deleted);
            return this;
        }
        public Builder deletedTime(String deletedTime) {
            this.deletedTime = Objects.requireNonNull(deletedTime);
            return this;
        }
        public Builder denyEncryptionScopeOverride(@Nullable Boolean denyEncryptionScopeOverride) {
            this.denyEncryptionScopeOverride = denyEncryptionScopeOverride;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder hasImmutabilityPolicy(Boolean hasImmutabilityPolicy) {
            this.hasImmutabilityPolicy = Objects.requireNonNull(hasImmutabilityPolicy);
            return this;
        }
        public Builder hasLegalHold(Boolean hasLegalHold) {
            this.hasLegalHold = Objects.requireNonNull(hasLegalHold);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder immutabilityPolicy(ImmutabilityPolicyPropertiesResponse immutabilityPolicy) {
            this.immutabilityPolicy = Objects.requireNonNull(immutabilityPolicy);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder leaseDuration(String leaseDuration) {
            this.leaseDuration = Objects.requireNonNull(leaseDuration);
            return this;
        }
        public Builder leaseState(String leaseState) {
            this.leaseState = Objects.requireNonNull(leaseState);
            return this;
        }
        public Builder leaseStatus(String leaseStatus) {
            this.leaseStatus = Objects.requireNonNull(leaseStatus);
            return this;
        }
        public Builder legalHold(LegalHoldPropertiesResponse legalHold) {
            this.legalHold = Objects.requireNonNull(legalHold);
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder publicAccess(@Nullable String publicAccess) {
            this.publicAccess = publicAccess;
            return this;
        }
        public Builder remainingRetentionDays(Integer remainingRetentionDays) {
            this.remainingRetentionDays = Objects.requireNonNull(remainingRetentionDays);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetBlobContainerResult build() {
            return new GetBlobContainerResult(defaultEncryptionScope, deleted, deletedTime, denyEncryptionScopeOverride, etag, hasImmutabilityPolicy, hasLegalHold, id, immutabilityPolicy, lastModifiedTime, leaseDuration, leaseState, leaseStatus, legalHold, metadata, name, publicAccess, remainingRetentionDays, type, version);
        }
    }
}
