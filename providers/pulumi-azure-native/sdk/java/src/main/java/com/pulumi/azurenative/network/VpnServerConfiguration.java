// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.VpnServerConfigurationArgs;
import com.pulumi.azurenative.network.outputs.AadAuthenticationParametersResponse;
import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnGatewayResponse;
import com.pulumi.azurenative.network.outputs.RadiusServerResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigRadiusClientRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigRadiusServerRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigVpnClientRevokedCertificateResponse;
import com.pulumi.azurenative.network.outputs.VpnServerConfigVpnClientRootCertificateResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * VpnServerConfiguration Resource.
 * API Version: 2020-11-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:VpnServerConfiguration vpnServerConfiguration1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/vpnServerConfigurations/vpnServerConfiguration1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:VpnServerConfiguration")
public class VpnServerConfiguration extends CustomResource {
    /**
     * The set of aad vpn authentication parameters.
     * 
     */
    @Export(name="aadAuthenticationParameters", type=AadAuthenticationParametersResponse.class, parameters={})
    private Output</* @Nullable */ AadAuthenticationParametersResponse> aadAuthenticationParameters;

    /**
     * @return The set of aad vpn authentication parameters.
     * 
     */
    public Output<Optional<AadAuthenticationParametersResponse>> aadAuthenticationParameters() {
        return Codegen.optional(this.aadAuthenticationParameters);
    }
    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return A unique read-only string that changes whenever the resource is updated.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Resource location.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Resource location.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of references to P2SVpnGateways.
     * 
     */
    @Export(name="p2SVpnGateways", type=List.class, parameters={P2SVpnGatewayResponse.class})
    private Output<List<P2SVpnGatewayResponse>> p2SVpnGateways;

    /**
     * @return List of references to P2SVpnGateways.
     * 
     */
    public Output<List<P2SVpnGatewayResponse>> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }
    /**
     * The provisioning state of the VpnServerConfiguration resource. Possible values are: &#39;Updating&#39;, &#39;Deleting&#39;, and &#39;Failed&#39;.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the VpnServerConfiguration resource. Possible values are: &#39;Updating&#39;, &#39;Deleting&#39;, and &#39;Failed&#39;.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Radius client root certificate of VpnServerConfiguration.
     * 
     */
    @Export(name="radiusClientRootCertificates", type=List.class, parameters={VpnServerConfigRadiusClientRootCertificateResponse.class})
    private Output</* @Nullable */ List<VpnServerConfigRadiusClientRootCertificateResponse>> radiusClientRootCertificates;

    /**
     * @return Radius client root certificate of VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<VpnServerConfigRadiusClientRootCertificateResponse>>> radiusClientRootCertificates() {
        return Codegen.optional(this.radiusClientRootCertificates);
    }
    /**
     * The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @Export(name="radiusServerAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> radiusServerAddress;

    /**
     * @return The radius server address property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Output<Optional<String>> radiusServerAddress() {
        return Codegen.optional(this.radiusServerAddress);
    }
    /**
     * Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    @Export(name="radiusServerRootCertificates", type=List.class, parameters={VpnServerConfigRadiusServerRootCertificateResponse.class})
    private Output</* @Nullable */ List<VpnServerConfigRadiusServerRootCertificateResponse>> radiusServerRootCertificates;

    /**
     * @return Radius Server root certificate of VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<VpnServerConfigRadiusServerRootCertificateResponse>>> radiusServerRootCertificates() {
        return Codegen.optional(this.radiusServerRootCertificates);
    }
    /**
     * The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    @Export(name="radiusServerSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> radiusServerSecret;

    /**
     * @return The radius secret property of the VpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Output<Optional<String>> radiusServerSecret() {
        return Codegen.optional(this.radiusServerSecret);
    }
    /**
     * Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    @Export(name="radiusServers", type=List.class, parameters={RadiusServerResponse.class})
    private Output</* @Nullable */ List<RadiusServerResponse>> radiusServers;

    /**
     * @return Multiple Radius Server configuration for VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<RadiusServerResponse>>> radiusServers() {
        return Codegen.optional(this.radiusServers);
    }
    /**
     * Resource tags.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * VPN authentication types for the VpnServerConfiguration.
     * 
     */
    @Export(name="vpnAuthenticationTypes", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpnAuthenticationTypes;

    /**
     * @return VPN authentication types for the VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<String>>> vpnAuthenticationTypes() {
        return Codegen.optional(this.vpnAuthenticationTypes);
    }
    /**
     * VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    @Export(name="vpnClientIpsecPolicies", type=List.class, parameters={IpsecPolicyResponse.class})
    private Output</* @Nullable */ List<IpsecPolicyResponse>> vpnClientIpsecPolicies;

    /**
     * @return VpnClientIpsecPolicies for VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<IpsecPolicyResponse>>> vpnClientIpsecPolicies() {
        return Codegen.optional(this.vpnClientIpsecPolicies);
    }
    /**
     * VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    @Export(name="vpnClientRevokedCertificates", type=List.class, parameters={VpnServerConfigVpnClientRevokedCertificateResponse.class})
    private Output</* @Nullable */ List<VpnServerConfigVpnClientRevokedCertificateResponse>> vpnClientRevokedCertificates;

    /**
     * @return VPN client revoked certificate of VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<VpnServerConfigVpnClientRevokedCertificateResponse>>> vpnClientRevokedCertificates() {
        return Codegen.optional(this.vpnClientRevokedCertificates);
    }
    /**
     * VPN client root certificate of VpnServerConfiguration.
     * 
     */
    @Export(name="vpnClientRootCertificates", type=List.class, parameters={VpnServerConfigVpnClientRootCertificateResponse.class})
    private Output</* @Nullable */ List<VpnServerConfigVpnClientRootCertificateResponse>> vpnClientRootCertificates;

    /**
     * @return VPN client root certificate of VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<VpnServerConfigVpnClientRootCertificateResponse>>> vpnClientRootCertificates() {
        return Codegen.optional(this.vpnClientRootCertificates);
    }
    /**
     * VPN protocols for the VpnServerConfiguration.
     * 
     */
    @Export(name="vpnProtocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpnProtocols;

    /**
     * @return VPN protocols for the VpnServerConfiguration.
     * 
     */
    public Output<Optional<List<String>>> vpnProtocols() {
        return Codegen.optional(this.vpnProtocols);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpnServerConfiguration(String name) {
        this(name, VpnServerConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpnServerConfiguration(String name, VpnServerConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpnServerConfiguration(String name, VpnServerConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:VpnServerConfiguration", name, args == null ? VpnServerConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpnServerConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:VpnServerConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20190801:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190901:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191101:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20191201:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200301:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200401:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200501:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200601:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200701:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20200801:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20201101:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210201:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210301:VpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20210501:VpnServerConfiguration").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static VpnServerConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new VpnServerConfiguration(name, id, options);
    }
}
