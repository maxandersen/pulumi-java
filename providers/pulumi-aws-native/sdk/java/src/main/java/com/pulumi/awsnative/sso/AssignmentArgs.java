// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso;

import com.pulumi.awsnative.sso.enums.AssignmentPrincipalType;
import com.pulumi.awsnative.sso.enums.AssignmentTargetType;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AssignmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final AssignmentArgs Empty = new AssignmentArgs();

    /**
     * The sso instance that the permission set is owned.
     * 
     */
    @Import(name="instanceArn", required=true)
      private final Output<String> instanceArn;

    public Output<String> instanceArn() {
        return this.instanceArn;
    }

    /**
     * The permission set that the assignemt will be assigned
     * 
     */
    @Import(name="permissionSetArn", required=true)
      private final Output<String> permissionSetArn;

    public Output<String> permissionSetArn() {
        return this.permissionSetArn;
    }

    /**
     * The assignee&#39;s identifier, user id/group id
     * 
     */
    @Import(name="principalId", required=true)
      private final Output<String> principalId;

    public Output<String> principalId() {
        return this.principalId;
    }

    /**
     * The assignee&#39;s type, user/group
     * 
     */
    @Import(name="principalType", required=true)
      private final Output<AssignmentPrincipalType> principalType;

    public Output<AssignmentPrincipalType> principalType() {
        return this.principalType;
    }

    /**
     * The account id to be provisioned.
     * 
     */
    @Import(name="targetId", required=true)
      private final Output<String> targetId;

    public Output<String> targetId() {
        return this.targetId;
    }

    /**
     * The type of resource to be provsioned to, only aws account now
     * 
     */
    @Import(name="targetType", required=true)
      private final Output<AssignmentTargetType> targetType;

    public Output<AssignmentTargetType> targetType() {
        return this.targetType;
    }

    public AssignmentArgs(
        Output<String> instanceArn,
        Output<String> permissionSetArn,
        Output<String> principalId,
        Output<AssignmentPrincipalType> principalType,
        Output<String> targetId,
        Output<AssignmentTargetType> targetType) {
        this.instanceArn = Objects.requireNonNull(instanceArn, "expected parameter 'instanceArn' to be non-null");
        this.permissionSetArn = Objects.requireNonNull(permissionSetArn, "expected parameter 'permissionSetArn' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.principalType = Objects.requireNonNull(principalType, "expected parameter 'principalType' to be non-null");
        this.targetId = Objects.requireNonNull(targetId, "expected parameter 'targetId' to be non-null");
        this.targetType = Objects.requireNonNull(targetType, "expected parameter 'targetType' to be non-null");
    }

    private AssignmentArgs() {
        this.instanceArn = Codegen.empty();
        this.permissionSetArn = Codegen.empty();
        this.principalId = Codegen.empty();
        this.principalType = Codegen.empty();
        this.targetId = Codegen.empty();
        this.targetType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> instanceArn;
        private Output<String> permissionSetArn;
        private Output<String> principalId;
        private Output<AssignmentPrincipalType> principalType;
        private Output<String> targetId;
        private Output<AssignmentTargetType> targetType;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceArn = defaults.instanceArn;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.principalId = defaults.principalId;
    	      this.principalType = defaults.principalType;
    	      this.targetId = defaults.targetId;
    	      this.targetType = defaults.targetType;
        }

        public Builder instanceArn(Output<String> instanceArn) {
            this.instanceArn = Objects.requireNonNull(instanceArn);
            return this;
        }
        public Builder instanceArn(String instanceArn) {
            this.instanceArn = Output.of(Objects.requireNonNull(instanceArn));
            return this;
        }
        public Builder permissionSetArn(Output<String> permissionSetArn) {
            this.permissionSetArn = Objects.requireNonNull(permissionSetArn);
            return this;
        }
        public Builder permissionSetArn(String permissionSetArn) {
            this.permissionSetArn = Output.of(Objects.requireNonNull(permissionSetArn));
            return this;
        }
        public Builder principalId(Output<String> principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder principalId(String principalId) {
            this.principalId = Output.of(Objects.requireNonNull(principalId));
            return this;
        }
        public Builder principalType(Output<AssignmentPrincipalType> principalType) {
            this.principalType = Objects.requireNonNull(principalType);
            return this;
        }
        public Builder principalType(AssignmentPrincipalType principalType) {
            this.principalType = Output.of(Objects.requireNonNull(principalType));
            return this;
        }
        public Builder targetId(Output<String> targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Output.of(Objects.requireNonNull(targetId));
            return this;
        }
        public Builder targetType(Output<AssignmentTargetType> targetType) {
            this.targetType = Objects.requireNonNull(targetType);
            return this;
        }
        public Builder targetType(AssignmentTargetType targetType) {
            this.targetType = Output.of(Objects.requireNonNull(targetType));
            return this;
        }        public AssignmentArgs build() {
            return new AssignmentArgs(instanceArn, permissionSetArn, principalId, principalType, targetId, targetType);
        }
    }
}
