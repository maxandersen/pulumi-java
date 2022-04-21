// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectorProfileZendeskConnectorProfilePropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileZendeskConnectorProfilePropertiesArgs Empty = new ConnectorProfileZendeskConnectorProfilePropertiesArgs();

    /**
     * The location of the Zendesk resource
     * 
     */
    @Import(name="instanceUrl", required=true)
    private Output<String> instanceUrl;

    public Output<String> instanceUrl() {
        return this.instanceUrl;
    }

    private ConnectorProfileZendeskConnectorProfilePropertiesArgs() {}

    private ConnectorProfileZendeskConnectorProfilePropertiesArgs(ConnectorProfileZendeskConnectorProfilePropertiesArgs $) {
        this.instanceUrl = $.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectorProfileZendeskConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorProfileZendeskConnectorProfilePropertiesArgs $;

        public Builder() {
            $ = new ConnectorProfileZendeskConnectorProfilePropertiesArgs();
        }

        public Builder(ConnectorProfileZendeskConnectorProfilePropertiesArgs defaults) {
            $ = new ConnectorProfileZendeskConnectorProfilePropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceUrl(Output<String> instanceUrl) {
            $.instanceUrl = instanceUrl;
            return this;
        }

        public Builder instanceUrl(String instanceUrl) {
            return instanceUrl(Output.of(instanceUrl));
        }

        public ConnectorProfileZendeskConnectorProfilePropertiesArgs build() {
            $.instanceUrl = Objects.requireNonNull($.instanceUrl, "expected parameter 'instanceUrl' to be non-null");
            return $;
        }
    }

}
