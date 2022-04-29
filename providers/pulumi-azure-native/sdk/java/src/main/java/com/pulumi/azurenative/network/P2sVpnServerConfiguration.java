// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.network.P2sVpnServerConfigurationArgs;
import com.pulumi.azurenative.network.outputs.IpsecPolicyResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnServerConfigRadiusClientRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnServerConfigRadiusServerRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnServerConfigVpnClientRevokedCertificateResponse;
import com.pulumi.azurenative.network.outputs.P2SVpnServerConfigVpnClientRootCertificateResponse;
import com.pulumi.azurenative.network.outputs.SubResourceResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * P2SVpnServerConfiguration Resource.
 * API Version: 2019-07-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:network:P2sVpnServerConfiguration p2sVpnServerConfiguration1 /subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualWans/virtualWan1/p2sVpnServerConfigurations//p2sVpnServerConfiguration1 
 * ```
 * 
 */
@ResourceType(type="azure-native:network:P2sVpnServerConfiguration")
public class P2sVpnServerConfiguration extends CustomResource {
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
     * The name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return The name of the P2SVpnServerConfiguration that is unique within a VirtualWan in a resource group. This name can be used to access the resource along with Paren VirtualWan resource name.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * List of references to P2SVpnGateways.
     * 
     */
    @Export(name="p2SVpnGateways", type=List.class, parameters={SubResourceResponse.class})
    private Output<List<SubResourceResponse>> p2SVpnGateways;

    /**
     * @return List of references to P2SVpnGateways.
     * 
     */
    public Output<List<SubResourceResponse>> p2SVpnGateways() {
        return this.p2SVpnGateways;
    }
    /**
     * Radius client root certificate of P2SVpnServerConfiguration.
     * 
     */
    @Export(name="p2SVpnServerConfigRadiusClientRootCertificates", type=List.class, parameters={P2SVpnServerConfigRadiusClientRootCertificateResponse.class})
    private Output</* @Nullable */ List<P2SVpnServerConfigRadiusClientRootCertificateResponse>> p2SVpnServerConfigRadiusClientRootCertificates;

    /**
     * @return Radius client root certificate of P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<P2SVpnServerConfigRadiusClientRootCertificateResponse>>> p2SVpnServerConfigRadiusClientRootCertificates() {
        return Codegen.optional(this.p2SVpnServerConfigRadiusClientRootCertificates);
    }
    /**
     * Radius Server root certificate of P2SVpnServerConfiguration.
     * 
     */
    @Export(name="p2SVpnServerConfigRadiusServerRootCertificates", type=List.class, parameters={P2SVpnServerConfigRadiusServerRootCertificateResponse.class})
    private Output</* @Nullable */ List<P2SVpnServerConfigRadiusServerRootCertificateResponse>> p2SVpnServerConfigRadiusServerRootCertificates;

    /**
     * @return Radius Server root certificate of P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<P2SVpnServerConfigRadiusServerRootCertificateResponse>>> p2SVpnServerConfigRadiusServerRootCertificates() {
        return Codegen.optional(this.p2SVpnServerConfigRadiusServerRootCertificates);
    }
    /**
     * VPN client revoked certificate of P2SVpnServerConfiguration.
     * 
     */
    @Export(name="p2SVpnServerConfigVpnClientRevokedCertificates", type=List.class, parameters={P2SVpnServerConfigVpnClientRevokedCertificateResponse.class})
    private Output</* @Nullable */ List<P2SVpnServerConfigVpnClientRevokedCertificateResponse>> p2SVpnServerConfigVpnClientRevokedCertificates;

    /**
     * @return VPN client revoked certificate of P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<P2SVpnServerConfigVpnClientRevokedCertificateResponse>>> p2SVpnServerConfigVpnClientRevokedCertificates() {
        return Codegen.optional(this.p2SVpnServerConfigVpnClientRevokedCertificates);
    }
    /**
     * VPN client root certificate of P2SVpnServerConfiguration.
     * 
     */
    @Export(name="p2SVpnServerConfigVpnClientRootCertificates", type=List.class, parameters={P2SVpnServerConfigVpnClientRootCertificateResponse.class})
    private Output</* @Nullable */ List<P2SVpnServerConfigVpnClientRootCertificateResponse>> p2SVpnServerConfigVpnClientRootCertificates;

    /**
     * @return VPN client root certificate of P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<P2SVpnServerConfigVpnClientRootCertificateResponse>>> p2SVpnServerConfigVpnClientRootCertificates() {
        return Codegen.optional(this.p2SVpnServerConfigVpnClientRootCertificates);
    }
    /**
     * The provisioning state of the P2S VPN server configuration resource.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The provisioning state of the P2S VPN server configuration resource.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * The radius server address property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    @Export(name="radiusServerAddress", type=String.class, parameters={})
    private Output</* @Nullable */ String> radiusServerAddress;

    /**
     * @return The radius server address property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Output<Optional<String>> radiusServerAddress() {
        return Codegen.optional(this.radiusServerAddress);
    }
    /**
     * The radius secret property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    @Export(name="radiusServerSecret", type=String.class, parameters={})
    private Output</* @Nullable */ String> radiusServerSecret;

    /**
     * @return The radius secret property of the P2SVpnServerConfiguration resource for point to site client connection.
     * 
     */
    public Output<Optional<String>> radiusServerSecret() {
        return Codegen.optional(this.radiusServerSecret);
    }
    /**
     * VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     * 
     */
    @Export(name="vpnClientIpsecPolicies", type=List.class, parameters={IpsecPolicyResponse.class})
    private Output</* @Nullable */ List<IpsecPolicyResponse>> vpnClientIpsecPolicies;

    /**
     * @return VpnClientIpsecPolicies for P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<IpsecPolicyResponse>>> vpnClientIpsecPolicies() {
        return Codegen.optional(this.vpnClientIpsecPolicies);
    }
    /**
     * VPN protocols for the P2SVpnServerConfiguration.
     * 
     */
    @Export(name="vpnProtocols", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> vpnProtocols;

    /**
     * @return VPN protocols for the P2SVpnServerConfiguration.
     * 
     */
    public Output<Optional<List<String>>> vpnProtocols() {
        return Codegen.optional(this.vpnProtocols);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public P2sVpnServerConfiguration(String name) {
        this(name, P2sVpnServerConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public P2sVpnServerConfiguration(String name, P2sVpnServerConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public P2sVpnServerConfiguration(String name, P2sVpnServerConfigurationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:network:P2sVpnServerConfiguration", name, args == null ? P2sVpnServerConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private P2sVpnServerConfiguration(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:network:P2sVpnServerConfiguration", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:network/v20180801:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181001:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181101:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20181201:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190201:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190401:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190601:P2sVpnServerConfiguration").build()),
                Output.of(Alias.builder().type("azure-native:network/v20190701:P2sVpnServerConfiguration").build())
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
    public static P2sVpnServerConfiguration get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new P2sVpnServerConfiguration(name, id, options);
    }
}
