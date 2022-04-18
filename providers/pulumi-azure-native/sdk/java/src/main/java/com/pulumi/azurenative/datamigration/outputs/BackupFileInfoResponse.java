// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackupFileInfoResponse {
    /**
     * Sequence number of the backup file in the backup set
     * 
     */
    private final @Nullable Integer familySequenceNumber;
    /**
     * Location of the backup file in shared folder
     * 
     */
    private final @Nullable String fileLocation;
    /**
     * Status of the backup file during migration
     * 
     */
    private final @Nullable String status;

    @CustomType.Constructor
    private BackupFileInfoResponse(
        @CustomType.Parameter("familySequenceNumber") @Nullable Integer familySequenceNumber,
        @CustomType.Parameter("fileLocation") @Nullable String fileLocation,
        @CustomType.Parameter("status") @Nullable String status) {
        this.familySequenceNumber = familySequenceNumber;
        this.fileLocation = fileLocation;
        this.status = status;
    }

    /**
     * Sequence number of the backup file in the backup set
     * 
    */
    public Optional<Integer> familySequenceNumber() {
        return Optional.ofNullable(this.familySequenceNumber);
    }
    /**
     * Location of the backup file in shared folder
     * 
    */
    public Optional<String> fileLocation() {
        return Optional.ofNullable(this.fileLocation);
    }
    /**
     * Status of the backup file during migration
     * 
    */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupFileInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer familySequenceNumber;
        private @Nullable String fileLocation;
        private @Nullable String status;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupFileInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.familySequenceNumber = defaults.familySequenceNumber;
    	      this.fileLocation = defaults.fileLocation;
    	      this.status = defaults.status;
        }

        public Builder familySequenceNumber(@Nullable Integer familySequenceNumber) {
            this.familySequenceNumber = familySequenceNumber;
            return this;
        }
        public Builder fileLocation(@Nullable String fileLocation) {
            this.fileLocation = fileLocation;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }        public BackupFileInfoResponse build() {
            return new BackupFileInfoResponse(familySequenceNumber, fileLocation, status);
        }
    }
}
