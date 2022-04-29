// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datafactory.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDataFlowArgs extends InvokeArgs {

    public static final GetDataFlowArgs Empty = new GetDataFlowArgs();

    /**
     * The data flow name.
     * 
     */
    @Import(name="dataFlowName", required=true)
    private String dataFlowName;

    /**
     * @return The data flow name.
     * 
     */
    public String dataFlowName() {
        return this.dataFlowName;
    }

    /**
     * The factory name.
     * 
     */
    @Import(name="factoryName", required=true)
    private String factoryName;

    /**
     * @return The factory name.
     * 
     */
    public String factoryName() {
        return this.factoryName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDataFlowArgs() {}

    private GetDataFlowArgs(GetDataFlowArgs $) {
        this.dataFlowName = $.dataFlowName;
        this.factoryName = $.factoryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDataFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDataFlowArgs $;

        public Builder() {
            $ = new GetDataFlowArgs();
        }

        public Builder(GetDataFlowArgs defaults) {
            $ = new GetDataFlowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataFlowName The data flow name.
         * 
         * @return builder
         * 
         */
        public Builder dataFlowName(String dataFlowName) {
            $.dataFlowName = dataFlowName;
            return this;
        }

        /**
         * @param factoryName The factory name.
         * 
         * @return builder
         * 
         */
        public Builder factoryName(String factoryName) {
            $.factoryName = factoryName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDataFlowArgs build() {
            $.dataFlowName = Objects.requireNonNull($.dataFlowName, "expected parameter 'dataFlowName' to be non-null");
            $.factoryName = Objects.requireNonNull($.factoryName, "expected parameter 'factoryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
