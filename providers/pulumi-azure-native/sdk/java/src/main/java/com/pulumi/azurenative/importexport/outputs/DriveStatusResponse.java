// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DriveStatusResponse {
    /**
     * The BitLocker key used to encrypt the drive.
     * 
     */
    private final @Nullable String bitLockerKey;
    /**
     * Bytes successfully transferred for the drive.
     * 
     */
    private final @Nullable Double bytesSucceeded;
    /**
     * Detailed status about the data transfer process. This field is not returned in the response until the drive is in the Transferring state.
     * 
     */
    private final @Nullable String copyStatus;
    /**
     * The drive header hash value.
     * 
     */
    private final @Nullable String driveHeaderHash;
    /**
     * The drive's hardware serial number, without spaces.
     * 
     */
    private final @Nullable String driveId;
    /**
     * A URI that points to the blob containing the error log for the data transfer operation.
     * 
     */
    private final @Nullable String errorLogUri;
    /**
     * The relative path of the manifest file on the drive.
     * 
     */
    private final @Nullable String manifestFile;
    /**
     * The Base16-encoded MD5 hash of the manifest file on the drive.
     * 
     */
    private final @Nullable String manifestHash;
    /**
     * A URI that points to the blob containing the drive manifest file.
     * 
     */
    private final @Nullable String manifestUri;
    /**
     * Percentage completed for the drive.
     * 
     */
    private final @Nullable Integer percentComplete;
    /**
     * The drive's current state.
     * 
     */
    private final @Nullable String state;
    /**
     * A URI that points to the blob containing the verbose log for the data transfer operation.
     * 
     */
    private final @Nullable String verboseLogUri;

    @CustomType.Constructor
    private DriveStatusResponse(
        @CustomType.Parameter("bitLockerKey") @Nullable String bitLockerKey,
        @CustomType.Parameter("bytesSucceeded") @Nullable Double bytesSucceeded,
        @CustomType.Parameter("copyStatus") @Nullable String copyStatus,
        @CustomType.Parameter("driveHeaderHash") @Nullable String driveHeaderHash,
        @CustomType.Parameter("driveId") @Nullable String driveId,
        @CustomType.Parameter("errorLogUri") @Nullable String errorLogUri,
        @CustomType.Parameter("manifestFile") @Nullable String manifestFile,
        @CustomType.Parameter("manifestHash") @Nullable String manifestHash,
        @CustomType.Parameter("manifestUri") @Nullable String manifestUri,
        @CustomType.Parameter("percentComplete") @Nullable Integer percentComplete,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("verboseLogUri") @Nullable String verboseLogUri) {
        this.bitLockerKey = bitLockerKey;
        this.bytesSucceeded = bytesSucceeded;
        this.copyStatus = copyStatus;
        this.driveHeaderHash = driveHeaderHash;
        this.driveId = driveId;
        this.errorLogUri = errorLogUri;
        this.manifestFile = manifestFile;
        this.manifestHash = manifestHash;
        this.manifestUri = manifestUri;
        this.percentComplete = percentComplete;
        this.state = state;
        this.verboseLogUri = verboseLogUri;
    }

    /**
     * The BitLocker key used to encrypt the drive.
     * 
    */
    public Optional<String> bitLockerKey() {
        return Optional.ofNullable(this.bitLockerKey);
    }
    /**
     * Bytes successfully transferred for the drive.
     * 
    */
    public Optional<Double> bytesSucceeded() {
        return Optional.ofNullable(this.bytesSucceeded);
    }
    /**
     * Detailed status about the data transfer process. This field is not returned in the response until the drive is in the Transferring state.
     * 
    */
    public Optional<String> copyStatus() {
        return Optional.ofNullable(this.copyStatus);
    }
    /**
     * The drive header hash value.
     * 
    */
    public Optional<String> driveHeaderHash() {
        return Optional.ofNullable(this.driveHeaderHash);
    }
    /**
     * The drive's hardware serial number, without spaces.
     * 
    */
    public Optional<String> driveId() {
        return Optional.ofNullable(this.driveId);
    }
    /**
     * A URI that points to the blob containing the error log for the data transfer operation.
     * 
    */
    public Optional<String> errorLogUri() {
        return Optional.ofNullable(this.errorLogUri);
    }
    /**
     * The relative path of the manifest file on the drive.
     * 
    */
    public Optional<String> manifestFile() {
        return Optional.ofNullable(this.manifestFile);
    }
    /**
     * The Base16-encoded MD5 hash of the manifest file on the drive.
     * 
    */
    public Optional<String> manifestHash() {
        return Optional.ofNullable(this.manifestHash);
    }
    /**
     * A URI that points to the blob containing the drive manifest file.
     * 
    */
    public Optional<String> manifestUri() {
        return Optional.ofNullable(this.manifestUri);
    }
    /**
     * Percentage completed for the drive.
     * 
    */
    public Optional<Integer> percentComplete() {
        return Optional.ofNullable(this.percentComplete);
    }
    /**
     * The drive's current state.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * A URI that points to the blob containing the verbose log for the data transfer operation.
     * 
    */
    public Optional<String> verboseLogUri() {
        return Optional.ofNullable(this.verboseLogUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DriveStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bitLockerKey;
        private @Nullable Double bytesSucceeded;
        private @Nullable String copyStatus;
        private @Nullable String driveHeaderHash;
        private @Nullable String driveId;
        private @Nullable String errorLogUri;
        private @Nullable String manifestFile;
        private @Nullable String manifestHash;
        private @Nullable String manifestUri;
        private @Nullable Integer percentComplete;
        private @Nullable String state;
        private @Nullable String verboseLogUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DriveStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bitLockerKey = defaults.bitLockerKey;
    	      this.bytesSucceeded = defaults.bytesSucceeded;
    	      this.copyStatus = defaults.copyStatus;
    	      this.driveHeaderHash = defaults.driveHeaderHash;
    	      this.driveId = defaults.driveId;
    	      this.errorLogUri = defaults.errorLogUri;
    	      this.manifestFile = defaults.manifestFile;
    	      this.manifestHash = defaults.manifestHash;
    	      this.manifestUri = defaults.manifestUri;
    	      this.percentComplete = defaults.percentComplete;
    	      this.state = defaults.state;
    	      this.verboseLogUri = defaults.verboseLogUri;
        }

        public Builder bitLockerKey(@Nullable String bitLockerKey) {
            this.bitLockerKey = bitLockerKey;
            return this;
        }
        public Builder bytesSucceeded(@Nullable Double bytesSucceeded) {
            this.bytesSucceeded = bytesSucceeded;
            return this;
        }
        public Builder copyStatus(@Nullable String copyStatus) {
            this.copyStatus = copyStatus;
            return this;
        }
        public Builder driveHeaderHash(@Nullable String driveHeaderHash) {
            this.driveHeaderHash = driveHeaderHash;
            return this;
        }
        public Builder driveId(@Nullable String driveId) {
            this.driveId = driveId;
            return this;
        }
        public Builder errorLogUri(@Nullable String errorLogUri) {
            this.errorLogUri = errorLogUri;
            return this;
        }
        public Builder manifestFile(@Nullable String manifestFile) {
            this.manifestFile = manifestFile;
            return this;
        }
        public Builder manifestHash(@Nullable String manifestHash) {
            this.manifestHash = manifestHash;
            return this;
        }
        public Builder manifestUri(@Nullable String manifestUri) {
            this.manifestUri = manifestUri;
            return this;
        }
        public Builder percentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder verboseLogUri(@Nullable String verboseLogUri) {
            this.verboseLogUri = verboseLogUri;
            return this;
        }        public DriveStatusResponse build() {
            return new DriveStatusResponse(bitLockerKey, bytesSucceeded, copyStatus, driveHeaderHash, driveId, errorLogUri, manifestFile, manifestHash, manifestUri, percentComplete, state, verboseLogUri);
        }
    }
}
