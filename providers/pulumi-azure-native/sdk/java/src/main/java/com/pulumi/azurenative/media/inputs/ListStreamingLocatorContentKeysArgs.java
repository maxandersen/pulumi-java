// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListStreamingLocatorContentKeysArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListStreamingLocatorContentKeysArgs Empty = new ListStreamingLocatorContentKeysArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Streaming Locator name.
     * 
     */
    @Import(name="streamingLocatorName", required=true)
    private String streamingLocatorName;

    public String streamingLocatorName() {
        return this.streamingLocatorName;
    }

    private ListStreamingLocatorContentKeysArgs() {}

    private ListStreamingLocatorContentKeysArgs(ListStreamingLocatorContentKeysArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.streamingLocatorName = $.streamingLocatorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListStreamingLocatorContentKeysArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListStreamingLocatorContentKeysArgs $;

        public Builder() {
            $ = new ListStreamingLocatorContentKeysArgs();
        }

        public Builder(ListStreamingLocatorContentKeysArgs defaults) {
            $ = new ListStreamingLocatorContentKeysArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder streamingLocatorName(String streamingLocatorName) {
            $.streamingLocatorName = streamingLocatorName;
            return this;
        }

        public ListStreamingLocatorContentKeysArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.streamingLocatorName = Objects.requireNonNull($.streamingLocatorName, "expected parameter 'streamingLocatorName' to be non-null");
            return $;
        }
    }

}
