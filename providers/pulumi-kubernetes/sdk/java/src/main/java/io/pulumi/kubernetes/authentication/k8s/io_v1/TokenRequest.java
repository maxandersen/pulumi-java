// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.authentication.k8s.io_v1;

import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import io.pulumi.kubernetes.Utilities;
import io.pulumi.kubernetes.authentication.k8s.io_v1.TokenRequestArgs;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.TokenRequestSpec;
import io.pulumi.kubernetes.authentication.k8s.io_v1.outputs.TokenRequestStatus;
import io.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * TokenRequest requests a token for a given service account.
 * 
 */
@ResourceType(type="kubernetes:authentication.k8s.io/v1:TokenRequest")
public class TokenRequest extends io.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @OutputExport(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> getApiVersion() {
        return this.apiVersion;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> getKind() {
        return this.kind;
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @OutputExport(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> getMetadata() {
        return this.metadata;
    }
    /**
     * Spec holds information about the request being evaluated
     * 
     */
    @OutputExport(name="spec", type=TokenRequestSpec.class, parameters={})
    private Output<TokenRequestSpec> spec;

    /**
     * @return Spec holds information about the request being evaluated
     * 
     */
    public Output<TokenRequestSpec> getSpec() {
        return this.spec;
    }
    /**
     * Status is filled in by the server and indicates whether the token can be authenticated.
     * 
     */
    @OutputExport(name="status", type=TokenRequestStatus.class, parameters={})
    private Output</* @Nullable */ TokenRequestStatus> status;

    /**
     * @return Status is filled in by the server and indicates whether the token can be authenticated.
     * 
     */
    public Output</* @Nullable */ TokenRequestStatus> getStatus() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TokenRequest(String name, TokenRequestArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authentication.k8s.io/v1:TokenRequest", name, makeArgs(args), makeResourceOptions(options, Input.empty()));
    }

    private TokenRequest(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:authentication.k8s.io/v1:TokenRequest", name, null, makeResourceOptions(options, id));
    }

    private static TokenRequestArgs makeArgs(TokenRequestArgs args) {
        var builder = args == null ? TokenRequestArgs.builder() : TokenRequestArgs.builder(args);
        return builder
            .setApiVersion("authentication.k8s.io/v1")
            .setKind("TokenRequest")
            .build();
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TokenRequest get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new TokenRequest(name, id, options);
    }
}
