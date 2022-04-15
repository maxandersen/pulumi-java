// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.media.StreamingPolicyArgs;
import io.pulumi.azurenative.media.outputs.CommonEncryptionCbcsResponse;
import io.pulumi.azurenative.media.outputs.CommonEncryptionCencResponse;
import io.pulumi.azurenative.media.outputs.EnvelopeEncryptionResponse;
import io.pulumi.azurenative.media.outputs.NoEncryptionResponse;
import io.pulumi.azurenative.media.outputs.SystemDataResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Streaming Policy resource
 * API Version: 2020-05-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:media:StreamingPolicy UserCreatedSecureStreamingPolicy /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/contoso/providers/Microsoft.Media/mediaservices/contosomedia/streamingPolicies/UserCreatedSecureStreamingPolicy 
 * ```
 * 
 */
@ResourceType(type="azure-native:media:StreamingPolicy")
public class StreamingPolicy extends io.pulumi.resources.CustomResource {
    /**
     * Configuration of CommonEncryptionCbcs
     * 
     */
    @Export(name="commonEncryptionCbcs", type=CommonEncryptionCbcsResponse.class, parameters={})
    private Output</* @Nullable */ CommonEncryptionCbcsResponse> commonEncryptionCbcs;

    /**
     * @return Configuration of CommonEncryptionCbcs
     * 
     */
    public Output</* @Nullable */ CommonEncryptionCbcsResponse> commonEncryptionCbcs() {
        return this.commonEncryptionCbcs;
    }
    /**
     * Configuration of CommonEncryptionCenc
     * 
     */
    @Export(name="commonEncryptionCenc", type=CommonEncryptionCencResponse.class, parameters={})
    private Output</* @Nullable */ CommonEncryptionCencResponse> commonEncryptionCenc;

    /**
     * @return Configuration of CommonEncryptionCenc
     * 
     */
    public Output</* @Nullable */ CommonEncryptionCencResponse> commonEncryptionCenc() {
        return this.commonEncryptionCenc;
    }
    /**
     * Creation time of Streaming Policy
     * 
     */
    @Export(name="created", type=String.class, parameters={})
    private Output<String> created;

    /**
     * @return Creation time of Streaming Policy
     * 
     */
    public Output<String> created() {
        return this.created;
    }
    /**
     * Default ContentKey used by current Streaming Policy
     * 
     */
    @Export(name="defaultContentKeyPolicyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> defaultContentKeyPolicyName;

    /**
     * @return Default ContentKey used by current Streaming Policy
     * 
     */
    public Output</* @Nullable */ String> defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
    }
    /**
     * Configuration of EnvelopeEncryption
     * 
     */
    @Export(name="envelopeEncryption", type=EnvelopeEncryptionResponse.class, parameters={})
    private Output</* @Nullable */ EnvelopeEncryptionResponse> envelopeEncryption;

    /**
     * @return Configuration of EnvelopeEncryption
     * 
     */
    public Output</* @Nullable */ EnvelopeEncryptionResponse> envelopeEncryption() {
        return this.envelopeEncryption;
    }
    /**
     * The name of the resource
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Configurations of NoEncryption
     * 
     */
    @Export(name="noEncryption", type=NoEncryptionResponse.class, parameters={})
    private Output</* @Nullable */ NoEncryptionResponse> noEncryption;

    /**
     * @return Configurations of NoEncryption
     * 
     */
    public Output</* @Nullable */ NoEncryptionResponse> noEncryption() {
        return this.noEncryption;
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to this resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public StreamingPolicy(String name) {
        this(name, StreamingPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public StreamingPolicy(String name, StreamingPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public StreamingPolicy(String name, StreamingPolicyArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:StreamingPolicy", name, args == null ? StreamingPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private StreamingPolicy(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:media:StreamingPolicy", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:media/v20180330preview:StreamingPolicy").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180601preview:StreamingPolicy").build()),
                Output.of(Alias.builder().type("azure-native:media/v20180701:StreamingPolicy").build()),
                Output.of(Alias.builder().type("azure-native:media/v20200501:StreamingPolicy").build()),
                Output.of(Alias.builder().type("azure-native:media/v20210601:StreamingPolicy").build())
            ))
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
    public static StreamingPolicy get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new StreamingPolicy(name, id, options);
    }
}
