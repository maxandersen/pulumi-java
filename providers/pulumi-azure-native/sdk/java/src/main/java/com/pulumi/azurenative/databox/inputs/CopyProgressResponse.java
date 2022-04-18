// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Copy progress.
 * 
 */
public final class CopyProgressResponse extends com.pulumi.resources.InvokeArgs {

    public static final CopyProgressResponse Empty = new CopyProgressResponse();

    /**
     * Id of the account where the data needs to be uploaded.
     * 
     */
    @Import(name="accountId", required=true)
      private final String accountId;

    public String accountId() {
        return this.accountId;
    }

    /**
     * To indicate bytes transferred.
     * 
     */
    @Import(name="bytesProcessed", required=true)
      private final Double bytesProcessed;

    public Double bytesProcessed() {
        return this.bytesProcessed;
    }

    /**
     * Data Account Type.
     * 
     */
    @Import(name="dataAccountType", required=true)
      private final String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * To indicate directories errored out in the job.
     * 
     */
    @Import(name="directoriesErroredOut", required=true)
      private final Double directoriesErroredOut;

    public Double directoriesErroredOut() {
        return this.directoriesErroredOut;
    }

    /**
     * Number of files which could not be copied
     * 
     */
    @Import(name="filesErroredOut", required=true)
      private final Double filesErroredOut;

    public Double filesErroredOut() {
        return this.filesErroredOut;
    }

    /**
     * Number of files processed
     * 
     */
    @Import(name="filesProcessed", required=true)
      private final Double filesProcessed;

    public Double filesProcessed() {
        return this.filesProcessed;
    }

    /**
     * To indicate directories renamed
     * 
     */
    @Import(name="invalidDirectoriesProcessed", required=true)
      private final Double invalidDirectoriesProcessed;

    public Double invalidDirectoriesProcessed() {
        return this.invalidDirectoriesProcessed;
    }

    /**
     * Total amount of data not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="invalidFileBytesUploaded", required=true)
      private final Double invalidFileBytesUploaded;

    public Double invalidFileBytesUploaded() {
        return this.invalidFileBytesUploaded;
    }

    /**
     * Number of files not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="invalidFilesProcessed", required=true)
      private final Double invalidFilesProcessed;

    public Double invalidFilesProcessed() {
        return this.invalidFilesProcessed;
    }

    /**
     * To indicate if enumeration of data is in progress.
     * Until this is true, the TotalBytesToProcess may not be valid.
     * 
     */
    @Import(name="isEnumerationInProgress", required=true)
      private final Boolean isEnumerationInProgress;

    public Boolean isEnumerationInProgress() {
        return this.isEnumerationInProgress;
    }

    /**
     * Number of folders not adhering to azure naming conventions which were processed by automatic renaming
     * 
     */
    @Import(name="renamedContainerCount", required=true)
      private final Double renamedContainerCount;

    public Double renamedContainerCount() {
        return this.renamedContainerCount;
    }

    /**
     * Name of the storage account. This will be empty for data account types other than storage account.
     * 
     */
    @Import(name="storageAccountName", required=true)
      private final String storageAccountName;

    public String storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Total amount of data to be processed by the job.
     * 
     */
    @Import(name="totalBytesToProcess", required=true)
      private final Double totalBytesToProcess;

    public Double totalBytesToProcess() {
        return this.totalBytesToProcess;
    }

    /**
     * Total files to process
     * 
     */
    @Import(name="totalFilesToProcess", required=true)
      private final Double totalFilesToProcess;

    public Double totalFilesToProcess() {
        return this.totalFilesToProcess;
    }

    /**
     * Transfer type of data
     * 
     */
    @Import(name="transferType", required=true)
      private final String transferType;

    public String transferType() {
        return this.transferType;
    }

