// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.synapse.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetKustoPoolPrincipalAssignmentArgs extends InvokeArgs {

    public static final GetKustoPoolPrincipalAssignmentArgs Empty = new GetKustoPoolPrincipalAssignmentArgs();

    /**
     * The name of the Kusto pool.
     * 
     */
    @Import(name="kustoPoolName", required=true)
    private String kustoPoolName;

    /**
     * @return The name of the Kusto pool.
     * 
     */
    public String kustoPoolName() {
        return this.kustoPoolName;
    }

    /**
     * The name of the Kusto principalAssignment.
     * 
     */
    @Import(name="principalAssignmentName", required=true)
    private String principalAssignmentName;

    /**
     * @return The name of the Kusto principalAssignment.
     * 
     */
    public String principalAssignmentName() {
        return this.principalAssignmentName;
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

    private GetKustoPoolPrincipalAssignmentArgs() {}

    private GetKustoPoolPrincipalAssignmentArgs(GetKustoPoolPrincipalAssignmentArgs $) {
        this.kustoPoolName = $.kustoPoolName;
        this.principalAssignmentName = $.principalAssignmentName;
        this.resourceGroupName = $.resourceGroupName;
        this.workspaceName = $.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKustoPoolPrincipalAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKustoPoolPrincipalAssignmentArgs $;

        public Builder() {
            $ = new GetKustoPoolPrincipalAssignmentArgs();
        }

        public Builder(GetKustoPoolPrincipalAssignmentArgs defaults) {
            $ = new GetKustoPoolPrincipalAssignmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kustoPoolName The name of the Kusto pool.
         * 
         * @return builder
         * 
         */
        public Builder kustoPoolName(String kustoPoolName) {
            $.kustoPoolName = kustoPoolName;
            return this;
        }

        /**
         * @param principalAssignmentName The name of the Kusto principalAssignment.
         * 
         * @return builder
         * 
         */
        public Builder principalAssignmentName(String principalAssignmentName) {
            $.principalAssignmentName = principalAssignmentName;
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

        public GetKustoPoolPrincipalAssignmentArgs build() {
            $.kustoPoolName = Objects.requireNonNull($.kustoPoolName, "expected parameter 'kustoPoolName' to be non-null");
            $.principalAssignmentName = Objects.requireNonNull($.principalAssignmentName, "expected parameter 'principalAssignmentName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.workspaceName = Objects.requireNonNull($.workspaceName, "expected parameter 'workspaceName' to be non-null");
            return $;
        }
    }

}
