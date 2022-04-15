// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes information on user who created this ComputeInstance.
 * 
 */
public final class ComputeInstanceCreatedByResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceCreatedByResponse Empty = new ComputeInstanceCreatedByResponse();

    /**
     * Uniquely identifies the user within his/her organization.
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String userId() {
        return this.userId;
    }

    /**
     * Name of the user.
     * 
     */
    @Import(name="userName", required=true)
      private final String userName;

    public String userName() {
        return this.userName;
    }

    /**
     * Uniquely identifies user' Azure Active Directory organization.
     * 
     */
    @Import(name="userOrgId", required=true)
      private final String userOrgId;

    public String userOrgId() {
        return this.userOrgId;
    }

    public ComputeInstanceCreatedByResponse(
        String userId,
        String userName,
        String userOrgId) {
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
        this.userOrgId = Objects.requireNonNull(userOrgId, "expected parameter 'userOrgId' to be non-null");
    }

    private ComputeInstanceCreatedByResponse() {
        this.userId = null;
        this.userName = null;
        this.userOrgId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceCreatedByResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String userId;
        private String userName;
        private String userOrgId;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceCreatedByResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userId = defaults.userId;
    	      this.userName = defaults.userName;
    	      this.userOrgId = defaults.userOrgId;
        }

        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userOrgId(String userOrgId) {
            this.userOrgId = Objects.requireNonNull(userOrgId);
            return this;
        }        public ComputeInstanceCreatedByResponse build() {
            return new ComputeInstanceCreatedByResponse(userId, userName, userOrgId);
        }
    }
}
