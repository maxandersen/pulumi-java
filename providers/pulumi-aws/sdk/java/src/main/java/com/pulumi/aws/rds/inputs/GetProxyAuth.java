// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetProxyAuth extends com.pulumi.resources.InvokeArgs {

    public static final GetProxyAuth Empty = new GetProxyAuth();

    @Import(name="authScheme", required=true)
      private final String authScheme;

    public String authScheme() {
        return this.authScheme;
    }

    @Import(name="description", required=true)
      private final String description;

    public String description() {
        return this.description;
    }

    @Import(name="iamAuth", required=true)
      private final String iamAuth;

    public String iamAuth() {
        return this.iamAuth;
    }

    @Import(name="secretArn", required=true)
      private final String secretArn;

    public String secretArn() {
        return this.secretArn;
    }

    public GetProxyAuth(
        String authScheme,
        String description,
        String iamAuth,
        String secretArn) {
        this.authScheme = Objects.requireNonNull(authScheme, "expected parameter 'authScheme' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.iamAuth = Objects.requireNonNull(iamAuth, "expected parameter 'iamAuth' to be non-null");
        this.secretArn = Objects.requireNonNull(secretArn, "expected parameter 'secretArn' to be non-null");
    }

    private GetProxyAuth() {
        this.authScheme = null;
        this.description = null;
        this.iamAuth = null;
        this.secretArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProxyAuth defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authScheme;
        private String description;
        private String iamAuth;
        private String secretArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProxyAuth defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authScheme = defaults.authScheme;
    	      this.description = defaults.description;
    	      this.iamAuth = defaults.iamAuth;
    	      this.secretArn = defaults.secretArn;
        }

        public Builder authScheme(String authScheme) {
            this.authScheme = Objects.requireNonNull(authScheme);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder iamAuth(String iamAuth) {
            this.iamAuth = Objects.requireNonNull(iamAuth);
            return this;
        }
        public Builder secretArn(String secretArn) {
            this.secretArn = Objects.requireNonNull(secretArn);
            return this;
        }        public GetProxyAuth build() {
            return new GetProxyAuth(authScheme, description, iamAuth, secretArn);
        }
    }
}
