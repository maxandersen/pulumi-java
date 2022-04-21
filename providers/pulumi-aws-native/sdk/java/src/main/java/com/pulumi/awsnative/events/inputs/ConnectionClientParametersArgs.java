// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.events.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionClientParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionClientParametersArgs Empty = new ConnectionClientParametersArgs();

    @Import(name="clientID", required=true)
    private Output<String> clientID;

    public Output<String> clientID() {
        return this.clientID;
    }

    @Import(name="clientSecret", required=true)
    private Output<String> clientSecret;

    public Output<String> clientSecret() {
        return this.clientSecret;
    }

    private ConnectionClientParametersArgs() {}

    private ConnectionClientParametersArgs(ConnectionClientParametersArgs $) {
        this.clientID = $.clientID;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionClientParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionClientParametersArgs $;

        public Builder() {
            $ = new ConnectionClientParametersArgs();
        }

        public Builder(ConnectionClientParametersArgs defaults) {
            $ = new ConnectionClientParametersArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientID(Output<String> clientID) {
            $.clientID = clientID;
            return this;
        }

        public Builder clientID(String clientID) {
            return clientID(Output.of(clientID));
        }

        public Builder clientSecret(Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public ConnectionClientParametersArgs build() {
            $.clientID = Objects.requireNonNull($.clientID, "expected parameter 'clientID' to be non-null");
            $.clientSecret = Objects.requireNonNull($.clientSecret, "expected parameter 'clientSecret' to be non-null");
            return $;
        }
    }

}
