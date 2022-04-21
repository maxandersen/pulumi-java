// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileVeevaConnectorProfileCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileVeevaConnectorProfileCredentialsArgs Empty = new ConnectorProfileVeevaConnectorProfileCredentialsArgs();

    /**
     * The password that corresponds to the username.
     * 
     */
    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    /**
     * The name of the user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private ConnectorProfileVeevaConnectorProfileCredentialsArgs() {}

    private ConnectorProfileVeevaConnectorProfileCredentialsArgs(ConnectorProfileVeevaConnectorProfileCredentialsArgs $) {
        this.password = $.password;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileVeevaConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileVeevaConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileVeevaConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileVeevaConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileVeevaConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
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

        public ConnectorProfileVeevaConnectorProfileCredentialsArgs build() {
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
