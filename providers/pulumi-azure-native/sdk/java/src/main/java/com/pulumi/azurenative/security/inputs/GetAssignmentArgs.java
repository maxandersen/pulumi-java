// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAssignmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAssignmentArgs Empty = new GetAssignmentArgs();

    /**
     * The security assignment key - unique key for the standard assignment
     * 
     */
    @Import(name="assignmentId", required=true)
      private final String assignmentId;

    public String assignmentId() {
        return this.assignmentId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAssignmentArgs(
        String assignmentId,
        String resourceGroupName) {
        this.assignmentId = Objects.requireNonNull(assignmentId, "expected parameter 'assignmentId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAssignmentArgs() {
        this.assignmentId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assignmentId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignmentId = defaults.assignmentId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder assignmentId(String assignmentId) {
            this.assignmentId = Objects.requireNonNull(assignmentId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetAssignmentArgs build() {
            return new GetAssignmentArgs(assignmentId, resourceGroupName);
        }
    }
}
