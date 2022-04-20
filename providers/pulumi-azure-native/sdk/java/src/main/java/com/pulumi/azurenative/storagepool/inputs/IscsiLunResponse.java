// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * LUN to expose the Azure Managed Disk.
 * 
 */
public final class IscsiLunResponse extends com.pulumi.resources.InvokeArgs {

    public static final IscsiLunResponse Empty = new IscsiLunResponse();

    /**
     * Azure Resource ID of the Managed Disk.
     * 
     */
    @Import(name="managedDiskAzureResourceId", required=true)
      private final String managedDiskAzureResourceId;

    public String managedDiskAzureResourceId() {
        return this.managedDiskAzureResourceId;
    }

    /**
     * User defined name for iSCSI LUN; example: &#34;lun0&#34;
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    public IscsiLunResponse(
        String managedDiskAzureResourceId,
        String name) {
        this.managedDiskAzureResourceId = Objects.requireNonNull(managedDiskAzureResourceId, "expected parameter 'managedDiskAzureResourceId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private IscsiLunResponse() {
        this.managedDiskAzureResourceId = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IscsiLunResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managedDiskAzureResourceId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(IscsiLunResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedDiskAzureResourceId = defaults.managedDiskAzureResourceId;
    	      this.name = defaults.name;
        }

        public Builder managedDiskAzureResourceId(String managedDiskAzureResourceId) {
            this.managedDiskAzureResourceId = Objects.requireNonNull(managedDiskAzureResourceId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public IscsiLunResponse build() {
            return new IscsiLunResponse(managedDiskAzureResourceId, name);
        }
    }
}
