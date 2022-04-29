// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityConnectorArgs extends InvokeArgs {

    public static final GetSecurityConnectorArgs Empty = new GetSecurityConnectorArgs();

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The security connector name.
     * 
     */
    @Import(name="securityConnectorName", required=true)
    private String securityConnectorName;

    /**
     * @return The security connector name.
     * 
     */
    public String securityConnectorName() {
        return this.securityConnectorName;
    }

    private GetSecurityConnectorArgs() {}

    private GetSecurityConnectorArgs(GetSecurityConnectorArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.securityConnectorName = $.securityConnectorName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSecurityConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSecurityConnectorArgs $;

        public Builder() {
            $ = new GetSecurityConnectorArgs();
        }

        public Builder(GetSecurityConnectorArgs defaults) {
            $ = new GetSecurityConnectorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group within the user&#39;s subscription. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param securityConnectorName The security connector name.
         * 
         * @return builder
         * 
         */
        public Builder securityConnectorName(String securityConnectorName) {
            $.securityConnectorName = securityConnectorName;
            return this;
        }

        public GetSecurityConnectorArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.securityConnectorName = Objects.requireNonNull($.securityConnectorName, "expected parameter 'securityConnectorName' to be non-null");
            return $;
        }
    }

}
