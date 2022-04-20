// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskEncryptionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskEncryptionSetArgs Empty = new GetDiskEncryptionSetArgs();

    /**
     * The name of the disk encryption set that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskEncryptionSetName", required=true)
      private final String diskEncryptionSetName;

    public String diskEncryptionSetName() {
        return this.diskEncryptionSetName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetDiskEncryptionSetArgs(
        String diskEncryptionSetName,
        String resourceGroupName) {
        this.diskEncryptionSetName = Objects.requireNonNull(diskEncryptionSetName, "expected parameter 'diskEncryptionSetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetDiskEncryptionSetArgs() {
        this.diskEncryptionSetName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDiskEncryptionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String diskEncryptionSetName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDiskEncryptionSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetName = defaults.diskEncryptionSetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder diskEncryptionSetName(String diskEncryptionSetName) {
            this.diskEncryptionSetName = Objects.requireNonNull(diskEncryptionSetName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetDiskEncryptionSetArgs build() {
            return new GetDiskEncryptionSetArgs(diskEncryptionSetName, resourceGroupName);
        }
    }
}
