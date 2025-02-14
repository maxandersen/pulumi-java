// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.engagementfabric.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetChannelArgs Empty = new GetChannelArgs();

    /**
     * Account Name
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return Account Name
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Channel Name
     * 
     */
    @Import(name="channelName", required=true)
    private String channelName;

    /**
     * @return Channel Name
     * 
     */
    public String channelName() {
        return this.channelName;
    }

    /**
     * Resource Group Name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Resource Group Name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetChannelArgs() {}

    private GetChannelArgs(GetChannelArgs $) {
        this.accountName = $.accountName;
        this.channelName = $.channelName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetChannelArgs $;

        public Builder() {
            $ = new GetChannelArgs();
        }

        public Builder(GetChannelArgs defaults) {
            $ = new GetChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName Account Name
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param channelName Channel Name
         * 
         * @return builder
         * 
         */
        public Builder channelName(String channelName) {
            $.channelName = channelName;
            return this;
        }

        /**
         * @param resourceGroupName Resource Group Name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetChannelArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.channelName = Objects.requireNonNull($.channelName, "expected parameter 'channelName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
