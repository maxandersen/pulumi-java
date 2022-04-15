// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A2A protected disk details.
 * 
 */
public final class A2AProtectedDiskDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final A2AProtectedDiskDetailsResponse Empty = new A2AProtectedDiskDetailsResponse();

    /**
     * The disk level operations list.
     * 
     */
    @Import(name="allowedDiskLevelOperation")
      private final @Nullable List<String> allowedDiskLevelOperation;

    public List<String> allowedDiskLevelOperation() {
        return this.allowedDiskLevelOperation == null ? List.of() : this.allowedDiskLevelOperation;
    }

    /**
     * The data pending at source virtual machine in MB.
     * 
     */
    @Import(name="dataPendingAtSourceAgentInMB")
      private final @Nullable Double dataPendingAtSourceAgentInMB;

    public Optional<Double> dataPendingAtSourceAgentInMB() {
        return this.dataPendingAtSourceAgentInMB == null ? Optional.empty() : Optional.ofNullable(this.dataPendingAtSourceAgentInMB);
    }

    /**
     * The data pending for replication in MB at staging account.
     * 
     */
    @Import(name="dataPendingInStagingStorageAccountInMB")
      private final @Nullable Double dataPendingInStagingStorageAccountInMB;

    public Optional<Double> dataPendingInStagingStorageAccountInMB() {
        return this.dataPendingInStagingStorageAccountInMB == null ? Optional.empty() : Optional.ofNullable(this.dataPendingInStagingStorageAccountInMB);
    }

    /**
     * The KeyVault resource id for secret (BEK).
     * 
     */
    @Import(name="dekKeyVaultArmId")
      private final @Nullable String dekKeyVaultArmId;

    public Optional<String> dekKeyVaultArmId() {
        return this.dekKeyVaultArmId == null ? Optional.empty() : Optional.ofNullable(this.dekKeyVaultArmId);
    }

    /**
     * The disk capacity in bytes.
     * 
     */
    @Import(name="diskCapacityInBytes")
      private final @Nullable Double diskCapacityInBytes;

    public Optional<Double> diskCapacityInBytes() {
        return this.diskCapacityInBytes == null ? Optional.empty() : Optional.ofNullable(this.diskCapacityInBytes);
    }

    /**
     * The disk name.
     * 
     */
    @Import(name="diskName")
      private final @Nullable String diskName;

    public Optional<String> diskName() {
        return this.diskName == null ? Optional.empty() : Optional.ofNullable(this.diskName);
    }

    /**
     * The disk state.
     * 
     */
    @Import(name="diskState")
      private final @Nullable String diskState;

    public Optional<String> diskState() {
        return this.diskState == null ? Optional.empty() : Optional.ofNullable(this.diskState);
    }

    /**
     * The type of disk.
     * 
     */
    @Import(name="diskType")
      private final @Nullable String diskType;

    public Optional<String> diskType() {
        return this.diskType == null ? Optional.empty() : Optional.ofNullable(this.diskType);
    }

    /**
     * The disk uri.
     * 
     */
    @Import(name="diskUri")
      private final @Nullable String diskUri;

    public Optional<String> diskUri() {
        return this.diskUri == null ? Optional.empty() : Optional.ofNullable(this.diskUri);
    }

    /**
     * A value indicating whether vm has encrypted os disk or not.
     * 
     */
    @Import(name="isDiskEncrypted")
      private final @Nullable Boolean isDiskEncrypted;

    public Optional<Boolean> isDiskEncrypted() {
        return this.isDiskEncrypted == null ? Optional.empty() : Optional.ofNullable(this.isDiskEncrypted);
    }

    /**
     * A value indicating whether disk key got encrypted or not.
     * 
     */
    @Import(name="isDiskKeyEncrypted")
      private final @Nullable Boolean isDiskKeyEncrypted;

    public Optional<Boolean> isDiskKeyEncrypted() {
        return this.isDiskKeyEncrypted == null ? Optional.empty() : Optional.ofNullable(this.isDiskKeyEncrypted);
    }

    /**
     * The KeyVault resource id for key (KEK).
     * 
     */
    @Import(name="kekKeyVaultArmId")
      private final @Nullable String kekKeyVaultArmId;

    public Optional<String> kekKeyVaultArmId() {
        return this.kekKeyVaultArmId == null ? Optional.empty() : Optional.ofNullable(this.kekKeyVaultArmId);
    }

    /**
     * The key URL / identifier (KEK).
     * 
     */
    @Import(name="keyIdentifier")
      private final @Nullable String keyIdentifier;

    public Optional<String> keyIdentifier() {
        return this.keyIdentifier == null ? Optional.empty() : Optional.ofNullable(this.keyIdentifier);
    }

    /**
     * The type of the monitoring job. The progress is contained in MonitoringPercentageCompletion property.
     * 
     */
    @Import(name="monitoringJobType")
      private final @Nullable String monitoringJobType;

    public Optional<String> monitoringJobType() {
        return this.monitoringJobType == null ? Optional.empty() : Optional.ofNullable(this.monitoringJobType);
    }

    /**
     * The percentage of the monitoring job. The type of the monitoring job is defined by MonitoringJobType property.
     * 
     */
    @Import(name="monitoringPercentageCompletion")
      private final @Nullable Integer monitoringPercentageCompletion;

    public Optional<Integer> monitoringPercentageCompletion() {
        return this.monitoringPercentageCompletion == null ? Optional.empty() : Optional.ofNullable(this.monitoringPercentageCompletion);
    }

    /**
     * The primary disk storage account.
     * 
     */
    @Import(name="primaryDiskAzureStorageAccountId")
      private final @Nullable String primaryDiskAzureStorageAccountId;

    public Optional<String> primaryDiskAzureStorageAccountId() {
        return this.primaryDiskAzureStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.primaryDiskAzureStorageAccountId);
    }

    /**
     * The primary staging storage account.
     * 
     */
    @Import(name="primaryStagingAzureStorageAccountId")
      private final @Nullable String primaryStagingAzureStorageAccountId;

    public Optional<String> primaryStagingAzureStorageAccountId() {
        return this.primaryStagingAzureStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.primaryStagingAzureStorageAccountId);
    }

    /**
     * The recovery disk storage account.
     * 
     */
    @Import(name="recoveryAzureStorageAccountId")
      private final @Nullable String recoveryAzureStorageAccountId;

    public Optional<String> recoveryAzureStorageAccountId() {
        return this.recoveryAzureStorageAccountId == null ? Optional.empty() : Optional.ofNullable(this.recoveryAzureStorageAccountId);
    }

    /**
     * Recovery disk uri.
     * 
     */
    @Import(name="recoveryDiskUri")
      private final @Nullable String recoveryDiskUri;

    public Optional<String> recoveryDiskUri() {
        return this.recoveryDiskUri == null ? Optional.empty() : Optional.ofNullable(this.recoveryDiskUri);
    }

    /**
     * A value indicating whether resync is required for this disk.
     * 
     */
    @Import(name="resyncRequired")
      private final @Nullable Boolean resyncRequired;

    public Optional<Boolean> resyncRequired() {
        return this.resyncRequired == null ? Optional.empty() : Optional.ofNullable(this.resyncRequired);
    }

    /**
     * The secret URL / identifier (BEK).
     * 
     */
    @Import(name="secretIdentifier")
      private final @Nullable String secretIdentifier;

    public Optional<String> secretIdentifier() {
        return this.secretIdentifier == null ? Optional.empty() : Optional.ofNullable(this.secretIdentifier);
    }

    public A2AProtectedDiskDetailsResponse(
        @Nullable List<String> allowedDiskLevelOperation,
        @Nullable Double dataPendingAtSourceAgentInMB,
        @Nullable Double dataPendingInStagingStorageAccountInMB,
        @Nullable String dekKeyVaultArmId,
        @Nullable Double diskCapacityInBytes,
        @Nullable String diskName,
        @Nullable String diskState,
        @Nullable String diskType,
        @Nullable String diskUri,
        @Nullable Boolean isDiskEncrypted,
        @Nullable Boolean isDiskKeyEncrypted,
        @Nullable String kekKeyVaultArmId,
        @Nullable String keyIdentifier,
        @Nullable String monitoringJobType,
        @Nullable Integer monitoringPercentageCompletion,
        @Nullable String primaryDiskAzureStorageAccountId,
        @Nullable String primaryStagingAzureStorageAccountId,
        @Nullable String recoveryAzureStorageAccountId,
        @Nullable String recoveryDiskUri,
        @Nullable Boolean resyncRequired,
        @Nullable String secretIdentifier) {
        this.allowedDiskLevelOperation = allowedDiskLevelOperation;
        this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
        this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
        this.dekKeyVaultArmId = dekKeyVaultArmId;
        this.diskCapacityInBytes = diskCapacityInBytes;
        this.diskName = diskName;
        this.diskState = diskState;
        this.diskType = diskType;
        this.diskUri = diskUri;
        this.isDiskEncrypted = isDiskEncrypted;
        this.isDiskKeyEncrypted = isDiskKeyEncrypted;
        this.kekKeyVaultArmId = kekKeyVaultArmId;
        this.keyIdentifier = keyIdentifier;
        this.monitoringJobType = monitoringJobType;
        this.monitoringPercentageCompletion = monitoringPercentageCompletion;
        this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
        this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
        this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
        this.recoveryDiskUri = recoveryDiskUri;
        this.resyncRequired = resyncRequired;
        this.secretIdentifier = secretIdentifier;
    }

    private A2AProtectedDiskDetailsResponse() {
        this.allowedDiskLevelOperation = List.of();
        this.dataPendingAtSourceAgentInMB = null;
        this.dataPendingInStagingStorageAccountInMB = null;
        this.dekKeyVaultArmId = null;
        this.diskCapacityInBytes = null;
        this.diskName = null;
        this.diskState = null;
        this.diskType = null;
        this.diskUri = null;
        this.isDiskEncrypted = null;
        this.isDiskKeyEncrypted = null;
        this.kekKeyVaultArmId = null;
        this.keyIdentifier = null;
        this.monitoringJobType = null;
        this.monitoringPercentageCompletion = null;
        this.primaryDiskAzureStorageAccountId = null;
        this.primaryStagingAzureStorageAccountId = null;
        this.recoveryAzureStorageAccountId = null;
        this.recoveryDiskUri = null;
        this.resyncRequired = null;
        this.secretIdentifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(A2AProtectedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedDiskLevelOperation;
        private @Nullable Double dataPendingAtSourceAgentInMB;
        private @Nullable Double dataPendingInStagingStorageAccountInMB;
        private @Nullable String dekKeyVaultArmId;
        private @Nullable Double diskCapacityInBytes;
        private @Nullable String diskName;
        private @Nullable String diskState;
        private @Nullable String diskType;
        private @Nullable String diskUri;
        private @Nullable Boolean isDiskEncrypted;
        private @Nullable Boolean isDiskKeyEncrypted;
        private @Nullable String kekKeyVaultArmId;
        private @Nullable String keyIdentifier;
        private @Nullable String monitoringJobType;
        private @Nullable Integer monitoringPercentageCompletion;
        private @Nullable String primaryDiskAzureStorageAccountId;
        private @Nullable String primaryStagingAzureStorageAccountId;
        private @Nullable String recoveryAzureStorageAccountId;
        private @Nullable String recoveryDiskUri;
        private @Nullable Boolean resyncRequired;
        private @Nullable String secretIdentifier;

        public Builder() {
    	      // Empty
        }

        public Builder(A2AProtectedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedDiskLevelOperation = defaults.allowedDiskLevelOperation;
    	      this.dataPendingAtSourceAgentInMB = defaults.dataPendingAtSourceAgentInMB;
    	      this.dataPendingInStagingStorageAccountInMB = defaults.dataPendingInStagingStorageAccountInMB;
    	      this.dekKeyVaultArmId = defaults.dekKeyVaultArmId;
    	      this.diskCapacityInBytes = defaults.diskCapacityInBytes;
    	      this.diskName = defaults.diskName;
    	      this.diskState = defaults.diskState;
    	      this.diskType = defaults.diskType;
    	      this.diskUri = defaults.diskUri;
    	      this.isDiskEncrypted = defaults.isDiskEncrypted;
    	      this.isDiskKeyEncrypted = defaults.isDiskKeyEncrypted;
    	      this.kekKeyVaultArmId = defaults.kekKeyVaultArmId;
    	      this.keyIdentifier = defaults.keyIdentifier;
    	      this.monitoringJobType = defaults.monitoringJobType;
    	      this.monitoringPercentageCompletion = defaults.monitoringPercentageCompletion;
    	      this.primaryDiskAzureStorageAccountId = defaults.primaryDiskAzureStorageAccountId;
    	      this.primaryStagingAzureStorageAccountId = defaults.primaryStagingAzureStorageAccountId;
    	      this.recoveryAzureStorageAccountId = defaults.recoveryAzureStorageAccountId;
    	      this.recoveryDiskUri = defaults.recoveryDiskUri;
    	      this.resyncRequired = defaults.resyncRequired;
    	      this.secretIdentifier = defaults.secretIdentifier;
        }

        public Builder allowedDiskLevelOperation(@Nullable List<String> allowedDiskLevelOperation) {
            this.allowedDiskLevelOperation = allowedDiskLevelOperation;
            return this;
        }
        public Builder allowedDiskLevelOperation(String... allowedDiskLevelOperation) {
            return allowedDiskLevelOperation(List.of(allowedDiskLevelOperation));
        }
        public Builder dataPendingAtSourceAgentInMB(@Nullable Double dataPendingAtSourceAgentInMB) {
            this.dataPendingAtSourceAgentInMB = dataPendingAtSourceAgentInMB;
            return this;
        }
        public Builder dataPendingInStagingStorageAccountInMB(@Nullable Double dataPendingInStagingStorageAccountInMB) {
            this.dataPendingInStagingStorageAccountInMB = dataPendingInStagingStorageAccountInMB;
            return this;
        }
        public Builder dekKeyVaultArmId(@Nullable String dekKeyVaultArmId) {
            this.dekKeyVaultArmId = dekKeyVaultArmId;
            return this;
        }
        public Builder diskCapacityInBytes(@Nullable Double diskCapacityInBytes) {
            this.diskCapacityInBytes = diskCapacityInBytes;
            return this;
        }
        public Builder diskName(@Nullable String diskName) {
            this.diskName = diskName;
            return this;
        }
        public Builder diskState(@Nullable String diskState) {
            this.diskState = diskState;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskUri(@Nullable String diskUri) {
            this.diskUri = diskUri;
            return this;
        }
        public Builder isDiskEncrypted(@Nullable Boolean isDiskEncrypted) {
            this.isDiskEncrypted = isDiskEncrypted;
            return this;
        }
        public Builder isDiskKeyEncrypted(@Nullable Boolean isDiskKeyEncrypted) {
            this.isDiskKeyEncrypted = isDiskKeyEncrypted;
            return this;
        }
        public Builder kekKeyVaultArmId(@Nullable String kekKeyVaultArmId) {
            this.kekKeyVaultArmId = kekKeyVaultArmId;
            return this;
        }
        public Builder keyIdentifier(@Nullable String keyIdentifier) {
            this.keyIdentifier = keyIdentifier;
            return this;
        }
        public Builder monitoringJobType(@Nullable String monitoringJobType) {
            this.monitoringJobType = monitoringJobType;
            return this;
        }
        public Builder monitoringPercentageCompletion(@Nullable Integer monitoringPercentageCompletion) {
            this.monitoringPercentageCompletion = monitoringPercentageCompletion;
            return this;
        }
        public Builder primaryDiskAzureStorageAccountId(@Nullable String primaryDiskAzureStorageAccountId) {
            this.primaryDiskAzureStorageAccountId = primaryDiskAzureStorageAccountId;
            return this;
        }
        public Builder primaryStagingAzureStorageAccountId(@Nullable String primaryStagingAzureStorageAccountId) {
            this.primaryStagingAzureStorageAccountId = primaryStagingAzureStorageAccountId;
            return this;
        }
        public Builder recoveryAzureStorageAccountId(@Nullable String recoveryAzureStorageAccountId) {
            this.recoveryAzureStorageAccountId = recoveryAzureStorageAccountId;
            return this;
        }
        public Builder recoveryDiskUri(@Nullable String recoveryDiskUri) {
            this.recoveryDiskUri = recoveryDiskUri;
            return this;
        }
        public Builder resyncRequired(@Nullable Boolean resyncRequired) {
            this.resyncRequired = resyncRequired;
            return this;
        }
        public Builder secretIdentifier(@Nullable String secretIdentifier) {
            this.secretIdentifier = secretIdentifier;
            return this;
        }        public A2AProtectedDiskDetailsResponse build() {
            return new A2AProtectedDiskDetailsResponse(allowedDiskLevelOperation, dataPendingAtSourceAgentInMB, dataPendingInStagingStorageAccountInMB, dekKeyVaultArmId, diskCapacityInBytes, diskName, diskState, diskType, diskUri, isDiskEncrypted, isDiskKeyEncrypted, kekKeyVaultArmId, keyIdentifier, monitoringJobType, monitoringPercentageCompletion, primaryDiskAzureStorageAccountId, primaryStagingAzureStorageAccountId, recoveryAzureStorageAccountId, recoveryDiskUri, resyncRequired, secretIdentifier);
        }
    }
}
