// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.connectedvmwarevsphere.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVCenterArgs extends InvokeArgs {

    public static final GetVCenterArgs Empty = new GetVCenterArgs();

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The Resource Group Name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vCenter.
     * 
     */
    @Import(name="vcenterName", required=true)
    private String vcenterName;

    /**
     * @return Name of the vCenter.
     * 
     */
    public String vcenterName() {
        return this.vcenterName;
    }

    private GetVCenterArgs() {}

    private GetVCenterArgs(GetVCenterArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.vcenterName = $.vcenterName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVCenterArgs $;

        public Builder() {
            $ = new GetVCenterArgs();
        }

        public Builder(GetVCenterArgs defaults) {
            $ = new GetVCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The Resource Group Name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param vcenterName Name of the vCenter.
         * 
         * @return builder
         * 
         */
        public Builder vcenterName(String vcenterName) {
            $.vcenterName = vcenterName;
            return this;
        }

        public GetVCenterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.vcenterName = Objects.requireNonNull($.vcenterName, "expected parameter 'vcenterName' to be non-null");
            return $;
        }
    }

}
