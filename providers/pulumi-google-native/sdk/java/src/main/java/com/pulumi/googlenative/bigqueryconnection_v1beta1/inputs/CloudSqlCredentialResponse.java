// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigqueryconnection_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Credential info for the Cloud SQL.
 * 
 */
public final class CloudSqlCredentialResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudSqlCredentialResponse Empty = new CloudSqlCredentialResponse();

    /**
     * The password for the credential.
     * 
     */
    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    /**
     * The username for the credential.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private CloudSqlCredentialResponse() {}

    private CloudSqlCredentialResponse(CloudSqlCredentialResponse $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudSqlCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudSqlCredentialResponse $;

        public Builder() {
            $ = new CloudSqlCredentialResponse();
        }

        public Builder(CloudSqlCredentialResponse defaults) {
            $ = new CloudSqlCredentialResponse(Objects.requireNonNull(defaults));
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public CloudSqlCredentialResponse build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
