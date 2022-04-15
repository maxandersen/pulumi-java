// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowRunActionExpressionTracesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWorkflowRunActionExpressionTracesArgs Empty = new ListWorkflowRunActionExpressionTracesArgs();

    /**
     * The workflow action name.
     * 
     */
    @Import(name="actionName", required=true)
      private final String actionName;

    public String actionName() {
        return this.actionName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow run name.
     * 
     */
    @Import(name="runName", required=true)
      private final String runName;

    public String runName() {
        return this.runName;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
      private final String workflowName;

    public String workflowName() {
        return this.workflowName;
    }

    public ListWorkflowRunActionExpressionTracesArgs(
        String actionName,
        String resourceGroupName,
        String runName,
        String workflowName) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runName = Objects.requireNonNull(runName, "expected parameter 'runName' to be non-null");
        this.workflowName = Objects.requireNonNull(workflowName, "expected parameter 'workflowName' to be non-null");
    }

    private ListWorkflowRunActionExpressionTracesArgs() {
        this.actionName = null;
        this.resourceGroupName = null;
        this.runName = null;
        this.workflowName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkflowRunActionExpressionTracesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private String resourceGroupName;
        private String runName;
        private String workflowName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkflowRunActionExpressionTracesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runName = defaults.runName;
    	      this.workflowName = defaults.workflowName;
        }

        public Builder actionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder runName(String runName) {
            this.runName = Objects.requireNonNull(runName);
            return this;
        }
        public Builder workflowName(String workflowName) {
            this.workflowName = Objects.requireNonNull(workflowName);
            return this;
        }        public ListWorkflowRunActionExpressionTracesArgs build() {
            return new ListWorkflowRunActionExpressionTracesArgs(actionName, resourceGroupName, runName, workflowName);
        }
    }
}
