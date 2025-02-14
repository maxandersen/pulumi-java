// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListRemediationDeploymentsAtResourceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListRemediationDeploymentsAtResourceGroupArgs Empty = new ListRemediationDeploymentsAtResourceGroupArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
    private String remediationName;

    /**
     * @return The name of the remediation.
     * 
     */
    public String remediationName() {
        return this.remediationName;
    }

    /**
     * Resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Maximum number of records to return.
     * 
     */
    @Import(name="top")
    private @Nullable Integer top;

    /**
     * @return Maximum number of records to return.
     * 
     */
    public Optional<Integer> top() {
        return Optional.ofNullable(this.top);
    }

    private ListRemediationDeploymentsAtResourceGroupArgs() {}

    private ListRemediationDeploymentsAtResourceGroupArgs(ListRemediationDeploymentsAtResourceGroupArgs $) {
        this.remediationName = $.remediationName;
        this.resourceGroupName = $.resourceGroupName;
        this.top = $.top;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListRemediationDeploymentsAtResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListRemediationDeploymentsAtResourceGroupArgs $;

        public Builder() {
            $ = new ListRemediationDeploymentsAtResourceGroupArgs();
        }

        public Builder(ListRemediationDeploymentsAtResourceGroupArgs defaults) {
            $ = new ListRemediationDeploymentsAtResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param remediationName The name of the remediation.
         * 
         * @return builder
         * 
         */
        public Builder remediationName(String remediationName) {
            $.remediationName = remediationName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param top Maximum number of records to return.
         * 
         * @return builder
         * 
         */
        public Builder top(@Nullable Integer top) {
            $.top = top;
            return this;
        }

        public ListRemediationDeploymentsAtResourceGroupArgs build() {
            $.remediationName = Objects.requireNonNull($.remediationName, "expected parameter 'remediationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
