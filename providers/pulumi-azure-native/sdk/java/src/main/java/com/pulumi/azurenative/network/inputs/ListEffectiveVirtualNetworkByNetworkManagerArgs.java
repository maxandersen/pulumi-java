// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListEffectiveVirtualNetworkByNetworkManagerArgs extends InvokeArgs {

    public static final ListEffectiveVirtualNetworkByNetworkManagerArgs Empty = new ListEffectiveVirtualNetworkByNetworkManagerArgs();

    /**
     * Conditional Members.
     * 
     */
    @Import(name="conditionalMembers")
    private @Nullable String conditionalMembers;

    /**
     * @return Conditional Members.
     * 
     */
    public Optional<String> conditionalMembers() {
        return Optional.ofNullable(this.conditionalMembers);
    }

    /**
     * The name of the network manager.
     * 
     */
    @Import(name="networkManagerName", required=true)
    private String networkManagerName;

    /**
     * @return The name of the network manager.
     * 
     */
    public String networkManagerName() {
        return this.networkManagerName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Continuation token for pagination, capturing the next page size and offset, as well as the context of the query.
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    /**
     * @return Continuation token for pagination, capturing the next page size and offset, as well as the context of the query.
     * 
     */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    /**
     * An optional query parameter which specifies the maximum number of records to be returned by the server.
     * 
     */
    @Import(name="top")
    private @Nullable Integer top;

    /**
     * @return An optional query parameter which specifies the maximum number of records to be returned by the server.
     * 
     */
    public Optional<Integer> top() {
        return Optional.ofNullable(this.top);
    }

    private ListEffectiveVirtualNetworkByNetworkManagerArgs() {}

    private ListEffectiveVirtualNetworkByNetworkManagerArgs(ListEffectiveVirtualNetworkByNetworkManagerArgs $) {
        this.conditionalMembers = $.conditionalMembers;
        this.networkManagerName = $.networkManagerName;
        this.resourceGroupName = $.resourceGroupName;
        this.skipToken = $.skipToken;
        this.top = $.top;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListEffectiveVirtualNetworkByNetworkManagerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListEffectiveVirtualNetworkByNetworkManagerArgs $;

        public Builder() {
            $ = new ListEffectiveVirtualNetworkByNetworkManagerArgs();
        }

        public Builder(ListEffectiveVirtualNetworkByNetworkManagerArgs defaults) {
            $ = new ListEffectiveVirtualNetworkByNetworkManagerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditionalMembers Conditional Members.
         * 
         * @return builder
         * 
         */
        public Builder conditionalMembers(@Nullable String conditionalMembers) {
            $.conditionalMembers = conditionalMembers;
            return this;
        }

        /**
         * @param networkManagerName The name of the network manager.
         * 
         * @return builder
         * 
         */
        public Builder networkManagerName(String networkManagerName) {
            $.networkManagerName = networkManagerName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param skipToken Continuation token for pagination, capturing the next page size and offset, as well as the context of the query.
         * 
         * @return builder
         * 
         */
        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        /**
         * @param top An optional query parameter which specifies the maximum number of records to be returned by the server.
         * 
         * @return builder
         * 
         */
        public Builder top(@Nullable Integer top) {
            $.top = top;
            return this;
        }

        public ListEffectiveVirtualNetworkByNetworkManagerArgs build() {
            $.networkManagerName = Objects.requireNonNull($.networkManagerName, "expected parameter 'networkManagerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
