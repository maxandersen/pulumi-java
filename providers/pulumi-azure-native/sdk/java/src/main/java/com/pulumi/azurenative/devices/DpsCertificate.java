// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.devices.DpsCertificateArgs;
import com.pulumi.azurenative.devices.outputs.CertificatePropertiesResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * The X509 Certificate.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:devices:DpsCertificate cert /subscriptions/91d12660-3dec-467a-be2a-213b5544ddc0/resourceGroups/myResourceGroup/providers/Microsoft.Devices/ProvisioningServives/myFirstProvisioningService/certificates/cert 
 * ```
 * 
 */
@ResourceType(type="azure-native:devices:DpsCertificate")
public class DpsCertificate extends CustomResource {
    /**
     * The entity tag.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The entity tag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name of the certificate.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the certificate.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * properties of a certificate
     * 
     */
    @Export(name="properties", type=CertificatePropertiesResponse.class, parameters={})
    private Output<CertificatePropertiesResponse> properties;

    /**
     * @return properties of a certificate
     * 
     */
    public Output<CertificatePropertiesResponse> properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The resource type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DpsCertificate(String name) {
        this(name, DpsCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DpsCertificate(String name, DpsCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DpsCertificate(String name, DpsCertificateArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:devices:DpsCertificate", name, args == null ? DpsCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DpsCertificate(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:devices:DpsCertificate", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:devices/v20170821preview:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20171115:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20180122:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20200101:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20200301:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20200901preview:DpsCertificate").build()),
                Output.of(Alias.builder().type("azure-native:devices/v20211015:DpsCertificate").build())
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
    public static DpsCertificate get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DpsCertificate(name, id, options);
    }
}
