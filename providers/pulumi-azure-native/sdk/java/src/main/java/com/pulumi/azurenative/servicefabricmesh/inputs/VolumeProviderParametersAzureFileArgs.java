// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * This type describes a volume provided by an Azure Files file share.
 * 
 */
public final class VolumeProviderParametersAzureFileArgs extends ResourceArgs {

    public static final VolumeProviderParametersAzureFileArgs Empty = new VolumeProviderParametersAzureFileArgs();

    /**
     * Access key of the Azure storage account for the File Share.
     * 
     */
    @Import(name="accountKey")
    private @Nullable Output<String> accountKey;

    /**
     * @return Access key of the Azure storage account for the File Share.
     * 
     */
    public Optional<Output<String>> accountKey() {
        return Optional.ofNullable(this.accountKey);
    }

    /**
     * Name of the Azure storage account for the File Share.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return Name of the Azure storage account for the File Share.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Name of the Azure Files file share that provides storage for the volume.
     * 
     */
    @Import(name="shareName", required=true)
    private Output<String> shareName;

    /**
     * @return Name of the Azure Files file share that provides storage for the volume.
     * 
     */
    public Output<String> shareName() {
        return this.shareName;
    }

    private VolumeProviderParametersAzureFileArgs() {}

    private VolumeProviderParametersAzureFileArgs(VolumeProviderParametersAzureFileArgs $) {
        this.accountKey = $.accountKey;
        this.accountName = $.accountName;
        this.shareName = $.shareName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VolumeProviderParametersAzureFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VolumeProviderParametersAzureFileArgs $;

        public Builder() {
            $ = new VolumeProviderParametersAzureFileArgs();
        }

        public Builder(VolumeProviderParametersAzureFileArgs defaults) {
            $ = new VolumeProviderParametersAzureFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountKey Access key of the Azure storage account for the File Share.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(@Nullable Output<String> accountKey) {
            $.accountKey = accountKey;
            return this;
        }

        /**
         * @param accountKey Access key of the Azure storage account for the File Share.
         * 
         * @return builder
         * 
         */
        public Builder accountKey(String accountKey) {
            return accountKey(Output.of(accountKey));
        }

        /**
         * @param accountName Name of the Azure storage account for the File Share.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Name of the Azure storage account for the File Share.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param shareName Name of the Azure Files file share that provides storage for the volume.
         * 
         * @return builder
         * 
         */
        public Builder shareName(Output<String> shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param shareName Name of the Azure Files file share that provides storage for the volume.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            return shareName(Output.of(shareName));
        }

        public VolumeProviderParametersAzureFileArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            return $;
        }
    }

}
