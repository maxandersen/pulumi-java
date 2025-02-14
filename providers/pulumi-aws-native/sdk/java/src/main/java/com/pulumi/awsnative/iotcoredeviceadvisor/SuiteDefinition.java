// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotcoredeviceadvisor;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.iotcoredeviceadvisor.SuiteDefinitionArgs;
import com.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionConfigurationProperties;
import com.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionTag;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An example resource schema demonstrating some basic constructs and validation rules.
 * 
 * ## Example Usage
 * 
 */
@ResourceType(type="aws-native:iotcoredeviceadvisor:SuiteDefinition")
public class SuiteDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource name for the suite definition.
     * 
     */
    @Export(name="suiteDefinitionArn", type=String.class, parameters={})
    private Output<String> suiteDefinitionArn;

    /**
     * @return The Amazon Resource name for the suite definition.
     * 
     */
    public Output<String> suiteDefinitionArn() {
        return this.suiteDefinitionArn;
    }
    @Export(name="suiteDefinitionConfiguration", type=SuiteDefinitionConfigurationProperties.class, parameters={})
    private Output<SuiteDefinitionConfigurationProperties> suiteDefinitionConfiguration;

    public Output<SuiteDefinitionConfigurationProperties> suiteDefinitionConfiguration() {
        return this.suiteDefinitionConfiguration;
    }
    /**
     * The unique identifier for the suite definition.
     * 
     */
    @Export(name="suiteDefinitionId", type=String.class, parameters={})
    private Output<String> suiteDefinitionId;

    /**
     * @return The unique identifier for the suite definition.
     * 
     */
    public Output<String> suiteDefinitionId() {
        return this.suiteDefinitionId;
    }
    /**
     * The suite definition version of a test suite.
     * 
     */
    @Export(name="suiteDefinitionVersion", type=String.class, parameters={})
    private Output<String> suiteDefinitionVersion;

    /**
     * @return The suite definition version of a test suite.
     * 
     */
    public Output<String> suiteDefinitionVersion() {
        return this.suiteDefinitionVersion;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Export(name="tags", type=List.class, parameters={SuiteDefinitionTag.class})
    private Output</* @Nullable */ List<SuiteDefinitionTag>> tags;

    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public Output<Optional<List<SuiteDefinitionTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SuiteDefinition(String name) {
        this(name, SuiteDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SuiteDefinition(String name, SuiteDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SuiteDefinition(String name, SuiteDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, args == null ? SuiteDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SuiteDefinition(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:iotcoredeviceadvisor:SuiteDefinition", name, null, makeResourceOptions(options, id));
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
    public static SuiteDefinition get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SuiteDefinition(name, id, options);
    }
}
