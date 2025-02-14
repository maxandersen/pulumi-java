// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AzureFileFilterDetailsResponse {
    /**
     * @return List of full path of the files to be transferred.
     * 
     */
    private final @Nullable List<String> filePathList;
    /**
     * @return Prefix list of the Azure files to be transferred.
     * 
     */
    private final @Nullable List<String> filePrefixList;
    /**
     * @return List of file shares to be transferred.
     * 
     */
    private final @Nullable List<String> fileShareList;

    @CustomType.Constructor
    private AzureFileFilterDetailsResponse(
        @CustomType.Parameter("filePathList") @Nullable List<String> filePathList,
        @CustomType.Parameter("filePrefixList") @Nullable List<String> filePrefixList,
        @CustomType.Parameter("fileShareList") @Nullable List<String> fileShareList) {
        this.filePathList = filePathList;
        this.filePrefixList = filePrefixList;
        this.fileShareList = fileShareList;
    }

    /**
     * @return List of full path of the files to be transferred.
     * 
     */
    public List<String> filePathList() {
        return this.filePathList == null ? List.of() : this.filePathList;
    }
    /**
     * @return Prefix list of the Azure files to be transferred.
     * 
     */
    public List<String> filePrefixList() {
        return this.filePrefixList == null ? List.of() : this.filePrefixList;
    }
    /**
     * @return List of file shares to be transferred.
     * 
     */
    public List<String> fileShareList() {
        return this.fileShareList == null ? List.of() : this.fileShareList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFileFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> filePathList;
        private @Nullable List<String> filePrefixList;
        private @Nullable List<String> fileShareList;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFileFilterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filePathList = defaults.filePathList;
    	      this.filePrefixList = defaults.filePrefixList;
    	      this.fileShareList = defaults.fileShareList;
        }

        public Builder filePathList(@Nullable List<String> filePathList) {
            this.filePathList = filePathList;
            return this;
        }
        public Builder filePathList(String... filePathList) {
            return filePathList(List.of(filePathList));
        }
        public Builder filePrefixList(@Nullable List<String> filePrefixList) {
            this.filePrefixList = filePrefixList;
            return this;
        }
        public Builder filePrefixList(String... filePrefixList) {
            return filePrefixList(List.of(filePrefixList));
        }
        public Builder fileShareList(@Nullable List<String> fileShareList) {
            this.fileShareList = fileShareList;
            return this;
        }
        public Builder fileShareList(String... fileShareList) {
            return fileShareList(List.of(fileShareList));
        }        public AzureFileFilterDetailsResponse build() {
            return new AzureFileFilterDetailsResponse(filePathList, filePrefixList, fileShareList);
        }
    }
}