    public CopyProgressResponse(
        String accountId,
        Double bytesProcessed,
        String dataAccountType,
        Double directoriesErroredOut,
        Double filesErroredOut,
        Double filesProcessed,
        Double invalidDirectoriesProcessed,
        Double invalidFileBytesUploaded,
        Double invalidFilesProcessed,
        Boolean isEnumerationInProgress,
        Double renamedContainerCount,
        String storageAccountName,
        Double totalBytesToProcess,
        Double totalFilesToProcess,
        String transferType) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.bytesProcessed = Objects.requireNonNull(bytesProcessed, "expected parameter 'bytesProcessed' to be non-null");
        this.dataAccountType = Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut, "expected parameter 'directoriesErroredOut' to be non-null");
        this.filesErroredOut = Objects.requireNonNull(filesErroredOut, "expected parameter 'filesErroredOut' to be non-null");
        this.filesProcessed = Objects.requireNonNull(filesProcessed, "expected parameter 'filesProcessed' to be non-null");
        this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed, "expected parameter 'invalidDirectoriesProcessed' to be non-null");
        this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded, "expected parameter 'invalidFileBytesUploaded' to be non-null");
        this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed, "expected parameter 'invalidFilesProcessed' to be non-null");
        this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress, "expected parameter 'isEnumerationInProgress' to be non-null");
        this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount, "expected parameter 'renamedContainerCount' to be non-null");
        this.storageAccountName = Objects.requireNonNull(storageAccountName, "expected parameter 'storageAccountName' to be non-null");
        this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess, "expected parameter 'totalBytesToProcess' to be non-null");
        this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess, "expected parameter 'totalFilesToProcess' to be non-null");
        this.transferType = Objects.requireNonNull(transferType, "expected parameter 'transferType' to be non-null");
    }

    private CopyProgressResponse() {
        this.accountId = null;
        this.bytesProcessed = null;
        this.dataAccountType = null;
        this.directoriesErroredOut = null;
        this.filesErroredOut = null;
        this.filesProcessed = null;
        this.invalidDirectoriesProcessed = null;
        this.invalidFileBytesUploaded = null;
        this.invalidFilesProcessed = null;
        this.isEnumerationInProgress = null;
        this.renamedContainerCount = null;
        this.storageAccountName = null;
        this.totalBytesToProcess = null;
        this.totalFilesToProcess = null;
        this.transferType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CopyProgressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private Double bytesProcessed;
        private String dataAccountType;
        private Double directoriesErroredOut;
        private Double filesErroredOut;
        private Double filesProcessed;
        private Double invalidDirectoriesProcessed;
        private Double invalidFileBytesUploaded;
        private Double invalidFilesProcessed;
        private Boolean isEnumerationInProgress;
        private Double renamedContainerCount;
        private String storageAccountName;
        private Double totalBytesToProcess;
        private Double totalFilesToProcess;
        private String transferType;

        public Builder() {
    	      // Empty
        }

        public Builder(CopyProgressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.bytesProcessed = defaults.bytesProcessed;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.directoriesErroredOut = defaults.directoriesErroredOut;
    	      this.filesErroredOut = defaults.filesErroredOut;
    	      this.filesProcessed = defaults.filesProcessed;
    	      this.invalidDirectoriesProcessed = defaults.invalidDirectoriesProcessed;
    	      this.invalidFileBytesUploaded = defaults.invalidFileBytesUploaded;
    	      this.invalidFilesProcessed = defaults.invalidFilesProcessed;
    	      this.isEnumerationInProgress = defaults.isEnumerationInProgress;
    	      this.renamedContainerCount = defaults.renamedContainerCount;
    	      this.storageAccountName = defaults.storageAccountName;
    	      this.totalBytesToProcess = defaults.totalBytesToProcess;
    	      this.totalFilesToProcess = defaults.totalFilesToProcess;
    	      this.transferType = defaults.transferType;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder bytesProcessed(Double bytesProcessed) {
            this.bytesProcessed = Objects.requireNonNull(bytesProcessed);
            return this;
        }
        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder directoriesErroredOut(Double directoriesErroredOut) {
            this.directoriesErroredOut = Objects.requireNonNull(directoriesErroredOut);
            return this;
        }
        public Builder filesErroredOut(Double filesErroredOut) {
            this.filesErroredOut = Objects.requireNonNull(filesErroredOut);
            return this;
        }
        public Builder filesProcessed(Double filesProcessed) {
            this.filesProcessed = Objects.requireNonNull(filesProcessed);
            return this;
        }
        public Builder invalidDirectoriesProcessed(Double invalidDirectoriesProcessed) {
            this.invalidDirectoriesProcessed = Objects.requireNonNull(invalidDirectoriesProcessed);
            return this;
        }
        public Builder invalidFileBytesUploaded(Double invalidFileBytesUploaded) {
            this.invalidFileBytesUploaded = Objects.requireNonNull(invalidFileBytesUploaded);
            return this;
        }
        public Builder invalidFilesProcessed(Double invalidFilesProcessed) {
            this.invalidFilesProcessed = Objects.requireNonNull(invalidFilesProcessed);
            return this;
        }
        public Builder isEnumerationInProgress(Boolean isEnumerationInProgress) {
            this.isEnumerationInProgress = Objects.requireNonNull(isEnumerationInProgress);
            return this;
        }
        public Builder renamedContainerCount(Double renamedContainerCount) {
            this.renamedContainerCount = Objects.requireNonNull(renamedContainerCount);
            return this;
        }
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = Objects.requireNonNull(storageAccountName);
            return this;
        }
        public Builder totalBytesToProcess(Double totalBytesToProcess) {
            this.totalBytesToProcess = Objects.requireNonNull(totalBytesToProcess);
            return this;
        }
        public Builder totalFilesToProcess(Double totalFilesToProcess) {
            this.totalFilesToProcess = Objects.requireNonNull(totalFilesToProcess);
            return this;
        }
        public Builder transferType(String transferType) {
            this.transferType = Objects.requireNonNull(transferType);
            return this;
        }        public CopyProgressResponse build() {
            return new CopyProgressResponse(accountId, bytesProcessed, dataAccountType, directoriesErroredOut, filesErroredOut, filesProcessed, invalidDirectoriesProcessed, invalidFileBytesUploaded, invalidFilesProcessed, isEnumerationInProgress, renamedContainerCount, storageAccountName, totalBytesToProcess, totalFilesToProcess, transferType);
        }
    }
}
