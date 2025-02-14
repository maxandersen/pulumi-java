// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.apigateway.ClientCertificateArgs;
import com.pulumi.awsnative.apigateway.outputs.ClientCertificateTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ApiGateway::ClientCertificate
 * 
 */
@ResourceType(type="aws-native:apigateway:ClientCertificate")
public class ClientCertificate extends com.pulumi.resources.CustomResource {
    /**
     * The Primary Identifier of the Client Certficate, generated by a Create API Call
     * 
     */
    @Export(name="clientCertificateId", type=String.class, parameters={})
    private Output<String> clientCertificateId;

    /**
     * @return The Primary Identifier of the Client Certficate, generated by a Create API Call
     * 
     */
    public Output<String> clientCertificateId() {
        return this.clientCertificateId;
    }
    /**
     * A description of the client certificate.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the client certificate.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * An array of arbitrary tags (key-value pairs) to associate with the client certificate.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ClientCertificateTag.class})
    private Output</* @Nullable */ List<ClientCertificateTag>> tags;

    /**
     * @return An array of arbitrary tags (key-value pairs) to associate with the client certificate.
     * 
     */
    public Output<Optional<List<ClientCertificateTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClientCertificate(String name) {
        this(name, ClientCertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClientCertificate(String name, @Nullable ClientCertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ClientCertificate", name, args == null ? ClientCertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClientCertificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:apigateway:ClientCertificate", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ClientCertificate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClientCertificate(name, id, options);
    }
}
