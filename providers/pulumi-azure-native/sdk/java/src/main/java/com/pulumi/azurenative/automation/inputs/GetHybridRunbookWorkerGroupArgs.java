// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.automation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHybridRunbookWorkerGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHybridRunbookWorkerGroupArgs Empty = new GetHybridRunbookWorkerGroupArgs();

    /**
     * The name of the automation account.
     * 
     */
    @Import(name="automationAccountName", required=true)
    private String automationAccountName;

    public String automationAccountName() {
        return this.automationAccountName;
    }

    /**
     * The hybrid runbook worker group name
     * 
     */
    @Import(name="hybridRunbookWorkerGroupName", required=true)
    private String hybridRunbookWorkerGroupName;

    public String hybridRunbookWorkerGroupName() {
        return this.hybridRunbookWorkerGroupName;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetHybridRunbookWorkerGroupArgs() {}

    private GetHybridRunbookWorkerGroupArgs(GetHybridRunbookWorkerGroupArgs $) {
        this.automationAccountName = $.automationAccountName;
        this.hybridRunbookWorkerGroupName = $.hybridRunbookWorkerGroupName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHybridRunbookWorkerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHybridRunbookWorkerGroupArgs $;

        public Builder() {
            $ = new GetHybridRunbookWorkerGroupArgs();
        }

        public Builder(GetHybridRunbookWorkerGroupArgs defaults) {
            $ = new GetHybridRunbookWorkerGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder automationAccountName(String automationAccountName) {
            $.automationAccountName = automationAccountName;
            return this;
        }

        public Builder hybridRunbookWorkerGroupName(String hybridRunbookWorkerGroupName) {
            $.hybridRunbookWorkerGroupName = hybridRunbookWorkerGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHybridRunbookWorkerGroupArgs build() {
            $.automationAccountName = Objects.requireNonNull($.automationAccountName, "expected parameter 'automationAccountName' to be non-null");
            $.hybridRunbookWorkerGroupName = Objects.requireNonNull($.hybridRunbookWorkerGroupName, "expected parameter 'hybridRunbookWorkerGroupName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
