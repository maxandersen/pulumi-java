// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.iot;

import com.pulumi.azure.Utilities;
import com.pulumi.azure.iot.CertificateArgs;
import com.pulumi.azure.iot.inputs.CertificateState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an IotHub Certificate.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var exampleResourceGroup = new ResourceGroup(&#34;exampleResourceGroup&#34;, ResourceGroupArgs.builder()        
 *             .location(&#34;West Europe&#34;)
 *             .build());
 * 
 *         var exampleIoTHub = new IoTHub(&#34;exampleIoTHub&#34;, IoTHubArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .location(exampleResourceGroup.getLocation())
 *             .sku(IoTHubSku.builder()
 *                 .name(&#34;B1&#34;)
 *                 .capacity(&#34;1&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleCertificate = new Certificate(&#34;exampleCertificate&#34;, CertificateArgs.builder()        
 *             .resourceGroupName(exampleResourceGroup.getName())
 *             .iothubName(exampleIoTHub.getName())
 *             .isVerified(true)
 *             .certificateContent(Base64.getEncoder().encodeToString(Files.readAllBytes(Paths.get(&#34;example.cer&#34;))))
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * IoTHub Certificates can be imported using the `resource id`, e.g.
 * 
 * ```sh
 *  $ pulumi import azure:iot/certificate:Certificate example /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/mygroup1/providers/Microsoft.Devices/IotHubs/example/Certificates/example
 * ```
 * 
 */
@ResourceType(type="azure:iot/certificate:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    @Export(name="certificateContent", type=String.class, parameters={})
    private Output<String> certificateContent;

    /**
     * @return The Base-64 representation of the X509 leaf certificate .cer file or just a .pem file content.
     * 
     */
    public Output<String> certificateContent() {
        return this.certificateContent;
    }
    /**
     * The name of the IoTHub that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="iothubName", type=String.class, parameters={})
    private Output<String> iothubName;

    /**
     * @return The name of the IoTHub that this certificate will be attached to. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> iothubName() {
        return this.iothubName;
    }
    /**
     * Is the certificate verified? Defaults to `false`.
     * 
     */
    @Export(name="isVerified", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isVerified;

    /**
     * @return Is the certificate verified? Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> isVerified() {
        return Codegen.optional(this.isVerified);
    }
    /**
     * Specifies the name of the IotHub Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Specifies the name of the IotHub Certificate resource. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the resource group under which the IotHub Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    @Export(name="resourceGroupName", type=String.class, parameters={})
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group under which the IotHub Certificate resource has to be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/certificate:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure:iot/certificate:Certificate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable CertificateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, state, options);
    }
}
