// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReportByResourceGroupNameArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReportByResourceGroupNameArgs Empty = new GetReportByResourceGroupNameArgs();

    /**
     * Report Name.
     * 
     */
    @Import(name="reportName", required=true)
    private String reportName;

    public String reportName() {
        return this.reportName;
    }

    /**
     * Azure Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetReportByResourceGroupNameArgs() {}

    private GetReportByResourceGroupNameArgs(GetReportByResourceGroupNameArgs $) {
        this.reportName = $.reportName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReportByResourceGroupNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReportByResourceGroupNameArgs $;

        public Builder() {
            $ = new GetReportByResourceGroupNameArgs();
        }

        public Builder(GetReportByResourceGroupNameArgs defaults) {
            $ = new GetReportByResourceGroupNameArgs(Objects.requireNonNull(defaults));
        }

        public Builder reportName(String reportName) {
            $.reportName = reportName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetReportByResourceGroupNameArgs build() {
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
