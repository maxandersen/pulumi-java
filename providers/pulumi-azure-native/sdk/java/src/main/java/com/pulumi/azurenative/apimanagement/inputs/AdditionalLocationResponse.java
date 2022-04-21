// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.ApiManagementServiceSkuPropertiesResponse;
import com.pulumi.azurenative.apimanagement.inputs.VirtualNetworkConfigurationResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description of an additional API Management resource location.
 * 
 */
public final class AdditionalLocationResponse extends com.pulumi.resources.InvokeArgs {

    public static final AdditionalLocationResponse Empty = new AdditionalLocationResponse();

    /**
     * Property only valid for an Api Management service deployed in multiple locations. This can be used to disable the gateway in this additional location.
     * 
     */
    @Import(name="disableGateway")
    private @Nullable Boolean disableGateway;

    public Optional<Boolean> disableGateway() {
        return Optional.ofNullable(this.disableGateway);
    }

    /**
     * Gateway URL of the API Management service in the Region.
     * 
     */
    @Import(name="gatewayRegionalUrl", required=true)
    private String gatewayRegionalUrl;

    public String gatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }

    /**
     * The location name of the additional region among Azure Data center regions.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    /**
     * Private Static Load Balanced IP addresses of the API Management service which is deployed in an Internal Virtual Network in a particular additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @Import(name="privateIPAddresses", required=true)
    private List<String> privateIPAddresses;

    public List<String> privateIPAddresses() {
        return this.privateIPAddresses;
    }

    /**
     * Public Static Load Balanced IP addresses of the API Management service in the additional location. Available only for Basic, Standard, Premium and Isolated SKU.
     * 
     */
    @Import(name="publicIPAddresses", required=true)
    private List<String> publicIPAddresses;

    public List<String> publicIPAddresses() {
        return this.publicIPAddresses;
    }

    /**
     * SKU properties of the API Management service.
     * 
     */
    @Import(name="sku", required=true)
    private ApiManagementServiceSkuPropertiesResponse sku;

    public ApiManagementServiceSkuPropertiesResponse sku() {
        return this.sku;
    }

    /**
     * Virtual network configuration for the location.
     * 
     */
    @Import(name="virtualNetworkConfiguration")
    private @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;

    public Optional<VirtualNetworkConfigurationResponse> virtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable List<String> zones;

    public Optional<List<String>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private AdditionalLocationResponse() {}

    private AdditionalLocationResponse(AdditionalLocationResponse $) {
        this.disableGateway = $.disableGateway;
        this.gatewayRegionalUrl = $.gatewayRegionalUrl;
        this.location = $.location;
        this.privateIPAddresses = $.privateIPAddresses;
        this.publicIPAddresses = $.publicIPAddresses;
        this.sku = $.sku;
        this.virtualNetworkConfiguration = $.virtualNetworkConfiguration;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AdditionalLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AdditionalLocationResponse $;

        public Builder() {
            $ = new AdditionalLocationResponse();
        }

        public Builder(AdditionalLocationResponse defaults) {
            $ = new AdditionalLocationResponse(Objects.requireNonNull(defaults));
        }

        public Builder disableGateway(@Nullable Boolean disableGateway) {
            $.disableGateway = disableGateway;
            return this;
        }

        public Builder gatewayRegionalUrl(String gatewayRegionalUrl) {
            $.gatewayRegionalUrl = gatewayRegionalUrl;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder privateIPAddresses(List<String> privateIPAddresses) {
            $.privateIPAddresses = privateIPAddresses;
            return this;
        }

        public Builder privateIPAddresses(String... privateIPAddresses) {
            return privateIPAddresses(List.of(privateIPAddresses));
        }

        public Builder publicIPAddresses(List<String> publicIPAddresses) {
            $.publicIPAddresses = publicIPAddresses;
            return this;
        }

        public Builder publicIPAddresses(String... publicIPAddresses) {
            return publicIPAddresses(List.of(publicIPAddresses));
        }

        public Builder sku(ApiManagementServiceSkuPropertiesResponse sku) {
            $.sku = sku;
            return this;
        }

        public Builder virtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            $.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public AdditionalLocationResponse build() {
            $.disableGateway = Codegen.booleanProp("disableGateway").arg($.disableGateway).def(false).getNullable();
            $.gatewayRegionalUrl = Objects.requireNonNull($.gatewayRegionalUrl, "expected parameter 'gatewayRegionalUrl' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.privateIPAddresses = Objects.requireNonNull($.privateIPAddresses, "expected parameter 'privateIPAddresses' to be non-null");
            $.publicIPAddresses = Objects.requireNonNull($.publicIPAddresses, "expected parameter 'publicIPAddresses' to be non-null");
            $.sku = Objects.requireNonNull($.sku, "expected parameter 'sku' to be non-null");
            return $;
        }
    }

}
