// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.azurenative.media.enums.AssetContainerPermission;
import com.pulumi.core.Either;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListAssetContainerSasArgs extends InvokeArgs {

    public static final ListAssetContainerSasArgs Empty = new ListAssetContainerSasArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The Asset name.
     * 
     */
    @Import(name="assetName", required=true)
    private String assetName;

    /**
     * @return The Asset name.
     * 
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * The SAS URL expiration time.  This must be less than 24 hours from the current time.
     * 
     */
    @Import(name="expiryTime")
    private @Nullable String expiryTime;

    /**
     * @return The SAS URL expiration time.  This must be less than 24 hours from the current time.
     * 
     */
    public Optional<String> expiryTime() {
        return Optional.ofNullable(this.expiryTime);
    }

    /**
     * The permissions to set on the SAS URL.
     * 
     */
    @Import(name="permissions")
    private @Nullable Either<String,AssetContainerPermission> permissions;

    /**
     * @return The permissions to set on the SAS URL.
     * 
     */
    public Optional<Either<String,AssetContainerPermission>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListAssetContainerSasArgs() {}

    private ListAssetContainerSasArgs(ListAssetContainerSasArgs $) {
        this.accountName = $.accountName;
        this.assetName = $.assetName;
        this.expiryTime = $.expiryTime;
        this.permissions = $.permissions;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListAssetContainerSasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListAssetContainerSasArgs $;

        public Builder() {
            $ = new ListAssetContainerSasArgs();
        }

        public Builder(ListAssetContainerSasArgs defaults) {
            $ = new ListAssetContainerSasArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param assetName The Asset name.
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param expiryTime The SAS URL expiration time.  This must be less than 24 hours from the current time.
         * 
         * @return builder
         * 
         */
        public Builder expiryTime(@Nullable String expiryTime) {
            $.expiryTime = expiryTime;
            return this;
        }

        /**
         * @param permissions The permissions to set on the SAS URL.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Either<String,AssetContainerPermission> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions The permissions to set on the SAS URL.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Either.ofLeft(permissions));
        }

        /**
         * @param permissions The permissions to set on the SAS URL.
         * 
         * @return builder
         * 
         */
        public Builder permissions(AssetContainerPermission permissions) {
            return permissions(Either.ofRight(permissions));
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListAssetContainerSasArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
