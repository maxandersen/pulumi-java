// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.documentai_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.documentai_v1.ProcessorArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a processor from the type processor that the user chose. The processor will be at "ENABLED" state by default after its creation.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:documentai/v1:Processor")
public class Processor extends com.pulumi.resources.CustomResource {
    /**
     * The time the processor was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time the processor was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The default processor version.
     * 
     */
    @Export(name="defaultProcessorVersion", type=String.class, parameters={})
    private Output<String> defaultProcessorVersion;

    /**
     * @return The default processor version.
     * 
     */
    public Output<String> defaultProcessorVersion() {
        return this.defaultProcessorVersion;
    }
    /**
     * The display name of the processor.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The display name of the processor.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    @Export(name="kmsKeyName", type=String.class, parameters={})
    private Output<String> kmsKeyName;

    /**
     * @return The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    @Export(name="processEndpoint", type=String.class, parameters={})
    private Output<String> processEndpoint;

    /**
     * @return Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    public Output<String> processEndpoint() {
        return this.processEndpoint;
    }
    /**
     * The state of the processor.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The state of the processor.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Processor(String name) {
        this(name, ProcessorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Processor(String name, @Nullable ProcessorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Processor(String name, @Nullable ProcessorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:documentai/v1:Processor", name, args == null ? ProcessorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Processor(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:documentai/v1:Processor", name, null, makeResourceOptions(options, id));
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
    public static Processor get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Processor(name, id, options);
    }
}
