// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurearcdata.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPostgresInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPostgresInstanceArgs Empty = new GetPostgresInstanceArgs();

    /**
     * Name of Postgres Instance
     * 
     */
    @Import(name="postgresInstanceName", required=true)
    private String postgresInstanceName;

    /**
     * @return Name of Postgres Instance
     * 
     */
    public String postgresInstanceName() {
        return this.postgresInstanceName;
    }

    /**
     * The name of the Azure resource group
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the Azure resource group
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPostgresInstanceArgs() {}

    private GetPostgresInstanceArgs(GetPostgresInstanceArgs $) {
        this.postgresInstanceName = $.postgresInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPostgresInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPostgresInstanceArgs $;

        public Builder() {
            $ = new GetPostgresInstanceArgs();
        }

        public Builder(GetPostgresInstanceArgs defaults) {
            $ = new GetPostgresInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param postgresInstanceName Name of Postgres Instance
         * 
         * @return builder
         * 
         */
        public Builder postgresInstanceName(String postgresInstanceName) {
            $.postgresInstanceName = postgresInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Azure resource group
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPostgresInstanceArgs build() {
            $.postgresInstanceName = Objects.requireNonNull($.postgresInstanceName, "expected parameter 'postgresInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
