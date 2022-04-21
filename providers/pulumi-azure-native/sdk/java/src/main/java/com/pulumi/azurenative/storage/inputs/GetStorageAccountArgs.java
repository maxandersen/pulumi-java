// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStorageAccountArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStorageAccountArgs Empty = new GetStorageAccountArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * May be used to expand the properties within account&#39;s properties. By default, data is not included when fetching properties. Currently we only support geoReplicationStats and blobRestoreStatus.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetStorageAccountArgs() {}

    private GetStorageAccountArgs(GetStorageAccountArgs $) {
        this.accountName = $.accountName;
        this.expand = $.expand;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStorageAccountArgs $;

        public Builder() {
            $ = new GetStorageAccountArgs();
        }

        public Builder(GetStorageAccountArgs defaults) {
            $ = new GetStorageAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetStorageAccountArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
