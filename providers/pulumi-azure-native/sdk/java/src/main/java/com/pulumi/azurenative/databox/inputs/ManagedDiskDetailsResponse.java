// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Details of the managed disks.
 * 
 */
public final class ManagedDiskDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedDiskDetailsResponse Empty = new ManagedDiskDetailsResponse();

    /**
     * Account Type of the data to be transferred.
     * Expected value is &#39;ManagedDisk&#39;.
     * 
     */
    @Import(name="dataAccountType", required=true)
      private final String dataAccountType;

    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Resource Group Id of the compute disks.
     * 
     */
    @Import(name="resourceGroupId", required=true)
      private final String resourceGroupId;

    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Resource Id of the storage account that can be used to copy the vhd for staging.
     * 
     */
    @Import(name="stagingStorageAccountId", required=true)
      private final String stagingStorageAccountId;

    public String stagingStorageAccountId() {
        return this.stagingStorageAccountId;
    }

    public ManagedDiskDetailsResponse(
        String dataAccountType,
        String resourceGroupId,
        String stagingStorageAccountId) {
        this.dataAccountType = Codegen.stringProp("dataAccountType").arg(dataAccountType).def("StorageAccount").require();
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
        this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId, "expected parameter 'stagingStorageAccountId' to be non-null");
    }

    private ManagedDiskDetailsResponse() {
        this.dataAccountType = null;
        this.resourceGroupId = null;
        this.stagingStorageAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedDiskDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataAccountType;
        private String resourceGroupId;
        private String stagingStorageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedDiskDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.stagingStorageAccountId = defaults.stagingStorageAccountId;
        }

        public Builder dataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }
        public Builder stagingStorageAccountId(String stagingStorageAccountId) {
            this.stagingStorageAccountId = Objects.requireNonNull(stagingStorageAccountId);
            return this;
        }        public ManagedDiskDetailsResponse build() {
            return new ManagedDiskDetailsResponse(dataAccountType, resourceGroupId, stagingStorageAccountId);
        }
    }
}
