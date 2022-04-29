// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetBigDataPoolArgs extends InvokeArgs {

    public static final GetBigDataPoolArgs Empty = new GetBigDataPoolArgs();

    /**
     * Big Data pool name
     * 
     */
    @Import(name="bigDataPoolName", required=true)
    private String bigDataPoolName;

    /**
     * @return Big Data pool name
     * 
     */
    public String bigDataPoolName() {
        return this.bigDataPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace
     * 
     */
    @Import(name="workspaceName", required=true)
    private String workspaceName;

    /**
     * @return The name of the workspace
     * 
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    private GetBigDataPoolArgs() {}

    private GetBigDataPoolArgs(GetBigDataPoolArgs $) {
        this.bigDataPoolName = $.bigDataPoolName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBigDataPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBigDataPoolArgs $;

        public Builder() {
            $ = new GetBigDataPoolArgs();
        }

        public Builder(GetBigDataPoolArgs defaults) {
            $ = new GetBigDataPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bigDataPoolName Big Data pool name
         * 
         * @return builder
         * 
         */
        public Builder bigDataPoolName(String bigDataPoolName) {
            $.bigDataPoolName = bigDataPoolName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param workspaceName The name of the workspace
         * 
         * @return builder
         * 
         */
        public Builder workspaceName(String workspaceName) {
            $.workspaceName = workspaceName;
            return this;
        }

        public GetBigDataPoolArgs build() {
            $.bigDataPoolName = Objects.requireNonNull($.bigDataPoolName, "expected parameter 'bigDataPoolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
