// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.mixedreality.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListRemoteRenderingAccountKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListRemoteRenderingAccountKeysArgs Empty = new ListRemoteRenderingAccountKeysArgs();

    /**
     * Name of an Mixed Reality Account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * Name of an Azure resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListRemoteRenderingAccountKeysArgs() {}

    private ListRemoteRenderingAccountKeysArgs(ListRemoteRenderingAccountKeysArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListRemoteRenderingAccountKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListRemoteRenderingAccountKeysArgs $;

        public Builder() {
            $ = new ListRemoteRenderingAccountKeysArgs();
        }

        public Builder(ListRemoteRenderingAccountKeysArgs defaults) {
            $ = new ListRemoteRenderingAccountKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListRemoteRenderingAccountKeysArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
