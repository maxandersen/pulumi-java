// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetConnectionArgs extends InvokeArgs {

    public static final GetConnectionArgs Empty = new GetConnectionArgs();

    /**
     * Connection name
     * 
     */
    @Import(name="connectionName", required=true)
    private String connectionName;

    /**
     * @return Connection name
     * 
     */
    public String connectionName() {
        return this.connectionName;
    }

    /**
     * The resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable String subscriptionId;

    /**
     * @return Subscription Id
     * 
     */
    public Optional<String> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    private GetConnectionArgs() {}

    private GetConnectionArgs(GetConnectionArgs $) {
        this.connectionName = $.connectionName;
        this.resourceGroupName = $.resourceGroupName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConnectionArgs $;

        public Builder() {
            $ = new GetConnectionArgs();
        }

        public Builder(GetConnectionArgs defaults) {
            $ = new GetConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionName Connection name
         * 
         * @return builder
         * 
         */
        public Builder connectionName(String connectionName) {
            $.connectionName = connectionName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param subscriptionId Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        public GetConnectionArgs build() {
            $.connectionName = Objects.requireNonNull($.connectionName, "expected parameter 'connectionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
