// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.azure.compute.inputs.WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsVirtualMachineScaleSetOsDiskArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetOsDiskArgs Empty = new WindowsVirtualMachineScaleSetOsDiskArgs();

    /**
     * The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    @Import(name="caching", required=true)
    private Output<String> caching;

    /**
     * @return The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
     * 
     */
    public Output<String> caching() {
        return this.caching;
    }

    /**
     * A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="diffDiskSettings")
    private @Nullable Output<WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs> diffDiskSettings;

    /**
     * @return A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs>> diffDiskSettings() {
        return Optional.ofNullable(this.diffDiskSettings);
    }

    /**
     * The ID of the Disk Encryption Set which should be used to encrypt this OS Disk.
     * 
     */
    @Import(name="diskEncryptionSetId")
    private @Nullable Output<String> diskEncryptionSetId;

    /**
     * @return The ID of the Disk Encryption Set which should be used to encrypt this OS Disk.
     * 
     */
    public Optional<Output<String>> diskEncryptionSetId() {
        return Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
     * 
     */
    @Import(name="diskSizeGb")
    private @Nullable Output<Integer> diskSizeGb;

    /**
     * @return The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
     * 
     */
    public Optional<Output<Integer>> diskSizeGb() {
        return Optional.ofNullable(this.diskSizeGb);
    }

    /**
     * The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
     * 
     */
    @Import(name="storageAccountType", required=true)
    private Output<String> storageAccountType;

    /**
     * @return The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
     * 
     */
    public Output<String> storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    @Import(name="writeAcceleratorEnabled")
    private @Nullable Output<Boolean> writeAcceleratorEnabled;

    /**
     * @return Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> writeAcceleratorEnabled() {
        return Optional.ofNullable(this.writeAcceleratorEnabled);
    }

    private WindowsVirtualMachineScaleSetOsDiskArgs() {}

    private WindowsVirtualMachineScaleSetOsDiskArgs(WindowsVirtualMachineScaleSetOsDiskArgs $) {
        this.caching = $.caching;
        this.diffDiskSettings = $.diffDiskSettings;
        this.diskEncryptionSetId = $.diskEncryptionSetId;
        this.diskSizeGb = $.diskSizeGb;
        this.storageAccountType = $.storageAccountType;
        this.writeAcceleratorEnabled = $.writeAcceleratorEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineScaleSetOsDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetOsDiskArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetOsDiskArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetOsDiskArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetOsDiskArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caching The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(Output<String> caching) {
            $.caching = caching;
            return this;
        }

        /**
         * @param caching The Type of Caching which should be used for the Internal OS Disk. Possible values are `None`, `ReadOnly` and `ReadWrite`.
         * 
         * @return builder
         * 
         */
        public Builder caching(String caching) {
            return caching(Output.of(caching));
        }

        /**
         * @param diffDiskSettings A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(@Nullable Output<WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs> diffDiskSettings) {
            $.diffDiskSettings = diffDiskSettings;
            return this;
        }

        /**
         * @param diffDiskSettings A `diff_disk_settings` block as defined above. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder diffDiskSettings(WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs diffDiskSettings) {
            return diffDiskSettings(Output.of(diffDiskSettings));
        }

        /**
         * @param diskEncryptionSetId The ID of the Disk Encryption Set which should be used to encrypt this OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(@Nullable Output<String> diskEncryptionSetId) {
            $.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        /**
         * @param diskEncryptionSetId The ID of the Disk Encryption Set which should be used to encrypt this OS Disk.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetId(String diskEncryptionSetId) {
            return diskEncryptionSetId(Output.of(diskEncryptionSetId));
        }

        /**
         * @param diskSizeGb The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            $.diskSizeGb = diskSizeGb;
            return this;
        }

        /**
         * @param diskSizeGb The Size of the Internal OS Disk in GB, if you wish to vary from the size used in the image this Virtual Machine Scale Set is sourced from.
         * 
         * @return builder
         * 
         */
        public Builder diskSizeGb(Integer diskSizeGb) {
            return diskSizeGb(Output.of(diskSizeGb));
        }

        /**
         * @param storageAccountType The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(Output<String> storageAccountType) {
            $.storageAccountType = storageAccountType;
            return this;
        }

        /**
         * @param storageAccountType The Type of Storage Account which should back this the Internal OS Disk. Possible values include `Standard_LRS`, `StandardSSD_LRS` and `Premium_LRS`.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountType(String storageAccountType) {
            return storageAccountType(Output.of(storageAccountType));
        }

        /**
         * @param writeAcceleratorEnabled Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(@Nullable Output<Boolean> writeAcceleratorEnabled) {
            $.writeAcceleratorEnabled = writeAcceleratorEnabled;
            return this;
        }

        /**
         * @param writeAcceleratorEnabled Should Write Accelerator be Enabled for this OS Disk? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder writeAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
            return writeAcceleratorEnabled(Output.of(writeAcceleratorEnabled));
        }

        public WindowsVirtualMachineScaleSetOsDiskArgs build() {
            $.caching = Objects.requireNonNull($.caching, "expected parameter 'caching' to be non-null");
            $.storageAccountType = Objects.requireNonNull($.storageAccountType, "expected parameter 'storageAccountType' to be non-null");
            return $;
        }
    }

}
