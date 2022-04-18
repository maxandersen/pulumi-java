// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetDomainCognitoOption extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainCognitoOption Empty = new GetDomainCognitoOption();

    /**
     * Whether node to node encryption is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The Cognito Identity pool used by the domain.
     * 
     */
    @Import(name="identityPoolId", required=true)
      private final String identityPoolId;

    public String identityPoolId() {
        return this.identityPoolId;
    }

    /**
     * The IAM Role with the AmazonESCognitoAccess policy attached.
     * 
     */
    @Import(name="roleArn", required=true)
      private final String roleArn;

    public String roleArn() {
        return this.roleArn;
    }

    /**
     * The Cognito User pool used by the domain.
     * 
     */
    @Import(name="userPoolId", required=true)
      private final String userPoolId;

    public String userPoolId() {
        return this.userPoolId;
    }

    public GetDomainCognitoOption(
        Boolean enabled,
        String identityPoolId,
        String roleArn,
        String userPoolId) {
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.identityPoolId = Objects.requireNonNull(identityPoolId, "expected parameter 'identityPoolId' to be non-null");
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.userPoolId = Objects.requireNonNull(userPoolId, "expected parameter 'userPoolId' to be non-null");
    }

    private GetDomainCognitoOption() {
        this.enabled = null;
        this.identityPoolId = null;
        this.roleArn = null;
        this.userPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainCognitoOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;
        private String identityPoolId;
        private String roleArn;
        private String userPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainCognitoOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.identityPoolId = defaults.identityPoolId;
    	      this.roleArn = defaults.roleArn;
    	      this.userPoolId = defaults.userPoolId;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder identityPoolId(String identityPoolId) {
            this.identityPoolId = Objects.requireNonNull(identityPoolId);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder userPoolId(String userPoolId) {
            this.userPoolId = Objects.requireNonNull(userPoolId);
            return this;
        }        public GetDomainCognitoOption build() {
            return new GetDomainCognitoOption(enabled, identityPoolId, roleArn, userPoolId);
        }
    }
}
