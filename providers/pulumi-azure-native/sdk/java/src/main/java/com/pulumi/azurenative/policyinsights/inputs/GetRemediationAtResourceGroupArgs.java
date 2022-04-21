// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.policyinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRemediationAtResourceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRemediationAtResourceGroupArgs Empty = new GetRemediationAtResourceGroupArgs();

    /**
     * The name of the remediation.
     * 
     */
    @Import(name="remediationName", required=true)
    private String remediationName;

    public String remediationName() {
        return this.remediationName;
    }

    /**
     * Resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetRemediationAtResourceGroupArgs() {}

    private GetRemediationAtResourceGroupArgs(GetRemediationAtResourceGroupArgs $) {
        this.remediationName = $.remediationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRemediationAtResourceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRemediationAtResourceGroupArgs $;

        public Builder() {
            $ = new GetRemediationAtResourceGroupArgs();
        }

        public Builder(GetRemediationAtResourceGroupArgs defaults) {
            $ = new GetRemediationAtResourceGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder remediationName(String remediationName) {
            $.remediationName = remediationName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetRemediationAtResourceGroupArgs build() {
            $.remediationName = Objects.requireNonNull($.remediationName, "expected parameter 'remediationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
