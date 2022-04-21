// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileSingularConnectorProfileCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSingularConnectorProfileCredentialsArgs Empty = new ConnectorProfileSingularConnectorProfileCredentialsArgs();

    /**
     * A unique alphanumeric identiﬁer used to authenticate a user, developer, or calling program to your API.
     * 
     */
    @Import(name="apiKey", required=true)
    private Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }

    private ConnectorProfileSingularConnectorProfileCredentialsArgs() {}

    private ConnectorProfileSingularConnectorProfileCredentialsArgs(ConnectorProfileSingularConnectorProfileCredentialsArgs $) {
        this.apiKey = $.apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileSingularConnectorProfileCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileSingularConnectorProfileCredentialsArgs $;

        public Builder() {
            $ = new ConnectorProfileSingularConnectorProfileCredentialsArgs();
        }

        public Builder(ConnectorProfileSingularConnectorProfileCredentialsArgs defaults) {
            $ = new ConnectorProfileSingularConnectorProfileCredentialsArgs(Objects.requireNonNull(defaults));
        }

        public Builder apiKey(Output<String> apiKey) {
            $.apiKey = apiKey;
            return this;
        }

        public Builder apiKey(String apiKey) {
            return apiKey(Output.of(apiKey));
        }

        public ConnectorProfileSingularConnectorProfileCredentialsArgs build() {
            $.apiKey = Objects.requireNonNull($.apiKey, "expected parameter 'apiKey' to be non-null");
            return $;
        }
    }

}
