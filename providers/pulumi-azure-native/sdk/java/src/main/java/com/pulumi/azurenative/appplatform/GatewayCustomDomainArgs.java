// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform;

import com.pulumi.azurenative.appplatform.inputs.GatewayCustomDomainPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GatewayCustomDomainArgs extends ResourceArgs {

    public static final GatewayCustomDomainArgs Empty = new GatewayCustomDomainArgs();

    /**
     * The name of the Spring Cloud Gateway custom domain.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The name of the Spring Cloud Gateway custom domain.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The name of Spring Cloud Gateway.
     * 
     */
    @Import(name="gatewayName", required=true)
    private Output<String> gatewayName;

    /**
     * @return The name of Spring Cloud Gateway.
     * 
     */
    public Output<String> gatewayName() {
        return this.gatewayName;
    }

    /**
     * The properties of custom domain for Spring Cloud Gateway
     * 
     */
    @Import(name="properties")
    private @Nullable Output<GatewayCustomDomainPropertiesArgs> properties;

    /**
     * @return The properties of custom domain for Spring Cloud Gateway
     * 
     */
    public Optional<Output<GatewayCustomDomainPropertiesArgs>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GatewayCustomDomainArgs() {}

    private GatewayCustomDomainArgs(GatewayCustomDomainArgs $) {
        this.domainName = $.domainName;
        this.gatewayName = $.gatewayName;
        this.properties = $.properties;
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayCustomDomainArgs $;

        public Builder() {
            $ = new GatewayCustomDomainArgs();
        }

        public Builder(GatewayCustomDomainArgs defaults) {
            $ = new GatewayCustomDomainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param domainName The name of the Spring Cloud Gateway custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The name of the Spring Cloud Gateway custom domain.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param gatewayName The name of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(Output<String> gatewayName) {
            $.gatewayName = gatewayName;
            return this;
        }

        /**
         * @param gatewayName The name of Spring Cloud Gateway.
         * 
         * @return builder
         * 
         */
        public Builder gatewayName(String gatewayName) {
            return gatewayName(Output.of(gatewayName));
        }

        /**
         * @param properties The properties of custom domain for Spring Cloud Gateway
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<GatewayCustomDomainPropertiesArgs> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties The properties of custom domain for Spring Cloud Gateway
         * 
         * @return builder
         * 
         */
        public Builder properties(GatewayCustomDomainPropertiesArgs properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GatewayCustomDomainArgs build() {
            $.gatewayName = Objects.requireNonNull($.gatewayName, "expected parameter 'gatewayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
