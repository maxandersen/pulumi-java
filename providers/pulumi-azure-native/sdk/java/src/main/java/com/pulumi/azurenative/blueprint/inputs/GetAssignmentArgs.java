// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssignmentArgs Empty = new GetAssignmentArgs();

    /**
     * Name of the blueprint assignment.
     * 
     */
    @Import(name="assignmentName", required=true)
      private final String assignmentName;

    public String assignmentName() {
        return this.assignmentName;
    }

    /**
     * The scope of the resource. Valid scopes are: management group (format: &#39;/providers/Microsoft.Management/managementGroups/{managementGroup}&#39;), subscription (format: &#39;/subscriptions/{subscriptionId}&#39;).
     * 
     */
    @Import(name="resourceScope", required=true)
      private final String resourceScope;

    public String resourceScope() {
        return this.resourceScope;
    }

    public GetAssignmentArgs(
        String assignmentName,
        String resourceScope) {
        this.assignmentName = Objects.requireNonNull(assignmentName, "expected parameter 'assignmentName' to be non-null");
        this.resourceScope = Objects.requireNonNull(resourceScope, "expected parameter 'resourceScope' to be non-null");
    }

    private GetAssignmentArgs() {
        this.assignmentName = null;
        this.resourceScope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentName;
        private String resourceScope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentName = defaults.assignmentName;
    	      this.resourceScope = defaults.resourceScope;
        }

        public Builder assignmentName(String assignmentName) {
            this.assignmentName = Objects.requireNonNull(assignmentName);
            return this;
        }
        public Builder resourceScope(String resourceScope) {
            this.resourceScope = Objects.requireNonNull(resourceScope);
            return this;
        }        public GetAssignmentArgs build() {
            return new GetAssignmentArgs(assignmentName, resourceScope);
        }
    }
}
