// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric;

import com.pulumi.azurenative.engagementfabric.inputs.SKUArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * Account Name
     * 
     */
    @Import(name="accountName")
    private @Nullable Output<String> accountName;

    /**
     * @return Account Name
     * 
     */
    public Optional<Output<String>> accountName() {
        return Optional.ofNullable(this.accountName);
    }

    /**
     * The location of the resource
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource Group Name
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The SKU of the resource
     * 
     */
    @Import(name="sku", required=true)
    private Output<SKUArgs> sku;

    /**
     * @return The SKU of the resource
     * 
     */
    public Output<SKUArgs> sku() {
        return this.sku;
    }

    /**
     * The tags of the resource
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return The tags of the resource
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.accountName = $.accountName;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account Name
         * 
         * @return builder
         * 
         */
        public Builder accountName(@Nullable Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName Account Name
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param location The location of the resource
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku The SKU of the resource
         * 
         * @return builder
         * 
         */
        public Builder sku(Output<SKUArgs> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku The SKU of the resource
         * 
         * @return builder
         * 
         */
        public Builder sku(SKUArgs sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags The tags of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags of the resource
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public AccountArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
