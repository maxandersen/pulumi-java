// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databoxedge.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The mapping between a particular user and the access type on the SMB share.
 * 
 */
public final class UserAccessRightResponse extends com.pulumi.resources.InvokeArgs {

    public static final UserAccessRightResponse Empty = new UserAccessRightResponse();

    /**
     * Type of access to be allowed for the user.
     * 
     */
    @Import(name="accessType", required=true)
      private final String accessType;

    public String accessType() {
        return this.accessType;
    }

    /**
     * User ID (already existing in the device).
     * 
     */
    @Import(name="userId", required=true)
      private final String userId;

    public String userId() {
        return this.userId;
    }

    public UserAccessRightResponse(
        String accessType,
        String userId) {
        this.accessType = Objects.requireNonNull(accessType, "expected parameter 'accessType' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private UserAccessRightResponse() {
        this.accessType = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAccessRightResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessType;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAccessRightResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessType = defaults.accessType;
    	      this.userId = defaults.userId;
        }

        public Builder accessType(String accessType) {
            this.accessType = Objects.requireNonNull(accessType);
            return this;
        }
        public Builder userId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }        public UserAccessRightResponse build() {
            return new UserAccessRightResponse(accessType, userId);
        }
    }
}
