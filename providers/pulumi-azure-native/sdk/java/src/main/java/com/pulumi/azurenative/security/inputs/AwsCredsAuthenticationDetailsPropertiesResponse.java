// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * AWS cloud account connector based credentials, the credentials is composed of access key ID and secret key, for more details, refer to &lt;a href=&#34;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_users_create.html&#34;&gt;Creating an IAM User in Your AWS Account (write only)&lt;/a&gt;
 * 
 */
public final class AwsCredsAuthenticationDetailsPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final AwsCredsAuthenticationDetailsPropertiesResponse Empty = new AwsCredsAuthenticationDetailsPropertiesResponse();

    /**
     * The ID of the cloud account
     * 
     */
    @Import(name="accountId", required=true)
      private final String accountId;

    public String accountId() {
        return this.accountId;
    }

    /**
     * State of the multi-cloud connector
     * 
     */
    @Import(name="authenticationProvisioningState", required=true)
      private final String authenticationProvisioningState;

    public String authenticationProvisioningState() {
        return this.authenticationProvisioningState;
    }

    /**
     * Connect to your cloud account, for AWS use either account credentials or role-based authentication. For GCP use account organization credentials.
     * Expected value is &#39;awsCreds&#39;.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final String authenticationType;

    public String authenticationType() {
        return this.authenticationType;
    }

    /**
     * Public key element of the AWS credential object (write only)
     * 
     */
    @Import(name="awsAccessKeyId", required=true)
      private final String awsAccessKeyId;

    public String awsAccessKeyId() {
        return this.awsAccessKeyId;
    }

    /**
     * Secret key element of the AWS credential object (write only)
     * 
     */
    @Import(name="awsSecretAccessKey", required=true)
      private final String awsSecretAccessKey;

    public String awsSecretAccessKey() {
        return this.awsSecretAccessKey;
    }

    /**
     * The permissions detected in the cloud account.
     * 
     */
    @Import(name="grantedPermissions", required=true)
      private final List<String> grantedPermissions;

    public List<String> grantedPermissions() {
        return this.grantedPermissions;
    }

    public AwsCredsAuthenticationDetailsPropertiesResponse(
        String accountId,
        String authenticationProvisioningState,
        String authenticationType,
        String awsAccessKeyId,
        String awsSecretAccessKey,
        List<String> grantedPermissions) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState, "expected parameter 'authenticationProvisioningState' to be non-null");
        this.authenticationType = Codegen.stringProp("authenticationType").arg(authenticationType).require();
        this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId, "expected parameter 'awsAccessKeyId' to be non-null");
        this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey, "expected parameter 'awsSecretAccessKey' to be non-null");
        this.grantedPermissions = Objects.requireNonNull(grantedPermissions, "expected parameter 'grantedPermissions' to be non-null");
    }

    private AwsCredsAuthenticationDetailsPropertiesResponse() {
        this.accountId = null;
        this.authenticationProvisioningState = null;
        this.authenticationType = null;
        this.awsAccessKeyId = null;
        this.awsSecretAccessKey = null;
        this.grantedPermissions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCredsAuthenticationDetailsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String authenticationProvisioningState;
        private String authenticationType;
        private String awsAccessKeyId;
        private String awsSecretAccessKey;
        private List<String> grantedPermissions;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsCredsAuthenticationDetailsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.authenticationProvisioningState = defaults.authenticationProvisioningState;
    	      this.authenticationType = defaults.authenticationType;
    	      this.awsAccessKeyId = defaults.awsAccessKeyId;
    	      this.awsSecretAccessKey = defaults.awsSecretAccessKey;
    	      this.grantedPermissions = defaults.grantedPermissions;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder authenticationProvisioningState(String authenticationProvisioningState) {
            this.authenticationProvisioningState = Objects.requireNonNull(authenticationProvisioningState);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder awsAccessKeyId(String awsAccessKeyId) {
            this.awsAccessKeyId = Objects.requireNonNull(awsAccessKeyId);
            return this;
        }
        public Builder awsSecretAccessKey(String awsSecretAccessKey) {
            this.awsSecretAccessKey = Objects.requireNonNull(awsSecretAccessKey);
            return this;
        }
        public Builder grantedPermissions(List<String> grantedPermissions) {
            this.grantedPermissions = Objects.requireNonNull(grantedPermissions);
            return this;
        }
        public Builder grantedPermissions(String... grantedPermissions) {
            return grantedPermissions(List.of(grantedPermissions));
        }        public AwsCredsAuthenticationDetailsPropertiesResponse build() {
            return new AwsCredsAuthenticationDetailsPropertiesResponse(accountId, authenticationProvisioningState, authenticationType, awsAccessKeyId, awsSecretAccessKey, grantedPermissions);
        }
    }
}
