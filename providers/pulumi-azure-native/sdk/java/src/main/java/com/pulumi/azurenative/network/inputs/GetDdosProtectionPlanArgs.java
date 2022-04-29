// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetDdosProtectionPlanArgs extends InvokeArgs {

    public static final GetDdosProtectionPlanArgs Empty = new GetDdosProtectionPlanArgs();

    /**
     * The name of the DDoS protection plan.
     * 
     */
    @Import(name="ddosProtectionPlanName", required=true)
    private String ddosProtectionPlanName;

    /**
     * @return The name of the DDoS protection plan.
     * 
     */
    public String ddosProtectionPlanName() {
        return this.ddosProtectionPlanName;
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

    private GetDdosProtectionPlanArgs() {}

    private GetDdosProtectionPlanArgs(GetDdosProtectionPlanArgs $) {
        this.ddosProtectionPlanName = $.ddosProtectionPlanName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDdosProtectionPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDdosProtectionPlanArgs $;

        public Builder() {
            $ = new GetDdosProtectionPlanArgs();
        }

        public Builder(GetDdosProtectionPlanArgs defaults) {
            $ = new GetDdosProtectionPlanArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ddosProtectionPlanName The name of the DDoS protection plan.
         * 
         * @return builder
         * 
         */
        public Builder ddosProtectionPlanName(String ddosProtectionPlanName) {
            $.ddosProtectionPlanName = ddosProtectionPlanName;
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

        public GetDdosProtectionPlanArgs build() {
            $.ddosProtectionPlanName = Objects.requireNonNull($.ddosProtectionPlanName, "expected parameter 'ddosProtectionPlanName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
