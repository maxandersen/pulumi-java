// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a custom account.
 * 
 */
public final class CustomAccountResponse extends com.pulumi.resources.InvokeArgs {

    public static final CustomAccountResponse Empty = new CustomAccountResponse();

    /**
     * The login form URL of the website.
     * 
     */
    @Import(name="loginUrl", required=true)
    private String loginUrl;

    public String loginUrl() {
        return this.loginUrl;
    }

    /**
     * Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
    private String password;

    public String password() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @Import(name="username", required=true)
    private String username;

    public String username() {
        return this.username;
    }

    private CustomAccountResponse() {}

    private CustomAccountResponse(CustomAccountResponse $) {
        this.loginUrl = $.loginUrl;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAccountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAccountResponse $;

        public Builder() {
            $ = new CustomAccountResponse();
        }

        public Builder(CustomAccountResponse defaults) {
            $ = new CustomAccountResponse(Objects.requireNonNull(defaults));
        }

        public Builder loginUrl(String loginUrl) {
            $.loginUrl = loginUrl;
            return this;
        }

        public Builder password(String password) {
            $.password = password;
            return this;
        }

        public Builder username(String username) {
            $.username = username;
            return this;
        }

        public CustomAccountResponse build() {
            $.loginUrl = Objects.requireNonNull($.loginUrl, "expected parameter 'loginUrl' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
