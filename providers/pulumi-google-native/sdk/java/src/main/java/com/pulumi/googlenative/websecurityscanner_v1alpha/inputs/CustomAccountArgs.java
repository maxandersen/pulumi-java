// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.websecurityscanner_v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration that uses a custom account.
 * 
 */
public final class CustomAccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final CustomAccountArgs Empty = new CustomAccountArgs();

    /**
     * The login form URL of the website.
     * 
     */
    @Import(name="loginUrl", required=true)
    private Output<String> loginUrl;

    public Output<String> loginUrl() {
        return this.loginUrl;
    }

    /**
     * Input only. The password of the custom account. The credential is stored encrypted and not returned in any response nor included in audit logs.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * The user name of the custom account.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private CustomAccountArgs() {}

    private CustomAccountArgs(CustomAccountArgs $) {
        this.loginUrl = $.loginUrl;
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomAccountArgs $;

        public Builder() {
            $ = new CustomAccountArgs();
        }

        public Builder(CustomAccountArgs defaults) {
            $ = new CustomAccountArgs(Objects.requireNonNull(defaults));
        }

        public Builder loginUrl(Output<String> loginUrl) {
            $.loginUrl = loginUrl;
            return this;
        }

        public Builder loginUrl(String loginUrl) {
            return loginUrl(Output.of(loginUrl));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public CustomAccountArgs build() {
            $.loginUrl = Objects.requireNonNull($.loginUrl, "expected parameter 'loginUrl' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
