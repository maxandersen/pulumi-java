// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.eks.inputs;

import com.pulumi.aws.eks.inputs.GetNodeGroupResourceAutoscalingGroup;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetNodeGroupResource extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeGroupResource Empty = new GetNodeGroupResource();

    /**
     * List of objects containing information about AutoScaling Groups.
     * 
     */
    @Import(name="autoscalingGroups", required=true)
      private final List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups;

    public List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups() {
        return this.autoscalingGroups;
    }

    /**
     * Identifier of the remote access EC2 Security Group.
     * 
     */
    @Import(name="remoteAccessSecurityGroupId", required=true)
      private final String remoteAccessSecurityGroupId;

    public String remoteAccessSecurityGroupId() {
        return this.remoteAccessSecurityGroupId;
    }

    public GetNodeGroupResource(
        List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups,
        String remoteAccessSecurityGroupId) {
        this.autoscalingGroups = Objects.requireNonNull(autoscalingGroups, "expected parameter 'autoscalingGroups' to be non-null");
        this.remoteAccessSecurityGroupId = Objects.requireNonNull(remoteAccessSecurityGroupId, "expected parameter 'remoteAccessSecurityGroupId' to be non-null");
    }

    private GetNodeGroupResource() {
        this.autoscalingGroups = List.of();
        this.remoteAccessSecurityGroupId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeGroupResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups;
        private String remoteAccessSecurityGroupId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeGroupResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroups = defaults.autoscalingGroups;
    	      this.remoteAccessSecurityGroupId = defaults.remoteAccessSecurityGroupId;
        }

        public Builder autoscalingGroups(List<GetNodeGroupResourceAutoscalingGroup> autoscalingGroups) {
            this.autoscalingGroups = Objects.requireNonNull(autoscalingGroups);
            return this;
        }
        public Builder autoscalingGroups(GetNodeGroupResourceAutoscalingGroup... autoscalingGroups) {
            return autoscalingGroups(List.of(autoscalingGroups));
        }
        public Builder remoteAccessSecurityGroupId(String remoteAccessSecurityGroupId) {
            this.remoteAccessSecurityGroupId = Objects.requireNonNull(remoteAccessSecurityGroupId);
            return this;
        }        public GetNodeGroupResource build() {
            return new GetNodeGroupResource(autoscalingGroups, remoteAccessSecurityGroupId);
        }
    }
}
