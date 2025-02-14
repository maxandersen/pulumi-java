// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * LUN to expose the Azure Managed Disk.
 * 
 */
public final class IscsiLunArgs extends com.pulumi.resources.ResourceArgs {

    public static final IscsiLunArgs Empty = new IscsiLunArgs();

    /**
     * Azure Resource ID of the Managed Disk.
     * 
     */
    @Import(name="managedDiskAzureResourceId", required=true)
    private Output<String> managedDiskAzureResourceId;

    /**
     * @return Azure Resource ID of the Managed Disk.
     * 
     */
    public Output<String> managedDiskAzureResourceId() {
        return this.managedDiskAzureResourceId;
    }

    /**
     * User defined name for iSCSI LUN; example: &#34;lun0&#34;
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return User defined name for iSCSI LUN; example: &#34;lun0&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private IscsiLunArgs() {}

    private IscsiLunArgs(IscsiLunArgs $) {
        this.managedDiskAzureResourceId = $.managedDiskAzureResourceId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IscsiLunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IscsiLunArgs $;

        public Builder() {
            $ = new IscsiLunArgs();
        }

        public Builder(IscsiLunArgs defaults) {
            $ = new IscsiLunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedDiskAzureResourceId Azure Resource ID of the Managed Disk.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskAzureResourceId(Output<String> managedDiskAzureResourceId) {
            $.managedDiskAzureResourceId = managedDiskAzureResourceId;
            return this;
        }

        /**
         * @param managedDiskAzureResourceId Azure Resource ID of the Managed Disk.
         * 
         * @return builder
         * 
         */
        public Builder managedDiskAzureResourceId(String managedDiskAzureResourceId) {
            return managedDiskAzureResourceId(Output.of(managedDiskAzureResourceId));
        }

        /**
         * @param name User defined name for iSCSI LUN; example: &#34;lun0&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name User defined name for iSCSI LUN; example: &#34;lun0&#34;
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public IscsiLunArgs build() {
            $.managedDiskAzureResourceId = Objects.requireNonNull($.managedDiskAzureResourceId, "expected parameter 'managedDiskAzureResourceId' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
